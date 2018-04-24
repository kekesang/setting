package com.yasi.controller;

import com.yasi.pojo.SCategory;
import com.yasi.pojo.SClass;
import com.yasi.pojo.SCourse;
import com.yasi.pojo.STeacher;
import com.yasi.service.IcategoryService;
import com.yasi.service.IclassService;
import com.yasi.service.IcourseService;
import com.yasi.service.IteacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/class")
public class classController {
    @Autowired
    private IcourseService courseService;
    @Autowired
    private IclassService classService;
    @Autowired
    private IteacherService teacherService;
    @Autowired
    private IcategoryService categoryService;

    @RequestMapping("/detail")
    public String classdetail(String classNo, Model model) {
        SClass cla = new SClass();
        cla.setClassNo(classNo);
        List<SClass> classList = classService.findclass(cla);
        /*List<SCategory> cateList=categoryService.selectallCate();*/
        if (classList != null) {
            cla = classList.get(0);
            SCourse c = new SCourse();
            c.setcNo(cla.getClassCno());
            STeacher tea1 = new STeacher();
            tea1.setTeaNo(cla.getClassTeano());
            List<STeacher> teaList = teacherService.findteacher(tea1);
            tea1 = teaList.get(0);
            model.addAttribute("tea1", tea1);
            model.addAttribute("cla", cla);
            try {
                List<SCourse> sc = courseService.selectcourse(c);
                c = sc.get(0);
                model.addAttribute("c", c);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        /*	model.addAttribute("cateList",cateList);*/
        return "classdetail1";

    }

    @RequestMapping("/teacher")
    public String teacherdetail(Model model) {
        List<STeacher> teaList = teacherService.findAll();
        List<SCategory> cateList = categoryService.selectallCate();
        model.addAttribute("cateList", cateList);
        model.addAttribute("teaList", teaList);
        return "teacherspace";
    }

}
