package Javap;

public class Varargs {
    public static void showDataOnly(int... values) {
        for (int i = 0; i < values.length; i++) {
          System.out.println("  " + values[i]);
        }
      }
    
      public static void showDataWithMessage(String message, int... values) {
        System.out.println(message);
        showDataOnly(values);
      }
      
      public static void main(String[] args) {
    
        System.out.println("Below printed from showDataOnly");
        showDataOnly(2, 4, 5, 1, 7);
        
        showDataWithMessage(
            "This printed with showDataWithMessage", 2, 4, 5, 1, 7);
        
        showDataWithMessage("No values this time");
        
        int[] data = { 4, 5, 1, 3 };
        showDataWithMessage("This time we passed an array", data);
      }	
}
