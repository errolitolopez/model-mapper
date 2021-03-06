package com.example.modelmapper.mapper.impl;

import com.example.modelmapper.dao.gateway.model.Company;
import com.example.modelmapper.dao.persistence.entity.CompanyEntity;
import com.example.modelmapper.mapper.CompanyMapper;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CompanyMapperImpl implements CompanyMapper {

    private final ModelMapper mapper;

    public CompanyMapperImpl() {
        this.mapper = new ModelMapper();
    }

    @Override
    public Company mapEntityToModel(CompanyEntity obj) {
        return mapper.map(obj, Company.class);
    }

    @Override
    public CompanyEntity mapModelToEntity(Company obj) {
        return mapper.map(obj, CompanyEntity.class);
    }
}
