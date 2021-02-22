package actions;

import state.State;

public class Close extends State {
    @Override
    public void close() {
        if(!this.EtatPaiment){
            this.result = "DOOR CLOSED";
            System.out.println(this.result);
        }else{
            Open();
        }
    }

    @Override
    public void Open() {
        if(this.EtatPaiment) {
            this.result = "DOOR OPENED";
            System.out.println(this.result);
        }else{
            close();
        }
    }
}
