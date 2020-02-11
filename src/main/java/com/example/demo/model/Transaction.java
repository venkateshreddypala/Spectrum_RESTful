package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Transaction extends Rewards {
    @Id
    @GeneratedValue
    private long id;
    @JsonIgnore
    @ManyToOne
    @JoinColumn
    private Customer customer;
    private Double total;
    private String description;
    @Temporal(TemporalType.TIMESTAMP)
    private Date saveDate;

    @Override
    public Long getPoints() {
        this.points = 0l;

        if (this.total > 50 && this.total <= 100) {
            this.points += (this.total.intValue() - 50) * 1;

        }

        if (this.total > 100) {
            this.points += 50;  //1 point for every dollar spent over $50
            this.points += (this.total.intValue() - 100) * 2;  //2 points for every dollar spent over $100
        }

        return this.points;
    }

    @Override
    public String toString() {
        return String.format("Transaction [id=%s, customer=%s, total=%s, description=%s, saveDate=%s]", id, customer,
                total, description, saveDate);
    }

}
