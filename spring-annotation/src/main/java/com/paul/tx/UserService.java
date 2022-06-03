package com.paul.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Project: spring-AnnotationDriver
 * @Desc: // describe the class information
 * @Date: 2022-06-03 15:23
 * @Author: Paul
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    @Transactional
    public void insertUser(){
        userDao.insert();
        //otherDao.other();xxx
        System.out.println("插入完成...");
        int i = 10/0;
    }

}
