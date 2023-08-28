package com.durcare.studentapp.dao;

import com.durcare.studentapp.bean.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.Statement;

@Repository
public class CompanyDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int createTable() {
        return jdbcTemplate.
                update("create table IF NOT EXISTS company(companyid serial primary key,companyname varchar(45) not null,address varchar(45) not null," +
                        "count numeric not null)");

    }

    public void saveCompany(Company company) {
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(con -> {
            PreparedStatement preparedStatement = con.prepareStatement("insert into company(companyname,address,count) values(?,?,?)",
                    new String[] { "companyid" });
            preparedStatement.setString(1, company.getCompanyName());
            preparedStatement.setString(2, company.getAddress());
            preparedStatement.setLong(3, company.getCount());
            return preparedStatement;
        }, keyHolder);
        Number key = keyHolder.getKey();
        System.out.println("Key :: " + key.longValue());
    }
}
