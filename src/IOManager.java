import java.util.Scanner;

public class IOManager {

    public static String writeMessage(String message){
        
        Scanner scan = new Scanner(System.in);
        System.out.println(message);

        return scan.next();
    }

    public static void printMessage(String readMessage){

        System.out.println(readMessage);
    }

}
