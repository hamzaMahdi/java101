public class Main
{
   
  public static void main (String[]args)
  {
    calculator(); 
  }
  
  
  
  
  
  
  
  
  
  
 
  
  
  
   static void calculator(){
          String e = "continue";
    while(e.equals("exit")==false){
    
      System.out.println ("please input two numbers");
    double inputNumber1 = Double.parseDouble (System.console ().readLine ());
    double inputNumber2 = Double.parseDouble (System.console ().readLine ());
    menu(inputNumber1,inputNumber2);

    System.out.println("do you want to continue? type exit if not");
    e = System.console().readLine();
    }
    }
    
    
    
    
    
    
    
     static void menu(double inputNumber1,double inputNumber2){
      double result = 0;
          System.out.println
      ("please input 1 for addition, 2 for subtraction, 3 for multiplication, 4 for division");
    int operation = Integer.parseInt (System.console ().readLine ());
    if (operation == 1)
      {
	result = inputNumber1 + inputNumber2;
      }
    else if (operation == 2)
      {
	result = inputNumber1 - inputNumber2;
      }
    else if (operation == 3)
      {
	result = inputNumber1 * inputNumber2;
      }
    else if (operation == 4)
      {
	result = inputNumber1 / inputNumber2;
      } 
      System.out.println (result);
  }
}
