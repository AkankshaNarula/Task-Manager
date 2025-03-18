package com.example.task_manager.model;

import jakarta.persistence.*;

@Entity  // Marks this class as a database entity (table)
@Table(name = "taskdb")  // The table name in the database
public class Task {

    @Id  // Marks this field as the Primary Key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-incremented ID
    private Long id;

    @Column(nullable = false)  // Ensures title is required (not null)
    private String title;

    private String description;  // Task details

    @Column(nullable = false)
    private boolean completed;  // True if task is done, false otherwise

    // 🛠 Constructor, Getters, and Setters

    public Task() {}  // Default constructor

    public Task(String title, String description, boolean completed) {
        this.title = title;
        this.description = description;
        this.completed = completed;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public boolean isCompleted() { return completed; }
    public void setCompleted(boolean completed) { this.completed = completed; }
}
