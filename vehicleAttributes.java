/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/********************************
Name: Miriam Ekiye
MethodsPurposes: For saving and retrieving the values which will be
placed in the linked list (getters, and setters)
*******************************/
public class vehicleAttributes extends DoublyLinkedList
{
private int numbers; //for the first set of numbers to beinserted
private int doorNum; // variable for the number of doors
private String carType;// variable for different vehiclemanufacturer
private int engineNum; //Variable for the number of engines
private String area;//The area where the engines are
//creating setters and getters for these fields used to storevalues in the linked list
public void setNumbers(int num)// storing the numbers for thefirst data set entry
{
numbers = num;
}
public void setCars(String typeCar,int numDoor) //storing carsfor the second data set entry
{
carType = typeCar;
doorNum = numDoor;
}
public void setPlanes(int numDoor, int numEngine, String
areaE) //Storing the data for planes
{
doorNum = numDoor;
engineNum = numEngine;
area = areaE;
}
public int getNumbers() //method for getting the data whichwill be placed into the linked list
{
return numbers;
}
public String toStringCars()//for getting data for cars
{
return carType + " with " + doorNum + " doors ";
}
public String toStringPlanes()//used for getting data forplanes
{
return doorNum +" doors " + engineNum +" engines by "+area;
}
}