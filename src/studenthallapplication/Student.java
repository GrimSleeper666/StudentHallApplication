package studenthallapplication;

//this Class will return the values provided within the form and apply them to be stored as they are. 

public class Student {

    String course;
    String level;
    String campus;
    String employment;
    String firstName;
    String middleName;
    String lastName;

    public Student(String theCourse, String theLevel, String theCampus, String theEmploymentStatus, String theFirstName, String theMiddleName, String theLastName) {
        this.course = theCourse;
        this.level = theLevel;
        this.campus = theCampus;
        this.employment = theEmploymentStatus;
        this.firstName = theFirstName;
        this.middleName = theMiddleName;
        this.lastName = theLastName;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public String getEmployment() {
        return employment;
    }

    public void setEmployment(String employment) {
        this.employment = employment;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
