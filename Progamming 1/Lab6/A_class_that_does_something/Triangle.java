public class Triangle {

	private int side1 = 3;  // Create a class attribute
	private int side2 = 4;  // Create a class attribute
	private int side3 = 5;  // Create a class attribute

	// Create a class constructor for the Main class
	public Triangle() {
		side1 = 3;  // Set the initial value for the class attribute x
		side2 = 4;  // Set the initial value for the class attribute x
		side3 = 5;  // Set the initial value for the class attribute x
	}
	public Triangle(int one, int two, int three) {
		// may need to fix up the order checking

		side1 = one;  // Set the initial value for the class attribute x
		side2 = two;  // Set the initial value for the class attribute x
		side3 = three;  // Set the initial value for the class attribute x
	}

	public boolean isIsosceles() {
		if(side1 == side2 || side2 == side3 || side1 == side3){
			return true;
		}
		else{
			return false;
		}
	}

	public boolean isEquilateral() {
		if(side1 == side2 && side2 == side3 && side1 == side3){
			return true;
		}
		else{
			return false;
		}
	}

	public boolean isScalene() {
		if(side1 != side2 && side2 != side3 && side1 != side3){
			return true;
		}
		else{
			return false;
		}
	}

	public boolean isRightTriangle() {

		int sq1 = side1 * side1;
		int sq2 = side2 * side2;
		int sq3 = side3 * side3;

		if (sq1 + sq2 == sq3 || sq2 + sq3 == sq1 || sq1 + sq3 == sq2){
			return true;
		}
		else{
			return false;
		}
	}

}

