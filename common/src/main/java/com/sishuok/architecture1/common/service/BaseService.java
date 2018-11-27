package com.sishuok.architecture1.common.service;

import com.sishuok.architecture1.common.dao.BaseDao;
import com.sishuok.architecture1.common.vo.BaseModel;
import com.sishuok.pageutil.Page;

import java.util.List;

/**
 * Created by qi on 2018/11/27.
 */
public class BaseService<M,MQ extends BaseModel> implements IBaseService<M,MQ>{
    private BaseDao dao = null;

    public void setDao(BaseDao dao) {
        this.dao = dao;
    }

    @Override
    public void create(M m) {
        dao.create(m);
    }

    @Override
    public void update(M m) {
        dao.update(m);
    }

    @Override
    public void delete(int uuid) {
        dao.delete(uuid);
    }

    @Override
    public M getByUuid(int uuid) {
        return (M)dao.getByUuid(uuid);
    }

    @Override
    public Page<M> getByConditionPage(MQ qm) {

        List<M> list = dao.getByConditionPage(qm);
        qm.getPage().setResult(list);
        return qm.getPage();
    }
}
