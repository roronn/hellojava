package activity4_masarate;

public class Activity4_Masarate {

    
    public static void main(String[] args) {
        boolean isEven;
        int isOdd;
        int num = 10;
        
        isEven = (num%2 == 0);
        isOdd = (num%2 != 0) ? num++ : num ;
        
        System.out.println(isEven);
        System.out.println(num);
        
        
    }
    
}
