package test_kolekcje;


public class Komputer implements Comparable<Komputer>
{
    
    int id;
    String nazwa;
    double wartosc;

    public Komputer() {
    }

    public Komputer(int id, String nazwa, double wartosc) {
        this.id = id;
        this.nazwa = nazwa;
        this.wartosc = wartosc;
    }
    
    public void Show()
    {
        System.out.println("Id: " + id + "  Nazwa: " + nazwa + "    Wartosc: " + wartosc);
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
