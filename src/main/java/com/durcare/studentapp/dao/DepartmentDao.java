package com.durcare.studentapp.dao;

import com.durcare.studentapp.bean.Department;
import com.durcare.studentapp.bean.Employee;
import com.durcare.studentapp.bean.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

@Repository
public class DepartmentDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void saveDepartment(List<Department> department) {

            jdbcTemplate.batchUpdate("insert into department(depname) values(?)", new BatchPreparedStatementSetter() {
                @Override
                public void setValues(PreparedStatement ps, int i) throws SQLException {
                    ps.setString(1, department.get(i).getDepName());
                }

                @Override
                public int getBatchSize() {
                    return department.size();
                }
            });
        }


    }

