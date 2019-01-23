package com.yr.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yr.dao.JpaUserDao;
import com.yr.dao2.JpaUserDao2;
import com.yr.entity.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private JpaUserDao jpaUserDao;
	
	@Autowired
	private JpaUserDao2 jpaUserDao2;

	//这个时候datasoure1的数据源会进行事务操作。
	@Override
	public void test(){
		User user = jpaUserDao.getOne(2);
		System.out.println(user.toString());
	}
	
	@Override
	public void test2(){
		User user = jpaUserDao2.getOne(2);
		System.out.println(user.toString());
	}
	
	
//	@Override
//	public List<User> select() {
//		List<User> result = jpaUserDao.select();
//        return result;
//	}
//	
//	@Override
//	public List<User> select2() {
//		List<User> result = jpaUserDao2.select2();
//        return result;
//	}
//
//	@Transactional
//	@Override
//	public String persist(User user) {
//		try {
//			jpaUserDao.persist(user);
//			return "succss";
//		} catch (Exception e) {
//			return "error";
//		}
//	}
//
//	@Transactional
//	@Override
//	public String delete(Integer id) { // 删除
//		try {
//			jpaUserDao.delete(id);
//			return "succss";
//		} catch (Exception e) {
//			return "error";
//		}
//	}
//
//	@Transactional
//	@Override
//	public String update(User user) { // 修改
//		try {
//			jpaUserDao.update(user);
//			return "succss";
//		} catch (Exception e) {
//			return "error";
//		}
//	}

}