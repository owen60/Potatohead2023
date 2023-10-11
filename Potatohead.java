/**
A class that describes an individual Potatohead toy
*/
public class Potatohead {

    /*  PRIVATE instance variables go here  */
    private int eyeNumber;
    // STEP 1 OF 5: add one instance variable HERE
    private int earNumber;
    private String rHandAccessory

    /*  the no argument constructor  */
    public Potatohead() {
        /* initialize ***ALL*** instance variables here. */
        /* Do NOT set Strings to "" or null. */
        /* Do NOT set Objects to null */
        eyeNumber = 2;
        // STEP 2 OF 5: initialize your instance variable HERE
        earNumber = 2;
	rHandAccessory = "none";

    }


    /*  VARIOUS ACCESSOR AND MUTATOR METHODS IN ALPHABETICAL ORDER GO HERE  */

    // STEP 3 OF 5: Add an accessor method for yr instance var WITH JAVADOC COMMENT
    // !!! NOTE: You MUST add Javadoc comments for your accessor method and mutator method

    /**
    	void setNumOfEyes(int _numOfEyes)
    	mutator method for eyeNumber
    	@param _numOfEyes for what the user desires.  
    */
    public void setNumOfEyes(int _numOfEyes) {
        eyeNumber = _numOfEyes;
    }
	
    /** void setRightHandAccessory(String _accessory)
     * sets what the potatohead is holding in ITS right hand.
     * parameters: 
     * @param _accessory for what the user desires
     */
    public void setRightHandAccessory(String _accessory){
	    rHandAccessory = _accessory;
    }
	
    /**
		void setNumOfEars(int _numOfEars)
  		mutator method for earNumber
		@param _numOfEars for what the user desires. 
  	*/
    public void setNumOfEars(int _numOfEars) {
        earNumber = _numOfEars;
    }
    
    // STEP 4 OF 5: a mutator method for yr instance var WITH JAVADOC COMMENT
    // !!! NOTE: You MUST add Javadoc comments for your accessor method and mutator method

    /**
    	String getNumOfEyes()
    	accessor method for eyeNumber
    	@return eyeNumber an int describing the number of eyes.
    */
    public int getNumOfEyes() {
        return eyeNumber;
    }

    /**
    	String getNumOfEars()
    	accessor method for earNumber
    	@return earNumber an int describing the number of ears.
    */
    public int getNumOfEars() {
        return earNumber;
    }

    /**String getRightHandAccessory()
    * Gets what the potatohead is holding in ITS right hand
    * @return a String of an accessory
    */
    public String getRightHandAccessory(){
	    return rHandAccessory;
    }


    /**
    	String toString()
    	returns a String description of the Potatohead
    	@return output String describing the Potatohead
    */
    public String toString() {
        String output = "PotatoHead object. ";
        output += "Number Of Eyes: " + eyeNumber + ". ";
        // STEP 5 OF 5: Add your instance variable to the toString() method using += HERE
        output += "Number of Ears: " + earNumber + ". ";
	output += "Holding: " + rHandAccessory + " in right hand.";


        return output;
    }
}
