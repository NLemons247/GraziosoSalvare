
public class Monkey extends RescueAnimal {
	
	//instance variables 
	private String monkeySpecies;
	private int monkeyTailLength;
	private double monkeyBodyLength;
	
	//Constructor Class
	public Monkey(String name, String gender, String age,
		    String weight, String acquisitionDate, String acquisitionCountry,
			String trainingStatus, boolean reserved, String inServiceCountry,
			String species, int tailLength, double bodyLength) {
		setName(name);
		setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
		setMonkeySpecies(species);
		setMonkeyTailLength(tailLength);
		setMonkeyBodyLength(bodyLength);
	}
	
	//Accessor 
	private void setMonkeySpecies(String species) {
		monkeySpecies = species;
	}
	
	//Mutator
	private String getMonkeySpecies() {
		return monkeySpecies;
		//FIXME: Figure out why this says unused
	}
	
	//Accessor
	private void setMonkeyTailLength(int tailLength) {
		monkeyTailLength = tailLength;
	}
	
	//Mutator
	private int getMonkeyTailLength() {
		return monkeyTailLength;
		//FIXME: Figure out why this says unused
	}
	
	//Accessor
	private void setMonkeyBodyLength(double bodyLength) {
		monkeyBodyLength = bodyLength;
	}
	
	//Mutator
	private double getMonkeyBodyLength() {
		return monkeyBodyLength;
		//FIXME: Figure out why this says unused
	}
	
}
