package com.CuongLeDuc.Test.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.CuongLeDuc.Test.model.sinhvien;
import com.CuongLeDuc.Test.services.ServiceCuong;

@Controller
@RequestMapping("/")
public class ControllerCuong {
	private ServiceCuong service;
	@Autowired
	public ControllerCuong(ServiceCuong service) {
		super();
		this.service = service;
	}
	@GetMapping("/")
	public String list(Model theModel) {
		List<sinhvien> list = service.getAll();
		theModel.addAttribute("list",list);
		return "list";
	}
	@GetMapping("/show")
	public String showForm(Model theModel) {
		sinhvien item = new sinhvien();		
		theModel.addAttribute("item",item);
		return "form";
	}
	@GetMapping("/showUpdate")
	public String showFormForUpdate(@RequestParam("Id") int theId,Model theModel) {
		sinhvien item = service.getById(theId);		
		theModel.addAttribute("item",item);		
		return "form";
		
	}
	@PostMapping("/save")
	public String saveEmployee(@ModelAttribute("item") sinhvien item) {		
		service.save(item);		
		return "redirect:/";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("Id")int id, Model model) {
		service.delete(id);		
		return "redirect:/";
	}
	
}
