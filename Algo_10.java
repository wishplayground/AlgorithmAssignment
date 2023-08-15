import java.util.Scanner;

class Algo_10{
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.print("Input phone Number: ");
        String phoneNumber = scanner.nextLine().strip();
        char[] num = phoneNumber.toCharArray();
        if(phoneNumber.isBlank()){
            System.out.println("Name cannot be Empty");
        }else{
            for (int i = 0; i < num.length; i++) {
                if(num[i] > 128 || num[i] < 0){
                    System.out.println("Enter Ascii characters only");
                }
            }
        } 
        boolean invalid = false;
        if (phoneNumber.startsWith("+94")){
            
            //validate 1 (+94)
            for (int i = 3; i < num.length; i++) {
                if(num[3] != ' ' || num[6] != ' ') {
                    invalid = true; 
                    break;  
                }else {
                    if(num[i] == ' ')continue;
                    if(Character.isDigit(num[i])) continue;
                    else invalid = true; break;
                }
            }
        }else{
            //valid 2
            for (int i = 0; i < num.length; i++) {
                if(num[3] != '-') {
                    invalid = true; 
                    break;  
                }else {
                    if(num[3] == '-')continue;
                    if(Character.isDigit(num[i])) continue;
                    else invalid = true; break;
                }
            }
        }
        if(invalid)System.out.println("Invalid Phone number");
        else System.out.println("Valid phone number");

    }
}