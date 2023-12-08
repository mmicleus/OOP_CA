/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trackerapp;

import java.io.Serializable;

/**
 *
 * @author micle
 */
public class Exercise implements Serializable {
    private int sets;
    private int reps;
    private String name;

    public Exercise(String name,int sets, int reps) {
        this.sets = sets;
        this.reps = reps;
        this.name = name;
    }

    public Exercise() {
        this.sets = 0;
        this.reps = 0;
        this.name = "";
    }

    public int getSets() {
        return sets;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    public int getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
