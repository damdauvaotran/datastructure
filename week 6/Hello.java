import java.io.*;
import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {

        try {
            File file = new File("data.dat");
            Scanner scanner = new Scanner(file);
            int a ;

            while (scanner.hasNextInt()){
                a= scanner.nextInt();
                System.out.println(a);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } 
    }



}
