package Interfaces;



public interface Subject {

    void registerListener(Observer o); // later

    void removeListener(Observer o);//later

    void notifyListeners(); //later
   
    
}
