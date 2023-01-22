package com.Erp.Mini.Customer;

import com.Erp.Mini.Supplier.SupplierBean;
import com.Erp.Mini.Supplier.SupplierRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class CustomerController {
    private CustomerRepository customerRepository;
    public CustomerController(CustomerRepository customerRepository){
        this.customerRepository=customerRepository;
    }
    //menu-->Part-1 add customer form
    @RequestMapping(value="/add-customer", method= RequestMethod.GET)
    public String customer(ModelMap model){
        CustomerBean customerBean = new CustomerBean(0,"","");
        model.put("saveCustomer",customerBean);
        return "customer";
    }
    //Part-2Post customer
    @RequestMapping(value ="/add-customer",method = RequestMethod.POST)
    public String saveCustomer(ModelMap model, @Valid CustomerBean saveCustomer , BindingResult result){
        customerRepository.save(saveCustomer);
        return "welcome";
    }
    @RequestMapping(value="/view-customers", method= RequestMethod.GET)
    public String viewcustomers(ModelMap model){
       List<CustomerBean> customers= customerRepository.findAll();
       model.put("customers",customers);
        return "viewCustomers";
    }
}
