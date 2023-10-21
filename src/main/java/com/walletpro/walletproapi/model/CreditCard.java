package com.walletpro.walletproapi.model;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
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
    private Timestamp createdAt;

    @Column
    private Timestamp updatedAt;

    @Column
    private String rewardType;

    @Column
    private int annualFee;


}
