package com.project.expensetracker.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;

@Document("expense")
public class Expense {
        @Id
        private String id;
        @Field(name = "name")
        @Indexed(unique = true)
        private String ExpenseName;
        @Field(name = "category")
        private ExpenseCategory expenseCategory;
        @Field(name = "amount")
        private BigDecimal expenseAmount;

        public Expense(String id, String expenseName, ExpenseCategory expenseCategory, BigDecimal expenseAmount) {
                this.id = id;
                ExpenseName = expenseName;
                this.expenseCategory = expenseCategory;
                this.expenseAmount = expenseAmount;
        }

        public String getId() {
                return id;
        }

        public void setId(String id) {
                this.id = id;
        }

        public String getExpenseName() {
                return ExpenseName;
        }

        public void setExpenseName(String expenseName) {
                ExpenseName = expenseName;
        }

        public ExpenseCategory getExpenseCategory() {
                return expenseCategory;
        }

        public void setExpenseCategory(ExpenseCategory expenseCategory) {
                this.expenseCategory = expenseCategory;
        }

        public BigDecimal getExpenseAmount() {
                return expenseAmount;
        }

        public void setExpenseAmount(BigDecimal expenseAmount) {
                this.expenseAmount = expenseAmount;
        }
}
