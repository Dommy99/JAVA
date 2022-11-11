package Javap;

public class If1 {
    public static void main(String[] args) {
        int a = 5;
        System.out.println("original number is: " + a);
        if ( a < 0 ) { 
          a = -a; 
        }
        System.out.println("absolute value is: " + a);
        a = -10;
        System.out.println("original number is: " + a);
        if ( a < 0 ) { 
          a = -a; 
        }
        System.out.println("absolute value is: " + a);
      }
}
