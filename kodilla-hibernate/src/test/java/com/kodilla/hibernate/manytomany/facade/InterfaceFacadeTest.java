package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

import static org.junit.Assert.*;

@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest
public class InterfaceFacadeTest {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    InterfaceFacade interfaceFacade;

    @Test
    public void testFindCompanyContainsFewLetters() {
        //Given
        Company company1 = new Company("XYZCOMPany");
        Company company2 = new Company("XYZknjbrCOMPany");
        Company company3 = new Company("fewqXYZCOMPany");
        Company company4 = new Company("ccccXYZCOMPany");
        Company company5 = new Company("jnkherjkhXYZCOMPany");
        Company company6 = new Company("jnkherjkhCOMPany");

        companyDao.save(company1);
        companyDao.save(company2);
        companyDao.save(company3);
        companyDao.save(company4);
        companyDao.save(company5);
        companyDao.save(company6);

        CompanyDto resultCompanies = new CompanyDto();

        //When
        try {
            resultCompanies = interfaceFacade.findCompanyContainsFewLetters("XYZ");
        } catch (SearchInDatabaseException e) {
            //not my problem.
        }

        //Then
        Assert.assertEquals(5, resultCompanies.getCompaniesName().size());
    }

    @Test
    public void testFindEmployeeContainsFewLetters() {
        //Given
        Employee employee1 = new Employee("JAN", "XYZnfij");
        Employee employee2 = new Employee("JAN", "dfdccXYZnfij");
        Employee employee3 = new Employee("JAN", "cswwcvXYZ");
        Employee employee4 = new Employee("JAN", "cnfij");
        Employee employee5 = new Employee("JAN", "jnknfij");

        employeeDao.save(employee1);
        employeeDao.save(employee2);
        employeeDao.save(employee3);
        employeeDao.save(employee4);
        employeeDao.save(employee5);

        EmployeeDto resultEmployees = new EmployeeDto();

        //When
        try {
            resultEmployees = interfaceFacade.findEmployeeContainsFewLetters("XYZ");
        } catch (SearchInDatabaseException e) {
            //not my problem.
        }

        //Then
        Assert.assertEquals(3, resultEmployees.getEmployeesNames().size());
    }

}