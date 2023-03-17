public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");

        int wage_per_hour = 20;
        int full_day_hour = 8;
        int total_wage;

        double num = Math.floor(Math.random() * 10) % 2;

        if (num == 1) {
            System.out.println("Employee is Present");
            total_wage = wage_per_hour * full_day_hour;
            System.out.println( "Total wage per hour of employee is "+total_wage);
        }
        else{
            System.out.println("Employee is Absent");
        }


    }
}