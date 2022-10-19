package Enum;

public class EnumExample {

    enum TrafficSignal {
        YELLOW,
        RED,
        GREEN
    }

    public static void main(String[] args) {
        TrafficSignal v1 = TrafficSignal.GREEN;
        TrafficSignal v2 = TrafficSignal.YELLOW;
        TrafficSignal v3 = TrafficSignal.RED;
        System.out.println("The signal is: " + v3);

        for (TrafficSignal colour : TrafficSignal.values()){ // for each loop
            System.out.println(colour);
        }
    }

}