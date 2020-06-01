package com.elead.dao.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.elead.dao.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author gong.cong
 * @since
 */
@Mapper
@Repository
public interface StudentMapper extends BaseMapper<Student> {
}
