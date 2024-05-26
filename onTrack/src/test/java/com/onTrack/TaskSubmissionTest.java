package com.onTrack;

import org.junit.Test;
import static org.junit.Assert.*;

public class TaskSubmissionTest {
    @Test
    public void testSubmitTask_Success() {
        // Initialize TaskSubmission instance with capacity for 5 submissions
        TaskSubmission taskSubmission = new TaskSubmission(5);

        // Call the submitTask method
        boolean result = taskSubmission.submitTask("123", "CS101", "Assignment 1",
                "Write a Java program");

        // Verify that task submission was successful
        assertTrue(result);
    }

    @Test
    public void testSubmitTask_NullStudentID() {
        // Initialize TaskSubmission instance with capacity for 5 submissions
        TaskSubmission taskSubmission = new TaskSubmission(5);

        // Call the submitTask method with null student ID
        boolean result = taskSubmission.submitTask(null, "CS101", "Assignment 1",
                "Write a Java program");

        // Verify that task submission fails
        assertFalse(result);
    }

    @Test
    public void testSubmitTask_MaxSubmissionsReached() {
        // Initialize TaskSubmission instance with capacity for 1 submission
        TaskSubmission taskSubmission = new TaskSubmission(1);

        // Submit a task
        taskSubmission.submitTask("123", "CS101", "Assignment 1", "Write a Java program");

        // Call the submitTask method again
        boolean result = taskSubmission.submitTask("456", "CS102", "Assignment 2", "Write a Python program");

        // Verify that task submission fails
        assertFalse(result);
    }

    // More test cases can be added to cover various scenarios
}
