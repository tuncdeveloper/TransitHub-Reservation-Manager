

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.swing.table.AbstractTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */

 public class CompanyVehicleTableForm extends AbstractTableModel {

    private List<Vehicle> vehicleList = new ArrayList();
    private String[] columnNames = { "Firma", "Otobüs no","Koltuk Sayısı","Sefer No","Yakıt Türü","Kilometre Ücreti(tl)"};
    private Set<Integer> selected;
    public CompanyVehicleTableForm(List<Vehicle> vehicleList ){
         this.vehicleList=vehicleList;
    }

    @Override
    public String getColumnName(int columnIndex){
         return columnNames[columnIndex];
    }

    @Override     
    public int getRowCount() {
        return vehicleList.size();
    }

    @Override        
    public int getColumnCount() {
        return 6; 
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Vehicle vehicle = vehicleList.get(rowIndex);
        switch (columnIndex) {
            case 0: 
                return vehicle.getCompanyName();
            case 1:
                return vehicle.getVehicleNo();
            case 2:
                return vehicle.getCountOfSeat();
            case 3:
                return vehicle.getVoyageNumber();
            case 4:
                return vehicle.getFuelType();
           case 5:
                return vehicle.getKmUcreti();
        }
           return null;
   }

   @Override
   public Class<?> getColumnClass(int columnIndex){
          switch (columnIndex){
             case 0:
               return String.class;
             case 1:
               return String.class;
             case 2:
               return Integer.class;
             case 3:
               return Integer.class;
             case 4:
               return String.class;
             case 5:
               return Integer.class;
          }
             return null;
      }
   
           @Override
        public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
            if (columnIndex != 6) {
                return;
            }
            if (!(aValue instanceof Boolean)) {
                return;
            }
            boolean isSelected = (Boolean) aValue;
            if (isSelected) {
                selected.add(rowIndex);
            } else {
                selected.remove(rowIndex);
            }

            fireTableCellUpdated(rowIndex, columnIndex);
        }
 }