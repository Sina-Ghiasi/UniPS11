package remote;

import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class PersonServiceImplementor extends UnicastRemoteObject implements Service {
    ArrayList<Person> personArrayList = new ArrayList<>();
    public PersonServiceImplementor()throws Exception{}

    @Override
    public void changePass(Person person) throws Exception {
        int i =0;
        for(Person temp : personArrayList){

            System.out.println(temp.getUsername()+" \t "+person.getUsername());
            if(temp.getUsername().equalsIgnoreCase(person.getUsername())){
                Person newPerson = new Person(temp.getUsername(),person.getPassword());
                personArrayList.remove(i);
                personArrayList.add(newPerson);
                System.out.println("Password Changed");
            }
            i++;
        }
    }

    @Override
    public boolean checkUserPass(Person person) throws Exception {
        for(Person temp : personArrayList){
            System.out.println(temp.getUsername()+" \t "+temp.getPassword());;
            if(temp.getUsername().equalsIgnoreCase(person.getUsername())){
                if(temp.getPassword().equalsIgnoreCase(person.getPassword())){
                    return true;
                }
            }
        }
        System.out.println("Failed Login"+"  "+personArrayList.size());

        return false;
    }

    @Override
    public void signUp(Person person) throws Exception {
        personArrayList.add(person);
        System.out.println("Person Added");
    }
}
