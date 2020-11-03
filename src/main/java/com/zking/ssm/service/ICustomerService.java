package com.zking.ssm.service;

import com.zking.ssm.mapper.CustomerMapper;
import com.zking.ssm.model.Customer;
import com.zking.ssm.utils.PageBean;

import javax.annotation.Resource;
import java.util.List;

public interface ICustomerService {

    int deleteByPrimaryKey(Integer customerId);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(Integer customerId);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);

    List<Customer> listCustomer(Customer customer, PageBean pageBean);
}
