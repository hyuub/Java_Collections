package test_kolekcje;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;


public class Shop
{
    //FOR LINKEDLIST
    
    LinkedList<Computer> computers;
    LinkedList<Computer> comps;
    
    //FOR TREESET
    
//    TreeSet<Computer> computers;
//    TreeSet<Computer> comps;
    
    Iterator<Computer> iter;

    public Shop() 
    {
        //FOR TREESET
        
//        computers = new TreeSet<Computer>();
//        iter = computers.iterator();
//        
//        
//        comps = new TreeSet<Computer>(new Comparator<Computer>()
//        {
//            public int compare(Computer o1, Computer o2) 
//            {
//             double diff = ((Computer)o1).getPrice() - ((Computer)o2).getPrice();
//             
//                if(diff>0)
//                {
//                    return -1;
//                }
//                else if(diff<0)
//                {
//                    return 1;
//                }
//                else
//                {
//                    return 0;
//                }
//            }   
//        });

        //FOR LINKEDLIST
        
        computers = new LinkedList<>();
        comps = new LinkedList<>(computers);
        iter = computers.iterator();
        
        Collections.sort(comps, new Comparator()
         {
            @Override
            public int compare(Object o1, Object o2) 
            {
                double diff = ((Computer)o1).getPrice() - ((Computer)o2).getPrice();
                
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
    
    
    public void add(Computer computer)
    {
        computers.add(computer);
        comps.add(computer);
    }
    
    public void remove(Computer computer)
    {
       computers.remove(computer);
       comps.remove(computer);
    }
    

    public void sortByPrice()
    { 
        
        //comps.addAll(computers);      // <--- FOR TREESET
        iter = comps.iterator();
        
        while(iter.hasNext())
        {
            iter.next().show();
        }
    
    }
    
    public void sortByName()
    {
       Collections.sort(computers);     // <--- FOR LINKEDLIST
        iter = computers.iterator();
        
        while(iter.hasNext())
        {
            iter.next().show();
        }
        
    }
    
    
    
}
