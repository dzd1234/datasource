package com.dzd.test.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dzd.test.entity.Test;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TestMapper extends BaseMapper<Test> {
   Test getContent(@Param("id") String id);
   int writeContent(@Param("entity") Test content);
}
