package com.CuongLeDuc.Test.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.CuongLeDuc.Test.DAO.DAOImplement;
import com.CuongLeDuc.Test.model.sinhvien;


@RestController
public class controllerCuong {
	@Autowired
	private DAOImplement service;
	
	@RequestMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE,  method = RequestMethod.GET)
	public List<sinhvien> list(){
		return service.getAll();
	}
	@RequestMapping(value = "/{id}")
	public sinhvien getById (@PathVariable("id") int id)
	{ 
		sinhvien item = service.getById(id);
		return item;	   
	}
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public void save(@RequestBody sinhvien item) 
	{
		service.save(item);				
	}
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public void delete(@PathVariable("id") int id) {
		service.delete(id);
	}
	
}
