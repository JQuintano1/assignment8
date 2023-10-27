import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Please enter your desired Fibonacci number: ");
        Scanner scnr = new Scanner(System.in);
        int fibonaccinum = scnr.nextInt();

        calculatefib(fibonaccinum);
    }

    public static void calculatefib(int fibonum){
        int fibsum = 0;
        ArrayList<Integer> fibsequence = new ArrayList<Integer>();
        if (fibonum == 0){
            fibsum = 0;
            System.out.println(fibsum);
        }
        else if (fibonum == 1){
            fibsum = 1;
            System.out.println(fibsum);
        }
        else if (fibonum == 2){
            fibsum = 1;
            System.out.println(fibsum);
        }
        else {
            fibsequence.add(0);
            fibsequence.add(1);           

            for (int i = 0 ; i < fibonum-1; i++){
                fibsum = fibsequence.get(i) + fibsequence.get(i+1);
                fibsequence.add(fibsum);
                
            }
            System.out.println(fibsum);
        }
        
    }

}
