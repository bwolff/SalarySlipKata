package org.neomatrix369.salaryslip.domain;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.math.BigDecimal;

@Builder
@Getter
@EqualsAndHashCode
public class Employee {

    private final String id;
    private final String name;
    @EqualsAndHashCode.Exclude private final BigDecimal annualGrossSalary;
}
