package com.ruanyuan.controller;

import com.github.pagehelper.PageInfo;
import com.ruanyuan.pojo.Department;
import com.ruanyuan.pojo.Employee;
import com.ruanyuan.service.DepartmentService;
import com.ruanyuan.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/EmployeeList")
    public String getAllEmployee(Model model, @RequestParam(defaultValue = "1") int pageNo, @RequestParam(defaultValue = "10") int pageSize){
       PageInfo<Employee> pageInfo=employeeService.getAllEmployee(pageNo,pageSize);
       List<Department> Deplist=departmentService.getAllDepartment();
        //拼接路径
        String url="/EmployeeList?";
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("url",url);
        model.addAttribute("pageSize",pageSize);
        model.addAttribute("Deplist",Deplist);
        return "emp/EmployeeList";
    }

    //前往添加员工页面
    @GetMapping("/toEmployeeAdd")
    public String toEmployeeAdd(Model model){
        model.addAttribute("deps",departmentService.getAllDepartment());
        return "emp/EmployeeAdd";
    }

    //添加员工信息
    @PostMapping("/addEmployee")
    public String addEmployee(Employee employee){
        employeeService.addEmployee(employee);
        return "redirect:EmployeeList";
    }

    @GetMapping("/toUpdateEmployee/{empno}")
    public String toUpdateEmployee(@PathVariable("empno") int empno,Model model){
        model.addAttribute("emp",employeeService.getEmpById(empno));
        model.addAttribute("deps",departmentService.getAllDepartment());
        return "emp/EmployeeAdd";
    }

    //修改员工
    @PutMapping("/addEmployee")
    public String updateEmployee(Employee employee){
        employeeService.updateEmployeeById(employee);
        return "redirect:EmployeeList";
    }

    @DeleteMapping("/deleteEmployee")
    @ResponseBody
    public int deleteEmployee(String empno){
        String[]id=empno.split(",");
        try{
            return employeeService.deleteEmployee(id);
        }catch (Exception e){
            return 0;
        }
    }

    @GetMapping("/getEmpByTj")
    public String getEmpByTj(@RequestParam(defaultValue = "1") int pageNo,@RequestParam(defaultValue = "10") int pageSize, Employee employee,Model model){
        PageInfo<Employee> pageInfo=employeeService.getEmpByTj(pageNo,pageSize,employee);
        String url="/getEmpByTj?ename="+employee.getEname()+"&hiredate="+employee.getHiredate()+"&sal="+employee.getSal()+"&deptno="+employee.getDeptno().getDeptno();
        //所有部门放到作用域
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("Deplist",departmentService.getAllDepartment());
        model.addAttribute("url",url);
        model.addAttribute("pageSize",pageSize);
        model.addAttribute("employee",employee);
        return "emp/EmployeeList";
    }
}
