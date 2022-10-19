package fileHandling;

import java.io.File;
import java.io.IOException;

public class CreateAFile {
    public static void main(String[] args) {

        try {
            File obj = new File("D:\\IdeaProjects\\SoftwareTesting\\PlacementTraining\\files\\Java\\Demo.txt");
            if (obj.createNewFile()){
                System.out.println("File created successfully: " + obj.getName());
            }
            else {
                System.out.println("File Already Exists");
            }
        } catch (IOException e) {
            System.out.println("Something unexpected happened");
        }
    }
}
