package com.walletpro.walletproapi.model;

import javax.persistence.Embeddable;

@Embeddable
public class Reward {
    private String category;
    private double percent;
    private double points;
    private double rewardLimit;
}
