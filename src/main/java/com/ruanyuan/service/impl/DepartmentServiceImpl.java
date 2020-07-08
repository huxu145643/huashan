package com.ruanyuan.service.impl;

import com.ruanyuan.dao.DepartmentDao;
import com.ruanyuan.pojo.Department;
import com.ruanyuan.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentDao departmentDao;

    /**
     * 查询所有部门
     * @return
     */
    public List<Department> getAllDepartment() {
        return departmentDao.getAllDepartment();
    }


    /**
     * 添加部门
     * @return
     */
    public int addDepartment(Department department) {
        return departmentDao.addDepartment(department);
    }

    /**
     * 根据id查询部门
     * @param deptno
     * @return
     */
    public Department getDepartmentById(int deptno) {
        return departmentDao.getDepartmentById(deptno);
    }

    /**
     * 修改部门
     * @param department
     * @return
     */
    public int updateDepartment(Department department) {
        return departmentDao.updateDepartment(department);
    }

    @Override
    public int deleteDepartment(int deptno) {
        return departmentDao.deleteDepartment(deptno);
    }
}
