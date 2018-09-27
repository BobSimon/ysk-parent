package com.ysk.admin.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ysk.api.model.User;
import com.ysk.api.service.UserService;


/**
 * @desc 暴露给前端的接口
 * @author Bob Simon
 */
@RestController
@RequestMapping("/")
public class TestController {

	/**
	 * 引用阿里巴巴包
	 */
	@Reference(version = "1.0.0")
	private UserService testService;

	/**
	 * 所hello
	 * @return
	 */
	@GetMapping("hello")
	public String hello() {
		return testService.sayHello("Hello springboot and dubbo!");
	}

	/**
	 * 找用户
	 * @return
	 */
	@GetMapping("user")
	public User user() {
		return testService.findUser();
	}

	/**
	 * 用户列表
	 * @param page
	 * @param pageSize
	 * @return
	 */
	@GetMapping("list")
	public List<User> list(@RequestParam(defaultValue = "1") int page,
			@RequestParam(defaultValue = "10") int pageSize) {
		return testService.getUser(page, pageSize);
	}

	/**
	 * 添加用户
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "add", method = RequestMethod.POST)
	public List<User> add(@RequestBody User user) {
		System.out.println(user.toString());
		return null;
	}

	/**
	 * 从redis获取某个用户
	 * @param key
	 * @return
	 */
	@RequestMapping(value = "/getuserfromredis", method = RequestMethod.GET)
	public User getRedis(@RequestParam String key) {

		return testService.getUserForRedis(key);
	}


}
