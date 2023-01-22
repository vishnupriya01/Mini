package com.Erp.Mini.Supplier;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import jakarta.validation.Valid;

import java.util.List;

@Controller
public class SupplierController {
    private SupplierRepository supplierRepository;
    public SupplierController(SupplierRepository supplierRepository){
        this.supplierRepository=supplierRepository;
    }
    //menu-->Part-1 add supplier form
    @RequestMapping(value="/add-supplier", method= RequestMethod.GET)
    public String supplier(ModelMap model){
        SupplierBean supplierBean = new SupplierBean(0,"","");
        model.put("saveSupplier",supplierBean);
        return "supplier";
    }
    //Part-2Post supplier
    @RequestMapping(value ="/add-supplier",method = RequestMethod.POST)
    public String saveSupplier(ModelMap model, @Valid SupplierBean saveSupplier , BindingResult result){
        supplierRepository.save(saveSupplier);
        return "welcome";
    }
    @RequestMapping(value="/view-suppliers", method= RequestMethod.GET)
    public String viewSuppliers(ModelMap model){
       List<SupplierBean> suppliers= supplierRepository.findAll();
       model.put("suppliers",suppliers);
        return "viewSuppliers";
    }
}
