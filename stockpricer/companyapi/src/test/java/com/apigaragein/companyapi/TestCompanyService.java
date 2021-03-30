package com.apigaragein.companyapi;

import com.apigaragein.companyapi.dao.CompanyDao;
import com.apigaragein.companyapi.model.Company;

import com.apigaragein.companyapi.service.CompanyService;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
@SpringBootTest(classes = CompanyapiApplication.class)
public class TestCompanyService {

    @InjectMocks
    CompanyService companyService;

    @Mock
    CompanyDao companyDao;

    @Test
    public void getAllCompaniesTest()
    {
        List<Company> list = new ArrayList<Company>();
        Company companyOne = new Company("1", "TestCompany1", "TC1", "111", "India", "222", "Consumer Services", "Tech");
        Company companyTwo = new Company("2", "TestCompany2", "TC2", "112", "China", "223", "Banking", "Finance");
        Company companyThree = new Company("3", "TestCompany3", "TC3", "113", "USA", "224", "Electronic", "Tech");

        list.add(companyOne);
        list.add(companyTwo);
        list.add(companyThree);

        when(companyDao.getCompanyList()).thenReturn(list);

        //test
        List<Company> companyList = companyService.getCompanyList();

        assertEquals(3, companyList.size());
        verify(companyDao, times(1)).getCompanyList();
    }

    @Test
    public void getCompanyByIdTest()
    {
        when(companyDao.getCompanyById("1")).thenReturn(new Company("1", "TestCompany3", "TC1", "111", "India", "222", "Consumer Servifces", "Tech"));

        Company company = companyService.getCompanyById("1");

        assertEquals("TestCompany3", company.getCompanyName());
        assertEquals("111", company.getMarketCap());
        assertEquals("India", company.getCountry());
    }

    @Test
    public void createCompanyTest()
    {
        Company company = new Company("1", "TestCompany1", "TC1", "111", "India", "222", "Consumer Services", "Tech");

        companyService.addCompany(company);

        verify(companyDao, times(1)).addCompany(company);;
    }

    @Test
    public void modifyCompanyTest()
    {
        when(companyDao.getCompanyById("1")).thenReturn(new Company("1", "TestCompany1", "TC1", "111", "India", "222", "Consumer Servifces", "Tech"));

        Company company = companyService.getCompanyById("1");
        company.setCompanyName("TestCompany4");

        companyService.modifyCompany(company);
        verify(companyDao, times(1)).modifyCompany(company);;
        assertEquals("TestCompany4", company.getCompanyName());
    }
    @Test
    public void deleteCompanyTest()
    {
        when(companyDao.getCompanyById("1")).thenReturn(new Company("1", "TestCompany1", "TC1", "111", "India", "222", "Consumer Servifces", "Tech"));
        Company company = companyService.getCompanyById("1");

        companyService.deleteCompany(company.getCompanyId());
        verify(companyDao, times(1)).deleteCompany(company.getCompanyId());
    }
}

