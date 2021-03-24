package Project02;
import java.awt.Frame;
import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
	//Jacob Vaught
	//Due-9-9-2020
	//Date-9-9-2020
	//A Simple Program to calculate BMI.

	//SETUP

	 
	// An AWT program inherits from the top-level container java.awt.Frame
	public class calcBMIGUI extends Frame implements ActionListener {
		private static final long serialVersionUID = 1L;
	private Label lblCount;    // Declare a Label component 
	   private TextField tfCount; // Declare a TextField component 
	   private Button btnCount;   // Declare a Button component
	   private int count = nextLine;     // Counter's value
	 
	   // Constructor to setup GUI components and event handlers
	   public calcBMIGUI() {
	      setLayout(new FlowLayout());
	         // "super" Frame, which is a Container, sets its layout to FlowLayout to arrange
	         // the components from left-to-right, and flow to next row from top-to-bottom.
	 
	      lblCount = new Label("Counter");  // construct the Label component
	      add(lblCount);                    // "super" Frame container adds Label component
	 
	      tfCount = new TextField(count + "", 10); // construct the TextField component with initial text
	      tfCount.setEditable(true);       // set to read-only
	      add(tfCount);                     // "super" Frame container adds TextField component
	 
	      btnCount = new Button("Count");   // construct the Button component
	      add(btnCount);                    // "super" Frame container adds Button component
	 
	      btnCount.addActionListener(this);
	         // "btnCount" is the source object that fires an ActionEvent when clicked.
	         // The source add "this" instance as an ActionEvent listener, which provides
	         //   an ActionEvent handler called actionPerformed().
	         // Clicking "btnCount" invokes actionPerformed().
	 
	      setTitle("AWT Counter");  // "super" Frame sets its title
	      setSize(250, 100);        // "super" Frame sets its initial window size
	 
	      // For inspecting the Container/Components objects
	      // System.out.println(this);
	      // System.out.println(lblCount);
	      // System.out.println(tfCount);
	      // System.out.println(btnCount);
	 
	      setVisible(true);         // "super" Frame shows
	 
	      // System.out.println(this);
	      // System.out.println(lblCount);
	      // System.out.println(tfCount);
	      // System.out.println(btnCount);
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   }
	 
	   // The entry main() method
	   public static void main(String[] args) {
	      // Invoke the constructor to setup the GUI, by allocating an instance
	      calcBMIGUI app = new calcBMIGUI();
	         // or simply "new AWTCounter();" for an anonymous instance
	   }
	 
	   // ActionEvent handler - Called back upon button-click.
	   @Override
	   public void actionPerformed(ActionEvent evt) {
	      ++count; // Increase the counter value
	      // Display the counter value on the TextField tfCount
	      tfCount.setText(count + ""); // Convert int to String
	   }}
