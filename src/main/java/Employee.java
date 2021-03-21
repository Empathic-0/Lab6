/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alexander
 */
class Employee {
 
  private String name;
  private int idNumber;
  private String department;
  private String position;

  public Employee(String name, int idNumber, String department, String position) {
    this.name = name;
    this.idNumber = idNumber;
    this.department = department;
    this.position = position; 
  }

  public Employee(String name, int idNumber) { //half constructor
    this.name = name;
    this.idNumber = idNumber; 
    this.department = "";
    this.position = "";
  }
  
  public Employee() {
    this.name = "";
    this.idNumber = 0; 
    this.department = "";
    this.position = "";
  }


  public String getName() { //getter
    return this.name;
  }

  public int getIdNumber() { //getter
    return this.idNumber;
  }

  public String getDepartment() { //getter
    return this.department;
  }

   public String getPosition() { //getter
    return this.position;
  }

  public void setName(String name) { //setter
    this.name = name;
  }

  public void setIdNumber(int IdNumber) { //setter
    this.idNumber = IdNumber;
  }

  public void setDepartment(String department) { //setter
    this.department = department;
  }

  public void setPosition(String position) { //setter
    this.position = position;
  }

  private String getNamedBar() {
    if (this.name.length() == 10) {
      return "    |   ";
    }

    if (this.name.length() == 12) {
       return "  |   ";
    }
    
    return "";
  }

  private String getIdBar() {
    return "   |   ";
  }

  private String getDepartmentBar() {
    if (this.department.length() == 13) {
      return " |   ";
    }
    
    if (this.department.length() == 10) {
      return "    |   ";
    }

    if (this.department.length() == 2) {
      return "            |   ";
    }

    return "";
  }

  private String getPositionBar() {
    if (this.position.length() == 14) {
      return "   |   ";
    }
    
    if (this.position.length() == 10) {
      return "       | ";
    }

    if (this.position.length() == 8) {
      return "         | ";
    }

    return "";
  }

  public void printAll() {
     System.out.println(getName() + getNamedBar() + getIdNumber() +
      getIdBar() + getDepartment() + getDepartmentBar() + getPosition() + getPositionBar());
  }

}
