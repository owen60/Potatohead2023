/**
A class that describes an individual Potatohead toy
*/
public class Potatohead {

    /*  PRIVATE instance variables go here  */
    private int eyeNumber;
    // STEP 1 OF 5: add one instance variable HERE 
    private boolean hasEars;
	
    private int earNumber;

    private boolean hasGlasses;

    private String rHandAccessory;

    private boolean hasMouth;

    private int numOfArms;

    private int numOfFeet;

    private boolean hasFeet;

    private boolean hasHat;

    private boolean hasArm;


    /*  the no argument constructor  */
    public Potatohead() {
        /* initialize ***ALL*** instance variables here. */
        /* Do NOT set Strings to "" or null. */
        /* Do NOT set Objects to null */
        eyeNumber = 2;
        // STEP 2 OF 5: initialize your instance variable HERE
	      hasEars = false;
	    
        earNumber = 2;
 
        hasGlasses = false;

        rHandAccessory = "none";
        hasMouth = false;

	      numOfArms = 0;

	
	      hasFeet = false;

        hasHat = false;

        hasArm = false;

	      numOfFeet = 2;
      
      
      

    }


    /*  VARIOUS ACCESSOR AND MUTATOR METHODS IN ALPHABETICAL ORDER GO HERE  */

    // STEP 3 OF 5: Add an accessor method for yr instance var WITH JAVADOC COMMENT
    // !!! NOTE: You MUST add Javadoc comments for your accessor method and mutator method
	/**
        void setEars(boolean _setEars)
	mutator method for hasEars
        @param _setHasEars for what the user desires
        */
    public void setHasEars(boolean _setHasEars){
	    hasEars = _setHasEars;
    }
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
  
    /** void setnumOfFeet(int _numOfFeet)
     * sets the potatoheads feet.
     * parameters: 
     * @param _numOfFeet the number of feet the user must set
    */
    public void setNumOfFeet(int _numOfFeet) {
	    numOfFeet = _numOfFeet;
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
    	    void setNumOfArms(int _numOfArms)
	    mutator method for numOfArms
	    @param _numOfArms changes the value of numOfArms to any number
     */
    public void setNumOfArms(int _numOfArms){
	    numOfArms = _numOfArms;
    }

    /**
		  void setHasMouth(boolean _hasMouth)
  		mutator method for hasMouth
		  @param _hasMouth changes the value of hasMouth to true or false 
  	*/

    public void setHasMouth(boolean _hasMouth){
	    hasMouth = _hasMouth;
    }


    /**
		  void setHasFeet(boolean _hasFeet)
  		mutator method for hasFeet
		  @param _hasFeet changes the value of hasMouth to true or false 
  	*/
    public void setHasFeet(boolean _hasFeet){
	    hasFeet = _hasFeet;
    }

    /**
		  void setHasHat(boolean _hasHat)
  		mutator method for hasHat
		  @param _hasHat changes the value of hasHat to true or false 
  	*/
    public void setHasHat(boolean _hasHat){
	    hasHat = _hasHat;
    }
  
  
  
    // STEP 4 OF 5: a mutator method for yr instance var WITH JAVADOC COMMENT
    // !!! NOTE: You MUST add Javadoc comments for your accessor method and mutator method
	/**
       boolean hasEars()
       accessor method for hasEars
       @return hasEars as a boolean to check if the potato head has ears
        */
    public boolean hasEars(){
	    return hasEars;
    }
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
  
    /** void getnumOfFeet(int _numOfFeet)
     * gets the potatoheads feet.
     * parameters: 
     * @return The Number Of Feet 
    */
    public int getNumOfFeet() {
	    return numOfFeet;
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
    	int getNumOfArms()
    	accessor method for numOfArms
    	@return numOfArms an int describing the number of arms.
    */
    public int getNumOfArms() {
	return numOfArms;
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
    	Boolean hasFeet()
    	accessor method for hasFeet
    	@return hasFeet true if potatohead has feet and false if it does not
    */
    public boolean hasFeet() {
	    return hasFeet;
    }


    /**
    	Boolean hasHat()
    	accessor method for hasHat
    	@return hasHat as a boolean for if the potato is wearing a hat
    */
    public boolean hasHat() {
	    return hasHat;
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
	      output += "Number of arms: " + numOfArms + ". ";
        if (hasEars == true){
          output += "Has ears. ";
        }
        else {
          output += "Does not have ears. ";
        }

        if (hasGlasses == true){
          output += "Is wearing glasses. ";
        }
        else {
          output += "Isn't wearing glasses";
        }
        if (hasArm == true){
          output += "Has Arm";
        }
        else {
          output += "Doesn't have arm";
        }
        output += "Holding: " + rHandAccessory + " in right hand.";
	      if (hasMouth == true){
          output += "Has a mouth.";
        }
	      else {
          output += "Does not have a mouth.";
        }
        if (numOfFeet == 0){
          output += "Has No Feet."
        }
        if (numOfFeet == 1){
          output += "Has A Foot."
        }
        if (numOfFeet == 2){
          output += "Has Two Feet."
        }
	      if (hasHat == true){
          output += "Has a hat.";
        }
	      else {
          output += "Does not have a hat.";
        }
	      if (hasFeet == true){
          output += "Has feet.";
        }
        else {
          output += "Does not have any feet.";
        }




        return output;
    }
}
