package com.sachinlakshitha.springbootjpaonetomany.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "customer")
public class ContactNumberDto {
    private String id;
    private String number;
    private CustomerDto customer;
}
