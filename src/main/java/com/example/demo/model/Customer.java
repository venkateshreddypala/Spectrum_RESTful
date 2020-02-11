package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class Customer {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Transaction> transactions;
    @JsonInclude
    @Transient
    private Long rewardPoints;
    @JsonInclude
    @Transient
    private Double totalPurchases;

    public Long getRewardPoints() {
        if (transactions == null || transactions.isEmpty()) return 0l;

        return transactions.stream().map(x -> x.getPoints().intValue()).reduce(0, (a, b) -> a + b).longValue();
    }

    public Double getTotalPurchases() {
        if (transactions == null || transactions.isEmpty()) return 0d;
        return transactions.stream().map(x -> x.getTotal().doubleValue()).reduce(0d, (a, b) -> a + b).doubleValue();
    }


}
