import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Services services = new Services();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("[1] Yetkazib berish:\t\t[2] Shaxsiy kabinet:\t\t[3] Magazin\t\t[default] Exit: ");
            int inputmain = input.nextInt();

            if (inputmain == 1) {
                services.Yetkazish();
            }
            else if(inputmain == 2) {
                services.kabinet();
            }
            else System.exit(0);
        }

    }
}