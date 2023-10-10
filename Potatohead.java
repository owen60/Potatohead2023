/**
A class that describes an individual Potatohead toy
*/
public class Potatohead
{

	/*  PRIVATE instance variables go here  */
	private int eyeNumber;
	
	// STEP 1 OF 5: add one instance variable HERE
	private int earNumber;
	
  
	/*  the no argument constructor  */
	public Potatohead()
	{
		/* initialize ***ALL*** instance variables here. */
		/* Do NOT set Strings to "" or null. */
		/* Do NOT set Objects to null */
		eyeNumber = 2;
    // STEP 2 OF 5: initialize your instance variable HERE
		earNumber = 2;

	}
  

	/*  VARIOUS ACCESSOR AND MUTATOR METHODS IN ALPHABETICAL ORDER GO HERE  */
	
  // STEP 3 OF 5: Add an accessor method for yr instance var WITH JAVADOC COMMENT
  // STEP 4 OF 5: a mutator method for yr instance var WITH JAVADOC COMMENT
	// !!! NOTE: You MUST add Javadoc comments for your accessor method and mutator method
	
		
	/**
		void setNumOfEyes(int _numOfEyes)
		mutator method for eyeNumber
		@param _numOfEyes for what the user desires.  
	*/	
	}
	public void setNumOfEyes(int _numOfEyes)
  	{
		eyeNumber = _numOfEyes;
	}

	public void setNumOfEars(int _numOfEars) 
	{
		earNumber = _numOfEars;
	}
		
	/**
		String getNumOfEyes()
		accessor method for eyeNumber
		@return eyeNumber an int describing the number of eyes.
	*/
	public int getNumOfEyes()
  	{
		return eyeNumber;
	}

	public int getNumOfEars() 
	{
		return earNumber;
	}
	

	
	public String toString()
	{
		String output = "PotatoHead object. ";
		output += "Number Of Eyes: " + eyeNumber + ". ";
    // STEP 5 OF 5: Add your instance variable to the toString() method using += HERE
		output += "Number of Ears: " + earNumber + ". ";

		
		return output;
	}
}
