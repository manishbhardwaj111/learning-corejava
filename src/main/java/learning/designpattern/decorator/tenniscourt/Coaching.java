package learning.designpattern.decorator.tenniscourt;

public class Coaching extends TennisDecorator{
    public Coaching(CourtBooking cb) {
        super(cb);
    }

    @Override
    public int cost() {
        System.out.println("Coaching charges : "+100);
        return 100+cb.cost();
    }
}