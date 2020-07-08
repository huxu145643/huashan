package com.ruanyuan.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ruanyuan.dao.EmployeeDao;
import com.ruanyuan.pojo.Employee;
import com.ruanyuan.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;

    /**
     * 查询所有员工信息
     * @return
     */
    public PageInfo<Employee> getAllEmployee(int pageNo, int pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<Employee> list=employeeDao.getAllEmployee();
        PageInfo<Employee> pageInfoEmp=new PageInfo<Employee>(list);
        return pageInfoEmp;
    }

    /**
     * 添加员工信息
     * @param employee
     * @return
     */
    public int addEmployee(Employee employee) {
        return employeeDao.addEmployee(employee);
    }

    /**
     * 根据id查询员工
     * @param empno
     * @return
     */
    public Employee getEmpById(int empno) {
        return employeeDao.getEmpById(empno);
    }

    /**
     * 修改员工
     * @param employee
     * @return
     */
    public int updateEmployeeById(Employee employee) {
        return employeeDao.updateEmployeeById(employee);
    }

    /**
     * 删除及批量删除
     * @param empno
     * @return
     */
    public int deleteEmployee(String[] empno) {
        return employeeDao.deleteEmployee(empno);
    }

    /**
     * 多条件查询
     * @param pageNo
     * @param pageSize
     * @param employee
     * @return
     */
    public PageInfo<Employee> getEmpByTj(int pageNo, int pageSize, Employee employee) {
        PageHelper.startPage(pageNo,pageSize);
        List<Employee> list=employeeDao.getEmpByTj(employee);
        PageInfo<Employee> pageInfoEmp=new PageInfo<Employee>(list);
        return pageInfoEmp;
    }
}
