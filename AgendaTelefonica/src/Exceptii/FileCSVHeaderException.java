package Exceptii;

public class FileCSVHeaderException extends RuntimeException {

    String header;
    
    public FileCSVHeaderException(String header){
        this.header = header;
    }
    
    public FileCSVHeaderException(String header, String message){
        super(message);
        this.header = header;
    }
}
