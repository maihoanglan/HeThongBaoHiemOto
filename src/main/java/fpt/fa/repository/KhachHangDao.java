package fpt.fa.repository;

import java.util.List;

import fpt.fa.entities.KhachHang;

public interface KhachHangDao {

	KhachHang getById(String id);
	
	void insert(KhachHang khachHang);
	
	List<KhachHang> getAll();
	
	List<KhachHang> getAll(KhachHang khachHang);
	
	void update(KhachHang khachHang);
	
}
