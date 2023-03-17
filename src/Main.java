public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");

        int wage_per_hour = 20;
        int full_day_hour = 8;
        int total_wage;
        int part_time_hours = 4;
        int total_working_day = 20;

        int num = (int) Math.floor(Math.random() * 10) % 3;

        switch (num) {
            case 0: {
                System.out.println("Employee is absent");
            }
            break;
            case 1: {
                System.out.println("Employee is present for part time");
                total_wage = part_time_hours * wage_per_hour;
                System.out.println("Wage of employee for part time is " + total_wage);
                total_wage = total_working_day * part_time_hours * wage_per_hour;
                System.out.println("Wage for a moth for part time is "+total_wage);
            }
            break;

            case 2: {
                System.out.println("Employee is present");
                total_wage = full_day_hour * wage_per_hour;
                System.out.println("Wage of employee for full time is " + total_wage);
                total_wage = total_working_day * full_day_hour * wage_per_hour;
                System.out.println("Wage for a moth for full time is "+total_wage);

            }
            break;

        }


    }
}