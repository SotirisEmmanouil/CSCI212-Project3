import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Arrays;
import java.util.StringTokenizer;
import javax.swing.*;

public class DateGUI extends JFrame{ 
	
	  private static final long serialVersionUID = 6;
	  public static TextArea unsortedDates;
	  public static TextArea sortedDates; 

	public DateGUI() {
	      unsortedDates = new TextArea("Unsorted\n\n");
	      sortedDates = new TextArea("Sorted\n\n");
	       add(unsortedDates,BorderLayout.WEST);
	       add(sortedDates, BorderLayout.EAST);
	       setSize(500,400);
	       setLocation(100, 100);
	       setTitle("Dates");
	       setLayout(new GridLayout(1,2));
	       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	       unsortedDates.setEditable(false);
	       sortedDates.setEditable(false);
	       createFileMenu();
	       setVisible(true);
	}
	
  public void createFileMenu() {
				   JMenuItem   DateItem;
				   JMenuBar    menuBar  = new JMenuBar();
				   JMenu       fileMenu = new JMenu("File");
				   FileMenuHandler fmh  = new FileMenuHandler(this);

				   DateItem = new JMenuItem("Open");    
				   DateItem.addActionListener( fmh );
				   fileMenu.add(DateItem);
				   fileMenu.addSeparator();           
				   DateItem = new JMenuItem("Quit");       
				   DateItem.addActionListener( fmh );
				   fileMenu.add( DateItem );
				   setJMenuBar(menuBar);
				   menuBar.add(fileMenu);
				 
				}
}
