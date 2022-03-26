package com.example.liveplatform;



import org.jasypt.encryption.StringEncryptor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;


@SpringBootTest
class LiveplatformApplicationTests {

    @Test
    void contextLoads() {
    }
    @Autowired
    StringEncryptor encryptor;

    @Test
    public void getPass() {
        String url = encryptor.encrypt("jdbc:mysql://127.0.0.1:3306/erp-framework?useUnicode=true&characterEncoding=utf8");
        String name = encryptor.encrypt("root");
        String password = encryptor.encrypt("root");
        System.out.println(url+"----------------");
        System.out.println(name+"----------------");
        System.out.println(password+"----------------");

    }

}
