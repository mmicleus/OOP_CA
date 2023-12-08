/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trackerapp;

import java.io.Serializable;
import java.util.ArrayList;
import trackerapp.enums.WorkoutExperience;
import trackerapp.enums.WorkoutType;
//import trackerapp.forms.WorkoutType;

/**
 *
 * @author micle
 */
public class WorkoutPlan implements Serializable {
    
    public ArrayList<Workout> workouts;
    public WorkoutExperience experience;
    public WorkoutType type;

    public WorkoutPlan() {
        this.workouts = new ArrayList<Workout>();
        this.experience = WorkoutExperience.BEGINNER;
        this.type=WorkoutType.WEIGHTLIFTING;
    }

    public WorkoutPlan(ArrayList<Workout> workouts, WorkoutExperience experience, WorkoutType type) {
        this.workouts = workouts;
        this.experience = experience;
        this.type = type;
    }

    public ArrayList<Workout> getWorkouts() {
        return workouts;
    }

    public void setWorkouts(ArrayList<Workout> workouts) {
        this.workouts = workouts;
    }

    public WorkoutExperience getExperience() {
        return experience;
    }

    public void setExperience(WorkoutExperience experience) {
        this.experience = experience;
    }

    public WorkoutType getType() {
        return type;
    }

    public void setType(WorkoutType type) {
        this.type = type;
    }
    
    
    
    
    
    
}


