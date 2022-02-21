package com.healthincode.nextreportgenerator.cucumber;

import com.healthincode.nextreportgenerator.IntegrationTest;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@IntegrationTest
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
