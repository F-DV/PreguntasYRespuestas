package com.project.questionandanswers.domain.model;

import java.time.LocalDate;

public class PlayerModel {

    private Long id;
    private String name;
    private String lastName;
    private LocalDate date;
    private int reward;

    public PlayerModel(Long id, String name, String lastName, LocalDate date, int reward) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.date = date;
        this.reward = reward;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        lastName = lastName;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getReward() {
        return reward;
    }

    public void setReward(int reward) {
        this.reward = reward;
    }
}