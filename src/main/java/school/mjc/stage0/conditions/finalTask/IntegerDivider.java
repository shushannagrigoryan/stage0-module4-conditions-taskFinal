package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        int d = dividend / divider;
        if( d* divider == dividend){
            System.out.println("can be divided completely");

        }
        else if(divider == 0){
            System.out.println("division by zero");
        }
        else{
            System.out.println("cannot be divided completely");
        }
    }
}
