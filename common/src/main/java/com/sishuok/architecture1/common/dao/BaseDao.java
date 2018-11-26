package com.sishuok.architecture1.common.dao;

import java.util.List;

/**
 * Created by qi on 2018/11/26.
 */
public interface BaseDao<M,QM> {
    public void create(M m);

    public void update(M m);

    public void delete(int uuid);

    public M getByUuid(int uuid);

    public List<M> getByConditionPage(QM qm);
}
