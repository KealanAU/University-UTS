public class GameMap {
    
    private int height;
    private int width;
    private Location[][] map;

    public GameMap(int height, int width)
    {
        if (height < 0) height = 0;
        if (width < 0) width = 0;
        this.height = height;
        this.width = width;
        map = new Location[width][height];
    }

    public int getHeight()
    {
        return this.height;
    }

    public int getWidth()
    {
        return this.width;
    }

    public boolean setLocation(int row, int column, Location loc)
    {
        // row is more than 1 less of width 
        // column is more than 1 less of height 
        if ((row > width-1) || (column > height-1) || (row < 0) || (column < 0))
        {
            return false;
        }

        // Checks if already there
        if (map[row][column] != null) return false;

        map[row][column] = loc;
        return true;
    }

    public Location getLocation(int row, int column)
    {
        if ((row > width-1) || (column > height-1) || (row < 0) || (column < 0))
        {
            return null;
        }
        if (map[row][column] == null) return null;
        return map[row][column];
    }

    public String toString()
    {
        String output = "";

        for (int w=0; w < width; w++)
        {
            for (int h=0; h < height; h++)
            {
                if (map[w][h] == null)
                {
                    output += " ";
                }
                
                else 
                {
                    output += map[w][h].mapRepresentation();
                }  
            }
            output += "\n";  
        }

        return output;
    }
}
