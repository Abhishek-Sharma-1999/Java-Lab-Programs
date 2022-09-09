import  java.util.*;
class  EP1Person  implements  Comparable<EP1Person>
{ 
String  name;
int  age;
EP1Person  (String  name,  int  age)
{ this.name  =  name;
this.age  =  age;
}
@Override
public  int  compareTo(EP1Person  o)  
{ 
    return  this.name.compareTo(o.name);
}
@Override
public  String  toString()  
{
   return  "Person{"  +  "name='"  +  name  +  '\''  +  ",  age="  + age + '}';
}
}
public  class  EP1try  
{
    
public  static  void  main(String[]  args)
{ 
    TreeSet<EP1Person>  peeps  =  new  TreeSet<>(); 
    Scanner  sc  =  new  Scanner(System.in); 
    System.out.print("\n No.  of  Entries:  "); 
    int  n  =  sc.nextInt();
    System.out.println(" Name ,   Age:  "); 
    for  (int  i  =  0;  i  <  n;  i++)  {
    String  name  =  sc.next(); 
    int  age  =  sc.nextInt();
    EP1Person  p1  =  new  EP1Person(name,  age); 
    peeps.add(p1);
}
for  (EP1Person  i  :  peeps)  
{ 
    System.out.println(i);
}
}
}
