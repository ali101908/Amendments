import java.util.Scanner;

class Civic extends getCars implements Cars {


    @Override
    void CompanyName() {
        System.out.println("Company Name: Arshad Car Sellers !");
    }

    @Override
    void DisplayMsg() {
        System.out.println("Welcome to Arshad Car Sellers Web! ");
    }

    @Override
    public void CarName(String a) {
        System.out.println("Car you are looking for is: "+a);
    }

    @Override
    public void CarColor() {
        System.out.println("Car is available in black n white color only! ");
    }

    @Override
    void Model() {
        System.out.println("Which models are available ? ");
//        Scanner mod=new Scanner(System.in);
        String no=mod.next();
        System.out.println("Only These models are available right now.");
    }

    @Override
    void No_of_cars() {
        System.out.println("How many cars of this brand are availble? ");
//        Scanner num = new Scanner(System.in);
        String am = num.next();
        System.out.println("Are you interested to buy? ");
        Scanner ans = new Scanner(System.in);
        String get = ans.next();

        while (get == "Yes") System.out.println("We r happy that u bought our car. Thanks! ");

        System.out.println("Thanks for visiting our website! ");
    }
}
