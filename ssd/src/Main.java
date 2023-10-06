import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1:Sh10 (15 mins, 1hrs)");
        System.out.println("2:Sh20 (15 mins, midnight)");
        System.out.println("3:Okoa 50");
        System.out.println("4:Okoa 20");
        System.out.println("5:Okoa 10");
        System.out.println("6:Okoa 5");
        System.out.println("7:Okoa 20(900MB, 1hr)");
        System.out.println("8:Okoa internet");
        System.out.println("0: More");




        System.out.println("please enter your option: ");
        int options = scanner.nextInt();
        if (options==0) {
            System.out.println("9:Roaming");
            System.out.println("10:Sms");
            System.out.println("11:Check balance");
            System.out.println("0:go back");
            System.out.println("please enter your option");
            int option2 = scanner.nextInt();
            if (option2 == 0) {
                System.out.println("2:Sh20 (15 mins, midnight)");
                System.out.println("3:Okoa 50");
                System.out.println("4:Okoa 20");
                System.out.println("5:Okoa 10");
                System.out.println("6:Okoa 5");
                System.out.println("7:Okoa 20(900MB, 1hr)");
                System.out.println("8:Okoa internet");
                System.out.println("0: More");
            }
        }
                scanner.close();




    }
}