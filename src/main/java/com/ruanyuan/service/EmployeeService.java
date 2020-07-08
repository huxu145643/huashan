package com.ruanyuan.service;

import com.github.pagehelper.PageInfo;
import com.ruanyuan.pojo.Employee;

import java.util.List;

public interface EmployeeService {
    /**
     * 查询所有员工
     * @return
     */
    public PageInfo<Employee> getAllEmployee(int pageNo, int pageSize);
    /**
     * 添加员工信息
     * @param employee
     * @return
     */
    public int addEmployee(Employee employee);
    /**
     * 根据id查询员工
     * @param empno
     * @return
     */
    public Employee getEmpById(int empno);
    /**
     * 修改员工信息
     * @param employee
     * @return
     */
    public int updateEmployeeById(Employee employee);
    /**
     * 删除及批量删除
     * @param empno
     * @return
     */
    public int deleteEmployee(String [] empno);
    /**
     * 查询所有员工
     * @return
     */
    public PageInfo<Employee> getEmpByTj(int pageNo, int pageSize,Employee employee);
}
