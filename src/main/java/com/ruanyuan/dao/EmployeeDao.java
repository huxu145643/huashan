package com.ruanyuan.dao;

import com.ruanyuan.pojo.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeDao {
    /**
     * 查询所有员工
     * @return
     */
    public List<Employee> getAllEmployee();

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
     * 多条件查询
     * @param employee
     * @return
     */
    public List<Employee> getEmpByTj(Employee employee);
}
