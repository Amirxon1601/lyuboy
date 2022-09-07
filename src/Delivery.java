import java.util.Scanner;

public class Delivery {
    Scanner in = new Scanner(System.in);
    public void info(){

        System.out.println("Tovar nomi: ");
        String nomi = in.nextLine();
        System.out.println("Tovar kilosi: ");
        int n = in.nextInt();
        System.out.println("Location: ");
        String loc = in.nextLine();
        in.nextLine();
        System.out.println("Destination");
        String des = in.nextLine();
    }


}