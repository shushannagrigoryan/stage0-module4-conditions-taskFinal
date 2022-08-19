package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {

        if(year > 0){
            if(month == 2){
                boolean a = ((year % 4 == 0) && ((year % 400 == 0) || (year % 100 != 0)));
                int b = a?1:0;
                switch (b) {
                    case (1):
                        System.out.println(29);
                        break;
                    case (0):
                        System.out.println(28);
                        break;
                }
            }

       else if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
           System.out.println(31);
            }
       else if(month == 4 || month == 6 || month == 9 || month == 11){
           System.out.println(30);
            }
       else{
           System.out.println("invalid date");
            }
        }
        else{
            System.out.println("invalid date");
        }



    }
}
