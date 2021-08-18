package Concrete;

import java.util.ArrayList;

import Interfaces.Observer;
import Interfaces.Subject;

public class Person implements Subject {

        //section of data to be observed to listeners
        
        private String name;
        private String address;
        private int age;

        //section of one to many implementation 

        private ArrayList<Observer>listeners;
        
        ///in case of watching out the listeners
        public ArrayList<Observer> getListeners(){
            return this.listeners;
        }

        public Person(){
            this.name = "object";
            this.age = 0;
            this.address = "living in the computer memory so pleas set me up !!";
            this.listeners = new ArrayList<Observer>();
        }

        //section of setters and getters

        public void setName(String name ){
            this.name = name;
            notifyListeners();
        }

        public void setAddress(String address){
            this.address = address;
            notifyListeners();
        }

        public void setAge(int age){
            this.age = age;
            notifyListeners();
        }

        //section of getters

        public String getName(){
            return this.name;
        }

        public String getAddress(){
            return this.address;
        }

        public int getAge(){
            return this.age;
        }

        public void  setPersonData(String name , String address , int age){
            this.name = name; this.age = age; this.address = address;
        }

        @Override
        public void registerListener(Observer o) {
            if(o != null){
                this.listeners.add(o);
            }else{
                System.out.println("pleas pass a working object");
            }
            
        }

        @Override
        public void removeListener(Observer o) {
            if(o != null) {
                int oIndex = this.listeners.indexOf(o);
                if(oIndex > -1){
                    //it found it
                    this.listeners.remove(o);
                }
            }else{
                System.out.println("pleas pass a working object");
            }
            
        }

        @Override
        public void notifyListeners() {

            for(Observer o : this.listeners){
                o.update(this);
            }
            
        }

       
}
