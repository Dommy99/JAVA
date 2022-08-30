public class FirstProgram {
    public static void main(String[] args) {
        int i = 0, j;
        
        i = i++;
        System.out.println("i = " + i);
        
        j = i++ + i;
        System.out.println("i = " + i + ", j = " + j);
      }
}