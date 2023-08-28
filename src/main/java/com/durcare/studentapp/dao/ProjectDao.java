package com.durcare.studentapp.dao;

import com.durcare.studentapp.bean.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

@Repository
public class ProjectDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    public void saveProject(List<Project> projectList) {

        jdbcTemplate.batchUpdate("insert into project(projectname,empid) values(?,?)",
                new BatchPreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement ps, int i) throws SQLException {
                ps.setString(1,projectList.get(i).getProjectName());
                ps.setInt(2,projectList.get(i).getEmployee().getEmpId());
            }

            @Override
            public int getBatchSize() {
                return projectList.size();
            }
        });
    }
}
