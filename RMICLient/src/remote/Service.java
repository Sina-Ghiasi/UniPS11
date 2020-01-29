package remote;

import java.rmi.Remote;
import java.util.List;

public interface Service extends Remote {
    void changePass(Person person) throws Exception;
    boolean checkUserPass(Person person) throws Exception;
    void signUp(Person person) throws Exception;
}
