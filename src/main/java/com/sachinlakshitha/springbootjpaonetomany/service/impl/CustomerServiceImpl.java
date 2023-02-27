package com.sachinlakshitha.springbootjpaonetomany.service.impl;

import com.sachinlakshitha.springbootjpaonetomany.dto.CustomerDto;
import com.sachinlakshitha.springbootjpaonetomany.entity.Customer;
import com.sachinlakshitha.springbootjpaonetomany.repository.CustomerRepository;
import com.sachinlakshitha.springbootjpaonetomany.service.CustomerService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private CustomerRepository  customerRepository;
    private ModelMapper modelMapper;

    @Override
    public Boolean save(CustomerDto customerDto) {
        return customerRepository.save(convertToEntity(customerDto)) != null;
    }

    @Override
    public List<CustomerDto> findAll() {
        return customerRepository.findAll().stream().map(this::convertToDto).toList();
    }

    @Override
    public List<CustomerDto> findAllByPage(Pageable page) {
        return customerRepository.findAll(page).stream().map(this::convertToDto).toList();
    }

    @Override
    public List<CustomerDto> findAllBySort(Sort sort) {
        return customerRepository.findAll(sort).stream().map(this::convertToDto).toList();
    }

    @Override
    public List<CustomerDto> findAllBySortAndPage(Pageable page) {
        return customerRepository.findAll(page).stream().map(this::convertToDto).toList();
    }

    @Override
    public CustomerDto findById(String id) {
        return customerRepository.findById(id).map(this::convertToDto).orElse(null);
    }

    @Override
    public Boolean update(CustomerDto customerDto) {
        return customerRepository.save(convertToEntity(customerDto)) != null;
    }

    @Override
    public void delete(String id) {
        customerRepository.deleteById(id);
    }

    public CustomerDto convertToDto(Customer customer) {
        return modelMapper.map(customer, CustomerDto.class);
    }

    public Customer convertToEntity(CustomerDto customerDto) {
        return modelMapper.map(customerDto, Customer.class);
    }
}
