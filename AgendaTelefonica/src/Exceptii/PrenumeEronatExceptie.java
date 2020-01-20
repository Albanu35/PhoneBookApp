package Exceptii;

public class PrenumeEronatExceptie extends RuntimeException{
    String prenume;

    public PrenumeEronatExceptie(String prenume) {
        this.prenume = prenume;
    }

    public PrenumeEronatExceptie(String prenume, String message) {
        super(message);
        this.prenume = prenume;
    }
    
    public String getPrenumeEronatExceptie(){
        return this.prenume;
    }
}
