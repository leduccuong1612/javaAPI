package com.CuongLeDuc.Test.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.CuongLeDuc.Test.model.sinhvien;


@Service
public class ServiceImplement implements ServiceCuong {

	@Override
	public List<sinhvien> getAll() {
		final String uri = "http://localhost:8081/";	     
	    RestTemplate restTemplate = new RestTemplate();
	    List<sinhvien> result = restTemplate.getForObject(uri, List.class);	     
	    return result;
	}

	@Override
	public sinhvien getById(int id) {
		 final String uri = "http://localhost:8081/{id}";
	     
		    Map<String, Integer> params = new HashMap<String, Integer>();
		    params.put("id", id);
		     
		    RestTemplate restTemplate = new RestTemplate();
		  sinhvien item = restTemplate.getForObject(uri, sinhvien.class, params);   
		  
		    return item;
	}

	@Override
	public void save(sinhvien item) {
		 final String uri = "http://localhost:8081/save";
		 RestTemplate restTemplate = new RestTemplate();
		 sinhvien result = restTemplate.postForObject(uri, item, sinhvien.class);
		
	}

	@Override
	public void delete(int id) {
			final String uri = "http://localhost:8081/delete/{id}";
	     
		    Map<String, Integer> params = new HashMap<String, Integer>();
		    params.put("id", id);
		     
		    RestTemplate restTemplate = new RestTemplate();
		    sinhvien item = restTemplate.getForObject(uri, sinhvien.class, params);
	}
}
