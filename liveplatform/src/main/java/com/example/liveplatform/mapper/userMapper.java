package com.example.liveplatform.mapper;

import com.example.liveplatform.pojo.user;
import org.apache.ibatis.annotations.Select;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface userMapper {
    @Select("select name,password from user")
    List<user> findUser();
}
