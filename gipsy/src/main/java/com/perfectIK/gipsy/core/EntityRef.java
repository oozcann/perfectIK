package com.perfectIK.gipsy.core;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.data.annotation.Id;

@JsonInclude(value= JsonInclude.Include.NON_EMPTY)
public class EntityRef {

    @Id
    private String id;
    private String type;
    private String name;
    private String uniqueName;
    private String internalUniqueName;

    public EntityRef() {
    }

    public EntityRef(String id, String type, String name) {
        this.id = id;
        this.type = type;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public String getInternalUniqueName() {
        return internalUniqueName;
    }

    public void setInternalUniqueName(String internalUniqueName) {
        this.internalUniqueName = internalUniqueName;
    }
}
