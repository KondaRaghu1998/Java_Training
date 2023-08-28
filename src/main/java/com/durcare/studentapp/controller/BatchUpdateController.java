package com.durcare.studentapp.controller;

import com.durcare.studentapp.bean.BatchUpdate;
import com.durcare.studentapp.bean.Department;
import com.durcare.studentapp.dao.DepartmentDao;
import com.durcare.studentapp.service.BatchUpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

@RestController
@RequestMapping(value = "/app")
public class BatchUpdateController {

    @Autowired
    private BatchUpdateService batchUpdateService;


    @Autowired
    private JdbcTemplate jdbcTemplate;

    @PostMapping(value = "/insertBatch")
    public ResponseEntity<String> saveBatchUpdate(@RequestBody BatchUpdate batchUpdate) {
        batchUpdateService.saveBatchUpdate(batchUpdate.getDepartmentList(), batchUpdate.getEmployeeList(), batchUpdate.getProjectList());
        return ResponseEntity.ok("Batch update successs");
    }

    @PostMapping(value = "/insertDepartment")
    public ResponseEntity<String> saveOrUpdateBatchUpdate(@RequestBody List<Department> department) {

        List<Department> insertAdd = new ArrayList<>();
        List<Department> updateAdd = new ArrayList<>();
        if (!department.isEmpty() && department != null) {
            for (Department departments : department) {
                if (departments.getDepId() == 0) {
                    insertAdd.add(departments);
                } else {
                    updateAdd.add(departments);
                }
            }
        }


        jdbcTemplate.batchUpdate("insert into department(depname) values(?)", new BatchPreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement ps, int i) throws SQLException {
                ps.setString(1, insertAdd.get(i).getDepName());
            }

            @Override
            public int getBatchSize() {
                return insertAdd.size();
            }
        });

        jdbcTemplate.batchUpdate("update department set depname=? where depid=?", new BatchPreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement ps, int i) throws SQLException {
                ps.setString(1, updateAdd.get(i).getDepName());
                ps.setInt(2, updateAdd.get(i).getDepId());
            }

            @Override
            public int getBatchSize() {
                return updateAdd.size();
            }
        });

        return ResponseEntity.ok("Success...!!!");
    }
}
