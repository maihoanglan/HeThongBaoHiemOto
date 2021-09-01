package fpt.fa.repository.impl;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fpt.fa.entities.LoaiKhachHang;
import fpt.fa.repository.LoaiKhachHangDao;

@Repository
@Transactional
public class LoaiKhachHangDaoImpl implements LoaiKhachHangDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public LoaiKhachHang getById(String id) {
		return sessionFactory.getCurrentSession().get(LoaiKhachHang.class, id);
	}
	
}
