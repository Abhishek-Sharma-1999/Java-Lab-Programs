import java.rmi.*;
public interface HP4stu extends java.rmi.Remote{
 public void admitNewStudent() throws RemoteException;
 public void searchStudent(int roll) throws
RemoteException;
} 
