package com.perfectIK.gipsy.controller;

import com.perfectIK.gipsy.model.company.Company;
import com.perfectIK.gipsy.service.persistence.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/company")
public class CompanyController {
    @Autowired
    CompanyService companyService;

    @GetMapping("list")
    public ResponseEntity<List<Company>> getAllCompanies () {
        return ResponseEntity.ok(companyService.findAll());
    }

    @GetMapping("{companyId}")
    public ResponseEntity getCompanyById(@PathVariable String companyId) {
        Optional<Company> company = companyService.findById(companyId);
        if (company.isPresent()) {
            return ResponseEntity.ok(company.get());
        } else {
            return ResponseEntity.ok("Company not found");
        }

    }

    @PostMapping("save")
    public ResponseEntity<Company> saveCompany (@RequestBody Company company) {
        return ResponseEntity.ok(companyService.save(company));
    }

    @DeleteMapping("delete/{companyId}")
    public ResponseEntity deleteCompany(@PathVariable String companyId) {
        Optional<Company> company = companyService.findById(companyId);
        if (company.isPresent()) {
            company.get().setArchived(true);
            companyService.save(company.get());
            return ResponseEntity.ok("Company has been archived");
        } else {
            return ResponseEntity.ok("Company not found");
        }
    }
}
