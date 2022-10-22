package Javap;
public class Employee {
  private int id = 0;
  private String firstName;
  private String lastName;
  private int dept;
  private double payRate;
  
  public Employee() {
  }
  public Employee(String firstName, String lastName) {
    setFirstName(firstName);
    setLastName(lastName);
  }
  public Employee(String firstName,String lastName, int dept) {
    this(firstName, lastName);
    setDept(dept);
  }
  public Employee(String firstName, String lastName, double payRate) {
    this(firstName, lastName);
    setPayRate(payRate);
  }
  public Employee(String firstName, String lastName, 
        int dept, double payRate) {
    this(firstName, lastName, dept);
    setPayRate(payRate);
  }

  public int getId() {  return id;  }

  public String getFirstName() { return firstName; }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() { return lastName; }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getDept() { return dept; }

  public void setDept(int dept) {
    this.dept = dept;
  }


  public double getPayRate() { return payRate; }

  public void setPayRate(double payRate) {
    this.payRate = payRate;
  }

  public String getFullName() {
    return firstName + " " + lastName;
  }

  public String getPayInfo() {
    return "Employee " + id + " dept " + dept + " " +
           getFullName() + " paid " + payRate;
  }


}

private int id = 0;
private String firstName;
private String lastName;
private int dept;
private double payRate;

public Employee() { }

public Employee(String firstName, String lastName, 
      int dept, double payRate) {
  setFirstName(firstName);
  setLastName(lastName);
  setDept(dept);
  setPayRate(payRate);
}

public int getId() {  return id;  }

public String getFirstName() { return firstName; }

public void setFirstName(String fn) {
  firstName = fn;
}

public String getLastName() { return lastName; }

public void setLastName(String ln) {
  lastName = ln;
}

public int getDept() { return dept; }



public double getPayRate() { return payRate; }

public void setPayRate(double pay) {
  payRate = pay;
}

public String getFullName() {
  return firstName + " " + lastName;
}

// public String getPayInfo() {
//   return "Employee " + id + " dept " + dept + " " +
//          getFullName() + " paid " + payRate;
// }