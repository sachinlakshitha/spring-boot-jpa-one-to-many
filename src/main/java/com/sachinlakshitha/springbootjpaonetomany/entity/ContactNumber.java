package com.sachinlakshitha.springbootjpaonetomany.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class ContactNumber {
    @Id
    private String id;
    private String number;
    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    private Customer customer;
}
