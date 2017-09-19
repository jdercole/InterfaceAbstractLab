/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Jenna
 */
public class StartUp {
    public static void main(String[] args) {
        ProgrammingCourse introJava = new IntroJavaCourse("Java Basics", 4);
        ProgrammingCourse introProgramming = new IntroToProgrammingCourse("Programming Basics", 5);
        ProgrammingCourse advJava = new AdvancedJavaCourse("Adv. Java", 6);
    }
}
