
import Concrete.*;

class Main{
    public static void main(String[] args) {
        Person jimmy = new Person();
        PersonDataListener personListener = new PersonDataListener(jimmy);

        jimmy.setName("Timmy");

        jimmy.setAge(29);

        jimmy.setAddress("Tanta City Club Street");

        personListener.display();

        jimmy.setName("Jimmy");

        jimmy.setAge(25);

        jimmy.setAddress("USA Club Street");

        personListener.display();
    }
}