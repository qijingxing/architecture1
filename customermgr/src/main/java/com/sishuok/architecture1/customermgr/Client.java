package com.sishuok.architecture1.customermgr;

import com.sishuok.architecture1.customermgr.dao.CustomerDAO;
import com.sishuok.architecture1.customermgr.vo.CustomerModel;
import com.sishuok.architecture1.customermgr.vo.CustomerQueryModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by qi on 2018/11/24.
 */
@Service
public class Client {
    @Autowired
    private CustomerDAO dao = null;

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Client t = (Client) ctx.getBean("client");
        CustomerModel customerModel = new CustomerModel();
        customerModel.setCustomerId("c1");
        customerModel.setPwd("c1");
        customerModel.setRegisterTime("111");
        customerModel.setShowName("c1");
        customerModel.setTrueName("张三");
        t.dao.create(customerModel);
        List<CustomerDAO> list = t.dao.getByCondition(new CustomerQueryModel());
        System.out.println("list =="+list);


    }
}
