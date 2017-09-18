package lab2;

import java.util.ArrayList;

/**
 * Describe responsibilities here.
 *
 * @author      Jenna
 * @version     1.00
 */
public class IntroJavaCourse {
    private String courseName;
    private int courseId;
    private double credits;
    private String instructor;
    private ArrayList prerequisitesByCourseId;

    public IntroJavaCourse(String courseName, int courseId) {
        setCourseName(courseName);
        setCourseId(courseId);
    }
    
    public String getCourseName() {
        return courseName;
    }

    public final void setCourseName(String courseName) throws IllegalArgumentException {
        if (courseName == null || courseName.length() == 0) {
            throw new IllegalArgumentException("Course name cannot be null or empty string!");
        } else {
            this.courseName = courseName;
        }
    }

    public int getCourseId() {
        return courseId;
    }

    public final void setCourseId(int courseId) throws IllegalArgumentException {
        if(courseId <= 0) {
            throw new IllegalArgumentException("Error: course number must be set!");
        } else {
            this.courseId = courseId;
        } 
    }

    public double getCredits() {
        return credits;
    }

    public final void setCredits(double credits) throws IllegalArgumentException {
        if(credits < 0.5 || credits > 4.0) {
            throw new IllegalArgumentException("Error: credits must be in the range 0.5 to 4.0");
        } else {
            this.credits = credits;
        }
    }
    
    public String getInstructor() {
        return instructor;
    }

    public final void setInstructor(String instructor) {
        if (instructor == null || instructor.length() == 0) {
            throw new IllegalArgumentException("Instructor cannot be null or empty string!");
        } else {
            this.instructor = instructor;
        }
    }

     public ArrayList getPrerequisites() {
        return prerequisitesByCourseId;
    }

    public final void setPrerequisite(int courseId) throws IllegalArgumentException {
        if(courseId < 0) {
            throw new IllegalArgumentException("Error: prerequisites cannot be negative.");
        } else {
            prerequisitesByCourseId.add(courseId);
        }
    }

    
}
