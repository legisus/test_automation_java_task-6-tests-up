package com.epam.test.automation.java.practice6;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * <summary>
 * Implement code according to description of task.
 * </summary>
 */
public class Company {
        private Employee[] employees;

    public Company(Employee... employees) {
        this.employees = employees;
    }

    public void giveEverybodyBonus(BigDecimal companyBonus){
        if(Objects.isNull(companyBonus)){
            throw new IllegalArgumentException("CompanyBonus can not be null ");
        }
        for (Employee employee : employees) {
            employee.setBonus(companyBonus);
        }
    }

    public BigDecimal totalToPay(){
        BigDecimal totalAmount = BigDecimal.ZERO;
        for (Employee employee : employees) {
            totalAmount = totalAmount.add(employee.toPay());
        }
        return totalAmount;
    }

    public String nameMaxSalary(){
        Optional<Employee> max = Stream.of(employees).max(Comparator.comparing(Employee::toPay));
        if (max.isPresent()){
            return max.get().getLastName();
        }
        throw new IllegalArgumentException();
    }
}
