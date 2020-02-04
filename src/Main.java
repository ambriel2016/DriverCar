import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car cr = new Car();
        Scanner sc = new Scanner(System.in);
        Driver dr = new Driver();

        System.out.println("Please enter your ID: ");
        dr.setID(sc.nextInt());
        System.out.println("Please enter your Year: ");
        dr.setYear(sc.nextInt());
        sc.nextLine();
        System.out.println("Please enter your Name: ");
        dr.setName(sc.nextLine());
        System.out.println("Please enter your Shift: ");
        dr.setShift(sc.nextLine());

        cr.setDriver(dr);

        System.out.println("Please enter your car maker: ");
        cr.setMake(sc.nextLine());
//        sc.nextLine();
        System.out.println("Please enter your car year: ");
        cr.setYear(sc.nextInt());
        sc.nextLine();
        System.out.println("Please enter your car model: ");
        cr.setModel(sc.nextLine());
        Driver driverObject = cr.getDriver();


        System.out.println(cr.getDriver().getID()+ " " +cr.getDriver().getYear() + " " +cr.getDriver().getName() + " " +cr.getDriver().getShift() + " " +cr.getMake()+ " "+ cr.getYear()+" "+ cr.getModel());

    }
}
