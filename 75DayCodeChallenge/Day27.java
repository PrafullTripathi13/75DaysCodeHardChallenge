import java.util.Scanner;

public class Day27 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int Basic = sc.nextInt();
            char Grade = sc.next().charAt(0);

            double hra = 0.2 * Basic;
            double da = 0.5 * Basic;

            int allowance;

            if (Grade == 'A') {
                allowance = 1700;
            } else if (Grade == 'B') {
                allowance = 1500;
            } else {
                allowance = 1300;
            }

            double pf = 0.11 * Basic;
            double totalSalary = Basic + hra + da + allowance - pf;

            int ans = (int) Math.round(totalSalary);

            System.out.println("Your total Salary is : " + ans);
        }
    }
}
