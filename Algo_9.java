import java.util.Scanner;

class Algo_9 {
    private final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        do{
            System.out.print("Enter a word to check palindrome: ");
            String word= scanner.nextLine().strip();
            char[] wordchar = word.toCharArray();
            //validation
            if(word.isBlank()){
                System.out.println("Name cannot be Empty");
                continue;
            }else{
                for (int i = 0; i < wordchar.length; i++) {
                    if(Character.isDigit(wordchar[i])){
                        System.out.println("Enter Ascii characters only:");
                        continue;
                    }
                }
            }

            //check pallindrome
            String temp ="";
            for (int i = wordchar.length-1; i >= 0 ; i--) {
                temp +=wordchar[i];
            }
            if(temp.equalsIgnoreCase(word)){
                System.out.println(word + " is a palindrome.");
            }else{
                System.out.println("Not a Palindrome.");
            }
        }while(true);
        
        
        
    }
}
