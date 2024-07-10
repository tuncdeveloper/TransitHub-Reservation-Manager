
import java.math.BigDecimal;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class Company extends User{

    private String hizmetBedeli;

    public String getHizmetBedeli() {
        return hizmetBedeli;
    }

    public void setHizmetBedeli(String hizmetBedeli) {
        this.hizmetBedeli = hizmetBedeli;
    }
    
    
    
    public Company(String username, String password,String hizmetBedeli) {
        super(username, password);
        this.hizmetBedeli=hizmetBedeli;
    }

    @Override
    public Boolean login(String username, String password) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
