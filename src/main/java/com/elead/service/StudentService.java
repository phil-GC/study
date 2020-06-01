package com.elead.service;

import com.elead.dao.entity.Student;
import com.elead.dao.entity.StudentAddDto;

/**
 * @author gong.cong
 * @since
 */
public interface StudentService {

    /**
     * 根据id查询对应学生信息
     *
     * @param id 学生id
     * @return Student
     */
    Student selectDtoById(String id);

    /**
     * 根据id删除学生信息
     *
     * @param id 学生id
     * @return 操作结果
     */
    boolean deleteStudentById(String id);

    /**
     * 新增学生信息
     *
     * @param student 学生新增实体类
     * @return 学生id
     */
    String addStudent(StudentAddDto student);

    /**
     * 根据id修改学生信息
     *
     * @param id      学生id
     * @param student 学生对象
     */
    void editStudentById(String id, Student student);
}
