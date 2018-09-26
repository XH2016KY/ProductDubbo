package com.product.core.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.product.core.pojo.UserRoles;

public interface UserRolesMapper {
	
	@Select(value = "select * from user_roles where uid = #{id}")
	List<UserRoles> findByUid(@Param("id")Integer id);

}
