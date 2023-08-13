import java.util.Scanner;

class Algo_5 {
    private final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        do{
            System.out.print("Enter ASCII text: ");
            String text = scanner.nextLine();
            text.strip();
            char[] tex = text.toCharArray();
            if(text.isBlank()){
                System.out.println("Invalid text: Try Again.");
                continue;
            }else{
                int pastIndex = tex.length - 1;
                for (int i = 0; i < tex.length; i++) {
                    if(i == pastIndex) break;
                    else{
                        char prev = tex[i];
                        tex[i] = tex[pastIndex];
                        tex[pastIndex] = prev;
                        pastIndex--;
                    }
                    
                }
            }
            for (int i = 0; i < tex.length; i++) {
                System.out.print(tex[i]);
            }
            System.out.println();
        }while(true);
    }
}
