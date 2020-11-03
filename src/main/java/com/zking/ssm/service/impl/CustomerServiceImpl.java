package com.zking.ssm.service.impl;

import com.zking.ssm.mapper.CustomerMapper;
import com.zking.ssm.model.Customer;
import com.zking.ssm.service.ICustomerService;
import com.zking.ssm.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public int deleteByPrimaryKey(Integer customerId) {
        return 0;
    }

    @Override
    public int insert(Customer record) {
        return customerMapper.insert(record);
    }

    @Override
    public int insertSelective(Customer record) {
        return customerMapper.insertSelective(record);
    }

    @Override
    public Customer selectByPrimaryKey(Integer customerId) {
        return customerMapper.selectByPrimaryKey(customerId);
    }

    @Override
    public int updateByPrimaryKeySelective(Customer record) {
        return customerMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Customer record) {
        return customerMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Customer> listCustomer(Customer customer, PageBean pageBean) {
        return customerMapper.listCustomer(customer);
    }
}
