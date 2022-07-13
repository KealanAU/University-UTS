public class Location {

    private static final String[] INACTIVE_SYMBOLS = { " ", "╴", "╷", "┐", "╶", "─", "┌", "┬", "╵", "┘", "│", "┤", "└", "┴", "├", "┼" };
	private static final String[] ACTIVE_SYMBOLS = { " ", "╸", "╻", "┓", "╺", "━", "┏", "┳", "╹", "┛", "┃", "┫", "┗", "┻", "┣", "╋" };
    
    boolean north; 
    boolean east; 
    boolean south;  
    boolean west;  
    boolean exit; 
    boolean playerLocation;

    public Location(boolean northInput, boolean eastInput, boolean southInput, boolean westInput, boolean exitInput)
    {
        this.north = northInput;
        this.east = eastInput;
        this.south = southInput;
        this.west = westInput; 
        this.exit = exitInput; 
        this.playerLocation = false; 
    }

    public boolean isExit()
    {
        if(exit == true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean hasDirection(String direction)
    {
        if(direction.contains("north") && north == true)
        {
            return true;
        }
        else if(direction.contains("east") && east == true)
        {
            return true;
        }
        else if(direction.contains("south") && south == true)
        {
            return true;
        }
        else if(direction.contains("west") && west == true)
        {
            return true;
        }
        else{
            return false; 
        }
        
    }

    @Override
    public String toString()
    {
         String output = "Available directions:\n";
         
         if(north == true)
         {
            output = output + "north\n";
         }
         if(east == true)
         {
            output = output + "east\n";
         }
         if(south == true)
         {
            output = output + "south\n";
         }
         if(west == true)
         {
            output = output + "west\n";
         }
        // if(exit == true)
        //  {
        //     output = output + "exit\n";
        //  }
        return output;
    }

    public String mapRepresentation()
    {
        int indecies = 0 ;

        if(north == false && east == false && south == false && west == true)
        {
            // "╸" West
            indecies = 1;
        }
        else if(north == false && east == false && south == true && west == false)
        {
            // "╻" South
            indecies = 2;
        }
        else if(north == false && east == false && south == true && west == true)
        {
            // "┓" South West
            indecies = 3;
        }
        else if(north == false && east == true && south == false && west == false)
        {
            // "╺" East
            indecies = 4;
        } 
        else if(north == false && east == true && south == false && west == true)
        {
            // "━" East West
            indecies = 5;
        } 
        else if(north == false && east == true && south == true && west == false)
        {
            // "┏" South East
            indecies = 6;
        }
        else if(north == false && east == true && south == true && west == true)
        {
            // "┳" South East West
            indecies = 7;
        }
        else if(north == true && east == false && south == false && west == false)
        {
            // "╹" North
            indecies = 8;
        }
        else if(north == true && east == false && south == false && west == true)
        {
            // "┛" North West
            indecies = 9;
        }
        else if(north == true && east == false && south == true && west == false)
        {
            // "┃" North South
            indecies = 10;
        }
        else if(north == true && east == false && south == true && west == true)
        {
            // "┫" North South West
            indecies = 11;
        }
        else if(north == true && east == true && south == false && west == false)
        {
            // "┗" North East
            indecies = 12;
        } 
        else if(north == true && east == true && south == false && west == true)
        {
            // "┻" North East West
            indecies = 13;
        } 
        else if(north == true && east == true && south == true && west == false)
        {
            // "┣" North East South
            indecies = 14;
        }
        else if(north == true && east == true && south == true && west == true)
        {
            // "╋" North East South West
            indecies = 15;
        }


        if(playerLocation == true)
        {
            return ACTIVE_SYMBOLS[indecies];
        }
        else
        {
            return INACTIVE_SYMBOLS[indecies];
        }
    }

    public void togglePlayerHere()
    {
        playerLocation ^= true;
    }
    
}
