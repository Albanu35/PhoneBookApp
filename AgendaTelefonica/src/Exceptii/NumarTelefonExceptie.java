package Exceptii;

public class NumarTelefonExceptie extends RuntimeException{
    String numarTelefon;
    
    public NumarTelefonExceptie(String numarTelefon){
        this.numarTelefon = numarTelefon;
    }
    
    public NumarTelefonExceptie(String numarTelefon, String message){
        super(message);
        this.numarTelefon = numarTelefon;
    }
    
    public String getNumarTelefonExceptie(){
        return this.numarTelefon;
    }
}