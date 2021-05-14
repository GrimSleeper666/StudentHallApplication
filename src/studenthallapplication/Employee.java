/*
 * This section is going to be used to apply the information required to each employee. this is so
   when an employee is applied into the database, they are able to be identified as such.

 */
package studenthallapplication;

/**
 *
 * @author Student
 */
public class Employee extends Person{

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
    public Employee(String course, String level, String campus, String employment, String firstName, String middleName, String lastName) {
        super(course, level, campus, employment, firstName, middleName, lastName);
    }

    /**
     *
     * @return
     */
    public String getCampus() {
        return campus;
    } //this will return the campus

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
    public String getEmployment() {
        return employment;
    }//this will return the employment of each person

    /**
     *
     * @param employment
     */
    public void setEmployment(String employment) {
        this.employment = employment;
    }

    /**
     *
     * @return
     */
    public String getFirstName() {
        return firstName;
    }//this will return the first name of the person inserted

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
    }//this will return the middle name of the inserted person

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
    }//this will return the last name of the person

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
    }//this will return the dietary requirements inserted for each person

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
    }//this will return the date that the employee started their employment.

    /**
     *
     * @param dateofregistration
     */
    public void setDateofregistration(String dateofregistration) {
        this.dateofregistration = dateofregistration;
    }

    /**
     *
     * @return
     */
    public int getHoursworked() {
        return hoursworked;
    }//this will return how many hours the employee worked.

    /**
     *
     * @param hoursworked
     */
    public void setHoursworked(int hoursworked) {
        this.hoursworked = hoursworked;
    }

}