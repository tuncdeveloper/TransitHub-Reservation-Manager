

public class Personel extends Person {
    
    private String companyName;
    
    private String   soforSalary;
    
    private String asistanceSalary;
    
    private String vehicleType;

    public Personel(String companyName, String soforSalary, String asistanceSalary,String vehicleType) {
        this.companyName = companyName;
        this.soforSalary = soforSalary;
        this.asistanceSalary = asistanceSalary;
        this.vehicleType=vehicleType;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
    
    

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    
    

    public String getSoforSalary() {
        return soforSalary;
    }

    public void setSoforSalary(String soforSalary) {
        this.soforSalary = soforSalary;
    }

    public String getAsistanceSalary() {
        return asistanceSalary;
    }

    public void setAsistanceSalary(String asistanceSalary) {
        this.asistanceSalary = asistanceSalary;
    }
    
    

    /**
     * @return the salary
     */
    
}
