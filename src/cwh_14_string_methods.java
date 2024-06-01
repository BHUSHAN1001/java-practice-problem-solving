// 0 1 2 3 4
// H a r r y
public class cwh_14_string_methods {
    public static void main(String[] args) {
        String name = "Harry";
        //System.out.println(name);
            // next concept
     //   int value = name.length();
     //  System.out.println(value);
            // next concept
     //   String lstring = name.toLowerCase();
     //   System.out.println(lstring);
            // next concept
     //   String ustring = name.toUpperCase();
     //   System.out.println(ustring);
           // next concept
      // String nonTrimmedString = "            Harry         ";
       // System.out.println(nonTrimmedString);
             // next concept
      // String trimmedString = nonTrimmedString.trim();
      // System.out.println(trimmedString);
            // next concept
     //  System.out.println(name.substring(2));
     //   System.out.println(name.substring(1,4));
             // next concept
     //  System.out.println(name.replace('r','p'));
        System.out.println(name.replace("rry","ier"));
        System.out.println(name.replace("r","ier"));
              // next concept
        System.out.println(name.startsWith("Har"));
        System.out.println(name.endsWith("ry"));
               //new concept
        System.out.println(name.charAt(4));
               //new concept
        System.out.println(name.indexOf("ry")); // 0 1 2 3 4
                                                // H a r r y
                    // next concept
        String modifiedName = "Harryrry";
        System.out.println(modifiedName.indexOf("rry"));
                     // next concept
        System.out.println(modifiedName.indexOf("rry",4));
                      // next concept
        System.out.println(modifiedName.lastIndexOf("rry"));
        System.out.println(modifiedName.lastIndexOf("rry",3));
                     // next concept
        System.out.println(name.equals("Harry"));

        System.out.println(name.equalsIgnoreCase("harRy"));
                     //next concept
        System.out.println("I am escape sequence \\ double quote");
        System.out.println("I am escape sequence \n double quote");
        System.out.println("I am escape sequence \t double quote");




    }

}
