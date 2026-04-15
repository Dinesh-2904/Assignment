import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        int count=0;
        int temp =0;
        int original=number;
        int n = number
        while (number != 0) {
            count++;
            number = number/10;
        }
        while(n!= 0){
            int digit = n % 10;
            temp += Math.pow(digit, count); 
            n = n / 10;
        }
        if (temp == original) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}
