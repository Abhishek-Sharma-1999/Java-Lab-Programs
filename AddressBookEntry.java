// AddressBookEntry.java
public class AddressBookEntry implements Comparable<AddressBookEntry>
 {
 private String name, address, phone;
 public AddressBookEntry(String name) 
 {
 this.name = name;
 }
 @Override
 public String toString() {
 return name;
 }
 @Override
 public int compareTo(AddressBookEntry other) {
 return this.name.compareToIgnoreCase(other.name);
 }
 @Override
 public boolean equals(Object o) {
 return o != null && o instanceof AddressBookEntry &&
this.name.equalsIgnoreCase(((AddressBookEntry)o).name);
 }
 public int hashCode() {
 return name.toLowerCase().hashCode();
 }
}