package com.example.UserDataService.model;

import java.util.List;

public class User {
    private String name;
    private String bio;
    private List<WorkoutItem> workouts;

    public User(String name, String bio, List<WorkoutItem> workouts) {
        this.name = name;
        this.bio = bio;
        this.workouts = workouts;
    }

    public List<WorkoutItem> getWorkouts() {
        return workouts;
    }

    public void setWorkouts(List<WorkoutItem> workouts) {
        this.workouts = workouts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
