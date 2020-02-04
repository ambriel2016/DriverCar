public class Driver {
    private int ID;
    private int year;
    private String name;
    private String shift;

    public Driver(){

    }
    public Driver(int ID, int year, String name, String shift){
        this.ID = ID;
        this.year = year;
        this.name = name;
        this.shift = shift;
    }
    public int getID(){
        return this.ID;
    }
    public void setID(int ID){
        this.ID = ID;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getShift(){
        return this.shift;
    }
    public void setShift(String shift){
        this.shift = shift;
    }

}
