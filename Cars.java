import java.util.Scanner;
public class Cars extends Showroom implements utility {
    String Car_Name;
    String Car_colour;
    String Car_fuel_type;
    int price;
    String Car_type;
    String Car_transmission;
    
    @Override
    public void get_details(){
      System.out.println("NAME :"+Car_Name);
      System.out.println("Colour :"+Car_colour);
      System.out.println("FUEL :"+Car_fuel_type);
      System.out.println("PRICE :"+price);
      System.out.println("CAR TYPE :"+Car_type);
      System.out.println("TRANMISSION :"+Car_transmission);
    }

    @Override
    public void set_details(){
        Scanner sc= new Scanner(System.in);
        System.out.println("=================*** ENTER CAR DETAILS ***================");
        System.out.println();
        System.out.println("CAR NAME :");
        Car_Name = sc.nextLine();
        System.out.println(" COLOUR :");
        Car_colour = sc.nextLine();
        System.out.println("CAR FUEL TYPE(petrol/diesel)");
        Car_fuel_type = sc.nextLine();
        System.out.println("CAR PRICE");
        price = sc.nextInt();
        System.out.println("CAR TYPE");
        Car_type = sc.nextLine();
        System.out.println("TRANSMISSION(manual/automatic) :");
        Car_transmission = sc.nextLine();
        total_cars_in_stock++;

    }
}
