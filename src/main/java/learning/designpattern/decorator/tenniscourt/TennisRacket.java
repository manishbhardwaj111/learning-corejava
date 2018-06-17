package learning.designpattern.decorator.tenniscourt;

public class TennisRacket extends TennisDecorator{
    public TennisRacket(CourtBooking cb) {
        super(cb);
    }

    @Override
    public int cost() {
        System.out.println("TennisRacket charges : "+100);
        return 100+cb.cost();
    }
}