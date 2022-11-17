package Javap;
/**
  Represents an Employee
*/
-
  private static int nextId = 1;
  private int id = nextId++;
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
  public Employee(String firstName, String lastName, int dept, double payRate) {
    this(firstName, lastName, dept);
    setPayRate(payRate);
  }

  public static int getNextId() {
    return nextId;
  }
  
  public static void setNextId(int nextId) {
    Employee.nextId = nextId;
  }
  
  public int getId() {	return id;	}

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
    if (dept > 0) this.dept = dept;
  }


  public double getPayRate() { return payRate; }

  public void setPayRate(double payRate) {
    if (payRate >= 0) this.payRate = payRate;
  }

  public String getFullName() {
    return firstName + " " + lastName;
  }

  public String getPayInfo() {
    return "Employee " + id + " dept " + dept + " " +
           getFullName() + " paid " + payRate;
  }

}