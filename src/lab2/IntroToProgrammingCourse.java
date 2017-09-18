package lab2;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      Jenna
 * @version     1.00
 */
public class IntroToProgrammingCourse implements ProgrammingCourse {
    private String courseName;
    private int courseId;
    private double credits;
    private String instructor;

    public IntroToProgrammingCourse(String courseName, int courseId) {
        setCourseName(courseName);
        setCourseId(courseId);
    }

    public int getCourseId() {
        return courseId;
    }

    public final void setCourseId(int courseId) {
        if(courseId <= 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseId = courseId;
    }

    @Override
    public double getCredits() {
        return credits;
    }

    @Override
    public void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }

    @Override
    public String getCourseName() {
        return courseName;
    }

    @Override
    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }

    @Override
    public String getInstructor() {
        return instructor;
    }

    @Override
    public final void setInstructor(String instructor) throws IllegalArgumentException {
        if (instructor == null || instructor.length() == 0) {
            throw new IllegalArgumentException("Instructor cannot be null or empty string!");
        } else {
            this.instructor = instructor;
        }
    }

    
}
