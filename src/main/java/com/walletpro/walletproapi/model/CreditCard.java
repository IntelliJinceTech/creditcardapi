package com.walletpro.walletproapi.model;
import jakarta.persistence.*;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="credit_cards")
public class CreditCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="bank_name")
    private String bank;
    private String network;

    @Column(name = "credit_card_name", nullable = false, unique = true)
    private String name;

    @ElementCollection
    @CollectionTable(name = "credit_card_rewards")
    private ArrayList<Reward> rewards;
    private String lastFourDigits;
    private Date expiryDate;
    private int creditLimit;
    private Date createdAt;
    private Date updatedAt;
    private String rewardType;
    private int annualFee;
    private int paymentSchedule = 30;
    private boolean favorite = true;

    @Embedded
    private Perks perks;

}
