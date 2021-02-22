package state;

public abstract class State {
    protected Boolean EtatPaiment=false;
    protected String  result;

    public abstract void close();
    public abstract void Open();

    public Boolean getEtatPaiment() {
        return EtatPaiment;
    }

    public void setEtatPaiment(Boolean etat) {
        EtatPaiment = etat;
    }
}
