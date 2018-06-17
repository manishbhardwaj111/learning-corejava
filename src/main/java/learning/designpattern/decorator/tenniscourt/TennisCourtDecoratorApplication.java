package learning.designpattern.decorator.tenniscourt;

public class TennisCourtDecoratorApplication {
    public static void main(String[] args) {
        CourtBooking cb = new GrassCourtBooking();
        cb = new TennisRacket(cb);
        cb = new Ballpack(cb);
        cb = new Coaching(cb);
        cb = new Ballpack(cb);
        System.out.println("Total Charges : "+cb.cost());
    }
}
