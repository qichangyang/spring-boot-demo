package com.main.mapper;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;

import com.main.model.UserEntity;
public interface UserMapper {
	List<UserEntity> getAll();
	
	UserEntity getOne(Long id);

	void insert(UserEntity user);

	void update(UserEntity user);

	void delete(Long id);
}
