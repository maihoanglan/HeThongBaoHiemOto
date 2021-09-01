package fpt.fa.service.impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fpt.fa.entities.HopDongBaoHiem;
import fpt.fa.model.HopDongModel;
import fpt.fa.repository.HDBHDao;
import fpt.fa.service.HDBHService;

@Service
public class HDBHServiceImpl implements HDBHService {

	@Autowired
	private HDBHDao hDBHDao;
	
	@Override
	public void insert(HopDongModel hopDongModel) {

		HopDongBaoHiem hopDongBaoHiem = new HopDongBaoHiem();
		hopDongBaoHiem.setMaHopDong(hopDongModel.getMaHopDong());
		hopDongBaoHiem.setMaKH(hopDongModel.getMaKH());
		hopDongBaoHiem.setBienSoXe(hopDongModel.getBienSoXe());
		hopDongBaoHiem.setNgayHopDong(LocalDate.parse(hopDongModel.getNgayHD()));
		hopDongBaoHiem.setThoiHanHopDong(LocalDate.parse(hopDongModel.getThoiHanHD()));
		hopDongBaoHiem.setGiaTriHopDong(hopDongModel.getGiaTriHD());
		hopDongBaoHiem.setGiaTriThanhToan(hopDongModel.getGiaTriTT());
		
		hDBHDao.insert(hopDongBaoHiem);
	}

	@Override
	public List<HopDongBaoHiem> getAll() {
		return hDBHDao.getAll();
	}

	@Override
	public List<HopDongBaoHiem> getAll(String hetHan) {
		return hDBHDao.getAll(hetHan);
	}

	@Override
	public HopDongModel getById(String id) {
		HopDongBaoHiem hopDongBaoHiem = hDBHDao.getById(id);
		HopDongModel hopDongModel = new HopDongModel();

		hopDongModel.setMaHopDong(hopDongBaoHiem.getMaHopDong());
		hopDongModel.setMaKH(hopDongBaoHiem.getMaKH());
		hopDongModel.setBienSoXe(hopDongBaoHiem.getBienSoXe());
		hopDongModel.setNgayHD(hopDongBaoHiem.getNgayHopDong().toString());
		hopDongModel.setThoiHanHD(hopDongBaoHiem.getThoiHanHopDong().toString());
		hopDongModel.setGiaTriHD(hopDongBaoHiem.getGiaTriHopDong());
		hopDongModel.setGiaTriTT(hopDongBaoHiem.getGiaTriThanhToan());

		return hopDongModel;
	}

	@Override
	public void update(HopDongModel hopDongModel) {

		HopDongBaoHiem hopDongBaoHiem = new HopDongBaoHiem();
		hopDongBaoHiem.setMaHopDong(hopDongModel.getMaHopDong());
		hopDongBaoHiem.setMaKH(hopDongModel.getMaKH());
		hopDongBaoHiem.setBienSoXe(hopDongModel.getBienSoXe());
		hopDongBaoHiem.setNgayHopDong(LocalDate.parse(hopDongModel.getNgayHD()));
		hopDongBaoHiem.setThoiHanHopDong(LocalDate.parse(hopDongModel.getThoiHanHD()));
		hopDongBaoHiem.setGiaTriHopDong(hopDongModel.getGiaTriHD());
		hopDongBaoHiem.setGiaTriThanhToan(hopDongModel.getGiaTriTT());

		hDBHDao.update(hopDongBaoHiem);
	}

}
