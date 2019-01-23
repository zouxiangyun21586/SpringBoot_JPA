package com.yr.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yr.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/jpaSel")
	public String insPrimary(Map<String, Object> map) { // @RequestMapping 注解中名字(name)不能一样,否则会导致启动报错
		userService.test();
		map.put("over", "第一个啊 ~~~~~~~");
		return "jpaIns";
	}
	
	@RequestMapping("/jpaSel2")
	public String insSecondary(Map<String, Object> map) {
		userService.test2();
		map.put("over", "第二个哟 !!!!!!!!");
		return "jpaIns";
	}
	
//	@RequestMapping("/jpaSel")
//    public String selJpa(Map<String, Object> map) {
//		List<User> listUser = userService.select();
//		map.put("map", listUser);
//		return "jpa";
//    }
//	
//	@RequestMapping("/jpaSel2")
//    public String selJpa2(Map<String, Object> map) {
//		List<User> listUserA = userService.select2();
//		map.put("map", listUserA);
//		return "jpa";
//    }
//	
//	@RequestMapping("/jpaIns")
//    public String insJpa(Map<String, Object> map) {
//		User user = new User();
//		user.setName("深咖啡");
//		user.setAge(16);
//		user.setSex("钕");
//		String str = userService.persist(user);
//		if (str.equals("succss")) {
//			map.put("over", "添加的值为: " + user);
//			return "jpaIns";
//		} else {
//			map.put("over", "添加失败");
//			return "jpaIns";
//		}
//    }
//	
//	@RequestMapping("/jpaDel")
//    public String delJpa(Map<String, Object> map) {
//		String str = userService.delete(5);
//		if (str.equals("succss")) {
//			map.put("over", "删除成功");
//			return "jpaDel";
//		} else {
//			map.put("over", "删除失败");
//			return "jpaDel";
//		}
//    }
//	
//	@RequestMapping("/jpaUpd")
//    public String updJpa(Map<String, Object> map) {
//		User user = new User();
//		user.setId(2);
//		user.setName("卡等多项");
//		user.setAge(100);
//		user.setSex("莮");
//		String str = userService.update(user);
//		if (str.equals("succss")) {
//			map.put("over", "修改后的值为: " + user);
//			return "jpaUpd";
//		} else {
//			map.put("over", "修改失败");
//			return "jpaUpd";
//		}
//    }
}
