public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");

        int wage_per_hour = 20;
        int full_day_hour = 8;
        int total_wage;
        int part_time_hours = 4;

        double num = Math.floor(Math.random() * 10) % 3;

        if (num == 1) {
            System.out.println("Employee is Present");
            total_wage = wage_per_hour * full_day_hour;
            System.out.println("Total wage for a day of employee is rs " + total_wage);
        } else if (num ==2) {
            System.out.println("Employee is working for part time");
            total_wage = part_time_hours * wage_per_hour;
            System.out.println("Total wage for a day of employee is rs " + total_wage);

        } else {
            System.out.println("Employee is Absent");
        }


    }
}