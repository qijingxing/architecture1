package com.sishuok.architecture1.customermgr.dao;

import com.sishuok.architecture1.customermgr.vo.CustomerModel;
import com.sishuok.architecture1.customermgr.vo.CustomerQueryModel;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by qi on 2018/11/24.
 */

@Repository
public interface CustomerDAO {
    public void create(CustomerModel cm);

    public void update(CustomerModel cm);

    public void delete(int uuid);

    public CustomerModel getByUuid(int uuid);

    public List<CustomerDAO> getByCondition(CustomerQueryModel cqm);
}
