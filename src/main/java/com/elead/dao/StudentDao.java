package com.elead.dao;

import com.elead.dao.entity.Student;

import java.util.List;

/**
 * @author gong.cong
 * @since
 */
public interface StudentDao {

    /**
     * 根据id查询对应学生信息
     *
     * @param id 学生id
     * @return Student
     */
    Student selectDtoById(String id);

    /**
     * 根据id删除对应学生信息
     *
     * @param id 学生id
     * @return 操作结果
     */
    boolean deleteStudentById(String id);

    /**
     * 按条件查询
     *
     * @param student 学生搜索类
     * @return 查询结果
     */
    List<Student> studentSearchDto(Student student);

    /**
     * 新增学生信息
     *
     * @param student 学生信息
     * @return 学生id
     */
    boolean addStudent(Student student);
}
