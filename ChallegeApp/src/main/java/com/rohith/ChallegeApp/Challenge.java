package com.rohith.ChallegeApp;

import java.time.LocalDate;

public class Challenge {
    private Long id;
    private String title;

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public int getDayNumber() {
        return dayNumber;
    }

    public void setDayNumber(int dayNumber) {
        this.dayNumber = dayNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Challenge(boolean completed, int dayNumber, String description, Long id, String title) {
        this.completed = completed;
        this.dayNumber = dayNumber;
        this.description = description;
        this.id = id;
        this.title = title;
    }

    private String description;
    private int dayNumber;
    private boolean completed;

    public Challenge() {
    }

   }
