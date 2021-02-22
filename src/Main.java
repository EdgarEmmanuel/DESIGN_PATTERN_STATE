import actions.Close;
import database.CardNumber;
import state.State;

public class Main {
    public static void main(String[] args){
        State action = new Close();
        CardNumber cardNumber = new CardNumber();

        // the user tries to enter
        System.out.println("state of the door => ");
        action.Open();

        //he push his card and we verify
        action.setEtatPaiment(cardNumber.verifyTheCardNumber(""));

        // we process and we set the state of the door
        System.out.println("state of the door after the credit card => ");
        action.Open();
    }
}
