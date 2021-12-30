package com.cailei.mapper;

import com.cailei.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface UserMapper {
    List<User> findAllUser();
}
