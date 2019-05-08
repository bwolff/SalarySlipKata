package org.neomatrix369.salaryslip;

import org.junit.Test;
import org.neomatrix369.salaryslip.domain.Employee;
import org.neomatrix369.salaryslip.domain.SalarySlip;

import java.math.BigDecimal;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class SalarySlipGeneratorShould {

    @Test
    public void calculateScenario1Correctly() {
        Employee employee = Employee.builder()
                .id("4711")
                .name("John Doe")
                .annualGrossSalary(BigDecimal.valueOf(24000d))
                .build();

        SalarySlip expectedSalarySlip = SalarySlip.builder()
                .employee(employee)
                .monthlyGrossSalary(BigDecimal.valueOf(200))
                .nationalInsuranceContributions(BigDecimal.valueOf(159.40))
                .taxFreeAllowance(BigDecimal.valueOf(916.67))
                .taxableIncome(BigDecimal.valueOf(1083.33))
                .taxPayable(BigDecimal.valueOf(1216.67))
                .build();

        SalarySlip actualSalarySlip = new SalarySlipGenerator().generateFor(employee);

        assertThat(actualSalarySlip,equalTo(expectedSalarySlip));
    }
}
