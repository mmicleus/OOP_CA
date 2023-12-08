/*
 * Cl
ick nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trackerapp;

import trackerapp.enums.WorkoutExperience;
import trackerapp.enums.WorkoutType;

/**
 *
 * @author micle
 */
public class WorkoutPlanFilters {

    private WorkoutExperience experience;
    private int daysAWeek;
    private WorkoutType workoutType;
    
    public WorkoutPlanFilters() {
        experience = WorkoutExperience.BEGINNER;
        daysAWeek = 0;
        workoutType = WorkoutType.WEIGHTLIFTING;
    }

    public WorkoutPlanFilters(WorkoutExperience experience, int daysAWeek, WorkoutType workoutType) {
        this.experience = experience;
        this.daysAWeek = daysAWeek;
        this.workoutType = workoutType;
    }

    public WorkoutExperience getExperience() {
        return experience;
    }

    public void setExperience(WorkoutExperience experience) {
        this.experience = experience;
    }

    public int getDaysAWeek() {
        return daysAWeek;
    }

    public void setDaysAWeek(int daysAWeek) {
        this.daysAWeek = daysAWeek;
    }

    public WorkoutType getWorkoutType() {
        return workoutType;
    }

    public void setWorkoutType(WorkoutType workoutType) {
        this.workoutType = workoutType;
    }
    
    
    
}
