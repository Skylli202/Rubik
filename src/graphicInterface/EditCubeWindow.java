/*
 * Created by JFormDesigner on Sun Dec 08 14:15:01 CET 2019
 */

package graphicInterface;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * @author Dvd Nss
 */
public class EditCubeWindow extends JFrame {

    String[] tab = new String[48];
    PrincipalWindow parent;
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JFrame editCubeFrame;
    private JPanel bluePnl;
    private JTextField B1;
    private JTextField B2;
    private JTextField B3;
    private JTextField B4;
    private JTextField blueCenter;
    private JTextField B6;
    private JTextField B7;
    private JTextField B8;
    private JTextField B9;
    private JPanel colorCodingPnl;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField5;
    private JTextField textField3;
    private JTextField textField6;
    private JTextField textField4;
    private JTextField textField55;
    private JPanel orangePnl;
    private JTextField O1;
    private JTextField O2;
    private JTextField O3;
    private JTextField O4;
    private JTextField orangeCenter;
    private JTextField O6;
    private JTextField O7;
    private JTextField O8;
    private JTextField O9;
    private JPanel whitePnl;
    private JTextField W1;
    private JTextField W2;
    private JTextField W3;
    private JTextField W4;
    private JTextField whiteCenter;
    private JTextField W6;
    private JTextField W7;
    private JTextField W8;
    private JTextField W9;
    private JPanel redPnl;
    private JTextField R1;
    private JTextField R2;
    private JTextField R3;
    private JTextField R4;
    private JTextField redCenter;
    private JTextField R6;
    private JTextField R7;
    private JTextField R8;
    private JTextField R9;
    private JPanel yellowPnl;
    private JTextField Y1;
    private JTextField Y2;
    private JTextField Y3;
    private JTextField Y4;
    private JTextField yellowCenter;
    private JTextField Y6;
    private JTextField Y7;
    private JTextField Y8;
    private JTextField Y9;
    private JPanel greenPnl;
    private JTextField G1;
    private JTextField G2;
    private JTextField G3;
    private JTextField G4;
    private JTextField greenCenter;
    private JTextField G6;
    private JTextField G7;
    private JTextField G8;
    private JTextField G9;
    private JButton confirmBtn;

    public EditCubeWindow(PrincipalWindow global) {
        this.parent = global;
        initComponents();
    }

