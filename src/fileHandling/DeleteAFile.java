package fileHandling;

import java.io.File;

public class DeleteAFile {
    public static void main(String[] args) {
        File obj = new File("D:\\IdeaProjects\\SoftwareTesting\\PlacementTraining\\files\\Java\\Demo.txt");
        if (obj.delete()){
            System.out.println("File deleted successfully: " + obj.getName());
        }
        else{
            System.out.println("Failed to delete the file");
        }
    }
}
