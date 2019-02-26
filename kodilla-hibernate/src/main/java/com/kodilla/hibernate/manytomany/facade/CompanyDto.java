package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;

import java.util.ArrayList;
import java.util.List;

public class CompanyDto {
    List<String> companiesName;

    public CompanyDto(List<Company> companies) {
        companiesName = new ArrayList<>();
        for (Company company: companies) {
            companiesName.add(company.getName());
        }
    }

    public CompanyDto() {
        companiesName = new ArrayList<>();
    }

    public List<String> getCompaniesName() {
        return this.companiesName;
    }
}
