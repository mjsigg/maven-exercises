import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.SystemUtils;

import java.util.Scanner;


public class Test {

    static String firstPrompt() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("What's on your mind?");
        String firstResponse = userInput.nextLine();
        String storedResponse = "";

        if(StringUtils.isNumeric(firstResponse)) {
            System.out.println("C'mon ...");
            firstPrompt();
        }

        String reversedResponse = StringUtils.reverse(firstResponse);
        System.out.println("Reversed case string: " + reversedResponse);

        String swappedCase = StringUtils.swapCase(firstResponse);
        System.out.println("Swapped case string: " + swappedCase);

        return firstResponse;
    }

    public static void main(String[] args) {

        firstPrompt();


    }
}
