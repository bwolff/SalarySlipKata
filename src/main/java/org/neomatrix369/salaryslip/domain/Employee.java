package org.neomatrix369.salaryslip.domain;

import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;

@Builder
@Getter
public class Employee {

    private String id;
    private String name;
    private BigDecimal annualGrossSalary;
}
