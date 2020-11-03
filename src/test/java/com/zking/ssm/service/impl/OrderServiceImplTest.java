package com.zking.ssm.service.impl;

import com.zking.ssm.model.Order;
import com.zking.ssm.service.IOrderService;
import org.aspectj.weaver.ast.Or;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class OrderServiceImplTest extends BaseTestCase {

    @Autowired
    private IOrderService orderService;
    private Order order;

    @Override
    public void setUp() {
        super.setUp();
        order = new Order();
    }

    @Test
    public void loadOrder() {
        order.setOrderId(3);
        Order order = orderService.loadOrder(this.order);
        System.out.println(order );
    }
}
