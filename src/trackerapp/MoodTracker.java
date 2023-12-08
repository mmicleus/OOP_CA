/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trackerapp;

/**
 *
 * @author Rodrigo
 */
import java.util.ArrayList;
import java.util.List;

public class MoodTracker {
    private List<MoodEntry> moodEntries;

    // Constructor
    public MoodTracker() {
        this.moodEntries = new ArrayList<>();
    }

    // Method to log mood entry
    public void logMood(MoodEntry moodEntry) {
        moodEntries.add(moodEntry);
        System.out.println("Mood logged successfully.");
    }

    // Method to analyze overall mood
    public String analyzeMood() {
        if (moodEntries.isEmpty()) {
            return "No mood entries available for analysis.";
        }

        // Your analysis logic goes here (e.g., calculate average mood)
        // For simplicity, we'll just return the latest mood in this example.
        MoodEntry latestEntry = moodEntries.get(moodEntries.size() - 1);
        return "Overall Mood: " + latestEntry.getMood();
    }

    // Getters and setters (if needed)

    public List<MoodEntry> getMoodEntries() {
        return moodEntries;
    }

    public void setMoodEntries(List<MoodEntry> moodEntries) {
        this.moodEntries = moodEntries;
    }

    // Example usage in a main method
    public static void main(String[] args) {
        // Create a MoodTracker instance
        MoodTracker moodTracker = new MoodTracker();

        // Log mood entries
        moodTracker.logMood(new MoodEntry("Happy"));
        moodTracker.logMood(new MoodEntry("Sad"));

        // Analyze overall mood
        System.out.println(moodTracker.analyzeMood());
    }

    private static class MoodEntry {

        public MoodEntry(String sad) {
        }

        private String getMood() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}
