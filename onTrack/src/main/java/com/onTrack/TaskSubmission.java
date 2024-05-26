package com.onTrack;

import java.time.LocalDateTime;

public class TaskSubmission {
    private TaskSubmissionInfo[] submissions;
    private int submissionCount;

    public TaskSubmission(int maxSubmissions) {
        this.submissions = new TaskSubmissionInfo[maxSubmissions];
        this.submissionCount = 0;
    }

    public boolean submitTask(String studentID, String courseCode, String taskTitle,
                              String taskDescription) {
        // Check if student ID and course code are not null or empty
        if (studentID == null || studentID.isEmpty() || courseCode == null || courseCode.isEmpty()) {
            return false;
        }

        // Check if there's space in the array
        if (submissionCount >= submissions.length) {
            return false;
        }

        // Store the task submission metadata (simplified)
        TaskSubmissionInfo submissionInfo = new TaskSubmissionInfo(studentID, courseCode,
                taskTitle, taskDescription, LocalDateTime.now());

        // Add the submission to the array
        submissions[submissionCount] = submissionInfo;
        submissionCount++;

        return true;
    }

    
}
