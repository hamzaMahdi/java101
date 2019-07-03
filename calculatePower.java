
public class Main
{
    static double calculateSquares(double x, int power){
        double result = x;
        for(int i=1;i<power;i++){
        result  = result*x;
        }
        return result;
    }
	public static void main(String[] args) {
	    System.out.println("please enter a number to square");
		double input  = Double.parseDouble(System.console ().readLine ());
		System.out.println(calculateSquares(input,2));
	}
}
