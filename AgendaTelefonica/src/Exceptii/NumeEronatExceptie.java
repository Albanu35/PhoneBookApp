package Exceptii;

public class NumeEronatExceptie extends RuntimeException {

    String nume;

    public NumeEronatExceptie(String nume) {
        this.nume = nume;
    }

    public NumeEronatExceptie(String nume, String message) {
        super(message);
        this.nume = nume;
    }
    
    public String getNumeEronatExceptie(){
        return this.nume;
    }
}