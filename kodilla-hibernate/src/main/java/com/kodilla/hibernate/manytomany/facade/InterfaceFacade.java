package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InterfaceFacade {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;
    private final static Logger LOGGER = LoggerFactory.getLogger(InterfaceFacade.class);

    public CompanyDto findCompanyContainsFewLetters(String searchPart) throws SearchInDatabaseException {
        boolean wasError = false;
        LOGGER.info("Searching for companies which names contains " + searchPart);
        List<Company> resultCompany = companyDao.findCompanyWithSpecifiedLettersInName(searchPart);
        if (resultCompany.size() <= 0 ) {
            LOGGER.error(SearchInDatabaseException.ERR_NO_RESULT);
            wasError = true;
            throw new SearchInDatabaseException(SearchInDatabaseException.ERR_NO_RESULT);
        }
        if (wasError) {
            return new CompanyDto();
        }
        LOGGER.info("Found " + resultCompany.size() + "companies.");
        CompanyDto resultCompaniesNames = new CompanyDto(resultCompany);
        return resultCompaniesNames;
    }

    public EmployeeDto findEmployeeContainsFewLetters(String searchPart) throws SearchInDatabaseException {
        boolean wasError = false;
        LOGGER.info("Searching for employee which names contains " + searchPart);
        List<Employee> result = employeeDao.findEmployeeWithSpecifiedLettersInSurname(searchPart);
        if (result.size() <= 0 ) {
            LOGGER.error(SearchInDatabaseException.ERR_NO_RESULT);
            throw new SearchInDatabaseException(SearchInDatabaseException.ERR_NO_RESULT);
        }
        if (wasError) {
            return new EmployeeDto();
        }
        LOGGER.info("Found " + result.size() + "employees.");
        EmployeeDto resultNames = new EmployeeDto(result);

        return resultNames;
    }
}
