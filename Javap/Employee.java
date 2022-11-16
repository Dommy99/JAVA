package Javap;
package employees;
/**
  Represents an Employee
*/
public class Employee {
/**
Holds the id of the next instance
*/
  private static int nextId = 1;
/**
Stores the current next id value in this instance and
increments <code>nextId</code>
*/
  private int id = nextId++;
/**
Stores the first name
*/
  private String firstName;
/**
Stores the last name
*/
  private String lastName;
/**
Stores the department number
*/
  private int dept;
/**
Stores the pay rate
*/
  private double payRate;
  
/**
Constructs an empty Employee
*/
  public Employee() {
  }
  
/**
Constructs an Employee with first and last names
@param  firstName the first name
@param lastName the last name
*/
  public Employee(String firstName, String lastName) {
    setFirstName(firstName);
    setLastName(lastName);
  }
  
/**
Constructs an Employee with first and last names, and department number
@param  firstName the first name
@param lastName the last name
@param dept the department number
*/
  public Employee(String firstName,String lastName, int dept) {
    this(firstName, lastName);
    setDept(dept);
  }
  
/**
Constructs an Employee with first and last names, department number,
and pay rate
@param  firstName the first name
@param lastName the last name
@param payRate the pay rate
*/
  public Employee(String firstName, String lastName, double payRate) {
    this(firstName, lastName);
    setPayRate(payRate);
  }
  
/**
Constructs an Employee with first and lsst names, department number,
and pay rate
@param firstName the first name
@param lastName the last name
@param dept the department number
@param payRate the pay rate
*/
  public Employee(
    String firstName, String lastName, int dept, double payRate) {
    this(firstName, lastName, dept);
    setPayRate(payRate);
  }

/**
Retrieves the next id
@return the nextId value
*/
  public static int getNextId() {
    return nextId;
  }
  
/**
Retrieves the next id
@return the nextId value
*/
  public static void setNextId(int nextId) {
    Employee.nextId = nextId;
  }
  
/**
Retrieves the id
@return the id
*/
  public int getId() {  return id;  }

/**
Retrieves the first name
@return the first name
*/
  public String getFirstName() { return firstName; }

/**
Sets the first name
@param firstName the first name
*/
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

/**
Retrieves the last name
@return the last name
*/
  public String getLastName() { return lastName; }

/**
Sets the last name
@param lastName the last name
*/
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

/**
Retrieves the department
@return the department
*/
  public int getDept() { return dept; }

/**
Sets the department
@param dept the department
*/
  public void setDept(int dept) {
    this.dept = dept;
  }


/**
Retrieves the pay rate
@return the pay rate
*/
  public double getPayRate() { return payRate; }

/**
Sets the pay rate
@param payRate the pay rate
*/
  public void setPayRate(double payRate) {
    this.payRate = payRate;
  }

/**
Retrieves the full name as first name and last name separated by a space
@return the full name
*/
  public String getFullName() {
    return firstName + " " + lastName;
  }

/**
Retrieves a pay information string
@return a String with the pay information
*/
  public String getPayInfo() {
    return "Employee " + id + " dept " + dept + " " +
           getFullName() + " paid " + payRate;
  }

}