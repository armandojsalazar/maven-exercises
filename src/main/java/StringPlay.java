import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;


public class StringPlay {
    public static String capitalizeLetter(String letter){
//        StringUtils utils = new StringUtils();
        return StringUtils.upperCase(letter);
//        return letter.toUpperCase();
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter a letter:");
//        String letter = scanner.next();
//        System.out.println(capitalizeLetter(letter));

        System.out.println("Enter Something:");
        String something = scanner.nextLine();
        System.out.println("You entered: \"" + something + "\"");
        if(StringUtils.isNumeric(something)){
            System.out.println("\"" + something + "\" is a number");
        } else {
            System.out.println("\"" + something + "\" is not a number");
        }
        System.out.println("Flipped case: \"" + StringUtils.swapCase(something) + "\"");
        System.out.println("Reversed: \"" + StringUtils.reverse(something) + "\"");


    }
}
