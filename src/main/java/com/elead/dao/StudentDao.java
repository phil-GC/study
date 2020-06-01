package com.elead.dao;

import com.elead.dao.entity.Student;

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

}
