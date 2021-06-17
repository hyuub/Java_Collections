package test_kolekcje;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;


public class Magazyn extends Komputer
{
    LinkedList<Komputer> komputery = new LinkedList<>();
    Iterator<Komputer> iter = komputery.iterator();

    public Magazyn() 
    {
        super();
        Collections.sort(komputery);
    }

    public Magazyn(int id, String name, double price) 
    {
        super(id, name, price);
    }
    
    
    public void add(int id, String name, double price)
    {
        komputery.add(new Komputer(id, name, price));
    }
    
    public void remove(int id)
    {
        komputery.remove(id);
    }
    
    public void Show()
    {
        iter = komputery.iterator();
        
        while(iter.hasNext())
        {
            iter.next().Show();
        }
    }

    public void changeSort(){
        Collections.sort(komputery, new Comparator()
         {
            @Override
            public int compare(Object o1, Object o2) 
            {
                double diff = ((Komputer)o1).getPrice() - ((Komputer)o2).getPrice();
                
                if(diff>0)
                {
                    return 1;
                }
                if(diff<0)
                {
                    return -1;
                }
                return 0;
                
            }                  
         });
    }
    
    
    
}
