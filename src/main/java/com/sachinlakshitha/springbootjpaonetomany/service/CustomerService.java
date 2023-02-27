package com.sachinlakshitha.springbootjpaonetomany.service;

import com.sachinlakshitha.springbootjpaonetomany.dto.CustomerDto;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface CustomerService {
    Boolean save(CustomerDto customerDto);
    List<CustomerDto> findAll();
    List<CustomerDto> findAllByPage(Pageable page);
    List<CustomerDto> findAllBySort(Sort sort);
    List<CustomerDto> findAllBySortAndPage(Pageable page);
    CustomerDto findById(String id);
    Boolean update(CustomerDto customerDto);
    void delete(String id);
}
