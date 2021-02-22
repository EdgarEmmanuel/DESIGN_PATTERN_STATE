package database;

import java.util.HashMap;
import java.util.Map;

public class CardNumber {

    Map<Integer,String> cardNumberDatabase = new HashMap<Integer,String>();

    public CardNumber(){
        // the database of card number
        this.cardNumberDatabase.put(1,"ORBITDK");
        this.cardNumberDatabase.put(2,"gfhjfklgkg");
        this.cardNumberDatabase.put(3,"DKFALL");
        this.cardNumberDatabase.put(4,"JUDITHSN");
        this.cardNumberDatabase.put(5,"EMMAGAB");
    }

    public Boolean verifyTheCardNumber(String val){
        Boolean resultofVerification = false;

        //we verify the cardNumber in the database
        for (Map.Entry<Integer, String> entry : cardNumberDatabase.entrySet()) {
            if(entry.getValue().equalsIgnoreCase(val)) resultofVerification = true;
        }

        //display a message after the verification
        if(resultofVerification) System.out.println("SUCCESFULL VERIFICATION");
        System.out.println("VERFIFICATION FAILED");
        return resultofVerification;
    }
}
