package com.devsuperpoo.interfaces2.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {

    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy _HH:mm");

    private LocalDate dueDate;
    private Double amount;

    public Installment() {
    }

    public Installment(LocalDate dueDate, Double amount) {
        this.dueDate = dueDate;
        this.amount = amount;
    }

    public DateTimeFormatter getFmt() {
        return fmt;
    }

    public void setFmt(DateTimeFormatter fmt) {
        this.fmt = fmt;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return dueDate.format(fmt)
                + " - " +
                String.format("%.2f", amount);
    }
}

