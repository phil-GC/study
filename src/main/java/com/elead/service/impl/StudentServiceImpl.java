package com.elead.service.impl;

import com.elead.dao.StudentDao;
import com.elead.dao.entity.Student;
import com.elead.dao.entity.StudentAddDto;
import com.elead.service.StudentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.plugin2.util.PojoUtil;

import java.util.UUID;

/**
 * @author gong.cong
 * @since
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public Student selectDtoById(String id) {
        return studentDao.selectDtoById(id);
    }

    @Override
    public boolean deleteStudentById(String id) {
        return studentDao.deleteStudentById(id);
    }

    @Override
    public String addStudent(StudentAddDto addStudent) {
        Student student = new Student();
        BeanUtils.copyProperties(addStudent, student);
        String id = String.valueOf(UUID.randomUUID());
        student.setId(id);
        boolean result = studentDao.addStudent(student);
        return result ? id : "";
    }

    @Override
    public void editStudentById(String id, Student student) {

    }
}
