package Concrete;

import Interfaces.Observer;

import Interfaces.Displayable;

public class PersonDataListener implements Observer, Displayable {

    private Person person;

    private Person initial; // this is an initial one

    public PersonDataListener(Person subject) {
        this.person = subject;
        initial = new Person();
        person.registerListener(this);
    }

    @Override
    public void update(Person p) {
        if (!p.getName().equalsIgnoreCase(initial.getName())) {
            System.out.println("Person Object changed the name from :" + initial.getName() + " to :" + p.getName());

        }

        if (!p.getAddress().equalsIgnoreCase(initial.getAddress())) {
            System.out.println(
                    "Person Object changed the address from :" + initial.getAddress() + " to :" + p.getAddress());

        }

        if (p.getAge() != initial.getAge()) {
            System.out.println("Person Object changed the age from :" + initial.getAge() + " to :" + p.getAge());

        }
        initial.setName(p.getName());
        initial.setAddress(p.getAddress());
        initial.setAge(p.getAge());

    }

    @Override
    public void display() {
        System.out.println("I'm : " + person.getName() + " i'm : " + person.getAge() + " years old"
                + " and i'm living at :" + person.getAddress());
    }

}
