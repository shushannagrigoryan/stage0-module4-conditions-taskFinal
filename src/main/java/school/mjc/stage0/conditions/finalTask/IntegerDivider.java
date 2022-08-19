package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        System.out.println("divident" + dividend);
        System.out.println("divider" + divider);
        double d = (double)dividend / (double)divider;
        System.out.println("d = " + d);
        if(( d* (double)divider ) == (double) dividend){
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
