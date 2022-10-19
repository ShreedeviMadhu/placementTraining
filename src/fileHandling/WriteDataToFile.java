package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataToFile {
    public static void main(String[] args) throws IOException {
        //File object = new File("D:\\IdeaProjects\\SoftwareTesting\\PlacementTraining\\files\\Java\\Demo.txt");
        FileWriter write = new FileWriter("D:\\IdeaProjects\\SoftwareTesting\\PlacementTraining\\files\\Java\\Demo.txt", true);
        write.append("Hi Everyone\n");
        write.append("Hello");
        write.append("Core Java");
        write.append("Programming");
        write.append("Placement");
        write.close();
        System.out.println("Written successfully to the file");
    }
}
