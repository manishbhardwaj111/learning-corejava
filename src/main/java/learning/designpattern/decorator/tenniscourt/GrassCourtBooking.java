package learning.designpattern.decorator.tenniscourt;

public class GrassCourtBooking implements  CourtBooking{
    @Override
    public int cost(){
        System.out.println("GrassCourtBooking charges : "+500);
        return 500;
    }
}

