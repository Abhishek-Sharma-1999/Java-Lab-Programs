// TreeSetComparableTest.java
import java.util.TreeSet;
public class TreeSetComparableTest {
 public static void main(String[] args) {
 AddressBookEntry addr1 = new AddressBookEntry("Abhishek");
 AddressBookEntry addr2 = new AddressBookEntry("Jack");
 TreeSet<AddressBookEntry> set = new TreeSet<>();
 set.add(addr1);
 set.add(addr2);
 System.out.println(set);
 System.out.println(set.floor(addr2));
 System.out.println(set.lower(addr2));
 System.out.println(set.headSet(addr2)); 
 System.out.println(set.tailSet(addr2));
 }
} 