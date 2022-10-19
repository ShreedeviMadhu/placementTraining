package controlStatements.decisionMaking;

public class NestedIfElse {
    public static void main(String[] args) {
        int marksEnglish = 70;
        int marksMathematics = 78;
        String name = "Sachin";

        if (marksEnglish > 80){
            if (marksMathematics > 80){
                System.out.println("Congratulations " + name + ". You get a video game!!");
            }
            else {
                System.out.println("Congratulations " + name + ". You get a football!!");
            }
        }
        else {
            System.out.println("Sorry "+ name + ". You need to study harder..!!");
        }
    }

}
