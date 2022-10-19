package fileHandling;

import java.io.File;

public class DeleteAFolder {
    public static void main(String[] args) {
        File obj = new File("D:\\IdeaProjects\\SoftwareTesting\\PlacementTraining\\files\\Java");
        if (obj.delete()){
            System.out.println("Folder Deleted Successfully: " + obj.getName());
        }
        else {
            System.out.println("Unable to delete the folder");
        }
    }
}
