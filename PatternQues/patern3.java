package PatternQues;

public class patern3 {

    public static void patternQu(int a){
        
        for (int i = 0; i < a; i++) {  // row 
            for (int j = 1; j <= i; j++) {   // in iteration col size inc. 
                                              //till it reaches to the size of the row
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
        patternQu(5);
    }
}
