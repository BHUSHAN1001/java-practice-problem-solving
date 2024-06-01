public class cwh_33_varargs {

   /* static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Varargs Tutorial");
        System.out.println("The sum of 4 and 5 is: " + sum(4, 5));
        System.out.println("The sum of 4,3 and 5 is: " + sum(4, 3, 5));
        System.out.println("The sum of 4,8,12 and 16 is:" + sum(4, 8, 12, 16));
 }*/


    //shortcut method for adding method using (int ...arr)

        static int add(int ...arr){
            int result = 0;
            for (int a : arr){
                result = result + a;
            }
            return result;
        }

        public static void main(String[] args){
            System.out.println(add(1,2));
            System.out.println(add(2,3,4));
            System.out.println(add(4,5,6,5,8,78,778));
        }
    }


