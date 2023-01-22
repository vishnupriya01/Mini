package com.Erp.Mini.ProductCategory;

import com.Erp.Mini.Brand.BrandBean;
import com.Erp.Mini.Brand.BrandRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class CategoryController {
    private CategoryRepository categoryRepository;
    private BrandRepository brandRepository;
    public CategoryController(CategoryRepository categoryRepository,BrandRepository brandRepository){
        this.categoryRepository = categoryRepository;
        this.brandRepository=brandRepository;
    }
    @RequestMapping(value="add-category" ,method = RequestMethod.GET)
        public String addCategory(ModelMap model){
            CategoryBean categoryBean =new CategoryBean(0,"","",0);
            List<BrandBean> brandlist= brandRepository.findAll();
        System.out.println(brandlist.get(0).getBrand_id());
            model.addAttribute("brandlist",brandlist);
            model.addAttribute("brand", new BrandBean());
            model.put("category", categoryBean);
            return "Category";
        }


    @RequestMapping(value = "add-category",method=RequestMethod.POST)
    public String saveCategory(ModelMap model, @Valid CategoryBean category, BindingResult results){
        categoryRepository.save(category);
        return "redirect:viewCategory";
    }

    @RequestMapping(value = "viewCategory",method = RequestMethod.GET)
    public String viewCategory(ModelMap model){
        List<CategoryBean> categorylist= categoryRepository.findAll();
        model.put("categorylist",categorylist);
        return "viewCategory";
    }

}
