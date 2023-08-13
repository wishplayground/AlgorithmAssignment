import java.util.Scanner;

import javax.sound.midi.Soundbank;

class Algo_1{
    private final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        do{
            System.out.print("Enter a positive Intiger number: ");
            int num = scanner.nextInt();
            scanner.nextLine();
            String output = "0, 1";
            if (num <= 0 ){
                System.out.println("Invalid number.Try Again!!");
                continue;
            }else if (num <=2){
                output = num ==1 ? "0" :"0, 1";
            }else{
                int fibo,count = 2;
                //System.out.print("01 ");
                int prevNum = 0, nextNum = 1;
                do{
                    fibo = prevNum + nextNum;
                    prevNum = nextNum;
                    nextNum = fibo;
                    count++;
                    output += ", " + fibo;
                }while(count!=num);
            }
            System.out.println(output.concat("\n"));
        }while(true);

    }
}