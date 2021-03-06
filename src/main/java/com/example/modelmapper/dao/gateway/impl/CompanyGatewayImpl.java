package com.example.modelmapper.dao.gateway.impl;

import com.example.modelmapper.dao.gateway.CompanyGateway;
import com.example.modelmapper.dao.gateway.model.Company;
import com.example.modelmapper.dao.persistence.entity.CompanyEntity;
import com.example.modelmapper.mapper.CompanyMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class CompanyGatewayImpl implements CompanyGateway {

    private final CompanyMapper mapper;

    @Override
    public List<Company> getAllCompanies() {

        return Stream.of(
                new CompanyEntity(1L, "BENCH", "MANILA"),
                new CompanyEntity(2L, "BENCH", "MAKATI"),
                new CompanyEntity(3L, "BENCH", "PASIG"))
                .map(mapper::mapEntityToModel)
                .collect(Collectors.toList());
    }
}
