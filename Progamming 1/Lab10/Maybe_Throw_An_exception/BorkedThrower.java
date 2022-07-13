public class BorkedThrower {

    public static void thrower(boolean isBorked) throws ItsBorkedException {
        // Do something here.
        if(isBorked == true)
        {
            throw new ItsBorkedException("Error");
        }

    }

    public static void main(String[] args) {
        // Don't need anything here, but you can
        // use it to Bork your program
    }
    
}
