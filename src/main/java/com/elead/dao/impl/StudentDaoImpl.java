package com.elead.dao.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.elead.dao.StudentDao;
import com.elead.dao.entity.Student;
import com.elead.dao.mapper.StudentMapper;
import org.springframework.stereotype.Repository;

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
}
