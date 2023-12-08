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
public class Activity implements Serializable {
    private String name;
    private int dayOfWeek;
    
    public Activity(){
        name = "";
        dayOfWeek = 0;
    }
    
    public Activity(String name,int dayOfWeek){
        this.name = name;
        this.dayOfWeek = dayOfWeek;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(int dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }
    
    
}
