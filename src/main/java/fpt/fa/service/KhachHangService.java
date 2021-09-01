package fpt.fa.service;

import java.util.List;

import fpt.fa.entities.KhachHang;
import fpt.fa.model.KhachHangModel;

public interface KhachHangService {

	KhachHangModel getById(String id);

	void insert(KhachHangModel khachHangModel);

	List<KhachHang> getAll();
	
	List<KhachHang> getAll(KhachHang khachHang);

	void update(KhachHangModel khachHangModel);

}
