package com.durcare.studentapp.service;

import com.durcare.studentapp.bean.Department;
import com.durcare.studentapp.bean.Employee;
import com.durcare.studentapp.bean.Project;
import com.durcare.studentapp.dao.DepartmentDao;
import com.durcare.studentapp.dao.EmployeeDao;
import com.durcare.studentapp.dao.ProjectDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BatchUpdateService {

    @Autowired
    private DepartmentDao departmentDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private ProjectDao projectDao;
    public void saveBatchUpdate(List<Department> departmentList, List<Employee> employeeList, List<Project> projectList) {

       departmentDao.saveDepartment(departmentList);
       employeeDao.saveEmployee(employeeList);
       projectDao.saveProject(projectList);
    }
}
