package com.yasi.controller;

import com.yasi.pojo.SAlltype;
import com.yasi.pojo.SCategory;
import com.yasi.pojo.SClass;
import com.yasi.pojo.SCourse;
import com.yasi.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/course")
public class courseController {
    @Autowired
    private IcategoryService categoryService;

    @Autowired
    private IcourseService courseService;
    @Autowired
    private IclassService classService;
    @Autowired
    private IteacherService teacherService;
    @Autowired
    private ItypeService typeService;
    @RequestMapping("/detail")
    public String classdetail(String courseNo, Model model) {
        SCourse c = new SCourse();
        c.setcNo(courseNo);
        List<SCourse> sc = courseService.selectcourse(c);
        List<SCategory> cateList = categoryService.selectallCate();
        if (sc != null) {
            c = sc.get(0);
            SClass c1 = new SClass();
            c1.setClassCno(c.getcNo());
            List<SClass> cla = classService.findclass(c1);
            model.addAttribute("cla", cla);
            model.addAttribute("c", c);
        }

        model.addAttribute("cateList", cateList);
        return "coursedetail";

    }

    @RequestMapping("/list")
    public String courseList(String categoryNo, Model model) {
        List<SCategory> cateList = categoryService.selectallCate();
        List<SAlltype> typeList = typeService.findbyparent(categoryNo);
        List<SCourse> courseList = courseService.findcateC(categoryNo);
        model.addAttribute("cateList", cateList);
        model.addAttribute("typeList", typeList);
        model.addAttribute("courseList", courseList);
        model.addAttribute("categoryNo", categoryNo);
        return "courselist";

    }

    /***
     *
     * @param name
     * @param model
     * 课程名称模糊搜索
     * @return
     */
    @RequestMapping("/search")
    public String coursearch(String cour, Model model) {
        SCourse c = new SCourse();
        c.setcName(cour);
        List<SCourse> nofreeList = new ArrayList<SCourse>();
        List<SCategory> cateList = categoryService.selectallCate();
        List<SCourse> freeList = courseService.freecourse();
        List<SCourse> courseList = courseService.selectcourse(c);
        if (courseList != null) {
            for (int i = 0; i < courseList.size(); i++) {
                c = courseList.get(i);
                if (c.getcDprice() != 0) {
                    nofreeList.add(c);
                }
            }
        }
        model.addAttribute("cour", cour);
        model.addAttribute("nofreeList", nofreeList);
        model.addAttribute("freeList", freeList);
        model.addAttribute("cateList", cateList);
        model.addAttribute("courseList", courseList);
        return "courselist";

    }
}
