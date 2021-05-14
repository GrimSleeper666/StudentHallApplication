package studenthallapplication;

//this Class will return the values provided within the form and apply them to be stored as they are. 

/**
 *
 * @author Student
 */
public class Person {

    String course;
    String level;
    String campus;
    String employment;
    String firstName;
    String middleName;
    String lastName;
    String dietaryrequirements;
    String dateofregistration;
    int hoursworked;

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
    public Person(String course, String level, String campus, String employment, String firstName, String middleName, String lastName) {
        this.course = course;
        this.level = level;
        this.campus = campus;
        this.employment = employment;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }
    
    /**
     *
     * @param campus
     * @param firstName
     * @param middleName
     * @param lastName
     */
    public Person(String campus, String firstName, String middleName, String lastName) {
        this.campus = campus;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
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
    public String getEmployment() {
        return employment;
    }

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

}