public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");

        double num = Math.floor(Math.random() * 10) % 2;

        if (num == 1) {
            System.out.println("Employee is Present");
        }
        else{
            System.out.println("Employee is Absent");
        }

    }
}