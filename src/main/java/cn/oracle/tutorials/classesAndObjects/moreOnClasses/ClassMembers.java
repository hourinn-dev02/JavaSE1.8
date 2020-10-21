package cn.oracle.tutorials.classesAndObjects.moreOnClasses;

class Bicycle {
    
    private int cadence;  //转速
    private int gear;
    private int speed;
        
    // add an instance variable for the object ID
    private int id;
    
    // add a class variable for the
    // number of Bicycle objects instantiated
    public static int numberOfBicycles  = 1;
    
    public Bicycle(int startCadence, int startSpeed, int startGear){
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;

        // increment number of Bicycles
        // and assign ID number
        id = ++numberOfBicycles;
    }
    
    public int getId() {
		return id;
	}
    
    public static int getNumberOfBicycles() {
    	return numberOfBicycles;
    }
    
    public int getCadence() {
        return cadence;
    }
        
    public void setCadence(int newValue) {
        cadence = newValue;
    }
        
    public int getGear(){
        return gear;
    }
        
    public void setGear(int newValue) {
        gear = newValue;
    }
        
    public int getSpeed() {
        return speed;
    }
        
    public void applyBrake(int decrement) {
        speed -= decrement;
    }
        
    public void speedUp(int increment) {
        speed += increment;
    }
    
}
public class ClassMembers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bicycle b1 = new Bicycle(10, 10, 10);
		Bicycle b2 =new Bicycle(10, 10, 10);
		Bicycle b3 =new Bicycle(10, 10, 10);
		
		System.out.println(b3.getId());   //3
		System.out.println(Bicycle.getNumberOfBicycles());   //3
	}

}
