package Enum;

enum Level {
    LOW,
    MEDIUM,
    HIGH
}

public class EnumWithSwitch {
    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;

        switch (myVar){
            case LOW:
                System.out.println("Low Priority");
                break;
            case MEDIUM:
                System.out.println("Medium Priority");
                break;
            case HIGH:
                System.out.println("High Priority");
                break;
            default:
                System.out.println("Invalid Bug");
        }

    }

}
