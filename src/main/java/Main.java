/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alexander
 */
class Main {
  public static void main(String[] args) {
    Employee e1 = new Employee("Susan Meyers", 47899, "Accounting", "Vice President"); //full constructor
    
    Employee e2 = new Employee("Mark Jones", 39119); //half constructor 
    e2.setDepartment("IT");
    e2.setPosition("Programmer");
    
    Employee e3 = new Employee(); //empty constructor
    e3.setName("Joy Rogers");
    e3.setIdNumber(81774);
    e3.setDepartment("Manufacturing");
    e3.setPosition("Engineer");


    printDisplay(e1, e2, e3);
  }

  public static void printDisplay(Employee e1, Employee e2, Employee e3 ) {
    System.out.println("____________________________________________________________________");
    System.out.println("Name   " + "         IdNumber" + "      Department" 
    + "          Position");
    e1.printAll();
    e2.printAll();
    e3.printAll(); 
    System.out.println("____________________________________________________________________");
  }
}
