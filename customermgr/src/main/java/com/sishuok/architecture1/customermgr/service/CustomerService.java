package com.sishuok.architecture1.customermgr.service;

import com.sishuok.architecture1.common.service.BaseService;
import com.sishuok.architecture1.customermgr.dao.CustomerDAO;
import com.sishuok.architecture1.customermgr.vo.CustomerModel;
import com.sishuok.architecture1.customermgr.vo.CustomerQueryModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by qi on 2018/11/27.
 */
@Service
//@Transactional
public class CustomerService extends BaseService<CustomerModel,CustomerQueryModel> implements IcustomerService {
    private CustomerDAO dao = null;
    @Autowired
    public void setDao(CustomerDAO dao) {
        this.dao = dao;
        super.setDao(dao);
    }
}
