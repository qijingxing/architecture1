package com.sishuok.architecture1.customermgr.dao;

import com.sishuok.architecture1.common.dao.BaseDao;
import com.sishuok.architecture1.customermgr.vo.CustomerModel;
import com.sishuok.architecture1.customermgr.vo.CustomerQueryModel;
import org.springframework.stereotype.Repository;

/**
 * Created by qi on 2018/11/24.
 */

@Repository
public interface CustomerDAO extends BaseDao<CustomerModel,CustomerQueryModel>{

}
