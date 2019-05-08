package org.neomatrix369.salaryslip.domain;

import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;

@Builder
@Getter
public class SalarySlip {

    private Employee employee;
    private BigDecimal monthlyGrossSalary;
    private BigDecimal nationalInsuranceContributions;
    private BigDecimal taxFreeAllowance;
    private BigDecimal taxableIncome;
}
