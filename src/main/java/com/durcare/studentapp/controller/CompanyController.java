package com.durcare.studentapp.controller;

import com.durcare.studentapp.bean.Company;
import com.durcare.studentapp.dao.CompanyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/app")
public class CompanyController {

    @Autowired
    private CompanyDao companyDao;

    @PostMapping(value = "/insertCompany")
    public ResponseEntity<String> saveCompany(@RequestBody Company company) {
        companyDao.createTable();
        companyDao.saveCompany(company);
        return ResponseEntity.ok("Table created and data inserted successfully.");
    }
}
