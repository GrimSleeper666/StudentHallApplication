/* no of tenants, person contains students and employees. tenants contains person.
    hall contains rooms, rooms contain tenants*/
package studenthallapplication;

/**
 *
 * @author Student
 */
public class Room{

    String campus;
    String hallname;
    int roomnumber;
    int rentprice;
    Person tenant;
    
    /**
     *
     * @param roomNumber
     * @param theRent
     */
    public Room(int roomNumber, int theRent) {    
        roomnumber = roomNumber;
        rentprice = theRent;
    }

    /**
     *
     * @return
     */
    public Person getTenant() {
        return tenant;
    }

    /**
     *
     * @param tenant
     */
    public void setTenant(Person tenant) {
        this.tenant = tenant;
    }

    
}
