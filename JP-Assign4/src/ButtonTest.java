import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonTest extends JFrame {
    private JButton plainButton, fancyButton;

    // Set up GUI
    public ButtonTest() {
        super("Testing Buttons");

        // get content pane and set its layout
        Container container = getContentPane();
        container.setLayout( new FlowLayout() );

        // create buttons
        plainButton  = new JButton( "Plain JButton" );
        container.add( plainButton );

        Icon img1 = new ImageIcon("src/img1.png" );
        Icon img2 = new ImageIcon("src/img2.png" );
        fancyButton  = new JButton( "Fancy Button", img1 );
        fancyButton.setRolloverIcon( img2 );
        container.add( fancyButton );

        // Create an instance of inner class button-handler
        // to use for Button Event Handling
        ButtonHandler handler = new ButtonHandler();
        fancyButton.addActionListener(handler);
        plainButton.addActionListener(handler);

        setSize( 420, 220 );
        setVisible( true );
    }

    // Execute Application
    public static void main(String args[]) {
        ButtonTest app = new ButtonTest();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Inner Class for Button Event-Handling
    private class ButtonHandler implements ActionListener {

        // handle button event
        public void actionPerformed( ActionEvent event ) {
            JOptionPane.showMessageDialog( null, "You pressed: " + event.getActionCommand() );
        }
    } // end Inner-Class Button-Handler
}
