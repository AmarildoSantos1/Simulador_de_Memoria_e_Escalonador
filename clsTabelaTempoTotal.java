import java.awt.Color;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.event.*;
import java.awt.event.*;
public class clsTabelaTempoTotal 
{
	 JTable tblTabela;
    int valor;
	public clsTabelaTempoTotal(int pLargura, int pAltura) 
    {
    	tblTabela = new JTable();
		valor = 0;
		atribuirModelo();
		atribuirRenderer();
		tblTabela.setPreferredScrollableViewportSize(new Dimension(pLargura, pAltura));
		tblTabela.setTableHeader(null);	
    }
	public JTable getTable()
	{
		return tblTabela;
	}
	public void atualizarTabela()
	{
		tblTabela.updateUI();
	}
	public void incrementarValor()
	{
		valor++;
		atualizarTabela();
	}
	private void atribuirRenderer()
    {
		tblTabela.setDefaultRenderer(Object.class, 
										new DefaultTableCellRenderer()
										{
											public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int col) 
									        {  
									            super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);   
									            setHorizontalAlignment(CENTER);
									            return this; 
									        }	
										}	
									 );
    }
	private void atribuirModelo()
    {
    	tblTabela.setModel(
							new AbstractTableModel()
							{
								public int getColumnCount()
								{
									return 1;
								}
								public int getRowCount()
								{
									return 1;
								}
								public Object getValueAt(int row, int col)
								{
									return new Integer(valor);
								}
							}
						   );
    }
}