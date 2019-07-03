import java.util.Random;
public class Main
{
    //static int[] a = new int[100];
    static void printArray(int [] myarray){
        for(int i = 0;i<100;i++){
	       System.out.print(myarray[i]+" ,");
	   }
    }
    
	public static void main(String[] args) {
	    
    Random rand = new Random();
	   int[] a = new int[100];
	   for(int i=0;i<100;i++){
	       a[i] = rand.nextInt(1000)-500;
	   }
	   printArray(a);
	       int n = 100;
	       boolean swapped = true;
    while(swapped ==true){
        swapped = false;
        for (int i = 1; i<100; i++){
            /* if this pair is out of order */
            if (a[i-1] > a[i]){ 
                /* swap them and remember something changed */
                int temporary = a[i-1];
                a[i-1] = a[i];
                a[i] = temporary;
                swapped = true;
            }
        }
    }
    System.out.println("-------------------------------------------------------------");
    printArray(a);
	}

}
