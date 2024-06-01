import java.util.Scanner;

public class cwh_11_ex1_sol {

    public static void main(String[] args){

        Scanner  scan  = new Scanner(System.in);
        System.out.println("Enter your Physics marks :");;
        float physics =  scan.nextInt();
        System.out.println("Enter your English marks :");
        float English =  scan.nextInt();
        System.out.println("Enter your Chemistry marks :" );
        float Chemistry =  scan.nextInt();
        System.out.println("Enter your Mathematics marks :");
        float Mathematics = scan.nextInt();
        System.out.println("Enter your Computer Science marks :");
        float ComputerScience = scan.nextInt();

        float percentage = (( physics +  English + Chemistry + Mathematics + ComputerScience )/500)*100;

        System.out.println("percentage :");
        System.out.println(percentage);

    }

}
