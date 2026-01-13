import java.util.Scanner;

public class IOManager {

    public static String userWrite(String message){
        
        Scanner scan = new Scanner(System.in);
        System.out.println(message);

        return scan.next();
    }

    public static void userRead(String readMessage){

        System.out.println(readMessage);
    }

}
