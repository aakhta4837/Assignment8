import java.util.Scanner;

public class Fibonacci {
    
    
  public static long computeFibonacci(int n){
    if (n == 1) {
        return 0;
    }
    if (n == 2){
        return 1;
    }
    return computeFibonacci(n-1) + computeFibonacci(n-2);
  }  
    
    
 
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer value to calculate the Fibonacci number: ");
        int n = scanner.nextInt();
        if (n <= 0){
            System.out.println("Please enter a numebr greater than 0");
        } else {
            long fibNumber = computeFibonacci(n);
            System.out.println("The " + n + "th Fibonacci number is: " + fibNumber);
        }
        scanner.close();
    }
}
