package com.zking.ssm.service.impl;

import com.zking.ssm.model.Customer;
import com.zking.ssm.service.ICustomerService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class CustomerServiceImplTest extends BaseTestCase {

    @Autowired
    private ICustomerService customerService;
    private Customer customer;

    @Override
    public void setUp() {
        super.setUp();
        customer = new Customer();
    }

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insert() {
    }

    @Test
    public void insertSelective() {
    }

    @Test
    public void selectByPrimaryKey() {
    }

    @Test
    public void updateByPrimaryKeySelective() {
    }

    @Test
    public void updateByPrimaryKey() {
    }

    @Test
    public void listCustomer() {
        List<Customer> customers = customerService.listCustomer(customer,pageBean);
        for (Customer customer1 : customers) {
            System.out.println(customer1);
        }
    }
}
