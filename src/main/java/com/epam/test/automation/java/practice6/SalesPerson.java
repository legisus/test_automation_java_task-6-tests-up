package com.epam.test.automation.java.practice6;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * <summary>
 * Implement code according to description of task.
 * </summary>
 */
public class SalesPerson extends Employee{
    private int percent;
    public SalesPerson(String lastName, BigDecimal salary, int percent) {
        super(lastName, salary);
        this.percent = percent;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    @Override
    public void setBonus(BigDecimal bonus) {
        if (Objects.isNull(bonus)){
            throw new IllegalArgumentException();
        }
        if(percent >= 100 && percent < 200) {
            bonus = bonus.add(bonus);
        } else {
            bonus = bonus.add(bonus).add(bonus);

        }
        super.setBonus(bonus);
    }
}