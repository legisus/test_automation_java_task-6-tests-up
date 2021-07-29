package com.epam.test.automation.java.practice6;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * <summary>
 * Implement code according to description of task.
 * </summary>
 */
public class Manager extends Employee{
    private int clientAmount;

    public Manager(String lastName, BigDecimal salary, int clientAmount) {
        super(lastName, salary);
        this.clientAmount = clientAmount;
    }


    @Override
    public void setBonus(BigDecimal bonus) {
        if (Objects.isNull(bonus)){
            throw new IllegalArgumentException();
        }
        if (clientAmount >= 100 && clientAmount < 150) {
            bonus = (bonus).add(new BigDecimal(500));
        }
        else {
            bonus = (bonus).add(new BigDecimal(1000));
        }
        super.setBonus(bonus);
    }
}
