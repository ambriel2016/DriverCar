public class Car {
    private String make;
    private int year;
    private String model;
    private Driver driver;

    public Car(){

    }
    public Car (String make, int year, String model){
        this.make = make;
        this.year = year;
        this.model = model;
    }
    public String getMake(){
        return this.make;
    }
    public void setMake(String make){
        this.make = make;
    }
    public int getYear(){
        return this.year;
    }
    public void setYear(int year){
        this.year = year;
    }
    public String getModel(){
        return this.model;
    }
    public void setModel(String model){
        this.model = model;
    }

    public Driver getDriver(){
        return this.driver;
    }
    public void setDriver(Driver driver){
        this.driver = driver;
    }
}
