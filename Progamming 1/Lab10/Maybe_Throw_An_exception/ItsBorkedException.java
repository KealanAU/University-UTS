public class ItsBorkedException extends Exception {
 
    public ItsBorkedException(String message){
        super(message);
    }
    public String getMessage(){
        return "Program is Borked!";
    }
}
