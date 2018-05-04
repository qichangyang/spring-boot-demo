package com.main.controler;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.model.User;
import com.main.service.UserService;

@RestController
@RequestMapping("/stu")
public class UserControler {
	private static final Logger logger = LoggerFactory.getLogger(UserControler.class);
	  @Autowired
	  private UserService userService;
	 
	  @RequestMapping("/list")
	  public List<User> getStus(){
	    logger.info("从数据库读取user集合");
	    return userService.getList();
	  }
}
