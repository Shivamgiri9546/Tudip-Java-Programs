package tudipProgram;
import java.util.Scanner;
public class CheckDivisibility {
            public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int num=scn.nextInt();

            if(num%5==0 && num%7==0) {
                System.out.println("Hello World");
            }else if(num%5==0) {
                System.out.println("Hello");
            }else if(num%7==0) {
                System.out.println("World");
            }else {
                System.out.println("Not devisible by 5 or 7");
            }
        }
    }
