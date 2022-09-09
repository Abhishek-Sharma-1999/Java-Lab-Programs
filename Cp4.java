class Electronics { 
    static class Television{ 
    static Television obj; 
    int price; 
    Television(int p){ 
    price = p; 
    } 
    Television(Television o){ 
    obj=o; 
    } 
    public void cost(){ 
    System.out.print(" Cost of TV: "+obj.price); 
    } 
    public static void cost2(){ 
    System.out.print(" Cost of Static TV: "+obj.price); 
    } 
    } 
   } 
   public class Cp4{ 
    public static void main(String[] args){ 
    Electronics.Television e = new Electronics.Television(777); 
    Electronics.Television e2 = new Electronics.Television(e); 
    Electronics.Television.cost2(); 
}} 