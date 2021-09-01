package fpt.fa.service;

import java.util.List;

import fpt.fa.entities.HopDongBaoHiem;
import fpt.fa.model.HopDongModel;

public interface HDBHService {

	void insert(HopDongModel hopDongModel);

	List<HopDongBaoHiem> getAll();

	List<HopDongBaoHiem> getAll(String hetHan);

	HopDongModel getById(String id);

	void update(HopDongModel hopDongModel);
}
