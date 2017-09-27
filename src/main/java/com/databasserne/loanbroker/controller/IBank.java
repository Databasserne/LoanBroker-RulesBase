package com.databasserne.loanbroker.controller;

public interface IBank {
    boolean isRequirementMet(int creditScore, double amount, int months);
    String getName();
}
