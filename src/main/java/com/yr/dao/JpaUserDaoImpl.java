//package com.yr.dao;
//
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.persistence.Query;
//
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Repository;
//
//import com.yr.entity.User;
//
//@Repository
//public class JpaUserDaoImpl implements JpaUserDao{ // 多数据源使用时建议不继承,否则会产出许多父类方法
//
////	@Autowired
//	@PersistenceContext
//	@Qualifier("primaryDataSource")
//	private EntityManager entityManager;
//	
//	@Override
//	public List<User> select() {
//		Query q = entityManager.createQuery("From User");
//		List<User> listSuser = q.getResultList();
//		return listSuser;
//	}
//
//	@Override
//	public void persist(User user) {
//		entityManager.persist(user);
//	}
//
//	@Override
//	public void delete(Integer id) {
////		Query q = entityManager.createNativeQuery("delete from user where id = :id").setParameter("id", id); // 本地sql
//		Query q = entityManager.createQuery("delete from User where id = :id").setParameter("id", id);
//		q.executeUpdate();
//	}
//
//	@Override
//	public void update(User user) {
//		
//		User r = entityManager.find(User.class, user.getId());
//		
//		int id = user.getId();
//		String name = user.getName();
//		String sex = user.getSex();
//		int age = user.getAge();
//		entityManager.remove(r);
//		
//		User user2 = new User();
//		user2.setId(id);
//		user2.setName(name);
//		user2.setAge(age);
//		user2.setSex(sex);
//		entityManager.merge(user2);
//		
//		
//		
////		Query nameUpd = entityManager.createNamedQuery("user")
////				.setParameter("id", user.getId()).setParameter("name", user.getName())
////				.setParameter("age", user.getAge()).setParameter("sex", user.getSex()); // 修改
////		nameUpd.executeUpdate();
////		d.getPeople().setName("YG9999");
////		Query q = entityManager.createQuery("update user set name=?, sex=?, age=? where id=?")
////					.setParameter(1, user.getName())
////					.setParameter(2, user.getSex())
////					.setParameter(3, user.getAge())
////					.setParameter(4, user.getId());
////		nameUpd.executeUpdate(); // 执行修改
//	}
//
//}
