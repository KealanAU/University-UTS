public class Bug {

    String message;
    static int bugsGenerated;
    boolean alreadyExecuted = false;

    public Bug() {
        this.message = "Unknown cause";
        bugsGenerated++;
    }

    public Bug(String cause) {
        this.message = cause;
        bugsGenerated++;
    }

    public void solved() {
        if(bugsGenerated > 0 && alreadyExecuted == false){
            bugsGenerated--;
            alreadyExecuted = true;
        }
    }

    public static boolean bugFree() {
        boolean bugFree = bugsGenerated == 0;
        
        if (bugFree == true) {
            return true;
        }
        else {
            return false;
        }
    }

    public String getMessage() {
        return this.message;
    }
    
    public static int bugCount() {
        return bugsGenerated;
    }

}
