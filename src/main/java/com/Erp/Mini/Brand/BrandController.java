package com.Erp.Mini.Brand;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class BrandController {
    private BrandRepository brandRepository;
    public BrandController(BrandRepository brandRepository){
        this.brandRepository=brandRepository;
    }
    @RequestMapping(value="add-brand" ,method = RequestMethod.GET)
        public String addBrand(ModelMap model){
            BrandBean brandBean =new BrandBean(0,"","");
            model.put("brand",brandBean);
            return "brand";
        }
    @RequestMapping(value = "add-brand",method=RequestMethod.POST)
    public String saveBrand(ModelMap model, @Valid BrandBean brand, BindingResult results){
        brandRepository.save(brand);
        return "redirect:viewBrand";
    }

    @RequestMapping(value = "viewBrand",method = RequestMethod.GET)
    public String viewBrand(ModelMap model){
        List<BrandBean> brandlist=brandRepository.findAll();
        model.put("brandlist",brandlist);
        return "viewBrand";
    }
}
