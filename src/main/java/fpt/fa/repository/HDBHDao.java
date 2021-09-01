package fpt.fa.repository;

import java.util.List;

import fpt.fa.entities.HopDongBaoHiem;

public interface HDBHDao {

	void insert(HopDongBaoHiem hopDongBaoHiem);

	List<HopDongBaoHiem> getAll();

	List<HopDongBaoHiem> getAll(String hetHan);

	HopDongBaoHiem getById(String id);

	void update(HopDongBaoHiem hopDongBaoHiem);
}
