/*
 * Created by JFormDesigner on Sun Dec 08 15:05:23 CET 2019
 */

package graphicInterface;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;

/**
 * @author Dvd Nss
 */
public class ErrorWindow {
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JDialog errorWindow;
    private JTextField errorTxt;

    public ErrorWindow(Window owner, String msg) {
        super();
        initComponents();
        this.errorTxt.setText(msg);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        errorWindow = new JDialog();
        errorTxt = new JTextField();

        //======== errorWindow ========
        {
            errorWindow.setTitle("Error");
            errorWindow.setMinimumSize(new Dimension(275, 100));
            errorWindow.setVisible(true);
            var errorWindowContentPane = errorWindow.getContentPane();
            errorWindowContentPane.setLayout(new MigLayout(
                    "hidemode 3,align left center",
                    // columns
                    "[fill]",
                    // rows
                    "[]"));

            //---- errorTxt ----
            errorTxt.setMinimumSize(new Dimension(300, 50));
            errorTxt.setFocusable(false);
            errorTxt.setEditable(false);
            errorTxt.setSelectionColor(Color.white);
            errorTxt.setBorder(null);
            errorWindowContentPane.add(errorTxt, "cell 0 0");
            errorWindow.pack();
            errorWindow.setLocationRelativeTo(errorWindow.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
