package com.paul.test;

import org.junit.Test;

/**
 * @Project: spring-AnnotationDriver
 * @Desc: // describe the class information
 * @Date: 2022-06-03 15:51
 * @Author: Paul
 */
public class RegxText {

    //数字
    public static final String REG_NUMBER = ".*\\d+.*";
    //小写字母
    public static final String REG_UPPERCASE = ".*[A-Z]+.*";
    //大写字母
    public static final String REG_LOWERCASE = ".*[a-z]+.*";
    //特殊符号
    public static final String REG_SYMBOL = ".*[~!@#$%^&*()_+|<>,.?/:;'\\[\\]{}\"]+.*";

    public static boolean checkPasswordRule(String password){
        //密码为空或者长度小于8位则返回false
        if (password == null || password.length() <8 ) return false;
        int i = 0;
        if (password.matches(REG_NUMBER)) i++;
        if (password.matches(REG_LOWERCASE))i++;
        if (password.matches(REG_UPPERCASE)) i++;
        if (password.matches(REG_SYMBOL)) i++;

        if (i  < 3 )  return false;

        return true;
    }

    @Test
    public void testReg() {
        System.out.println(checkPasswordRule("ly12345678@"));
    }

}
