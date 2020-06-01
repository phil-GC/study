package com.elead.dao.entity;


import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import javax.persistence.*;

/**
 * @author gong.cong
 * @since
 */
@Entity
@TableName("phil_student")
@Data
public class Student {

    @Id
    private String id;

    private String name;

    private Integer gender;

    private Integer age;


}
