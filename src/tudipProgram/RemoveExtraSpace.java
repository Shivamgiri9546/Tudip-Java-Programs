package tudipProgram;

import java.util.Scanner;
public class RemoveExtraSpace {
        public static void main(String[] args) {

            Scanner scn = new Scanner(System.in);
            String inputStr=scn.nextLine();

            String output = inputStr.replaceAll("\\s+", " ");
            System.out.println("Output:" + output);

        }
    }

