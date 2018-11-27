package com.sishuok.architecture1.customermgr.web;

import com.sishuok.architecture1.customermgr.service.IcustomerService;
import com.sishuok.architecture1.customermgr.vo.CustomerModel;
import com.sishuok.architecture1.customermgr.vo.CustomerQueryModel;
import com.sishuok.pageutil.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by qi on 2018/11/27.
 */
@Controller
@RequestMapping(value = "/customer")
public class CustomerController {
    @Autowired
    private IcustomerService ics = null;

    @RequestMapping(value = "toAdd",method = RequestMethod.GET)
    public String toAdd() {
        return "customer/add";
    }
    @RequestMapping(value = "add",method = RequestMethod.POST)
    public String add(@ModelAttribute("cm") CustomerModel cm) {
        ics.create(cm);
        return "customer/success";
    }
    @RequestMapping(value = "toUpdate/{customerUuid}",method = RequestMethod.POST)
    public String toUpdate(Model model, @PathVariable("customerUuid") int customerUuid) {
        CustomerModel cm = ics.getByUuid(customerUuid);
        model.addAttribute("cm",cm);
        return "customer/success";
    }
    @RequestMapping(value = "update",method = RequestMethod.POST)
    public String update(@ModelAttribute("cm") CustomerModel cm) {
        ics.update(cm);
        return "customer/success";
    }
    @RequestMapping(value ="toDelete/{customerUuid}",method = RequestMethod.GET)
    public String toDelete(Model model,@PathVariable("customerUuid") int customerUuid){
        CustomerModel cm = ics.getByUuid(customerUuid);
        model.addAttribute("cm",cm);
        return "customer/success";
    }
    @RequestMapping(value = "delete",method = RequestMethod.POST)
    public String delete(@RequestParam("uuid") int customerUuid) {
        ics.delete(customerUuid);
        return "customer/success";
    }
    @RequestMapping(value = "toList",method = RequestMethod.GET)
    public String toList(@RequestParam("queryJsonStr") String queryJson, @ModelAttribute("page")Page pageWW) {
        CustomerQueryModel cqm =null;
        if(queryJson ==null ||queryJson.trim().length() == 0){
            cqm = new CustomerQueryModel();
        }else {
        }
        return "customer/success";
    }


}
