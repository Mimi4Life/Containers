/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/********************************
Name: Miriam Ekiye
MethodsPurposes: For processing the c option data which will be stored
in the linked list
*******************************/
public class DoublyLinkedList extends DoublyLinkedListStrings{
 Node head; // Variable for head node
 class Node {
 int data;
 Node prev;
 Node next;
 // Constructor
 Node(int d) { data = d; }
 }
 
 public void insertFront(int value)
 {
//create a node odject and place the value in the node
 Node nNode = new Node(value);
 nNode.next = head;// The next node will become the head andthe previous will be equal to null
 nNode.prev = null;
 //If the head is not equal to null, the new node will be setto the previous head
 if (head != null)
 head.prev = nNode;
 //And the head will be pointed to by the new node
 head = nNode;
 }
 //Method for inserting a node after a given previous node
 public void InsertAfter(Node prev_Node, int data)
 {
 //If the previous node is null
 if (prev_Node == null) {
 System.out.println(" The previous node is null. ");
 return;
 }
 //allocate a node from memory, and place the data in the node
 Node nNode = new Node(data);
 //the next node will then become the next previous node
 nNode.next = prev_Node.next;
 // The value of the new node will be given to the previousnext node
 prev_Node.next = nNode;
 // The previous node becomes the previous node of the new node
 nNode.prev = prev_Node;
 //If the new next node is equal to null, then the valude ofthe new node will be given to nNode.next.prev
 if (nNode.next != null)
 nNode.next.prev = nNode;
 }
 void InsertRear(int data) //Method to add a node at the end (left)of a list
 {
 //Allocate space for a new node and place the value in thenode
 Node nNode = new Node(data);
//Set the last node as null
 nNode.next = null;
 //The new node will become the head is the list is empty
 if (head == null) {
 nNode.prev = null;
 head = nNode;
 return;
 }
 Node lastNode = head; // for the last Node
 while (lastNode.next != null) //Traverse till the last node
 lastNode = lastNode.next;
 //The value of the new node will be given to the last node
 lastNode.next = nNode;
 //The value of the last node will be given to the new previousnode
 nNode.prev = lastNode;
 }
void delete_Node(Node head_pointer, Node nDelete)
{
 // If there are no items in the list
 if (head == null || nDelete == null) {
 return;
 }
 // If the head node is the one to be deleted
 if (head == nDelete) {
 head = nDelete.next;
 }
 //If the node to be deleted is not the last node
 if (nDelete.next != null) {
 nDelete.next.prev = nDelete.prev;
 }
 // If the node to be deleted is not the first nodechange the previous
 if (nDelete.prev != null) {
 nDelete.prev.next = nDelete.next;
 }
 return;
 }
 // This method prints the content of the linked list begining atthe given node
 public void printList(Node startNode)
 {
 Node last = null;
 System.out.println(" List will be printed from front to rear");
 while (startNode != null)
 {
 System.out.print(startNode.data + " ");
 last = startNode;
 startNode = startNode.next;
 }
 System.out.println(" ");
 System.out.println(" List will be printed from rear to front");
 while (last != null) {
 System.out.print(last.data + " ");
 last = last.prev;
 }
 }
 public void print(Node start)
 {
 Node last = null;
 while (start != null)
 {
 System.out.print(start.data + " ");
 last = start;
 start = start.next;
 }
 System.out.println(" ");
}
}