
                   // PRACTICE SET
public class cwh_15_ps3 {
    public static void main(String[] args) {
          //Problem 1
        String name = "Jack Parker";
        name = name.toLowerCase();
        System.out.println(name);

          //Problem 2
        String text = "To My Friend";
        text = text.replace(" ","_");
        System.out.println(text);

        //Problem 3
        String letter = "Dear <|name|>,Thanks a lot!";
        letter = letter.replace("<|name|>","Sachin");
        System.out.println(letter);

        //Problem 4
        String myString = "This string contains double and   Triple spces";
        System.out.println(myString.indexOf(" "));
        System.out.println(myString.indexOf("   "));

        //Problem 5
        String Letter2 = "Dear Harry,\n\tThis Java Course is Nice. \nThanks! ";
        System.out.println(Letter2);









    }
}
