package fileHandling;

import java.io.File;

public class CreatingAFolder {
    public static void main(String[] args) {
        File object = new File("D:\\IdeaProjects\\SoftwareTesting\\PlacementTraining\\files\\Java");
        if (object.mkdir()){
            System.out.println("Folder Created : " + object.getName());
        }
        else {
            System.out.println("The Folder Already Exists");
        }
    }

}
