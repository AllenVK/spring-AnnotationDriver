package com.paul.controller;

import com.paul.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @Project: spring-AnnotationDriver
 * @Desc: // describe the class information
 * @Date: 2022-06-03 15:20
 * @Author: Paul
 */
@Controller
public class BookController {

    @Autowired
    private BookService bookService;

}
