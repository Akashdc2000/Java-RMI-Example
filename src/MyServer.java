import java.rmi.Naming;

public class MyServer {
    public static void main(String[] args) {
        System.out.println("Server Listening At 7000");

        try{
            MyInterface stub=new MyInterfaceImplementation();
            Naming.rebind("rmi://localhost:7000/demo",stub);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}