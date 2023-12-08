/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trackerapp;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author micle
 */
public class Workout implements Serializable {
    public int dayOfWeek;
    public ArrayList<Exercise> exercises;

    public Workout() {
        this.dayOfWeek = 0;
        this.exercises = new ArrayList<Exercise>();
    }

    public Workout(int dayOfWeek, ArrayList<Exercise> exercises) {
        this.dayOfWeek = dayOfWeek;
        this.exercises = exercises;
    }

    public int getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(int dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public ArrayList<Exercise> getExercises() {
        return exercises;
    }

    public void setExercises(ArrayList<Exercise> exercises) {
        this.exercises = exercises;
    }
    
}
