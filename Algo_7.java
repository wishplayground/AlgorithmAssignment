import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

class Algo_7 {
    private final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        do{
            System.out.print("Enter sentence: ");
            String sentence = scanner.nextLine();
            if(sentence.isBlank()) {
                System.out.println("Invalid input");
                continue;
            }
            char[] sent = sentence.strip().toCharArray();
            int wordEndCount = 1;
            for (int i = 0; i < sent.length; i++) {
                if(sent[i] == ' ') wordEndCount++;
            }
        
            //create string array
            String[] strarray = new String[wordEndCount];
            String tempstr = "";
            int count = 0;
            for (int i = 0; i < sent.length; i++) {
                if(sent[i] == ' ' || i == sent.length -1){
                    if(i == sent.length -1) tempstr +=sent[i];
                    strarray[count] = tempstr;
                    count++;
                    tempstr = ""; //use substring method
                }else {
                    tempstr +=sent[i];
                }
            }
            System.out.println(Arrays.toString(strarray));
            //find logest and shortest indexes
            int shortestIndex = 0, longestIndex = 0;
            for (int i = 0; i < strarray.length; i++) {
                if (strarray[shortestIndex].length() > strarray[i].length()) shortestIndex = i;
                if (strarray[longestIndex].length() < strarray[i].length()) longestIndex = i;
                //System.out.println(strarray[i] + " " + strarray[i].length() + " " + shortestIndex);
                
            }
            System.out.println("Shortest word is \"" + strarray[shortestIndex] + "\" has length of " + strarray[shortestIndex].length());
            System.out.println("Longest word is \"" + strarray[longestIndex] + "\" has length of " + strarray[longestIndex].length());
        }while(true);

    }
}
