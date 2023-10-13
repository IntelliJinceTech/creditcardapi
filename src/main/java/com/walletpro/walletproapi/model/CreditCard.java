package com.walletpro.walletproapi.model;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;


@Getter
@Setter
@Entity
@Table(name="credit_cards")
public class CreditCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="card_id")
    private Long id;

    @Column(name="bank_name")
    private String bank;

    @Column
    private String network;

    @Column(name = "credit_card_name")
    private String name;

    @Column
    private double groceryPercentage;

    @Column
    private double travelPercentage;

    @Column
    private double diningPercentage;

    @Column
    private double entertainmentPercentage;

    @Column
    private int groceryPointsMultipler;

    @Column
    private int travelPointsMultipler;

    @Column
    private int diningPointsMultipler;

    @Column
    private int entertainmentPointsMultipler;

    @Column
    private String lastFourDigits;

    @Column
    private Date expiryDate;

    @Column
    private int creditLimit;

    @Column
    private Date createdAt;

    @Column
    private Date updatedAt;

    @Column
    private String rewardType;

    @Column
    private int annualFee;

    @Column
    private int paymentSchedule = 30;

    @Column
    private boolean favorite = true;

}
