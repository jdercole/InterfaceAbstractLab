
package lab2;

import java.util.ArrayList;

/**
 *
 * @author Jenna
 */
public interface ProgrammingCourse {
    public abstract double getCredits();

    public abstract void setCredits(double credits);
    
    public abstract int getCourseId();

    public abstract void setCourseId(int courseId);

    public abstract String getCourseName();

    public abstract void setCourseName(String courseName);

    public abstract String getInstructor();

    public abstract void setInstructor(String instructor);
    
    public abstract ArrayList getPrerequisite();
    
    public abstract void setPrerequisite(int courseId);
}
