package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        if(divider != 0) {
            int d = dividend / divider;
            if (d * divider == dividend) {
                System.out.println("can be divided completely");

            }  else {
                System.out.println("cannot be divided completely");
            }
        }

        else {
            System.out.println("division by zero");
        }
    }
}
