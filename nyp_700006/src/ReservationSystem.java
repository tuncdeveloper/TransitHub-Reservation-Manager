
import java.util.ArrayList;
import java.util.List;


public class ReservationSystem {
    
    
    private static List<Company> companyList=new ArrayList<>();
    
    private static List<Vehicle>vehicleList=new ArrayList<>();
    
    private static List<Personel> personelList=new ArrayList<>();
    
    private static List<Route>routeList=new ArrayList<>();
    
    private static List<Trip>tripList=new ArrayList<>();

    
    static {
            companyList.add(new Company("A","12","1250"));
            companyList.add(new Company("B","23","2540"));
            companyList.add(new Company("C","34","2541"));
            companyList.add(new Company("D","45","25410"));
            companyList.add(new Company("F","56","8745"));
            
            vehicleList.add(new Train("D","Tren 1",40,"1.Sefer","Elektrik",3));
            vehicleList.add(new Train("D","Tren 2",60,"2.Sefer","Elektrik",3));
            vehicleList.add(new Train("D","Tren 3",60,"2.Sefer","Elektrik",3)); 
            vehicleList.add(new Bus("A","Otobus 1",40,"3.Sefer","Benzin",10));
            vehicleList.add(new Bus("A","Otobus 2",30,"3.Sefer","Benzin",10));  
            vehicleList.add(new Bus("B","Otobus 1",30,"3.Sefer","Motorin",5));
            vehicleList.add(new Bus("B","Otobus 2",40,"4.Sefer","Motorin",5));
            vehicleList.add(new Bus("C","Otobus 1",40,"4.Sefer","Motorin",6));
            vehicleList.add(new Airplane("C","Uçak 1",60,"5.Sefer","Gaz",25));
            vehicleList.add(new Airplane("C","Uçak 2",60,"5.Sefer","Gaz",25));    
            vehicleList.add(new Airplane("F","Uçak 1",60,"6.Sefer","Gaz",20));
            vehicleList.add(new Airplane("F","Uçak 2",60,"6.Sefer","Gaz",20));
            
            personelList.add(new Personel("A", "5000", "2000","Otobüs"));
            personelList.add(new Personel("B", "3000", "1500","Otobüs"));
            personelList.add(new Personel("C", "4000", "2000","Otobüs"));
            personelList.add(new Personel("D", "2000", "1000","Tren"));
            personelList.add(new Personel("F", "7500", "4000","Uçak"));
            personelList.add(new Personel("C", "10000", "6000","Uçak"));
            
            routeList.add(new Route("İstanbul","Kocaeli","Karayolu",100));
            routeList.add(new Route("İstanbul","Ankara","Karayolu",500));
            routeList.add(new Route("İstanbul","Eskişehir","Karayolu",300));
            routeList.add(new Route("İstanbul","Konya","Karayolu",600));
            routeList.add(new Route("Kocaeli","İstanbul","Karayolu",100));
            routeList.add(new Route("Kocaeli","Ankara","Karayolu",400));
            routeList.add(new Route("Kocaeli","Eskişehir","Karayolu",200));
            routeList.add(new Route("Kocaeli","Konya","Karayolu",500));
            routeList.add(new Route("Ankara","İstanbul","Karayolu",500));
            routeList.add(new Route("Ankara","Kocaeli","Karayolu",400));
            routeList.add(new Route("Eskişehir","İstanbul","Karayolu",300));
            routeList.add(new Route("Eskişehir","Kocaeli","Karayolu",200));
            routeList.add(new Route("Eskişehir","Konya","Karayolu",300));
            routeList.add(new Route("Konya","İstanbul","Karayolu",600));
            routeList.add(new Route("Konya","Kocaeli","Karayolu",500));
            routeList.add(new Route("Konya","Eskişehir","Karayolu",300));
            
            routeList.add(new Route("İstanbul","Kocaeli","Demiryolu",75));
            routeList.add(new Route("İstanbul","Bilecik","Demiryolu",225));
            routeList.add(new Route("İstanbul","Ankara","Demiryolu",375));
            routeList.add(new Route("İstanbul","Eskişehir","Demiryolu",300));
            routeList.add(new Route("İstanbul","Konya","Demiryolu",450));
            routeList.add(new Route("Kocaeli","İstanbul","Demiryolu",75));
            routeList.add(new Route("Kocaeli","Bilecik","Demiryolu",75));
            routeList.add(new Route("Kocaeli","Ankara","Demiryolu",300));
            routeList.add(new Route("Kocaeli","Eskişehir","Demiryolu",150));
            routeList.add(new Route("Kocaeli","Konya","Demiryolu",350));
            routeList.add(new Route("Ankara","İstanbul","Demiryolu",375));
            routeList.add(new Route("Ankara","Kocaeli","Demiryolu",300));
            routeList.add(new Route("Ankara","Bilecik","Demiryolu",225));
            routeList.add(new Route("Ankara","Eskişehir","Demiryolu",150));
            routeList.add(new Route("Eskişehir","İstanbul","Demiryolu",300));
            routeList.add(new Route("Eskişehir","Kocaeli","Demiryolu",150));
            routeList.add(new Route("Eskişehir","Bilecik","Demiryolu",75));
            routeList.add(new Route("Eskişehir","Ankara","Demiryolu",150));
            routeList.add(new Route("Eskişehir","Konya","Demiryolu",225));
            routeList.add(new Route("Konya","İstanbul","Demiryolu",450));
            routeList.add(new Route("Konya","Kocaeli","Demiryolu",350));
            routeList.add(new Route("Konya","Bilecik","Demiryolu",300));
            routeList.add(new Route("Konya","Eskişehir","Demiryolu",225));
            
            
            routeList.add(new Route("İstanbul","Ankara","Havayolu",250));
            routeList.add(new Route("İstanbul","Konya","Havayolu",300));
            routeList.add(new Route("Ankara","İstanbul","Havayolu",250));
            routeList.add(new Route("Konya","İstanbul","Havayolu",300));
            
            tripList.add(new Trip(vehicleList.get(0),routeList.get(18),"1200","06/12/2023","10.00"));
            tripList.add(new Trip(vehicleList.get(2),routeList.get(20),"1200","07/12/2023","11.00"));
            tripList.add(new Trip(vehicleList.get(3),routeList.get(3),"1200","08/12/2023","12.00"));
            tripList.add(new Trip(vehicleList.get(6),routeList.get(13),"1200","09/12/2023","13.00"));
            tripList.add(new Trip(vehicleList.get(9),routeList.get(40),"1200","10/12/2023","14.00"));
            tripList.add(new Trip(vehicleList.get(10),routeList.get(39),"1200","11/12/2023","15.00"));
           



            
            }
    
    public ReservationSystem(){
   
    }
    
   
    public static void main(String[] args){        
       
        
    }

    public  List<Route> getRouteList() {
        return routeList;
    }

    public  void setRouteList(List<Route> routeList) {
        ReservationSystem.routeList = routeList;
    }

    public List<Personel> getPersonelList() {
        return personelList;
    }

    public void setPersonelList(List<Personel> personelList) {
        this.personelList=personelList;
    }

    public List<Company> getCompanyList() {
        return companyList;
    }

    public void setCompanyList(List<Company> companyList) {
        this.companyList = companyList;
    }

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }


    
    
}
