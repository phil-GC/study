package com.elead.controller;

import com.elead.dao.entity.Student;
import com.elead.dao.entity.StudentAddDto;
import com.elead.service.StudentService;
import groovy.util.logging.Slf4j;
import io.swagger.annotations.Api;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

/**
 * @author gong.cong
 * @since
 */

@Api(description = "学生接口")
@RestController
@RequestMapping("/student")
@Slf4j
public class StudentController {

    @Autowired
    private StudentService studentService;


    @ApiOperation("根据id查询学生信息")
    @GetMapping("/{id}")
    public String getStudent(@PathVariable String id) {
        Student student = studentService.selectDtoById(id);
        if (student == null) {
            return "";
        } else {
            return student.toString();
        }
    }

    @ApiOperation("根据id删除学生信息")
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable String id) {
        return studentService.deleteStudentById(id) ? "删除成功" : "删除失败";
    }

    @ApiOperation("新增学生实体对象")
    @PostMapping("/add")
    public String addStudent(StudentAddDto student){
        return studentService.addStudent(student);
    }

    @ApiOperation("根据id修改学生信息")
    @PutMapping("/{id}/change")
    public String editStudentById(@PathVariable String id,@NotNull Student student){
        studentService.editStudentById(id,student);
        return null;
    }

}
