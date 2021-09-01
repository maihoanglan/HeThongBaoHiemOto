package fpt.fa.repository.impl;

import java.time.LocalDate;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fpt.fa.entities.HopDongBaoHiem;
import fpt.fa.repository.HDBHDao;

@Repository
@Transactional
public class HDBHDaoImpl implements HDBHDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void insert(HopDongBaoHiem hopDongBaoHiem) {
		sessionFactory.getCurrentSession().save(hopDongBaoHiem);
	}

	@Override
	public List<HopDongBaoHiem> getAll() {
		String hql = "from HopDongBaoHiem ";
		
		Query<HopDongBaoHiem> query = sessionFactory.getCurrentSession().createQuery(hql, HopDongBaoHiem.class);
		
		return query.list();
	}

	@Override
	public List<HopDongBaoHiem> getAll(String hetHan) {
		String hql = "from HopDongBaoHiem where thoiHanHopDong <= :dateHetHan and thoiHanHopDong >= :dateNow";

		Query<HopDongBaoHiem> query = sessionFactory.getCurrentSession().createQuery(hql, HopDongBaoHiem.class);
		query.setParameter("dateHetHan", LocalDate.now().plusDays(15));
		query.setParameter("dateNow", LocalDate.now());

		return query.list();
	}

	@Override
	public HopDongBaoHiem getById(String id) {
		HopDongBaoHiem hopDongBaoHiem = sessionFactory.getCurrentSession().get(HopDongBaoHiem.class, id);
		return hopDongBaoHiem;
	}

	@Override
	public void update(HopDongBaoHiem hopDongBaoHiem) {
		sessionFactory.getCurrentSession().update(hopDongBaoHiem);
	}

}
