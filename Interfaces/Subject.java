package Interfaces;



public interface Subject {

    void registerListener(Observer o);   

    void removeListener(Observer o); 

    void notifyListeners();  
   
    
}
