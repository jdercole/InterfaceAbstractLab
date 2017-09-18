package lab1;

import java.util.ArrayList;


/**
 * Describe responsibilities here.
 *
 * @author      Jenna Dercole
 * @version     1.00
 */
public class AdvancedJavaCourse extends ProgrammingCourse {
    private ArrayList prerequisitesByCourseId;

    public AdvancedJavaCourse(String courseName, int courseId, double credits) {
        setCourseName(courseName);
        setCourseId(courseId);
        setCredits(credits);
    }

    public ArrayList getPrerequisites() {
        return prerequisitesByCourseId;
    }

    public void setPrerequisite(int courseId) throws IllegalArgumentException {
        if(courseId < 0) {
            throw new IllegalArgumentException("Error: prerequisites cannot be negative.");
        } else {
            prerequisitesByCourseId.add(courseId);
        }
    }

    
}
