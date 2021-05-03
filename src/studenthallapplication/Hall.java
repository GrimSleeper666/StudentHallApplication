//this section will be in two sections there will be a first floor for people with mobility issues only and the rest of the buliding.
//the hall/floor they are provided will depend on their mobility (e.g. limited or not)

package studenthallapplication;

public class Hall extends StudentHallSorting{

    String campus;
    int hallnumber;
    int roomnumber;
    int rentprice;

    public Hall(String theCampus,int theHall,int theRoom, int theRent) {
        campus = theCampus;
        hallnumber = theHall;
        roomnumber = theRoom;
        rentprice = theRent;
    }

}
