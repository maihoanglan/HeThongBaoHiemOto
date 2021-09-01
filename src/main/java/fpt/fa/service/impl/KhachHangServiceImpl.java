package fpt.fa.service.impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fpt.fa.entities.KhachHang;
import fpt.fa.model.KhachHangModel;
import fpt.fa.repository.KhachHangDao;
import fpt.fa.service.KhachHangService;

@Service
public class KhachHangServiceImpl implements KhachHangService{

	@Autowired
	private KhachHangDao khachHangDao;
	
	@Override
	public KhachHangModel getById(String id) {
		KhachHang khachHang = khachHangDao.getById(id);
		KhachHangModel khachHangModel = new KhachHangModel();
		
		khachHangModel.setMaKH(khachHang.getMaKH());
		khachHangModel.setMaLoaiKH(khachHang.getMaLoaiKH());
		khachHangModel.setTenKH(khachHang.getTenKH());
		khachHangModel.setSoCMND(khachHang.getSoCMND());
		khachHangModel.setGioiTinh(khachHang.getGioiTinh());
		khachHangModel.setNgaySinh(khachHang.getNgaySinh().toString());
		khachHangModel.setSoDienThoai(khachHang.getSoDienThoai());
		
		return khachHangModel;
	}

	@Override
	public void insert(KhachHangModel khachHangModel) {
		
		KhachHang khachHang = new KhachHang();
		khachHang.setMaKH(khachHangModel.getMaKH());
		khachHang.setMaLoaiKH(khachHangModel.getMaLoaiKH());
		khachHang.setTenKH(khachHangModel.getTenKH());
		khachHang.setSoCMND(khachHangModel.getSoCMND());
		khachHang.setGioiTinh(khachHangModel.getGioiTinh());
		khachHang.setNgaySinh(LocalDate.parse(khachHangModel.getNgaySinh()));
		khachHang.setSoDienThoai(khachHangModel.getSoDienThoai());
		
		khachHangDao.insert(khachHang);
	}

	@Override
	public List<KhachHang> getAll() {
		return khachHangDao.getAll();
	}

	@Override
	public void update(KhachHangModel khachHangModel) {

		KhachHang khachHang = new KhachHang();
		khachHang.setMaKH(khachHangModel.getMaKH());
		khachHang.setMaLoaiKH(khachHangModel.getMaLoaiKH());
		khachHang.setTenKH(khachHangModel.getTenKH());
		khachHang.setSoCMND(khachHangModel.getSoCMND());
		khachHang.setGioiTinh(khachHangModel.getGioiTinh());
		khachHang.setNgaySinh(LocalDate.parse(khachHangModel.getNgaySinh()));
		khachHang.setSoDienThoai(khachHangModel.getSoDienThoai());
		
		khachHangDao.update(khachHang);
	}

	@Override
	public List<KhachHang> getAll(KhachHang khachHang) {
		return khachHangDao.getAll(khachHang);
	}

}
