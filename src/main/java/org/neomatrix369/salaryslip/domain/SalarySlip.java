package org.neomatrix369.salaryslip.domain;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.math.BigDecimal;

@Builder
@Getter
@EqualsAndHashCode
public class SalarySlip {

    private final Employee employee;
    private final BigDecimal monthlyGrossSalary;
    private final BigDecimal nationalInsuranceContributions;
    private final BigDecimal taxFreeAllowance;
    private final BigDecimal taxableIncome;
    private final BigDecimal taxPayable;
}
