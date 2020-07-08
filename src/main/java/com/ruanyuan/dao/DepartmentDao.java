package com.ruanyuan.dao;

import com.ruanyuan.pojo.Department;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentDao {

    /**
     * 查询所有部门
     * @return
     */
    public List<Department> getAllDepartment();

    /**
     * 添加部门
     * @return
     */
    public int addDepartment(Department department);

    /**
     * 根据id查询部门
     * @param deptno
     * @return
     */
    public Department getDepartmentById(int deptno);

    /**
     * 修改部门
     * @param department
     * @return
     */
    public int updateDepartment(Department department);

    /**
     * 删除部门
     * @param deptno
     * @return
     */
    public int deleteDepartment(int deptno);
}
