package test_kolekcje;


public class Computer implements Comparable<Computer>
{

    String name;
    double price;

    public Computer() {
    }

    public Computer(String nazwa, double wartosc) {
        this.name = nazwa;
        this.price = wartosc;
    }
    
    public void show()
    {
        System.out.println("Name: " + name + "    Price: " + price);
    }

    public String getName()
    {
        return name;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    @Override
    public int compareTo(Computer o) {
        
    if(this.getName().toLowerCase().charAt(0) < o.getName().toLowerCase().charAt(0))
    {
        return -1;
    }
    else if(this.getName().toLowerCase().charAt(0) > o.getName().toLowerCase().charAt(0))
    {
        return 1;
    }
    else
     {
         return 0;
    }
    }
            
    
    
    
}
