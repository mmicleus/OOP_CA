/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trackerapp;

/**
 *
 * @author Rodrigo
 */
import java.util.Scanner;

public class CalorieCounter {
    private int calorieIntake;
    private final int recommendedCalorieIntake;

    // Constructor
    public CalorieCounter() {
        this.calorieIntake = 0;
        this.recommendedCalorieIntake = calculateRecommendedIntake();
    }

    // Method to calculate the recommended calorie intake
    private int calculateRecommendedIntake() {
        // Your calculation logic goes here (e.g., based on user profile, activity level, etc.)
        // For simplicity, we'll use a constant value in this example.
        return 2000;
    }

    // Method to log calories
    public void logCalories() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of calories consumed: ");

        // Validate input (assuming a positive integer input)
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Please enter a valid integer: ");
            scanner.next(); // Consume the invalid input
        }

        int consumedCalories = scanner.nextInt();
        this.calorieIntake += consumedCalories;

        System.out.println("Calories logged successfully.");
    }

    // Method to get the current calorie intake
    public int getCalorieIntake() {
        return calorieIntake;
    }

    // Method to get the recommended calorie intake
    public int getRecommendedCalorieIntake() {
        return recommendedCalorieIntake;
    }

    public static void main(String[] args) {
        // Example usage
        CalorieCounter calorieCounter = new CalorieCounter();
        calorieCounter.logCalories();

        System.out.println("Current Calorie Intake: " + calorieCounter.getCalorieIntake());
        System.out.println("Recommended Calorie Intake: " + calorieCounter.getRecommendedCalorieIntake());
    }
}

