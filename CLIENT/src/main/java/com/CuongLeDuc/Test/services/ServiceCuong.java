package com.CuongLeDuc.Test.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.CuongLeDuc.Test.model.sinhvien;


@Service
public interface ServiceCuong {
	public List<sinhvien> getAll();
	
	public sinhvien getById(int id);
	
	public void save(sinhvien item);
	
	public void delete(int id);
}
