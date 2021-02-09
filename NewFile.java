package gittest;
import java.util.Scanner;
/**
 *
 * @author Master
 */
public class GitTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("type your name");
        String userName = userInput.nextLine();
        System.out.println("Hello " + userName );
        // TODO code application logic here
    }
    
}
