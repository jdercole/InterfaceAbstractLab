
package lab1;

import java.util.ArrayList;

/**
 *
 * @author Jenna
 */
public abstract class ProgrammingCourse {
    private double credits;
    private int courseId;
    private String courseName;
    private String instructor;
    private ArrayList prerequisitesByCourseId;

    public final double getCredits() {
        return credits;
    }

    public final void setCredits(double credits) throws IllegalArgumentException {
        if(credits < 0.5 || credits > 4.0) {
            throw new IllegalArgumentException("Error: credits must be in the range 0.5 to 4.0");
        } else {
            this.credits = credits;
        }
    }

    public final int getCourseId() {
        return courseId;
    }

     public final void setCourseId(int courseId) throws IllegalArgumentException {
        if(courseId <= 0) {
            throw new IllegalArgumentException("Error: course number must be set!");
        } else {
            this.courseId = courseId;
        } 
    }

    public final String getCourseName() {
        return courseName;
    }

    public final void setCourseName(String courseName) throws IllegalArgumentException {
        if (courseName == null || courseName.length() == 0) {
            throw new IllegalArgumentException("Course name cannot be null or empty string!");
        } else {
            this.courseName = courseName;
        }
    }

    public final String getInstructor() {
        return instructor;
    }

    public final void setInstructor(String instructor) {
        if (instructor == null || instructor.length() == 0) {
            throw new IllegalArgumentException("Instructor cannot be null or empty string!");
        } else {
            this.instructor = instructor;
        }
    }
    
    public final ArrayList getPrerequisites() {
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
