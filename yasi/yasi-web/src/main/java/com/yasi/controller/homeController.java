package com.yasi.controller;

import com.yasi.pojo.SCategory;
import com.yasi.pojo.SClass;
import com.yasi.pojo.SCourse;
import com.yasi.service.IcategoryService;
import com.yasi.service.IclassService;
import com.yasi.service.IcourseService;
import com.yasi.service.ItypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class homeController {
    @Autowired
    private IcategoryService categoryService;
    @Autowired
    private ItypeService sCategoryService;
    @Autowired
    private IcourseService courseService;
    @Autowired
    private IclassService classService;

    @RequestMapping("/")
    public String showIndex(Model model) {
        List<SCategory> cateList = categoryService.selectallCate();
        model.addAttribute("cateList", cateList);

        return "index";
    }

    @RequestMapping(value = "/home")
    public String showHome(Model model) {
        List<SCategory> cateList = categoryService.selectallCate();
        List<SClass> classList = classService.findall();//最新开班时间
        List<SCourse> courseList = courseService.freecourse();//查询免费体验课
        model.addAttribute("cateList", cateList);
        model.addAttribute("classList", classList);
        model.addAttribute("courseList", courseList);
        return "index1";
    }

}
