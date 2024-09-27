package com.devsuperpoo.interfaces2.services;

import com.devsuperpoo.interfaces2.entities.Contract;
import com.devsuperpoo.interfaces2.entities.Installment;

import java.time.LocalDate;

public class ContractService {
    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void prossContract(Contract contract, int months) {
        double basicQuota = contract.getTotalValue() / months;

        for (int i = 0; i < months; i++) {
            LocalDate dueDate = contract.getDate().plusMonths(i);
            double interest = onlinePaymentService.interest(basicQuota,i);
            double fee = onlinePaymentService.paymentFee(basicQuota + interest);
            double quota = basicQuota + interest + fee;
            contract.getInstallments().add(new Installment(dueDate, quota));



            
        }
    }
    
    
}
