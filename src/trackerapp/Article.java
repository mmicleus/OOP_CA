/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trackerapp;

/**
 *
 * @author Rodrigo
 */
public class Article {
    private String title;
    private String content;

    // Constructor
    public Article(String title, String content) {
        this.title = title;
        this.content = content;
    }

    // Method to display the article
    public void displayArticle() {
        System.out.println("Title: " + title);
        System.out.println("Content: " + content);
    }

    // Getters and setters (if needed)

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    // Example usage in a main method
    public static void main(String[] args) {
        // Create an Article instance
        Article healthArticle = new Article("10 Tips for a Healthy Lifestyle", "...");
        
        // Display the article
        healthArticle.displayArticle();
    }
}
