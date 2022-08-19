package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        double first_squared = firstSide * firstSide;
        double second_squared = secondSide * secondSide;
        double third_squared = thirdSide * thirdSide;

        if((first_squared + second_squared >= third_squared) && (first_squared + third_squared >= second_squared) && (second_squared + third_squared >= first_squared)){
            System.out.println("this is a valid triangle");
        }
        else{
            System.out.println("it's not a triangle");
        }

    }
}
