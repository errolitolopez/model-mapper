package com.example.modelmapper.dao.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CompanyEntity {
    private final Long id;
    private final String name;
    private final String location;
}
