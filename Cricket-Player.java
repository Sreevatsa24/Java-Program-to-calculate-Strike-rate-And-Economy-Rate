package Cricket;                  //The file is present in Package cricket and it contains the details of Player
class player{ 

				String playername;    //Instance Variable
			    player()              //Default Constructor
				{
					playername="NULL";
				}
				player(String Playername)  //Parameterized Constructor
				{
					this.playername=Playername;    //Use of this Keyword
				}
			    void Display()               
				{
					System.out.println("The name of the player is "+playername);
				}
			    void Display(int age)        //Method used to demonstrate Method Overloading
			    {
			    	System.out.println("Age Of "+playername+" is "+age);
			    }
			}
		



