package studenthallapplication;

import java.util.ArrayList;

//this class focuses on creating the way the arraylist acts, what it contains and how it will display its contents.

/**
 *
 * @author Student
 */
public class PersonList {

    private ArrayList<Person> studentsInformation;

    /**
     *
     */
    public final int MAX;

    /**
     *
     * @param maxIn
     */
    public PersonList(int maxIn) {
        studentsInformation = new ArrayList<>();
        MAX = maxIn;
    }

    /**
     *
     * @param theStudent
     * @return
     */
    public boolean addStudent(Person theStudent) {
        if (!isFull()) {
            studentsInformation.add(theStudent);
            return true;
        } else {
            return false;
        }
    }

    /**
     *
     * @return
     */
    public boolean isEmpty() {
        return studentsInformation.isEmpty();
    }

    /**
     *
     * @return
     */
    public boolean isFull() {
        return studentsInformation.size() == MAX;
    }

    /**
     *
     * @return
     */
    public int getAll() {
        return studentsInformation.size();
    }

    /**
     *
     * @param positionIn
     * @return
     */
    public Person getInfo(int positionIn) {
        if (positionIn < 0 || positionIn >= getAll()) {
            return null;
        } else {
            return studentsInformation.get(positionIn);
        }
    }

//Displays in two rows the top 4 over the bottom 3

    /**
     *
     * @return
     */
    public String displayStudents() {
        String display = "\n";
        for (int counter = 0; counter < studentsInformation.size(); counter++) {
            display += studentsInformation.get(counter).course + "\t" + studentsInformation.get(counter).level + "\t" + studentsInformation.get(counter).campus + "\t" + studentsInformation.get(counter).employment;
            display += "\n" + studentsInformation.get(counter).firstName + "\t" + studentsInformation.get(counter).middleName + "\t" + studentsInformation.get(counter).lastName;
            display += "\n\n";
        }
        return display;
    }

}
