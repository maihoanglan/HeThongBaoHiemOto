package fpt.fa.repository.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fpt.fa.entities.KhachHang;
import fpt.fa.repository.KhachHangDao;

@Repository
@Transactional
public class KhachHangDaoImpl implements KhachHangDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public KhachHang getById(String id) {
		return sessionFactory.getCurrentSession().get(KhachHang.class, id);
	}

	@Override
	public void insert(KhachHang khachHang) {
		sessionFactory.getCurrentSession().save(khachHang);
	}

	@Override
	public List<KhachHang> getAll() {
		String hql = "from KhachHang";
		
		Query<KhachHang> query = sessionFactory.getCurrentSession().createQuery(hql, KhachHang.class);
		
		return query.list();
	}

	@Override
	public void update(KhachHang khachHang) {
		sessionFactory.getCurrentSession().update(khachHang);
	}

	@Override
	public List<KhachHang> getAll(KhachHang khachHang) {
		String hql = "from KhachHang where tenKH like :name";
		
		Query<KhachHang> query = sessionFactory.getCurrentSession().createQuery(hql, KhachHang.class);
		query.setParameter("name","%"+ khachHang.getTenKH()+ "%"); 
		
		return query.list();
	}

}
