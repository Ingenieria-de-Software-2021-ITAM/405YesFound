package proyectos;

/*
 * MiModelo.java
 *
 * Created on 3 de diciembre de 2004, 01:21 AM
 */

/**
 *
 * @author  Administrador
 */
import javax.swing.table.*;
import java.sql.*;
import java.util.*;

public class MiModelo extends AbstractTableModel implements TableModel
{
    Vector<String>         titulos   = null;

    Vector<Vector<String>> renglones = null;
    
    /** Creates a new instance of MiModelo
     * @param rs */
    public MiModelo( ResultSet rs )
    {
      int i,n;
      Vector<String> renglon;
      
      try
      {
        titulos = new Vector<>();
        java.sql.ResultSetMetaData rsmd = rs.getMetaData();  
        n = rsmd.getColumnCount();
        for(i=1;i<=n;i++)
          titulos.add( rsmd.getColumnLabel(i));
        renglones = new Vector<>();
        while(rs.next())
        {
          renglon = new Vector<>();
          for(i=1;i<=n;i++)
            renglon.add( rs.getString(i) );
          renglones.add( renglon );  
        }
      }
      catch( Exception e)
      {
          // eliminar el despliegue y relanzar la exepción...
          e.printStackTrace();
      } 
    }
    
    @Override
    public String getColumnName(int i)
    {
        return (String) titulos.elementAt(i);
    }
    
    
    @Override
    public int getColumnCount()
    {
        return titulos.size();
    }
    
    @Override
    public int getRowCount()
    {
        return renglones.size();
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex)
    {
        Vector<String> renglon = (Vector<String>) renglones.elementAt(rowIndex);
        return renglon.elementAt(columnIndex);
    }
    
    @Override
    public boolean isCellEditable(int row, int col)
    { 
      return true;
    }
    
    @Override
    public void setValueAt(Object value, int row, int col) 
    { 
      renglones.elementAt(row).setElementAt((String)value, col);
      fireTableCellUpdated(row, col);
    }

    
}
