package com.yr.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yr.entity.User;

/**
 * 多数据源使用时必须要继承JpaJpaRepository ,而单数据源使用时不强迫继承
 * 
 * @author zxy-un
 * 
 * 2018年7月18日 下午10:28:51
 */
public interface JpaUserDao extends JpaRepository<User, Integer>{
//	public List<User> select();
//	public void persist(User user);
//	public void delete(Integer id);
//	public void update(User user);
}
