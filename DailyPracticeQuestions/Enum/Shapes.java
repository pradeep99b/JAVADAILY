public class Shapes{


	public enum geometricShapes{

		CIRCLE,
		TRIANGLE,
		RECTANGLE,
		SQUARE	
	}

	public static void main(String[] args){

		geometricShapes one = geometricShapes.CIRCLE;
		geometricShapes two = geometricShapes.TRIANGLE;
		geometricShapes three = geometricShapes.RECTANGLE;
		geometricShapes four = geometricShapes.SQUARE;
	
		System.out.print("Geometric Shapes are "+one+" "+two+" "+three+" "+four);
	}
}