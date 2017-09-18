
package lab1;

/**
 *
 * @author Jenna
 */
public class StartUp {
    public static void main(String[] args) {
         ProgrammingCourse introJava = new IntroJavaCourse("Java Basics", 1, 4.0);
         ProgrammingCourse introProgramming = new IntroToProgrammingCourse("Programming Basics", 2, 3.0);
         ProgrammingCourse advancedJava = new AdvancedJavaCourse("Adv. Java", 3, 4.0);
         
         advancedJava.setInstructor("Jim Lombardo");
         introProgramming.setInstructor("Drew Kjell");
         
         System.out.println("Course Name: " + advancedJava.getCourseName() + "\n"
                 + "Course Credits: " + advancedJava.getCredits());
         
         System.out.println("Course Name: " + introProgramming.getCourseName() + "\n"
                 + "Course Credits: " + introProgramming.getCredits());

}
}