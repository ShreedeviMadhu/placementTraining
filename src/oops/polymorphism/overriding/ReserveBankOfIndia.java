package oops.polymorphism.overriding;
// Method overriding
public class ReserveBankOfIndia {
    int rateOfInterest(){
        return 5;
    }
}
class HDFC extends ReserveBankOfIndia{
    int rateOfInterest(){
        return 6;
    }
}
class HSBC extends ReserveBankOfIndia{
    int rateOfInterest(){
        return 7;
    }
}
class Axis extends ReserveBankOfIndia{
    int rateOfInterest(){
        return 8;
    }
}
class Banking {
    public static void main(String[] args) {
        HDFC hdfc = new HDFC();
        HSBC hsbc = new HSBC();
        Axis axis = new Axis();
        System.out.println("The ROI of HDFC is: " + hdfc.rateOfInterest());
        System.out.println("The ROI of HSBC is: " + hsbc.rateOfInterest());
        System.out.println("The ROI of AXIS is: " + axis.rateOfInterest());
    }
}

