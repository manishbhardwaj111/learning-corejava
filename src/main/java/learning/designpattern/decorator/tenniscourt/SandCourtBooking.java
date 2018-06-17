package learning.designpattern.decorator.tenniscourt;

public class SandCourtBooking  implements  CourtBooking{
    @Override
    public int cost(){
        System.out.println("SandCourtBooking charges : "+400);
        return 400;
    }
}

