/**
A class that describes an individual Potatohead toy
*/
public class Potatohead {

    /*  PRIVATE instance variables go here  */
    private int eyeNumber;
    // STEP 1 OF 5: add one instance variable HERE
    private int earNumber;

    private boolean hasGlasses;

    private String rHandAccessory;

    private boolean hasMouth;

    private boolean hasArm;


    /*  the no argument constructor  */
    public Potatohead() {
        /* initialize ***ALL*** instance variables here. */
        /* Do NOT set Strings to "" or null. */
        /* Do NOT set Objects to null */
        eyeNumber = 2;
        // STEP 2 OF 5: initialize your instance variable HERE
        earNumber = 2;

        hasGlasses = false;

        rHandAccessory = "none";
        hasMouth = false;

	hasArm = false;

    }


    /*  VARIOUS ACCESSOR AND MUTATOR METHODS IN ALPHABETICAL ORDER GO HERE  */

    // STEP 3 OF 5: Add an accessor method for yr instance var WITH JAVADOC COMMENT
    // !!! NOTE: You MUST add Javadoc comments for your accessor method and mutator method

    /**
    	void setArm(boolean _hasArm)
     	mutator method for hasArm
      	@param _hasArm changes the value of the boolean to true or false
    */
    public void setArm(boolean _hasArm){
	hasArm = _hasArm;
    }
	
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
    /**
		  void setGlasses(boolean changeGlasses)
  		mutator method for hasGlasses
		  @param changeGlasses changes the value of the boolean to true or false 
  	*/
    public void setGlasses(boolean changeGlasses){
	    hasGlasses = changeGlasses;
    }

     /**
		  void setHasMouth(boolean _hasMouth)
  		mutator method for hasMouth
		  @param _hasMouth changes the value of hasMouth to true or false 
  	*/
    public void setHasMouth(boolean _hasMouth){
	    hasMouth = _hasMouth;
    }
    // STEP 4 OF 5: a mutator method for yr instance var WITH JAVADOC COMMENT
    // !!! NOTE: You MUST add Javadoc comments for your accessor method and mutator method

    /**
    	boolean hasArm()
     	accesor method for hasArm variable
        @return hasArm as a boolean for if the potatohead has arms
    */	
    public boolean hasArm(){
	return hasArm;
    }
	
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

	
    /**
    	Boolean hasGlasses()
    	accessor method for hasGlasses
    	@return hasGlasses as a boolean for if the potato is wearing glasses
    */
    public boolean hasGlasses() {
	    return hasGlasses;
    }


    /**String getRightHandAccessory()
    * Gets what the potatohead is holding in ITS right hand
    * @return a String of an accessory
    */
    public String getRightHandAccessory(){
	    return rHandAccessory;
    }

    /**
    	Boolean hasMouth()
    	accessor method for hasMouth
    	@return hasMouth as true if potato has a mouth and false if not
    */
    public boolean hasMouth() {
	    return hasMouth;
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

        if (hasGlasses == true){
          output += "Is wearing glasses. ";
        }
        if (hasGlasses == false){
          output += "Isn't wearing glasses";
        }

	if (hasArm == true){
	  output += "Has Arm";
	}
	if (hasArm == false){
	  output += "Doesn't have arm";
	}

        output += "Holding: " + rHandAccessory + " in right hand.";



        return output;
    }
}
