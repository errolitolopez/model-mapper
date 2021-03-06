package com.example.modelmapper.dao.gateway;

import com.example.modelmapper.dao.gateway.model.Company;

import java.util.List;

public interface CompanyGateway {
    List<Company> getAllCompanies();
}
