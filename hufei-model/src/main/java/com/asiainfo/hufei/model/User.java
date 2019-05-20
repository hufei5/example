package com.asiainfo.hufei.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author hufei
 * @date 2019/5/17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User implements Serializable {
    private static final long serialVersionUID = 6495230559239675103L;
    private Integer id;


    private String name;


    private Integer age;
}
