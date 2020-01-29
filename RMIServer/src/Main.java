import remote.PersonServiceImplementor;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.ServerNotActiveException;

public class Main {

    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            PersonServiceImplementor service = new PersonServiceImplementor ();
            Naming.rebind("MyService",service);
            System.out.println ("Server is wait for request...");
        } catch (RemoteException e) {
            e.printStackTrace ();
        } catch (ServerNotActiveException e) {
            e.printStackTrace ();
        } catch (MalformedURLException e) {
            e.printStackTrace ();
        } catch (Exception e) {
            e.printStackTrace ();
        }


    }
}
