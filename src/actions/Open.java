package actions;

import state.State;

public class Open extends State {

    @Override
    public void close() {
        if(!this.EtatPaiment) {
            this.result = "DOOR CLOSED";
            System.out.println(this.result);
        }else{
            Open();
        }
    }

    @Override
    public void Open() {
        if(this.EtatPaiment) {
            this.result = "DOOR OPEN";
            System.out.println(this.result);
        }else{
            close();
        }

    }

}
