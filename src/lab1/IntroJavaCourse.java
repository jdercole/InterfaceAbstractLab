package lab1;

import java.util.ArrayList;

/**
 * Describe responsibilities here.
 *
 * @author      Jenna
 * @version     1.00
 */
public class IntroJavaCourse extends Course {
    private ArrayList prerequisites;

    public IntroJavaCourse(String courseName, int courseId) {
        setCourseName(courseName);
        setCourseId(courseId);
    }

    public ArrayList getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    public void setCredits(double credits) throws IllegalArgumentException {
        if(credits < 0 || credits > 5.0) {
            throw new IllegalArgumentException("Error: credits must be in the range 0.5 to 4.0");
        } else {
            setCredits(credits);
        }
    }

}
