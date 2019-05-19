import javax.swing.*;
import java.awt.*;

public class LabelTest extends JFrame {
    private JLabel label1, label2, label3;

    // set up GUI
    public LabelTest() {
        super("Testing JLabel");

        // Get Content Pane and set its layout
        Container container = getContentPane();
        container.setLayout( new FlowLayout() );

        // JLabel constructor with a string argument
        label1 = new JLabel( "Label with Text." );
        label1.setToolTipText( "This is label1" );
        container.add(label1);

        // JLabel constructor with string, icon, and alignment arguments
        Icon bug = new ImageIcon( "src/img1.png" );
        label2 = new JLabel("Label with text and icon", bug, SwingConstants.LEFT);
        label2.setToolTipText("This is label2");
        container.add(label2);

        // JLabel constructor, no args
        label3 = new JLabel();
        label3.setText("Label with icon and text at bottom");
        label3.setIcon(bug);
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        label3.setToolTipText("This is label3");
        container.add(label3);

        setSize(350, 400);
        setVisible(true);
    }

    public static void main(String args[]) {
        LabelTest app = new LabelTest();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
