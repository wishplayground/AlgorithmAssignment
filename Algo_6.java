import java.util.Scanner;

class Algo_6 {
    private final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        

        do{
            System.out.print("Enter a sentence: ");
            String sentence = scanner.nextLine();
            char[] letterArray = sentence.strip().toCharArray();
            if(sentence.isBlank())continue;
            else{
                int count = 0;
                for (int i = 0; i < letterArray.length; i++) {
                    char c = letterArray[i];
                    if(c == ' '|| i == letterArray.length-1){
                        count++;
                    }
                }
                String[] words = new String[count];
                count = 0;
                String tempstr="";
                for (int i = 0; i < letterArray.length; i++) {
                    char c = letterArray[i];

                    if(c == ' ' || i == letterArray.length -1) {
                        if(c !=' ')tempstr += c;
                        words[count] = tempstr;
                        tempstr = "";
                        count++;
                        
                    }else{
                        tempstr += c;
                    }
                    
                }
                for (int i = words.length -1; i >= 0; i--) {
                    System.out.print(words[i] +" ");
                }
                    

            }
            System.out.println("\n");
        }while(true);
    }
    
}
