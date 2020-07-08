package com.ruanyuan.controller;

import com.ruanyuan.pojo.Department;
import com.ruanyuan.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    //前往主页
    @RequestMapping("/main")
    public String toMain(){
        return "main";
    }

    //前往部门列表页
    @RequestMapping("/DepartmentList")
    public String toDepartmentList(Model model){
        //查询处所有部门
        List<Department> deps=departmentService.getAllDepartment();
        model.addAttribute("deps",deps);
        return "dep/DepartmentList";
    }

    //前往部门添加页
    @GetMapping("toDepartmentAdd")
    public String toAddDepartment(){
        return "dep/DepartmentAdd";
    }

    //添加部门
    @PostMapping("/addDepartment")
    public String AddDepartment(Department department){
        departmentService.addDepartment(department);
        return "redirect:DepartmentList";
    }

    //前往修改页面
    @GetMapping("/toDepartmentAdd/{deptno}")
    public String toDepartmentAdd(@PathVariable("deptno") int deptno,Model model){
        Department dep=departmentService.getDepartmentById(deptno);
        model.addAttribute("dep",dep);
        return "dep/DepartmentAdd";
    }

    //修改部门
    @PutMapping("/addDepartment")
    public String updateDepartment(Department department){
        departmentService.updateDepartment(department);
        return "redirect:DepartmentList";
    }

    @DeleteMapping("/deleteDepartment/{deptno}")
    @ResponseBody
    public int deleteDepartment(@PathVariable("deptno") int deptno){
        try{
           return departmentService.deleteDepartment(deptno);
        }catch (Exception e){
            return 0;
        }
    }

    public int ad(){
        return 0;
    }
}
