package com.ysk.resource;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.ysk.api.model.User;

/**
 * @author Bob Simon
 */
public interface UserMapper {

	/**
	 * 使用注解的方式
	 * @param name
	 * @return
	 */
	@Select("select * from t_user where name like concat('%',#{name},'%')")
	List<User> likeName(String name);

	/**
	 * 使用注解方式
	 * @param id
	 * @return
	 */
	@Select("select * from t_user where id = #{id}")
	User getById(Long id);

	/**
	 * 使用xml的方式
	 */
	 List<User> getUsers();

}