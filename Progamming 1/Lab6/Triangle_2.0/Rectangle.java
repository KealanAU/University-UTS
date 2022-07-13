public class Rectangle {
    // Create a class attribute
	private int side1;  
	private int side2;  
	private int side3;  
	private int side4;  

	// Create a class constructor for the Main class
	public Rectangle() {
        // Set the initial value for the class attribute x
		side1 = 1;  
		side2 = 1;  
		side3 = 1;  
		side4 = 1;  
	}

	public Rectangle(int one) {
		// may need to fix up the order checking
        // Set the initial value for the class attribute x
		this.side1 = one;  
		this.side2 = one;  
		this.side3 = one;  
		this.side4 = one;  
	}
	public Rectangle(int one, int two) {
		// may need to fix up the order checking

		this.side1 = one;  // Set the initial value for the class attribute x
		this.side2 = two;  // Set the initial value for the class attribute x
		this.side3 = one;  // Set the initial value for the class attribute x
		this.side4 = two;  // Set the initial value for the class attribute x
	}

	public int getShortSide() {

		int[] sideArray = {side1, side2, side3, side4};

		int targetNumber = Integer.MAX_VALUE;
		
		for(int i = 0; i < sideArray.length; i++){
			if( targetNumber > sideArray[i]){
				targetNumber = sideArray[i];
			}
		}
		return targetNumber;
	}

	public int getLongSide() {

		int[] sideArray = {this.side1, this.side2, this.side3, this.side4};

		int targetNumber = Integer.MIN_VALUE;
		
		for(int i = 0; i < sideArray.length; i++){
			if( targetNumber < sideArray[i]){
				targetNumber = sideArray[i];
			}
		}
		return targetNumber;
	}

	public boolean isSquare() {
		if(this.side1 == this.side2 && this.side1 == this.side3 && this.side1 == this.side4 ){
			return true;
		}
		else{
			return false;
		}
	}

	public int area() {
		if(this.isSquare() == true){
			// Do square formula
			return this.side1 * this.side1;
		}
		else{
			// Rectangle : A = b x h
			int shortest = this.getShortSide();
			int longest = this.getLongSide();
			
			return shortest * longest;

		}
	}

	public double diagonal() {
		if(this.isSquare() == true){
			// Do square formula
			return this.side1 * Math.sqrt(2);
		}
		else{
			// Rectangle : A = b x h
			int shortest = this.getShortSide();
			int longest = this.getLongSide();
			
			return Math.sqrt((shortest * shortest) + (longest * longest));

		}
	}

	public boolean bigger(Rectangle other){
		if(other.area() < this.area()){
			// do i use this? 
			return true;
		}
		else{
			
			return false;

		}
	}

}

