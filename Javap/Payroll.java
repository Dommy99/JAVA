package Javap;
public class Payroll {  
  public static void main(String[] args) {

    Employee e1 = new Employee();
    e1.setFirstName("John");
    e1.setLastName("Doe");
    e1.setPayRate(6000.0);
    e1.setDept(2);
    System.out.println(e1.getPayInfo());

    Employee e2 = new Employee("dom", "akers", 15, 6500.0);
    System.out.println(e2.getPayInfo());
  }
}