package com.sishuok.architecture1.customermgr.vo;

import com.sishuok.pageutil.Page;

/**
 * Created by qi on 2018/11/24.
 */
public class CustomerQueryModel extends CustomerModel {

    private Page<CustomerModel> page = new Page<CustomerModel>();

    public Page<CustomerModel> getPage() {
        return page;
    }

    public void setPage(Page<CustomerModel> page) {
        this.page = page;
    }
}
