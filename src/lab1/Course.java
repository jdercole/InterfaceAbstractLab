
package lab1;

/**
 *
 * @author Jenna
 */
public abstract class Course {
    private double credits;
    private int courseId;
    private String courseName;
    private String instructor;

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) throws IllegalArgumentException {
        if(credits < 0.5 || credits > 4.0) {
            throw new IllegalArgumentException("Error: credits must be in the range 0.5 to 4.0");
        } else {
            this.credits = credits;
        }
    }

    public int getCourseId() {
        return courseId;
    }

     public void setCourseId(int courseId) throws IllegalArgumentException {
        if(courseId <= 0) {
            throw new IllegalArgumentException("Error: course number must be set!");
        } else {
            this.courseId = courseId;
        } 
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) throws IllegalArgumentException {
        if (courseName == null || courseName.length() == 0) {
            throw new IllegalArgumentException("Course name cannot be null or empty string!");
        } else {
            this.courseName = courseName;
        }
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }
    
    
    
}
