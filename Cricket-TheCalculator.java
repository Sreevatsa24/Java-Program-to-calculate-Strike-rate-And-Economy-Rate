package Cricket;
import java.util.Scanner;
public class Thecalaculator {

	public static void main(String[] args) throws ArithmeticException {
		Scanner sc=new Scanner(System.in);
		System.out.println ("Enter the Player Name");
		String name=sc.nextLine();              //Taking input from the user using scanner class
		System.out.println("Enter the Age");
		int age=sc.nextInt();
		player object=new player();             //Creation of objects
		player objectpar=new player();
		object.playername=name;
		object.Display();
		objectpar=object;                     //Giving an object as Parameter
		objectpar.Display(age);               //Method Overloading
		srateanderate object1=new srateanderate(name);
         System.out.println("Select the Type Of the Player");
         System.out.println("Type 1- Batsmen");
         System.out.println("Type 2 -Bowler");
         System.out.println("Type 3 -All Rounder");
         int selection =sc.nextInt();
         switch(selection) {
         case 1:
         System.out.println("Enter the No.Of.Runs Scored");
         float batruns=sc.nextFloat();
         System.out.println("Enter the No.Of Balls Faced");
         float balls=sc.nextFloat();
         try {
  		   if(balls==0)
  			   throw new ArithmeticException();
  		   else
  		   {
  		        object1.batruns=batruns;                   //Exception Handling
  		        object1.balls=balls;
  		    object1.strike_rate(batruns, balls);
  		    object1.Display();                            //Method Overriding
  		   }
  		   }
  		 catch(Exception e)
         {
      	   System.out.println("InCorrect Values Entered!!!");
         }
  		   break;
         case 2:
        	 System.out.println("Enter the No.Of.Runs Conceded");
             float bowlruns=sc.nextFloat();
             System.out.println("Enter the No.Of.overs bowled");
             float overs=sc.nextFloat();
        	 try {
        		 if(overs==0)
        			 throw new ArithmeticException();
        		 else
        		 {
       		        object1.bowlruns=bowlruns;
    		        object1.overs=overs;
    		        object1.Economy_rate(bowlruns, overs);
    		        object1.Display();
        		 }
        	 }
        	 catch(Exception e)
        	 {
        		 System.out.println("InCorrect Values Entered!!!");
        	 }
        	 break;
         case 3:
         System.out.println("Enter the No.Of.Runs Scored");
         float btruns=sc.nextFloat();
         System.out.println("Enter the No.Of Balls Faced");
         float ballsFaced=sc.nextFloat();
         System.out.println("Enter the No.Of.Runs Conceded");
         float blruns=sc.nextFloat();
         System.out.println("Enter the No.Of.overs bowled");
         float oversBowled=sc.nextFloat();
         try {
        	 if(ballsFaced==0||oversBowled==0)
        		 throw new ArithmeticException();
        	 else
        	 {
        		 object1.batruns=btruns;
        		 object1.balls=ballsFaced;
        		 object1.bowlruns=blruns;
        		 object1.overs=oversBowled;
        		 object1.strike_rate(btruns, ballsFaced);
        		 object1.Economy_rate(blruns, oversBowled);
        		 object1.Display();
        	 }
         }
        	 catch(Exception e){
        	System.out.println("InCorrect Values Entered!!!");	 
        	 }
         break;
                default:
        		 System.out.println("Invalid Choice!!!");
        		 break;
       
         }
	}}
        
 		        

 


	

