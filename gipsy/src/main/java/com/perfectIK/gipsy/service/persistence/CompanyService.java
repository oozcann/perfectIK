package com.perfectIK.gipsy.service.persistence;

import com.perfectIK.gipsy.model.company.Company;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CompanyService extends MongoRepository<Company,String> {
}
