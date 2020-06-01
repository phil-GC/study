package com.elead.service.impl;

import com.elead.dao.StudentDao;
import com.elead.dao.entity.Student;
import com.elead.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
