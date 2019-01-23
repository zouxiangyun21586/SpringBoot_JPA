package com.yr.dao2;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yr.entity.User;

public interface JpaUserDao2 extends JpaRepository<User, Integer>{
//	public List<User> select2(); // 使用多数据源时注释掉
//	public void persist(User user);
//	public void delete(Integer id);
//	public void update(User user);
}
