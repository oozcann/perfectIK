package com.perfectIK.gipsy.model.company;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.perfectIK.gipsy.model.entityproperties.CreationDatedEntity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document("COMPANY")
//@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, property = "_class")
public class Company implements CreationDatedEntity {

    @Id
    private String id;

    private String name;
    private String uniqueName;
    private String address;
    private String phone;
    private Date creationDate = new Date();

    public Company() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniqueName() {
        return uniqueName;
    }

    public void setUniqueName(String uniqueName) {
        this.uniqueName = uniqueName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public Date getCreationDate() {
        return creationDate;
    }

    @Override
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
