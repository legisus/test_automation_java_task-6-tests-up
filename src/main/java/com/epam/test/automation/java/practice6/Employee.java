package com.epam.test.automation.java.practice6;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * <summary>
 * Implement code according to description of task.
 * </summary>
 */
public class Employee {
    private String lastName;
    private BigDecimal salary;
    private BigDecimal bonus;


    public Employee(String lastName, BigDecimal salary) {
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getLastName() {
        return lastName;
    }


    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
        if (salary.compareTo(BigDecimal.ZERO) <= 0){
            throw new IllegalArgumentException();
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }

    public BigDecimal getBonus() {
        return bonus;
    }

    public void setBonus(BigDecimal bonus) {
        if (Objects.isNull(bonus)){
            throw new IllegalArgumentException();
        }
        if (bonus.compareTo(BigDecimal.ZERO) <= 0){
            throw new IllegalArgumentException();
        }

        this.bonus = bonus;
    }

    public BigDecimal toPay(){
        if (Objects.isNull(bonus)){
            throw new IllegalArgumentException();
        }
        return salary.add(bonus);
    }
}
