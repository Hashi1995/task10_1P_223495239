package com.onTrack;

import java.time.LocalDateTime;

public class TaskSubmissionInfo {
    private String studentID;
    private String courseCode;
    private String taskTitle;
    private String taskDescription;
    private LocalDateTime submissionDateTime;

    public TaskSubmissionInfo(String studentID, String courseCode, String taskTitle, String taskDescription, LocalDateTime submissionDateTime) {
        this.studentID = studentID;
        this.courseCode = courseCode;
        this.taskTitle = taskTitle;
        this.taskDescription = taskDescription;
        this.submissionDateTime = submissionDateTime;
    }

    // Getters and setters
    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public LocalDateTime getSubmissionDateTime() {
        return submissionDateTime;
    }

    public void setSubmissionDateTime(LocalDateTime submissionDateTime) {
        this.submissionDateTime = submissionDateTime;
    }
}
