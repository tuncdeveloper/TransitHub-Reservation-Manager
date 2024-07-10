

public class Reservation {
    
    private Passenger passenger;
    private Vehicle vehicle;
    private int SeatCode;

    public Reservation(String passenger, String vehicle, int seat) {
        
    }
    
    
  
    public Passenger getPassenger() {
        return passenger;
    }

    
    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    
    public Vehicle getVehicle() {
        return vehicle;
    }

   
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    
    public int getSeatCode() {
        return SeatCode;
    }

    public void setSeatCode(int SeatCode) {
        this.SeatCode = SeatCode;
    }
    
}
