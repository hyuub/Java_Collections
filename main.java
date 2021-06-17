package test_kolekcje;

import java.util.Iterator;


public class main {

    public static void main(String[] args) {
       
        Magazyn magazyn = new Magazyn();
        
        magazyn.add(3, "Xing", 2000);
        magazyn.add(1, "Asus", 5000);
        magazyn.add(2, "Xing", 2000);
        magazyn.add(0, "Dell", 4999);
        
        magazyn.Show();
        
        magazyn.remove(2);
        
        magazyn.Show();
      
    }
    
}
