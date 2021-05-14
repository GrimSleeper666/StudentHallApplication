//this section will be in two sections there will be a first floor for people with mobility issues only and the rest of the buliding.
//the hall/floor they are provided will depend on their mobility (e.g. limited or not)
package studenthallapplication;

import java.util.ArrayList;


//the arraylist below will create rooms and apply room numbers in increments to each person added to the room.

/**
 *
 * @author Student
 */
public class Hall {
    private ArrayList <Room> rooms;
    
    private String campus;
    private String hallname;

    /**
     *
     * @param theCampus
     */
    public Hall(String theCampus) {
        this.campus = theCampus;
        
    }

    /**
     *
     * @param quantity
     */
    public void addRooms(int quantity){
        for(int i = 0; i < 10; i++){
            
        }
    }

    /**
     *
     * @return
     */
    public int addRoom(){ // this is the actual method which creates rooms up to 100 rooms. there will be no more after this.
        
        int maxRoomNumber = rooms.size() + 1;
        Room room = new Room(maxRoomNumber, 100);
        rooms.add(room);
        return maxRoomNumber;
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
    public String getHallname() {
        return hallname;
    }

    /**
     *
     * @param hallname
     */
    public void setHallname(String hallname) {
        this.hallname = hallname;
    }

    /**
     *
     * @param roomNumber
     * @return
     */
    public Room getRoom(int roomNumber) {
        return rooms.get(roomNumber - 1);
    }

}
