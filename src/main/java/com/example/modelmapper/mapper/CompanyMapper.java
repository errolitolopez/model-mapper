package com.example.modelmapper.mapper;

import com.example.modelmapper.dao.gateway.model.Company;
import com.example.modelmapper.dao.persistence.entity.CompanyEntity;

public interface CompanyMapper {

    Company mapEntityToModel(CompanyEntity obj);

    CompanyEntity mapModelToEntity(Company obj);
}
