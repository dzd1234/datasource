package com.dzd.test.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Test implements Serializable {
    private String id;
    private String name;
}
