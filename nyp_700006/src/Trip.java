
   import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class Trip {
    
    private Vehicle vehicle;
    private Route route;
    private String Ticketcost; 
    private String DepartureDate;
    private String DepartureTime;

    
    private static List<Route>routeList=new ArrayList<>();
        
    public Trip(Vehicle vehicle, Route route, String Ticketcost, String DepartureDate, String DepartureTime) {
        this.vehicle = vehicle;
        this.route = route;
        this.Ticketcost = Ticketcost;
        this.DepartureDate = DepartureDate;
        this.DepartureTime = DepartureTime;
    }
    
        static{
           
        }



    public static List<Route> getRouteList() {
        return routeList;
    }

    public static void setRouteList(List<Route> routeList) {
        Trip.routeList = routeList;
    }
    
    
    
    
    
    
    
    
    /**
     * @return the vehicle
     */
    public Vehicle getVehicle() {
        return vehicle;
    }

    /**
     * @param vehicle the vehicle to set
     */
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    /**
     * @return the route
     */
    public Route getRoute() {
        return route;
    }

    /**
     * @param route the route to set
     */
    public void setRoute(Route route) {
        this.route = route;
    }

    /**
     * @return the Ticketcost
     */
    public String getTicketcost() {
        return Ticketcost;
    }

    /**
     * @param Ticketcost the Ticketcost to set
     */
    public void setTicketcost(String Ticketcost) {
        this.Ticketcost = Ticketcost;
    }

    /**
     * @return the DepartureDate
     */
    public String getDepartureDate() {
        return DepartureDate;
    }

    /**
     * @param DepartureDate the DepartureDate to set
     */
    public void setDepartureDate(String DepartureDate) {
        this.DepartureDate = DepartureDate;
    }

    /**
     * @return the DepartureTime
     */
    public String getDepartureTime() {
        return DepartureTime;
    }

    /**
     * @param DepartureTime the DepartureTime to set
     */
    public void setDepartureTime(String DepartureTime) {
        this.DepartureTime = DepartureTime;
    }
    
}
