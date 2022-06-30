package com.dzd.test.service;

import com.dzd.test.entity.Test;
import com.dzd.test.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//@DS("sharding")
public class TestService {
   @Autowired
   TestMapper testMapper;

   public Test getContent(String id) {
     return testMapper.getContent(id);
   }

   public int writeContent() {
     Test content = new Test();
//     content.setId(UUID.randomUUID().toString());
     content.setName("张三");
       testMapper.insert(content);
     return 1;
}
}
