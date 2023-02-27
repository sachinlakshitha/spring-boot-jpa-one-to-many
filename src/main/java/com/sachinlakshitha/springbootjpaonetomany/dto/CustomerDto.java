package com.sachinlakshitha.springbootjpaonetomany.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class CustomerDto {
    private String id;
    private String name;
    private String email;
    private Date createdTime;
    private List<ContactNumberDto> contacts = new ArrayList<>();
}
