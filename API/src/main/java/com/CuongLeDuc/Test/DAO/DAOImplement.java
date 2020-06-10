package com.CuongLeDuc.Test.DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.CuongLeDuc.Test.model.sinhvien;

@Repository
public class DAOImplement {
	@Autowired
	private DAO dao;
	
	public List<sinhvien> getAll() {		
		return dao.findAll();		
	}
	
	public sinhvien getById(int magieng) {
		Optional<sinhvien> result = dao.findById(magieng);
		sinhvien item = null;
		if (result.isPresent()) {
			item = result.get();
		} else {
			throw new RuntimeException("Cant find with id");
		}	
		return item;
	}
	
	public void save(sinhvien item) {
		dao.save(item);
	}
	
	public void delete(int magieng) {
		dao.deleteById(magieng);
	}
	
	
}
