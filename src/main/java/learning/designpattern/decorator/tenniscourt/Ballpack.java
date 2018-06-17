package learning.designpattern.decorator.tenniscourt;

public class Ballpack extends TennisDecorator{
    public Ballpack(CourtBooking cb) {
        super(cb);
    }

    @Override
    public int cost() {
        System.out.println("Ballpack charges : "+50);
        return   50+cb.cost();
    }
}