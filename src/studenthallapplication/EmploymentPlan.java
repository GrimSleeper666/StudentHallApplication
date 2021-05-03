//depending on the job type, responsibilities of the job and the hours theyve worked, the employee may be allowed a larger discount on the rent which will be applied automatically
//depending on the brackets they fall into.
package studenthallapplication;

public class EmploymentPlan {
    String name;
    String job;
    String dietaryrequirements;
    String dateofregistration;
    int hoursworked;
    int age;

    public EmploymentPlan(String theName, String theJobType, String theDietaryRequirements, String theDateOfRegistration, int theAge, int theHoursWorkedPerWeek) {
        name = theName;
        job = theJobType;
        dietaryrequirements = theDietaryRequirements;
        dateofregistration =  theDateOfRegistration;
        hoursworked = theHoursWorkedPerWeek;
        age = theAge;
    }

}