//Practise set

import org.w3c.dom.ls.LSOutput;

public class cwh_25_practice_set_4 {
    public static void main(String[] args) {
        //Problem 1
        int n = 4;
        for (int i=n; i>0; i--) {
            for (int j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println("\n");
        }

        // problem 2
      /*  int sum=0;
        int n=4;
        for(int i=0;i<n;i++){
            sum = sum + (2*i);
        }
        System.out.println("Sum of even number is:");
        System.out.println(sum); //first 4 even number are = 0 2 4 6  */

        //problem 3
      /*  int n = 5;
        //for(int i=0; i=<10; i++) - Goes from i=0 to i=9
        for(int i=0; i<=10; i++){
            System.out.printf("%d X %d = %d\n", n, i, n*i);
        }*/

        //problem 4
        /*int n = 10;
        for (int i = 10; i >=1; i--) {
            System.out.printf("%d X %d = %d\n", n, i, n * i);
        }*/

        //problem 6
      /*  int n = 5;
        //what is factorial n =n * n-1 * n-2 ..... for 1
        //5! = 5*4*3*2*1
        int i = 1;
        int factorial = 1;
        while(i<=n){
            factorial *= i;
            i++;
        }
        System.out.println(factorial);*/

        // Problem 9
        /*int n = 8;
        int sum = 0;
        for(int i=1;i<=10;i++){
            sum += n*i;
        }
        System.out.println(sum);*/
    }
}