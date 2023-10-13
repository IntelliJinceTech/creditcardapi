package com.walletpro.walletproapi.model;

import javax.persistence.Embeddable;

@Embeddable
public class Perks {
    private String loyaltyProgram;
    private int tripCancellationInsurancePerPerson;
    private boolean rentalCarInsurance;
    private boolean lostBaggageCoverage;
    private boolean hasForeignTransactionFee;
    private boolean airportLoungeAccess;
}
