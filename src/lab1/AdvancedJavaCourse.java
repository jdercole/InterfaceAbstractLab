package lab1;

import java.util.ArrayList;
import java.util.List;


/**
 * Describe responsibilities here.
 *
 * @author      Jenna Dercole
 * @version     1.00
 */
public class AdvancedJavaCourse extends Course{
    private String courseName;
    private int courseId;
    private double credits;
    private ArrayList prerequisitesByCourseId;

    public AdvancedJavaCourse(String courseName, String courseNumber) {
        setCourseName(courseName);
        setCourseId(courseId);
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
