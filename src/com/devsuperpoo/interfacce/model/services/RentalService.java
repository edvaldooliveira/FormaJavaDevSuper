package com.devsuperpoo.interfacce.model.services;

import com.devsuperpoo.interfacce.model.entities.CarRental;
import com.devsuperpoo.interfacce.model.entities.Invoice;

import java.time.Duration;

public class RentalService {

    private Double pricePerDay;
    private Double pricePorhour;

    private TaxService taxService;

    public RentalService(){
    }

    public RentalService(Double pricePerDay, Double pricePorhour, TaxService taxService) {
        this.pricePerDay = pricePerDay;
        this.pricePorhour = pricePorhour;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental){

        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();

        double hours = minutes / 60.0;

        double basicPayment;
        if (hours <= 12.0){
            basicPayment = pricePerDay * Math.ceil(hours / 24);

        }
        else {
            basicPayment = pricePerDay * Math.ceil(hours / 24);
        }

        double tax = taxService.tax(basicPayment);
        carRental.setInvoice(new Invoice(basicPayment, tax));

    }

}
