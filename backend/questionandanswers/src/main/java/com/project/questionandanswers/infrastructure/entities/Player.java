package com.project.questionandanswers.infrastructure.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "players")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name",nullable = false)
    private String name;

    @Column(name = "last_name",nullable = false)
    private String last_name;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "reward",nullable = false)
    private int reward;

    public Player(Long id, String name, String last_name, LocalDate date, int reward) {
        this.id = id;
        this.name = name;
        this.last_name = last_name;
        this.date = date;
        this.reward = reward;
    }

    public Player(String name, String last_name, int reward) {
        this.name = name;
        this.last_name = last_name;
        this.reward = reward;
    }

    public Player() {
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

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return reward == player.reward && Objects.equals(id, player.id) && Objects.equals(name, player.name) && Objects.equals(last_name, player.last_name) && Objects.equals(date, player.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, last_name, date, reward);
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", date=" + date +
                ", reward=" + reward +
                '}';
    }
}
