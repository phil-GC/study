package com.elead.dao.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.elead.dao.StudentDao;
import com.elead.dao.entity.Student;
import com.elead.dao.mapper.StudentMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author gong.cong
 * @since
 */
@Repository
public class StudentDaoImpl extends ServiceImpl<StudentMapper,Student> implements StudentDao {

    @Override
    public Student selectDtoById(String id) {
        return super.selectById(id);
    }

    @Override
    public boolean deleteStudentById(String id) {
        return super.deleteById(id);
    }

    @Override
    public List<Student> studentSearchDto(Student student) {

        EntityWrapper<Student> wrapper = new EntityWrapper<Student>();
        wrapper.eq("name",student.getName());


        return null;
    }

    @Override
    public boolean addStudent(Student student) {
        return super.insert(student);
    }
}
