package com.sishuok.architecture1.common.vo;

import com.sishuok.pageutil.Page;

/**
 * Created by qi on 2018/11/27.
 */
public class BaseModel {
    private Integer uuid;

    private Page page = new Page();

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public Integer getUuid() {
        return uuid;
    }

    public void setUuid(Integer uuid) {
        this.uuid = uuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BaseModel)) return false;

        BaseModel baseModel = (BaseModel) o;

        return uuid != null ? uuid.equals(baseModel.uuid) : baseModel.uuid == null;
    }

    @Override
    public int hashCode() {
        return uuid != null ? uuid.hashCode() : 0;
    }
}
