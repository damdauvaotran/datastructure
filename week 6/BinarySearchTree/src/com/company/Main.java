

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<Integer>();

        try {
            File file = new File("data.dat");
            Scanner scanner = new Scanner(file);
            int a ;

            while (scanner.hasNextInt()){
                a= scanner.nextInt();
                data.add(a);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        BinarySearchTree bst = new BinarySearchTree();

        for (Integer i : data){
            bst.insert(i.intValue());
        }

        //Print inorder
        bst.printInorder();
        System.out.println(bst.search(112));
        bst.delete(112);
        bst.printInorder();
    }



}
