package com.walletpro.walletproapi.repository;


import com.walletpro.walletproapi.model.CreditCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<CreditCard, Long> {
}
