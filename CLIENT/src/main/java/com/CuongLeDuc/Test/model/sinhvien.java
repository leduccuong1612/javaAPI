package com.CuongLeDuc.Test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_sinhvien")
public class sinhvien {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name = "masv")
	private int masv;
	
	@Column(name = "hoten")
	private String hoten;
	
	@Column(name = "tenkhoa")
	private String tenkhoa;
	
	@Column(name = "gioitinh")
	private String gioitinh;

	@Column(name = "diemtin")
	private String diemtin;

	public int getMasv() {
		return masv;
	}

	public void setMasv(int masv) {
		this.masv = masv;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public String getTenkhoa() {
		return tenkhoa;
	}

	public void setTenkhoa(String tenkhoa) {
		this.tenkhoa = tenkhoa;
	}

	public String getGioitinh() {
		return gioitinh;
	}

	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}

	public String getDiemtin() {
		return diemtin;
	}

	public void setDiemtin(String diemtin) {
		this.diemtin = diemtin;
	}

	public sinhvien() {
		super();
		// TODO Auto-generated constructor stub
	}

	public sinhvien(int masv, String hoten, String tenkhoa, String gioitinh, String diemtin) {
		super();
		this.masv = masv;
		this.hoten = hoten;
		this.tenkhoa = tenkhoa;
		this.gioitinh = gioitinh;
		this.diemtin = diemtin;
	}

	public sinhvien(String hoten, String tenkhoa, String gioitinh, String diemtin) {
		super();
		this.hoten = hoten;
		this.tenkhoa = tenkhoa;
		this.gioitinh = gioitinh;
		this.diemtin = diemtin;
	}

	@Override
	public String toString() {
		return "sinhvien [masv=" + masv + ", hoten=" + hoten + ", tenkhoa=" + tenkhoa + ", gioitinh=" + gioitinh
				+ ", diemtin=" + diemtin + "]";
	}

}
