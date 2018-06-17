package learning.exception;

class RunningTrain extends Exception{}

class CollideTrain extends RuntimeException{}

public class ExceptionTest {

    public void runTrain() throws RunningTrain,CollideTrain{
        try{
            throw new RunningTrain();
        }
        catch(RunningTrain | CollideTrain e){

        }
    }

    public static void main(String[] args) throws Exception{
        new ExceptionTest().runTrain();
    }
}
