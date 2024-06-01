public class cwh_17_logical {
    public static void main(String[] args) {
       /* boolean a = true;
        boolean b = false;
        if (a && b) {
            System.out.println("Y");
        } else {
            System.out.println("N");
        }*/

        // next concept
        //for AND
        System.out.println("For Logical AND...");
        boolean a = true;
        boolean b = false;
        if (a && b) {
            System.out.println("Y");
        }
        else {
            System.out.println("N");
        }
        //for OR
        System.out.println("For Logical OR...");
        boolean a1 = true;
        boolean b1 = false;
        if (a1 || b1) {
            System.out.println("Y");
        } else {
            System.out.println("N");
        }

        //for NOT
        System.out.println("For logical NOT");
        System.out.println("Not(a1) is");
        System.out.println(!a1);
        System.out.println("Not(b1) is");
        System.out.println(!b1);
    }
}