import java.rmi.Naming;

public class MyClient {

    public static void main(String[] args) {
        System.out.println("Client Running");

        try{
            MyInterface stub=(MyInterface) Naming.lookup("rmi://localhost:7000/demo");
            System.out.println(stub.add(34,4));
        }catch(Exception e){}
    }
}

