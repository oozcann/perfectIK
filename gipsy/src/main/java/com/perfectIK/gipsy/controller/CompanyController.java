package com.perfectIK.gipsy.controller;

import com.perfectIK.gipsy.model.company.Company;
import com.perfectIK.gipsy.service.persistence.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/company")
public class CompanyController {
    @Autowired
    CompanyService companyService;

    @GetMapping("list")
    public ResponseEntity<List<Company>> getAllCompanies () {
        return ResponseEntity.ok(companyService.findAll());
    }

    @PostMapping("save")
    public ResponseEntity<Company> saveCompany (@RequestBody Company company) {
        return ResponseEntity.ok(companyService.save(company));
    }
}
