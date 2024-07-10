

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

 public class CompanyPersonelTableForm extends AbstractTableModel {

    private List<Personel> personelList = new ArrayList();
    private String[] columnNames = { "Firma İsmi", "Araç Kullanan Sefer Başı Ücreti","Asistan Ücreti","Araç Tipi"};
    private Set<Integer> selected;
    public CompanyPersonelTableForm(List<Personel> personelList ){
         this.personelList=personelList;
    }

    @Override
    public String getColumnName(int columnIndex){
         return columnNames[columnIndex];
    }

    @Override     
    public int getRowCount() {
        return personelList.size();
    }

    @Override        
    public int getColumnCount() {
        return 4; 
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Personel personel = personelList.get(rowIndex);
        switch (columnIndex) {
            case 0: 
                return personel.getCompanyName();
            case 1:
                return personel.getSoforSalary();
            case 2:
                return personel.getAsistanceSalary();
            case 3:
                return personel.getVehicleType();
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
               return String.class;
             case 3:
               return String.class;
             }
             return null;
      }
   
           @Override
        public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
            if (columnIndex != 4) {
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