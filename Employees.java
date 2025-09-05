import java.util.*;
import java.util.UUID;
public class Employees extends Showroom implements utility {
    String id;
    String NAME;
    int AGE;
    String DEPARTMENT;

@Override
public void get_details(){
    System.out.println("ID :"+id);
    System.out.println("NAME :"+NAME);
    System.out.println("AGE :"+AGE);
    System.out.println("DEPARTMENT :"+DEPARTMENT);
    System.out.println("SHOWROOM NAME :"+showroom_name);
}

@Override
public void set_details(){
    Scanner sc = new Scanner(System.in);
    UUID uuid = UUID.randomUUID();
    id = String.valueOf(uuid);
    System.out.println("===============*** ENTER EMPLOYEES DETAILS ***===============");
    System.out.println();
    System.out.println("EMPLOYEE NAME : ");
    NAME = sc.nextLine();
    System.out.println("AGE :");
    AGE = sc.nextInt();
    System.out.println("DEPARTEMENT :");
    DEPARTMENT = sc.nextLine();
    System.out.println("SHOWROOM NAME :");
    showroom_name = sc.nextLine();
}

}
