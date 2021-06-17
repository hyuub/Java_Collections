package test_kolekcje;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;


public class Magazyn extends Komputer
{
    LinkedList<Komputer> komputery = new LinkedList<>();

    public Magazyn() 
    {
        super();
    }

    public Magazyn(int id, String nazwa, double wartosc) 
    {
        super(id, nazwa, wartosc);
    }
    
    
    public void add(int id, String nazwa, double wartosc)
    {
        komputery.add(new Komputer(id, nazwa, wartosc));
    }
    
    public void remove(int id)
    {
     komputery.remove(id);
    }
    
    public void Show()
    {
        Collections.sort(komputery);
        Iterator<Komputer> iter = komputery.iterator();
        while(iter.hasNext())
        {
            iter.next().Show();
        }
    }

    
    
    
    
}
