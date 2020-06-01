package com.elead.controller;

import com.elead.dao.entity.Student;
import com.elead.service.StudentService;
import groovy.util.logging.Slf4j;
import io.swagger.annotations.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author gong.cong
 * @since
 */

@Api("学生查询")
@RestController
@RequestMapping("/student")
@Slf4j
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/{id}")
    public String getStudent(@PathVariable String id){
        Student student = studentService.selectDtoById(id);
        if (student == null){
            return "";
        }else {
            return student.toString();
        }
    }


}
