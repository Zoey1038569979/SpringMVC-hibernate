package com.zy.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zy.entity.User;

@Controller
public class HelloController {

	@RequestMapping("/hello" )
	  public String sayHello() {
		  User user = new User();
		  user.setUserName("赵燚");
		  user.setPassWord("123456");
		  user.setUserPhoneNum("18586797207");
		  
		  Configuration config = new Configuration().configure();
	      SessionFactory sessionFactory = config.buildSessionFactory(); 
	      Session session = sessionFactory.openSession();
	      Transaction tran = session.beginTransaction();
	      
	   // 执行插入操作
			try {  
				session.saveOrUpdate(user);
				tran.commit();
				System.out.println("实例化成功");
			} catch (Exception e) {
				tran.rollback();
				e.printStackTrace();
			} finally {
				session.close();
				sessionFactory.close();
			}
		  System.out.println("后台：测试成功");
		  return "success";
	  }
	
}
