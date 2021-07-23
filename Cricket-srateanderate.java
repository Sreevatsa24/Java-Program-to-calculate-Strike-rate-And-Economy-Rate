package Cricket;          //The file is Present in Package Cricket,it contains the method definitions
                          //All the variables and methods in this file are public.
import Statastics.*;      // Importing the Statistics Package   

class srateanderate extends player implements Stats        //Single Level Inheritance
{

	public float batruns;
	public float balls;                //Instance Variables
	public float bowlruns;
	public float overs;

	public srateanderate(String a)
	{
		super(a);	                   //Use of Super
	}
	public void strike_rate(float batruns,float balls)
	{
	
			float strikerate=(batruns/balls)*100;
			System.out.println("Strike Rate=" +strikerate);
	
	}
    public void Economy_rate(float bowlruns,float overs)
    {
    		float economyrate =bowlruns/overs;
        	System.out.println("Economy Rate=" +economyrate);
  
    }
    public void Display ()       //Method used for demonstration of Method Overriding
    {
    	System.out.println("Stats Of "+playername+" calulated");
    }

}