    private void confirmBtnActionPerformed(ActionEvent e) {
        if (this.checkConditions()) {
            editCubeFrame.setVisible(false);
            parent.setTab(this.tab);
            parent.update();
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        editCubeFrame = new JFrame();
        bluePnl = new JPanel();
        B1 = new JTextField();
        B2 = new JTextField();
        B3 = new JTextField();
        B4 = new JTextField();
        blueCenter = new JTextField();
        B6 = new JTextField();
        B7 = new JTextField();
        B8 = new JTextField();
        B9 = new JTextField();
        colorCodingPnl = new JPanel();
        textField1 = new JTextField();
        textField2 = new JTextField();
        textField5 = new JTextField();
        textField3 = new JTextField();
        textField6 = new JTextField();
        textField4 = new JTextField();
        textField55 = new JTextField();
        orangePnl = new JPanel();
        O1 = new JTextField();
        O2 = new JTextField();
        O3 = new JTextField();
        O4 = new JTextField();
        orangeCenter = new JTextField();
        O6 = new JTextField();
        O7 = new JTextField();
        O8 = new JTextField();
        O9 = new JTextField();
        whitePnl = new JPanel();
        W1 = new JTextField();
        W2 = new JTextField();
        W3 = new JTextField();
        W4 = new JTextField();
        whiteCenter = new JTextField();
        W6 = new JTextField();
        W7 = new JTextField();
        W8 = new JTextField();
        W9 = new JTextField();
        redPnl = new JPanel();
        R1 = new JTextField();
        R2 = new JTextField();
        R3 = new JTextField();
        R4 = new JTextField();
        redCenter = new JTextField();
        R6 = new JTextField();
        R7 = new JTextField();
        R8 = new JTextField();
        R9 = new JTextField();
        yellowPnl = new JPanel();
        Y1 = new JTextField();
        Y2 = new JTextField();
        Y3 = new JTextField();
        Y4 = new JTextField();
        yellowCenter = new JTextField();
        Y6 = new JTextField();
        Y7 = new JTextField();
        Y8 = new JTextField();
        Y9 = new JTextField();
        greenPnl = new JPanel();
        G1 = new JTextField();
        G2 = new JTextField();
        G3 = new JTextField();
        G4 = new JTextField();
        greenCenter = new JTextField();
        G6 = new JTextField();
        G7 = new JTextField();
        G8 = new JTextField();
        G9 = new JTextField();
        confirmBtn = new JButton();

        //======== editCubeFrame ========
        {
            editCubeFrame.setTitle("Edit Cube Faces");
            editCubeFrame.setMinimumSize(new Dimension(400, 400));
            editCubeFrame.setBackground(Color.white);
            editCubeFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            editCubeFrame.setResizable(false);
            editCubeFrame.setVisible(true);
            var editCubeFrameContentPane = editCubeFrame.getContentPane();
            editCubeFrameContentPane.setLayout(new MigLayout(
                    "fillx,hidemode 3,alignx left",
                    // columns
                    "[100]" +
                            "[100]" +
                            "[100]" +
                            "[100]",
                    // rows
                    "[89]" +
                            "[85]" +
                            "[87]para"));

            //======== bluePnl ========
            {
                bluePnl.setBorder(new LineBorder(Color.black, 5, true));
                bluePnl.setLayout(new MigLayout(
                        "hidemode 3",
                        // columns
                        "[fill]" +
                                "[fill]" +
                                "[fill]",
                        // rows
                        "[]" +
                                "[]" +
                                "[]0" +
                                "[]"));

                //---- B1 ----
                B1.setMinimumSize(new Dimension(30, 30));
                B1.setSelectionColor(new Color(214, 214, 214));
                B1.setBackground(Color.white);
                bluePnl.add(B1, "cell 0 0");

                //---- B2 ----
                B2.setMinimumSize(new Dimension(30, 30));
                B2.setSelectionColor(new Color(214, 214, 214));
                B2.setBackground(Color.white);
                bluePnl.add(B2, "cell 1 0");

                //---- B3 ----
                B3.setMinimumSize(new Dimension(30, 30));
                B3.setSelectionColor(new Color(214, 214, 214));
                B3.setBackground(Color.white);
                bluePnl.add(B3, "cell 2 0");

                //---- B4 ----
                B4.setMinimumSize(new Dimension(30, 30));
                B4.setSelectionColor(new Color(214, 214, 214));
                B4.setBackground(Color.white);
                bluePnl.add(B4, "cell 0 1");

                //---- blueCenter ----
                blueCenter.setBackground(Color.blue);
                blueCenter.setMinimumSize(new Dimension(30, 30));
                blueCenter.setFocusable(false);
                blueCenter.setSelectionColor(new Color(214, 214, 214));
                bluePnl.add(blueCenter, "cell 1 1");

                //---- B6 ----
                B6.setMinimumSize(new Dimension(30, 30));
                B6.setSelectionColor(new Color(214, 214, 214));
                B6.setBackground(Color.white);
                bluePnl.add(B6, "cell 2 1");

                //---- B7 ----
                B7.setMinimumSize(new Dimension(30, 30));
                B7.setSelectionColor(new Color(214, 214, 214));
                B7.setBackground(Color.white);
                bluePnl.add(B7, "cell 0 2");

                //---- B8 ----
                B8.setMinimumSize(new Dimension(30, 30));
                B8.setSelectionColor(new Color(214, 214, 214));
                B8.setBackground(Color.white);
                bluePnl.add(B8, "cell 1 2");

                //---- B9 ----
                B9.setMinimumSize(new Dimension(30, 30));
                B9.setSelectionColor(new Color(214, 214, 214));
                B9.setBackground(Color.white);
                bluePnl.add(B9, "cell 2 2");
            }
            editCubeFrameContentPane.add(bluePnl, "cell 1 0");

            //======== colorCodingPnl ========
            {
                colorCodingPnl.setLayout(new MigLayout(
                        "hidemode 3",
                        // columns
                        "[fill]" +
                                "[fill]" +
                                "[fill]" +
                                "[fill]" +
                                "[fill]",
                        // rows
                        "[]" +
                                "[]" +
                                "[]" +
                                "[]" +
                                "[]"));

                //---- textField1 ----
                textField1.setText("Colors coding :");
                textField1.setFocusable(false);
                textField1.setEditable(false);
                textField1.setBorder(null);
                colorCodingPnl.add(textField1, "cell 1 0 3 1,alignx center,growx 0");

                //---- textField2 ----
                textField2.setFocusable(false);
                textField2.setText("W - White");
                textField2.setEditable(false);
                textField2.setBorder(null);
                colorCodingPnl.add(textField2, "cell 1 1");

                //---- textField5 ----
                textField5.setFocusable(false);
                textField5.setText("G - Green");
                textField5.setEditable(false);
                textField5.setBorder(null);
                colorCodingPnl.add(textField5, "cell 3 1");

                //---- textField3 ----
                textField3.setFocusable(false);
                textField3.setText("B - Blue");
                textField3.setEditable(false);
                textField3.setBorder(null);
                colorCodingPnl.add(textField3, "cell 1 2");

                //---- textField6 ----
                textField6.setFocusable(false);
                textField6.setText("R - Red");
                textField6.setEditable(false);
                textField6.setBorder(null);
                colorCodingPnl.add(textField6, "cell 3 2");

                //---- textField4 ----
                textField4.setFocusable(false);
                textField4.setText("O - Orange");
                textField4.setEditable(false);
                textField4.setBorder(null);
                colorCodingPnl.add(textField4, "cell 1 3");

                //---- textField55 ----
                textField55.setFocusable(false);
                textField55.setText("Y - Yellow");
                textField55.setEditable(false);
                textField55.setBorder(null);
                colorCodingPnl.add(textField55, "cell 3 3");
            }
            editCubeFrameContentPane.add(colorCodingPnl, "cell 2 0 2 1,align center center,grow 0 0");

            //======== orangePnl ========
            {
                orangePnl.setBorder(new LineBorder(Color.black, 5, true));
                orangePnl.setLayout(new MigLayout(
                        "hidemode 3",
                        // columns
                        "[fill]" +
                                "[fill]" +
                                "[fill]",
                        // rows
                        "[]" +
                                "[]" +
                                "[]0" +
                                "[]"));

                //---- O1 ----
                O1.setMinimumSize(new Dimension(30, 30));
                O1.setSelectionColor(new Color(214, 214, 214));
                O1.setBackground(Color.white);
                orangePnl.add(O1, "cell 0 0");

                //---- O2 ----
                O2.setMinimumSize(new Dimension(30, 30));
                O2.setSelectionColor(new Color(214, 214, 214));
                O2.setBackground(Color.white);
                orangePnl.add(O2, "cell 1 0");

                //---- O3 ----
                O3.setMinimumSize(new Dimension(30, 30));
                O3.setSelectionColor(new Color(214, 214, 214));
                O3.setBackground(Color.white);
                orangePnl.add(O3, "cell 2 0");

                //---- O4 ----
                O4.setMinimumSize(new Dimension(30, 30));
                O4.setSelectionColor(new Color(214, 214, 214));
                O4.setBackground(Color.white);
                orangePnl.add(O4, "cell 0 1");

                //---- orangeCenter ----
                orangeCenter.setBackground(new Color(255, 102, 0));
                orangeCenter.setMinimumSize(new Dimension(30, 30));
                orangeCenter.setFocusable(false);
                orangeCenter.setSelectionColor(new Color(214, 214, 214));
                orangePnl.add(orangeCenter, "cell 1 1");

                //---- O6 ----
                O6.setMinimumSize(new Dimension(30, 30));
                O6.setSelectionColor(new Color(214, 214, 214));
                O6.setBackground(Color.white);
                orangePnl.add(O6, "cell 2 1");

                //---- O7 ----
                O7.setMinimumSize(new Dimension(30, 30));
                O7.setSelectionColor(new Color(214, 214, 214));
                O7.setBackground(Color.white);
                orangePnl.add(O7, "cell 0 2");

                //---- O8 ----
                O8.setMinimumSize(new Dimension(30, 30));
                O8.setSelectionColor(new Color(214, 214, 214));
                O8.setBackground(Color.white);
                orangePnl.add(O8, "cell 1 2");

                //---- O9 ----
                O9.setMinimumSize(new Dimension(30, 30));
                O9.setSelectionColor(new Color(214, 214, 214));
                O9.setBackground(Color.white);
                orangePnl.add(O9, "cell 2 2");
            }
            editCubeFrameContentPane.add(orangePnl, "cell 0 1,alignx center,growx 0");

            //======== whitePnl ========
            {
                whitePnl.setBorder(new LineBorder(Color.black, 5, true));
                whitePnl.setLayout(new MigLayout(
                        "hidemode 3",
                        // columns
                        "[fill]" +
                                "[fill]" +
                                "[fill]",
                        // rows
                        "[]" +
                                "[]" +
                                "[]0" +
                                "[]"));

                //---- W1 ----
                W1.setMinimumSize(new Dimension(30, 30));
                W1.setSelectionColor(new Color(214, 214, 214));
                W1.setBackground(Color.white);
                whitePnl.add(W1, "cell 0 0");

                //---- W2 ----
                W2.setMinimumSize(new Dimension(30, 30));
                W2.setSelectionColor(new Color(214, 214, 214));
                W2.setBackground(Color.white);
                whitePnl.add(W2, "cell 1 0");

                //---- W3 ----
                W3.setMinimumSize(new Dimension(30, 30));
                W3.setSelectionColor(new Color(214, 214, 214));
                W3.setBackground(Color.white);
                whitePnl.add(W3, "cell 2 0");

                //---- W4 ----
                W4.setMinimumSize(new Dimension(30, 30));
                W4.setSelectionColor(new Color(214, 214, 214));
                W4.setBackground(Color.white);
                whitePnl.add(W4, "cell 0 1");

                //---- whiteCenter ----
                whiteCenter.setBackground(Color.white);
                whiteCenter.setMinimumSize(new Dimension(30, 30));
                whiteCenter.setFocusable(false);
                whiteCenter.setSelectionColor(new Color(214, 214, 214));
                whitePnl.add(whiteCenter, "cell 1 1");

                //---- W6 ----
                W6.setMinimumSize(new Dimension(30, 30));
                W6.setSelectionColor(new Color(214, 214, 214));
                W6.setBackground(Color.white);
                whitePnl.add(W6, "cell 2 1");

                //---- W7 ----
                W7.setMinimumSize(new Dimension(30, 30));
                W7.setSelectionColor(new Color(214, 214, 214));
                W7.setBackground(Color.white);
                whitePnl.add(W7, "cell 0 2");

                //---- W8 ----
                W8.setMinimumSize(new Dimension(30, 30));
                W8.setSelectionColor(new Color(214, 214, 214));
                W8.setBackground(Color.white);
                whitePnl.add(W8, "cell 1 2");

                //---- W9 ----
                W9.setMinimumSize(new Dimension(30, 30));
                W9.setSelectionColor(new Color(214, 214, 214));
                W9.setBackground(Color.white);
                whitePnl.add(W9, "cell 2 2");
            }
            editCubeFrameContentPane.add(whitePnl, "cell 1 1");

            //======== redPnl ========
            {
                redPnl.setBorder(new LineBorder(Color.black, 5, true));
                redPnl.setLayout(new MigLayout(
                        "hidemode 3",
                        // columns
                        "[fill]" +
                                "[fill]" +
                                "[fill]",
                        // rows
                        "[]" +
                                "[]" +
                                "[]0" +
                                "[]"));

                //---- R1 ----
                R1.setMinimumSize(new Dimension(30, 30));
                R1.setSelectionColor(new Color(214, 214, 214));
                R1.setBackground(Color.white);
                redPnl.add(R1, "cell 0 0");

                //---- R2 ----
                R2.setMinimumSize(new Dimension(30, 30));
                R2.setSelectionColor(new Color(214, 214, 214));
                R2.setBackground(Color.white);
                redPnl.add(R2, "cell 1 0");

                //---- R3 ----
                R3.setMinimumSize(new Dimension(30, 30));
                R3.setSelectionColor(new Color(214, 214, 214));
                R3.setBackground(Color.white);
                redPnl.add(R3, "cell 2 0");

                //---- R4 ----
                R4.setMinimumSize(new Dimension(30, 30));
                R4.setSelectionColor(new Color(214, 214, 214));
                R4.setBackground(Color.white);
                redPnl.add(R4, "cell 0 1");

                //---- redCenter ----
                redCenter.setBackground(Color.red);
                redCenter.setMinimumSize(new Dimension(30, 30));
                redCenter.setFocusable(false);
                redCenter.setSelectionColor(new Color(214, 214, 214));
                redPnl.add(redCenter, "cell 1 1");

                //---- R6 ----
                R6.setMinimumSize(new Dimension(30, 30));
                R6.setSelectionColor(new Color(214, 214, 214));
                R6.setBackground(Color.white);
                redPnl.add(R6, "cell 2 1");

                //---- R7 ----
                R7.setMinimumSize(new Dimension(30, 30));
                R7.setSelectionColor(new Color(214, 214, 214));
                R7.setBackground(Color.white);
                redPnl.add(R7, "cell 0 2");

                //---- R8 ----
                R8.setMinimumSize(new Dimension(30, 30));
                R8.setSelectionColor(new Color(214, 214, 214));
                R8.setBackground(Color.white);
                redPnl.add(R8, "cell 1 2");

                //---- R9 ----
                R9.setMinimumSize(new Dimension(30, 30));
                R9.setSelectionColor(new Color(214, 214, 214));
                R9.setBackground(Color.white);
                redPnl.add(R9, "cell 2 2");
            }
            editCubeFrameContentPane.add(redPnl, "cell 2 1");

            //======== yellowPnl ========
            {
                yellowPnl.setBorder(new LineBorder(Color.black, 5, true));
                yellowPnl.setLayout(new MigLayout(
                        "hidemode 3",
                        // columns
                        "[fill]" +
                                "[fill]" +
                                "[fill]",
                        // rows
                        "[]" +
                                "[]" +
                                "[]0" +
                                "[]"));

                //---- Y1 ----
                Y1.setMinimumSize(new Dimension(30, 30));
                Y1.setSelectionColor(new Color(214, 214, 214));
                Y1.setBackground(Color.white);
                yellowPnl.add(Y1, "cell 0 0");

                //---- Y2 ----
                Y2.setMinimumSize(new Dimension(30, 30));
                Y2.setSelectionColor(new Color(214, 214, 214));
                Y2.setBackground(Color.white);
                yellowPnl.add(Y2, "cell 1 0");

                //---- Y3 ----
                Y3.setMinimumSize(new Dimension(30, 30));
                Y3.setSelectionColor(new Color(214, 214, 214));
                Y3.setBackground(Color.white);
                yellowPnl.add(Y3, "cell 2 0");

                //---- Y4 ----
                Y4.setMinimumSize(new Dimension(30, 30));
                Y4.setSelectionColor(new Color(214, 214, 214));
                Y4.setBackground(Color.white);
                yellowPnl.add(Y4, "cell 0 1");

                //---- yellowCenter ----
                yellowCenter.setBackground(Color.yellow);
                yellowCenter.setMinimumSize(new Dimension(30, 30));
                yellowCenter.setFocusable(false);
                yellowCenter.setSelectionColor(new Color(214, 214, 214));
                yellowPnl.add(yellowCenter, "cell 1 1");

                //---- Y6 ----
                Y6.setMinimumSize(new Dimension(30, 30));
                Y6.setSelectionColor(new Color(214, 214, 214));
                Y6.setBackground(Color.white);
                yellowPnl.add(Y6, "cell 2 1");

                //---- Y7 ----
                Y7.setMinimumSize(new Dimension(30, 30));
                Y7.setSelectionColor(new Color(214, 214, 214));
                Y7.setBackground(Color.white);
                yellowPnl.add(Y7, "cell 0 2");

                //---- Y8 ----
                Y8.setMinimumSize(new Dimension(30, 30));
                Y8.setSelectionColor(new Color(214, 214, 214));
                Y8.setBackground(Color.white);
                yellowPnl.add(Y8, "cell 1 2");

                //---- Y9 ----
                Y9.setMinimumSize(new Dimension(30, 30));
                Y9.setSelectionColor(new Color(214, 214, 214));
                Y9.setBackground(Color.white);
                yellowPnl.add(Y9, "cell 2 2");
            }
            editCubeFrameContentPane.add(yellowPnl, "cell 3 1");

            //======== greenPnl ========
            {
                greenPnl.setBorder(new LineBorder(Color.black, 5, true));
                greenPnl.setLayout(new MigLayout(
                        "hidemode 3",
                        // columns
                        "[fill]" +
                                "[fill]" +
                                "[fill]",
                        // rows
                        "[]" +
                                "[]" +
                                "[]0" +
                                "[]"));

                //---- G1 ----
                G1.setMinimumSize(new Dimension(30, 30));
                G1.setSelectionColor(new Color(214, 214, 214));
                G1.setBackground(Color.white);
                greenPnl.add(G1, "cell 0 0");

                //---- G2 ----
                G2.setMinimumSize(new Dimension(30, 30));
                G2.setSelectionColor(new Color(214, 214, 214));
                G2.setBackground(Color.white);
                greenPnl.add(G2, "cell 1 0");

                //---- G3 ----
                G3.setMinimumSize(new Dimension(30, 30));
                G3.setSelectionColor(new Color(214, 214, 214));
                G3.setBackground(Color.white);
                greenPnl.add(G3, "cell 2 0");

                //---- G4 ----
                G4.setMinimumSize(new Dimension(30, 30));
                G4.setSelectionColor(new Color(214, 214, 214));
                G4.setBackground(Color.white);
                greenPnl.add(G4, "cell 0 1");

                //---- greenCenter ----
                greenCenter.setBackground(new Color(51, 204, 0));
                greenCenter.setMinimumSize(new Dimension(30, 30));
                greenCenter.setFocusable(false);
                greenCenter.setSelectionColor(new Color(214, 214, 214));
                greenPnl.add(greenCenter, "cell 1 1");

                //---- G6 ----
                G6.setMinimumSize(new Dimension(30, 30));
                G6.setSelectionColor(new Color(214, 214, 214));
                G6.setBackground(Color.white);
                greenPnl.add(G6, "cell 2 1");

                //---- G7 ----
                G7.setMinimumSize(new Dimension(30, 30));
                G7.setSelectionColor(new Color(214, 214, 214));
                G7.setBackground(Color.white);
                greenPnl.add(G7, "cell 0 2");

                //---- G8 ----
                G8.setMinimumSize(new Dimension(30, 30));
                G8.setSelectionColor(new Color(214, 214, 214));
                G8.setBackground(Color.white);
                greenPnl.add(G8, "cell 1 2");

                //---- G9 ----
                G9.setMinimumSize(new Dimension(30, 30));
                G9.setSelectionColor(new Color(214, 214, 214));
                G9.setBackground(Color.white);
                greenPnl.add(G9, "cell 2 2");
            }
            editCubeFrameContentPane.add(greenPnl, "cell 1 2");

            //---- confirmBtn ----
            confirmBtn.setText("Confirm");
            confirmBtn.setBackground(new Color(0, 153, 51));
            confirmBtn.setForeground(Color.black);
            confirmBtn.addActionListener(e -> confirmBtnActionPerformed(e));
            editCubeFrameContentPane.add(confirmBtn, "cell 3 2,align center bottom,grow 0 0");
            editCubeFrame.pack();
            editCubeFrame.setLocationRelativeTo(editCubeFrame.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    public boolean checkConditions() {
        int y = 0, w = 0, r = 0, g = 0, b = 0, o = 0, cpt = 0;
        boolean res = true;

        // Jaune
        tab[0] = this.Y1.getText();
        tab[1] = this.Y2.getText();
        tab[2] = this.Y3.getText();
        tab[3] = this.Y4.getText();
        tab[4] = this.Y6.getText();
        tab[5] = this.Y7.getText();
        tab[6] = this.Y8.getText();
        tab[7] = this.Y9.getText();

        // Bleu
        tab[8] = this.B1.getText();
        tab[9] = this.B2.getText();
        tab[10] = this.B3.getText();
        tab[11] = this.B4.getText();
        tab[12] = this.B6.getText();
        tab[13] = this.B7.getText();
        tab[14] = this.B8.getText();
        tab[15] = this.B9.getText();

        // Blanc
        tab[16] = this.W1.getText();
        tab[17] = this.W2.getText();
        tab[18] = this.W3.getText();
        tab[19] = this.W4.getText();
        tab[20] = this.W6.getText();
        tab[21] = this.W7.getText();
        tab[22] = this.W8.getText();
        tab[23] = this.W9.getText();

        // Vert
        tab[24] = this.G1.getText();
        tab[25] = this.G2.getText();
        tab[26] = this.G3.getText();
        tab[27] = this.G4.getText();
        tab[28] = this.G6.getText();
        tab[29] = this.G7.getText();
        tab[30] = this.G8.getText();
        tab[31] = this.G9.getText();

        // Rouge
        tab[32] = this.R1.getText();
        tab[33] = this.R2.getText();
        tab[34] = this.R3.getText();
        tab[35] = this.R4.getText();
        tab[36] = this.R6.getText();
        tab[37] = this.R7.getText();
        tab[38] = this.R8.getText();
        tab[39] = this.R9.getText();

        // Orange
        tab[40] = this.O1.getText();
        tab[41] = this.O2.getText();
        tab[42] = this.O3.getText();
        tab[43] = this.O4.getText();
        tab[44] = this.O6.getText();
        tab[45] = this.O7.getText();
        tab[46] = this.O8.getText();
        tab[47] = this.O9.getText();

        // Test cases vides
        for (int i = 0; i < 48; i++) {
            switch (tab[i]) {
                case "":
                    cpt++;
                    break;
                case "Y":
                    y++;
                    break;
                case "R":
                    r++;
                    break;
                case "G":
                    g++;
                    break;
                case "B":
                    b++;
                    break;
                case "W":
                    w++;
                    break;
                case "O":
                    o++;
                    break;
            }
        }

        if (cpt > 0) {
            ErrorWindow error = new ErrorWindow(this, "Attention ! Le cube contient des cases vides.");
            res = false;
        }

        if (y != 8 || o != 8 || g != 8 || w != 8 || r != 8 || b != 8) {
            ErrorWindow error = new ErrorWindow(this, "Attention ! Il n'y a pas 8 cases par couleur.");
            res = false;
        }

        return res;
    }

    public String[] getTab() {
        return tab;
    }

    public void setTab(String[] tab) {
        this.tab = tab;
    }
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
