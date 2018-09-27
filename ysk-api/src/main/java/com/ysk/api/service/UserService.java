package com.ysk.api.service;

import java.util.List;

import com.ysk.api.model.User;

/**
 * @desc 业务逻辑
 * @author Bob Simon
 */
public interface UserService {

	/**
	 * 发送信息到
	 * @param str
	 * @return
	 */
	String sayHello(String str);

	/**
	 * 找到用户
	 * @return
	 */
	User findUser();

	/**
	 * 获取用户
	 * @param page
	 * @param pageSize
	 * @return
	 */
	List<User> getUser(int page, int pageSize);

	/**
	 * 从redis中获取用户
	 * @param key
	 * @return
	 */
	User getUserForRedis(String key);
}
