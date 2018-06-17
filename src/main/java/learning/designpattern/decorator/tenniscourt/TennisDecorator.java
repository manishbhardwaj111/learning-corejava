package learning.designpattern.decorator.tenniscourt;

public abstract class TennisDecorator implements CourtBooking{
    CourtBooking cb;

    public TennisDecorator(CourtBooking cb) {
        this.cb=cb;
    }
}