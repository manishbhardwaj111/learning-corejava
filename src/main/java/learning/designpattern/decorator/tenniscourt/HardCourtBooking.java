package learning.designpattern.decorator.tenniscourt;

public class HardCourtBooking  implements  CourtBooking{
    @Override
    public int cost(){
        System.out.println("HardCourtBooking charges : "+300);
        return 300;
    }
}

