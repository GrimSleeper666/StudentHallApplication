//this section will provide the details and methods of payment and any discounts provided in the event of employment and or being a prefect/student representative.
package studenthallapplication;

/**
 *
 * @author Student
 */
public class Payment {

    String name;
    String paid;
    int amount;

    /**
     *
     * @param theName
     * @param thePaymentCompleteOrNot
     * @param thePaymentOwed
     */
    public Payment(String theName, String thePaymentCompleteOrNot, int thePaymentOwed) {
        name = theName;
        paid = thePaymentCompleteOrNot;
        amount = thePaymentOwed;
    }
}
