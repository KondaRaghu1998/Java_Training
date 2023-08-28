package com.durcare.studentapp.dao;

import com.durcare.studentapp.bean.Department;
import com.durcare.studentapp.bean.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

@Repository
public class EmployeeDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void saveEmployee(List<Employee> employeeList) {

        jdbcTemplate.batchUpdate("insert into employee(empname,depid) values(?,?)", new BatchPreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement ps, int i) throws SQLException {
                ps.setString(1, employeeList.get(i).getEmpName());
                ps.setInt(2, employeeList.get(i).getDepartment().getDepId());
            }

            @Override
            public int getBatchSize() {
                return employeeList.size();
            }
        });
    }



}
