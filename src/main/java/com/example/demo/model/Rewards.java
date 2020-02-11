package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.Transient;

public abstract class Rewards {

    @JsonInclude
    @Transient
    protected Long points;

    public abstract Long getPoints();
}
