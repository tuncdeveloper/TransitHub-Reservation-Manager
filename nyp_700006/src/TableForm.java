
import java.math.BigDecimal;
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

 public class TableForm extends AbstractTableModel {

    private List<Company> list = new ArrayList();
    private String[] columnNames = { "Firma İsmi", "Şifresi","Hizmet Bedeli"};
    private Set<Integer> selected;
    public TableForm(List<Company> list ){
         this.list=list;
    }

    @Override
    public String getColumnName(int columnIndex){
         return columnNames[columnIndex];
    }

    @Override     
    public int getRowCount() {
        return list.size();
    }

    @Override        
    public int getColumnCount() {
        return 3; 
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Company si = list.get(rowIndex);
        switch (columnIndex) {
            case 0: 
                return si.getUsername();
            case 1:
                return si.getPassword();
            case 2:
                return si.getHizmetBedeli();
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