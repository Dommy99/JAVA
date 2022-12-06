package Javap;
public class FirstProgram {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("Hey");
        StringBuffer sb2 = null;
        sb2 = sb1;
        sb2.append(" World");
        System.out.println(sb1);
      }
}
