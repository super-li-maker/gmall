package com.mlzq.pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @Author:李志强
 * @Date:2020/5/27 16:18
 * @version:1.0
 */
@Data
public class WareInfo implements Serializable {

    private static final long serialVersionUID =1L;

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
}
