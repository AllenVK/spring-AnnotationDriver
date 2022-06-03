package com.paul.service;

import com.paul.dao.BookDao;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

/**
 * @Project: spring-AnnotationDriver
 * @Desc: // describe the class information
 * @Date: 2022-06-03 15:22
 * @Author: Paul
 */
@Service
public class BookService {

    //@Qualifier("bookDao")
    //@Autowired(required=false)
    //@Resource(name="bookDao2")
    @Inject
    private BookDao bookDao;

    public void print(){
        System.out.println(bookDao);
    }

    @Override
    public String toString() {
        return "BookService [bookDao=" + bookDao + "]";
    }

}
