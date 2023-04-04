import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyInterfaceImplementation extends UnicastRemoteObject implements MyInterface{
    protected MyInterfaceImplementation() throws RemoteException {
        super();
    }

    @Override
    public int add(int a, int b) throws RemoteException {
        return (a+b);
    }
}
