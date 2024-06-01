import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class cwh_24_break_and_continue {
    public static void main(String[] args) {
        //Break and continue using loops!

        // for Break
     /*   for(int i=0;i<5;i++){
            System.out.println (i);
            System.out.println("Java is great");
            if(i==2){
                System.out.println("Ending The Loop");
                break;
            }
        }*/


      /*  int i = 0;
        do  {
            System.out.println(i);
            System.out.println("Java is great");
           if (i == 2) {
               System.out.println("Ending the loop");
                break;
            }
            i++;
        }while(i<5);*/

        // for continue

       /* for (int i = 0; i < 5; i++) {

            if (i == 2) {
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is great");*/

        //continue in do while

        int i = 0;
        do {
            i++;
            if (i == 2) {
            System.out.println("Ending the loop");
            continue;
        }
            System.out.println(i);
            System.out.println("Java is great");
        }while(i<5);
        System.out.println("Loops ends here");


        }
    }
