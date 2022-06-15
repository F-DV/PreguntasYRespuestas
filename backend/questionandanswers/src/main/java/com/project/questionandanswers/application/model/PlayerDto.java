package com.project.questionandanswers.application.model;

public class PlayerDto {

    private Long id;
    private String namePlayer;
    private String lastName;
    private int reward;

    public PlayerDto(Long id, String name, String lastName, int reward) {
        this.id = id;
        this.namePlayer = name;
        this.lastName = lastName;
        this.reward = reward;
    }

    public PlayerDto(String name, String lastName, int reward) {
        this.namePlayer = name;
        this.lastName = lastName;
        this.reward = reward;
    }

    public PlayerDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamePlayer() {
        return namePlayer;
    }

    public void setNamePlayer(String namePlayer) {
        this.namePlayer = namePlayer;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getReward() {
        return reward;
    }

    public void setReward(int reward) {
        this.reward = reward;
    }

    @Override
    public String toString() {
        return "PlayerDto{" +
                "id=" + id +
                ", namePlayer='" + namePlayer + '\'' +
                ", lastName='" + lastName + '\'' +
                ", reward=" + reward +
                '}';
    }
}
