package com.meteor.jojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data//GET+SET+toString+EqualsAndHashcode
@NoArgsConstructor//无参构造
@AllArgsConstructor//有参构造
public class User {
    private Integer id;
    private String name;
    private  Short age;
    private Short gender;
    private String phone;
}
