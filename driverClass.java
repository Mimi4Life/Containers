
package linkedlist;

/********************************
Name: Miriam Ekiye
ClassPurpose: This is the driver class which will be used to run the
program. The rear and front insertions are done here. Also the
deletions, and
list item counts. it inherits all its information from the
vehicleAttributes class, DoublyLinkedListString class, and
DoublyLinkedList class
*******************************/
 public class driverClass extends vehicleAttributes
 {
 public static void main(String[] args)
 {
//Processing data for the C option first
 DoublyLinkedList list = new DoublyLinkedList();
vehicleAttributes va = new vehicleAttributes();
va.setNumbers(33); //setting the 33 in the method
list.insertFront(va.getNumbers()); //getting the value33 and inserting it at the front of the list
va.setNumbers(57); //set 57
list.insertFront(va.getNumbers()); //getting the value57 and inserting it at the front of the list
va.setNumbers(85); //setting the 85 in the method
list.InsertRear(va.getNumbers()); //getting the value85 and inserting it at the front of the list
va.setNumbers(62); //set 62
list.insertFront(va.getNumbers()); //getting the value62 and inserting it at the front of the list
va.setNumbers(95); //setting the 95 in the method
list.insertFront(va.getNumbers()); //getting the value95 and inserting it at the front of the list
 list.printList(list.head);
list.delete_Node(list.head, list.head.next.next);
//deleting 57 from the list
System.out.println("\n List after deleting 57. ");
list.print(list.head);
list.delete_Node(list.head, list.head.next.next);
System.out.println(" List after deleting 33. ");
list.print(list.head);
list.delete_Node(list.head, list.head.next);// findindand deleting 62
System.out.println(" List after deleting 62. ");
list.print(list.head);
va.setNumbers(22); //setting the 22 in the method
list.insertFront(va.getNumbers()); //getting the value22 and inserting it at the front of the list
list.delete_Node(list.head, list.head.next);// findindand deleting 62
System.out.println(" List after deleting 95. ");
list.print(list.head);
DoublyLinkedListStrings listS = new DoublyLinkedListStrings();
System.out.println(" ");
System.out.println("Processing Cars now. ");
va.setCars(" Ford ", 4); //setting the value of carsto Ford with 4 doors
listS.InsertRear(va.toStringCars()); //Getting thestring value of cars
va.setCars(" Ford ", 2); //setting the value of carsto Ford with 2 doors
listS.insertFront(va.toStringCars()); //Getting thestring value of cars
va.setCars(" GMC ", 2);
listS.InsertRear(va.toStringCars());
va.setCars(" RAM ", 2);
listS.InsertRear(va.toStringCars());
va.setCars(" Chevy ", 3);
listS.insertFront(va.toStringCars());
System.out.println("The number of items in this listof cars are " + listS.getSize(listS.head));
listS.print(listS.head);
System.out.println("The number of items in this listare " + listS.getSize(listS.head));
listS.print(listS.head);
System.out.println(" ");
listS.delete_Node(listS.head, listS.head.next);
System.out.println(" List after deleting Ford ");
listS.print(listS.head);
//Processing the planes data set now.
System.out.println(" ");
System.out.println(" Processing Planes now. ");
va.setPlanes(3 , 6, " Boeing, "); //inserting datainto front of list
listS.insertFront(va.toStringPlanes());
va.setPlanes(2 , 1, " Piper, "); //inserting data intofront of list
listS.insertFront(va.toStringPlanes());
va.setPlanes(4 , 4, " Cessna, ");
listS.insertFront(va.toStringPlanes());
listS.print(listS.head); //Displaying processed datafrom the front to the rear
 }
}