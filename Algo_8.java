class Algo_8 {
    public static void main(String[] args) {
        
        
        int[] numA = {5, 7, -2, 3, 4, 6, -8};
        int[] numB = {7, 8, 2, 1, -9, 6,};
        //Intersection of sets
        /*System.out.print("Intersection of numA and numB {");
        for (int i = 0; i < numA.length; i++) {
            boolean foundIntersection = false;
            loop:
            for (int j = 0; j < numB.length; j++) {
                if(numA[i] == numB[j] && !foundIntersection) {
                    foundIntersection = true;
                    System.out.print(numA[i]+ ", ");
                }
            }
        }
        System.out.println("\b".repeat(2) + "}");*/
        
        int[] 
        //union of set
        System.out.print("Union of numA and numB {");
        for (int i = 0; i < numA.length; i++) {
            boolean intersect = false;
            loop:
            for (int j = 0; j < numB.length; j++) {
                if(numA[i] == numB[j]){
                    intersect = true;
                    break;
                }else{
                    continue;
                }
            }
            for (int j = 0; j < numB.length; j++) {
                if(numA[i] == numB[j]){
                    intersect = true;
                    break;
                }else{
                    continue;
                }
            }
            if(intersect) System.out.print(numA[i] + ", ");
            else System.out.print(numA[i]+", ");
        }
        System.out.println("\b".repeat(2) + "}");
    }
}
