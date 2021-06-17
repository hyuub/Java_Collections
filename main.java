package test_kolekcje;

import java.util.Iterator;


public class main {

    public static void main(String[] args) {
       
        Shop shop = new Shop();
        
        Computer Msi = new Computer("Msi", 5000);
        Computer Dell = new Computer("Dell", 3500);
        Computer Acer = new Computer("Acer", 3999);
        
        Computer Okap = new Computer("Okap", 3999);
        
        shop.add(Msi);
        shop.add(Acer);
        shop.add(Dell);
        
        System.out.println("--- Sorted by name ---");
        shop.sortByName();
        
        System.out.println("--- Sorted by price ---");
        shop.sortByPrice();
        
        shop.remove(Dell);
        
        System.out.println("--- Sorted by name ---");
        shop.sortByName();
        
        System.out.println("--- Sorted by price ---");
        shop.sortByPrice();
      
    }
    
}
