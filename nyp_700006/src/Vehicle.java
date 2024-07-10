
public abstract class Vehicle {
    
   private String companyName;
   
   private String vehicleNo;
   
   private Integer countOfSeat;
   
   private String voyageNumber;
   
   private String fuelType;
   
   private Integer kmUcreti;

    public Vehicle(String companyName, String vehicleNo, Integer countOfSeat, String voyageNumber,String fuelType,Integer kmUcreti) {
        this.companyName = companyName;
        this.vehicleNo = vehicleNo;
        this.countOfSeat = countOfSeat;
        this.voyageNumber = voyageNumber;
        this.fuelType=fuelType;
        this.kmUcreti=kmUcreti;
        
    }

    public Integer getKmUcreti() {
        return kmUcreti;
    }

    public void setKmUcreti(Integer kmUcreti) {
        this.kmUcreti = kmUcreti;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
   
   

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public Integer getCountOfSeat() {
        return countOfSeat;
    }

    public void setCountOfSeat(Integer countOfSeat) {
        this.countOfSeat = countOfSeat;
    }

    public String getVoyageNumber() {
        return voyageNumber;
    }

    public void setVoyageNumber(String voyageNumber) {
        this.voyageNumber = voyageNumber;
    }
   
   
    
    
     

    
    
    public abstract void CalculateFuelCost();
    
}
