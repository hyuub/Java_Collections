package test_kolekcje;


public class Komputer implements Comparable<Komputer>
{
    
    int id;
    String name;
    double price;

    public Komputer() {
    }

    public Komputer(int id, String nazwa, double wartosc) {
        this.id = id;
        this.name = nazwa;
        this.price = wartosc;
    }
    
    public void Show()
    {
        System.out.println("ID: " + id + "  Name: " + name + "    Price: " + price);
    }

    public double getPrice()
    {
        return price;
    }
    
    @Override
    public int compareTo(Komputer o) {
        
         if(this.id > o.id)
        {
            return 1;
        }
        else if (this.id < o.id)
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
            
    
    
    
}
