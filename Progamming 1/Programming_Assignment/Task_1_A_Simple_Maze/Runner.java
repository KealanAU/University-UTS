public class Runner {
    public static void main(String[] args) {
        //The code here is not tested, but can interfere with compilation.
        Location mapLocation = new Location(true, false, false, true, true);
        
        System.out.println(mapLocation.toString());
        System.out.println(mapLocation.mapRepresentation());
        
        
    }
}
