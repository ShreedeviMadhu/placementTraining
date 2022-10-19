package fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws FileNotFoundException {
        File obj = new File("D:\\IdeaProjects\\SoftwareTesting\\PlacementTraining\\files\\Java\\Demo.txt");
        Scanner read = new Scanner(obj);
        while(read.hasNextLine()){
            String data = read.nextLine();
            System.out.println(data);
        }
        read.close();
    }
}
