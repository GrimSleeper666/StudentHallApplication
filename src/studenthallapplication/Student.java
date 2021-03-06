/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studenthallapplication;

/**
 *
 * @author Student
 */
public class Student extends Person{

    /**
     *
     * @param course
     * @param level
     * @param campus
     * @param employment
     * @param firstName
     * @param middleName
     * @param lastName
     */
    public Student(String course, String level, String campus, String employment, String firstName, String middleName, String lastName) {
        super(campus, firstName, middleName, lastName);
        this.course = course;
        this.level = level;
    }

    /**
     *
     * @return
     */
    public String getCourse() {
        return course;
    }

    /**
     *
     * @param course
     */
    public void setCourse(String course) {
        this.course = course;
    }

    /**
     *
     * @return
     */
    public String getLevel() {
        return level;
    }

    /**
     *
     * @param level
     */
    public void setLevel(String level) {
        this.level = level;
    }

    /**
     *
     * @return
     */
    public String getCampus() {
        return campus;
    }

    /**
     *
     * @param campus
     */
    public void setCampus(String campus) {
        this.campus = campus;
    }

    /**
     *
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     *
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     *
     * @return
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     *
     * @param middleName
     */
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    /**
     *
     * @return
     */
    public String getLastName() {
        return lastName;
    }

    /**
     *
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     *
     * @return
     */
    public String getDietaryrequirements() {
        return dietaryrequirements;
    }

    /**
     *
     * @param dietaryrequirements
     */
    public void setDietaryrequirements(String dietaryrequirements) {
        this.dietaryrequirements = dietaryrequirements;
    }

    /**
     *
     * @return
     */
    public String getDateofregistration() {
        return dateofregistration;
    }

    /**
     *
     * @param dateofregistration
     */
    public void setDateofregistration(String dateofregistration) {
        this.dateofregistration = dateofregistration;
    }

}