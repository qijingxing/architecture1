package com.sishuok.architecture1.customermgr;

import com.sishuok.architecture1.customermgr.service.IcustomerService;
import com.sishuok.architecture1.customermgr.vo.CustomerModel;
import com.sishuok.architecture1.customermgr.vo.CustomerQueryModel;
import com.sishuok.pageutil.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by qi on 2018/11/24.
 */
@Service
@Transactional
public class Client {
    @Autowired
    private IcustomerService s = null;

    public IcustomerService  getS(){
        return s;
    }

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Client t = (Client) ctx.getBean("client");
        CustomerModel customerModel = new CustomerModel();
        customerModel.setCustomerId("c1");
        customerModel.setPwd("c1");
        customerModel.setRegisterTime("111");
        customerModel.setShowName("c1");
        customerModel.setTrueName("张三");
       // t.s.create(customerModel);

        CustomerQueryModel cqm = new CustomerQueryModel();
        cqm.getPage().setNowPage(1);
        cqm.getPage().setPageShow(4);
        Page<CustomerModel> list = t.getS().getByConditionPage(cqm);
        System.out.println("list =="+list);


    }
}
