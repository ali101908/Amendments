import java.util.Scanner;

public class main_function {
    public static void main(String[] args) {
        CarSeller.Cars_Web CS= new CarSeller.Cars_Web();
        System.out.println(CS.Wn());

        Scanner scanner = new Scanner(System.in);
        int menu;

        do {
            System.out.println("Cars Menu:");
            System.out.println("Enter 1 to get Civic details: ");
            System.out.println("Enter 2 to get Swift details: ");
            System.out.println("Enter 3 to get Toyotta details: ");

            System.out.print("Enter your choice: ");

            menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    // Add code for Option 1 here
                    System.out.println("You have successfully entered into Civic Car details! ");

                    Civic Ck=new Civic();
                    Ck.DisplayMsg();

                    Ck.CompanyName();

                    Ck.CarName("Civic");

                    Ck.CarColor();

                    Ck.Model();

                    Ck.No_of_cars();
//                    Scanner ans = new Scanner(System.in);
//                    String get = ans.next();
//
//                    if (get == "Yes") System.out.println("We r happy that u bought our car. Thanks! ");
//
//                    System.out.println("Thanks for visiting our website! ");
                    break;
                case 2:

                    // Add code for Option 2 here
                    System.out.println("You have successfully entered into Civic Car details! ");

                    Swift St=new Swift();
                    St.DisplayMsg();

                    St.CompanyName();

                    St.CarName("Civic");

                    St.CarColor();

                    St.Model();

                    St.No_of_cars();

                    break;
                case 3:

                    // Add code for Option 3 here
                    System.out.println("You have successfully entered into Civic Car details! ");

                    Toyotta Ty=new Toyotta();
                    Ty.DisplayMsg();

                    Ty.CompanyName();

                    Ty.CarName("Civic");

                    Ty.CarColor();

                    Ty.Model();

                    Ty.No_of_cars();

                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (menu != menu);


    }
}
