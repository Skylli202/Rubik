package graphicInterface;/*
 * Created by JFormDesigner on Sun Dec 08 12:38:12 CET 2019
 */

import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * @author David
 */
public class PrincipalWindow extends JFrame {

    String[] tab = new String[48];
    private PrincipalWindow principalWindow;
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
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
    private JPanel actionsPnl;
    private JTextField actionsTextFld;
    private JButton mixBtn;
    private JButton solveBtn;
    private JButton resetBtn;
    private JButton editBtn;
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
    private JPanel solutionPnl;
    private JTextField solutionTxt;

    public PrincipalWindow() {
        initComponents();
    }

    private void editBtnActionPerformed(ActionEvent e) {
        EditCubeWindow edition = new EditCubeWindow(this);
    }

    private void resetBtnActionPerformed(ActionEvent e) {
        setColor(this.Y1, "Y");
        setColor(this.Y2, "Y");
        setColor(this.Y3, "Y");
        setColor(this.Y4, "Y");
        setColor(this.Y6, "Y");
        setColor(this.Y7, "Y");
        setColor(this.Y8, "Y");
        setColor(this.Y9, "Y");

        setColor(this.B1, "B");
        setColor(this.B2, "B");
        setColor(this.B3, "B");
        setColor(this.B4, "B");
        setColor(this.B6, "B");
        setColor(this.B7, "B");
        setColor(this.B8, "B");
        setColor(this.B9, "B");

        setColor(this.W1, "W");
        setColor(this.W2, "W");
        setColor(this.W3, "W");
        setColor(this.W4, "W");
        setColor(this.W6, "W");
        setColor(this.W7, "W");
        setColor(this.W8, "W");
        setColor(this.W9, "W");

        setColor(this.O1, "O");
        setColor(this.O2, "O");
        setColor(this.O3, "O");
        setColor(this.O4, "O");
        setColor(this.O6, "O");
        setColor(this.O7, "O");
        setColor(this.O8, "O");
        setColor(this.O9, "O");

        setColor(this.R1, "R");
        setColor(this.R2, "R");
        setColor(this.R3, "R");
        setColor(this.R4, "R");
        setColor(this.R6, "R");
        setColor(this.R7, "R");
        setColor(this.R8, "R");
        setColor(this.R9, "R");

        setColor(this.G1, "G");
        setColor(this.G2, "G");
        setColor(this.G3, "G");
        setColor(this.G4, "G");
        setColor(this.G6, "G");
        setColor(this.G7, "G");
        setColor(this.G8, "G");
        setColor(this.G9, "G");
    }

    private void solveBtnActionPerformed(ActionEvent e) {
        // TODO add your code here
        ErrorWindow error = new ErrorWindow(this, "Attention ! Ce bouton n'est pas encore programmé.");
    }

    private void mixBtnActionPerformed(ActionEvent e) {
        // TODO add your code here
        ErrorWindow error = new ErrorWindow(this, "Attention ! Ce bouton n'est pas encore programmé.");
    }

    public void setColor(JTextField field, String color) {
        switch (color) {
            case "Y":
                field.setBackground(Color.yellow);
                break;
            case "O":
                field.setBackground(Color.orange);
                break;
            case "B":
                field.setBackground(Color.blue);
                break;
            case "W":
                field.setBackground(Color.white);
                break;
            case "R":
                field.setBackground(Color.red);
                break;
            case "G":
                field.setBackground(Color.green);
                break;
        }
    }

    public void update() {

        for (int i = 0; i < 48; i++) {
            System.out.println(this.tab[i]);
        }

        setColor(this.Y1, tab[0]);
        setColor(this.Y2, tab[1]);
        setColor(this.Y3, tab[2]);
        setColor(this.Y4, tab[3]);
        setColor(this.Y6, tab[4]);
        setColor(this.Y7, tab[5]);
        setColor(this.Y8, tab[6]);
        setColor(this.Y9, tab[7]);

        setColor(this.B1, tab[8]);
        setColor(this.B2, tab[9]);
        setColor(this.B3, tab[10]);
        setColor(this.B4, tab[11]);
        setColor(this.B6, tab[12]);
        setColor(this.B7, tab[13]);
        setColor(this.B8, tab[14]);
        setColor(this.B9, tab[15]);

        setColor(this.W1, tab[16]);
        setColor(this.W2, tab[17]);
        setColor(this.W3, tab[18]);
        setColor(this.W4, tab[19]);
        setColor(this.W6, tab[20]);
        setColor(this.W7, tab[21]);
        setColor(this.W8, tab[22]);
        setColor(this.W9, tab[23]);

        setColor(this.O1, tab[24]);
        setColor(this.O2, tab[25]);
        setColor(this.O3, tab[26]);
        setColor(this.O4, tab[27]);
        setColor(this.O6, tab[28]);
        setColor(this.O7, tab[29]);
        setColor(this.O8, tab[30]);
        setColor(this.O9, tab[31]);

        setColor(this.R1, tab[32]);
        setColor(this.R2, tab[33]);
        setColor(this.R3, tab[34]);
        setColor(this.R4, tab[35]);
        setColor(this.R6, tab[36]);
        setColor(this.R7, tab[37]);
        setColor(this.R8, tab[38]);
        setColor(this.R9, tab[39]);

        setColor(this.G1, tab[40]);
        setColor(this.G2, tab[41]);
        setColor(this.G3, tab[42]);
        setColor(this.G4, tab[43]);
        setColor(this.G6, tab[44]);
        setColor(this.G7, tab[45]);
        setColor(this.G8, tab[46]);
        setColor(this.G9, tab[47]);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
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
        actionsPnl = new JPanel();
        actionsTextFld = new JTextField();
        mixBtn = new JButton();
        solveBtn = new JButton();
        resetBtn = new JButton();
        editBtn = new JButton();
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
        solutionPnl = new JPanel();
        solutionTxt = new JTextField();

        //======== this ========
        setTitle("Rubik's Solver");
        setMinimumSize(new Dimension(400, 400));
        setVisible(true);
        var contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
                "fillx,hidemode 3,alignx left",
                // columns
                "[100]" +
                        "[100]" +
                        "[100]" +
                        "[100]" +
                        "[100]",
                // rows
                "[89]" +
                        "[85]" +
                        "[87]para" +
                        "[50]"));

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
            B1.setBackground(Color.blue);
            B1.setMinimumSize(new Dimension(30, 30));
            B1.setFocusable(false);
            B1.setSelectionColor(new Color(214, 214, 214));
            bluePnl.add(B1, "cell 0 0");

            //---- B2 ----
            B2.setBackground(Color.blue);
            B2.setMinimumSize(new Dimension(30, 30));
            B2.setFocusable(false);
            B2.setSelectionColor(new Color(214, 214, 214));
            bluePnl.add(B2, "cell 1 0");

            //---- B3 ----
            B3.setBackground(Color.blue);
            B3.setMinimumSize(new Dimension(30, 30));
            B3.setFocusable(false);
            B3.setSelectionColor(new Color(214, 214, 214));
            bluePnl.add(B3, "cell 2 0");

            //---- B4 ----
            B4.setBackground(Color.blue);
            B4.setMinimumSize(new Dimension(30, 30));
            B4.setFocusable(false);
            B4.setSelectionColor(new Color(214, 214, 214));
            bluePnl.add(B4, "cell 0 1");

            //---- blueCenter ----
            blueCenter.setBackground(Color.blue);
            blueCenter.setMinimumSize(new Dimension(30, 30));
            blueCenter.setFocusable(false);
            blueCenter.setSelectionColor(new Color(214, 214, 214));
            bluePnl.add(blueCenter, "cell 1 1");

            //---- B6 ----
            B6.setBackground(Color.blue);
            B6.setMinimumSize(new Dimension(30, 30));
            B6.setFocusable(false);
            B6.setSelectionColor(new Color(214, 214, 214));
            bluePnl.add(B6, "cell 2 1");

            //---- B7 ----
            B7.setBackground(Color.blue);
            B7.setMinimumSize(new Dimension(30, 30));
            B7.setFocusable(false);
            B7.setSelectionColor(new Color(214, 214, 214));
            bluePnl.add(B7, "cell 0 2");

            //---- B8 ----
            B8.setBackground(Color.blue);
            B8.setMinimumSize(new Dimension(30, 30));
            B8.setFocusable(false);
            B8.setSelectionColor(new Color(214, 214, 214));
            bluePnl.add(B8, "cell 1 2");

            //---- B9 ----
            B9.setBackground(Color.blue);
            B9.setMinimumSize(new Dimension(30, 30));
            B9.setFocusable(false);
            B9.setSelectionColor(new Color(214, 214, 214));
            bluePnl.add(B9, "cell 2 2");
        }
        contentPane.add(bluePnl, "cell 1 0");

        //======== actionsPnl ========
        {
            actionsPnl.setBorder(LineBorder.createBlackLineBorder());
            actionsPnl.setLayout(new MigLayout(
                    "fillx,hidemode 3",
                    // columns
                    "[fill]",
                    // rows
                    "[]" +
                            "[]" +
                            "[]" +
                            "[]" +
                            "[]"));

            //---- actionsTextFld ----
            actionsTextFld.setText("Actions");
            actionsTextFld.setEditable(false);
            actionsTextFld.setSelectionColor(new Color(214, 214, 214));
            actionsTextFld.setBorder(null);
            actionsTextFld.setFocusable(false);
            actionsPnl.add(actionsTextFld, "cell 0 0,alignx center,growx 0");

            //---- mixBtn ----
            mixBtn.setText("Mix");
            mixBtn.addActionListener(e -> mixBtnActionPerformed(e));
            actionsPnl.add(mixBtn, "cell 0 1");

            //---- solveBtn ----
            solveBtn.setText("Solve");
            solveBtn.addActionListener(e -> solveBtnActionPerformed(e));
            actionsPnl.add(solveBtn, "cell 0 2");

            //---- resetBtn ----
            resetBtn.setText("Reset");
            resetBtn.addActionListener(e -> resetBtnActionPerformed(e));
            actionsPnl.add(resetBtn, "cell 0 3");

            //---- editBtn ----
            editBtn.setText("Edit");
            editBtn.addActionListener(e -> editBtnActionPerformed(e));
            actionsPnl.add(editBtn, "cell 0 4");
        }
        contentPane.add(actionsPnl, "cell 4 0 1 3,align center top,grow 0 0");

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
            O1.setBackground(Color.orange);
            O1.setMinimumSize(new Dimension(30, 30));
            O1.setFocusable(false);
            O1.setSelectionColor(new Color(214, 214, 214));
            orangePnl.add(O1, "cell 0 0");

            //---- O2 ----
            O2.setBackground(Color.orange);
            O2.setMinimumSize(new Dimension(30, 30));
            O2.setFocusable(false);
            O2.setSelectionColor(new Color(214, 214, 214));
            orangePnl.add(O2, "cell 1 0");

            //---- O3 ----
            O3.setBackground(Color.orange);
            O3.setMinimumSize(new Dimension(30, 30));
            O3.setFocusable(false);
            O3.setSelectionColor(new Color(214, 214, 214));
            orangePnl.add(O3, "cell 2 0");

            //---- O4 ----
            O4.setBackground(Color.orange);
            O4.setMinimumSize(new Dimension(30, 30));
            O4.setFocusable(false);
            O4.setSelectionColor(new Color(214, 214, 214));
            orangePnl.add(O4, "cell 0 1");

            //---- orangeCenter ----
            orangeCenter.setBackground(Color.orange);
            orangeCenter.setMinimumSize(new Dimension(30, 30));
            orangeCenter.setFocusable(false);
            orangeCenter.setSelectionColor(new Color(214, 214, 214));
            orangePnl.add(orangeCenter, "cell 1 1");

            //---- O6 ----
            O6.setBackground(Color.orange);
            O6.setMinimumSize(new Dimension(30, 30));
            O6.setFocusable(false);
            O6.setSelectionColor(new Color(214, 214, 214));
            orangePnl.add(O6, "cell 2 1");

            //---- O7 ----
            O7.setBackground(Color.orange);
            O7.setMinimumSize(new Dimension(30, 30));
            O7.setFocusable(false);
            O7.setSelectionColor(new Color(214, 214, 214));
            orangePnl.add(O7, "cell 0 2");

            //---- O8 ----
            O8.setBackground(Color.orange);
            O8.setMinimumSize(new Dimension(30, 30));
            O8.setFocusable(false);
            O8.setSelectionColor(new Color(214, 214, 214));
            orangePnl.add(O8, "cell 1 2");

            //---- O9 ----
            O9.setBackground(Color.orange);
            O9.setMinimumSize(new Dimension(30, 30));
            O9.setFocusable(false);
            O9.setSelectionColor(new Color(214, 214, 214));
            orangePnl.add(O9, "cell 2 2");
        }
        contentPane.add(orangePnl, "cell 0 1,alignx center,growx 0");

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
            W1.setBackground(Color.white);
            W1.setMinimumSize(new Dimension(30, 30));
            W1.setFocusable(false);
            W1.setSelectionColor(new Color(214, 214, 214));
            whitePnl.add(W1, "cell 0 0");

            //---- W2 ----
            W2.setBackground(Color.white);
            W2.setMinimumSize(new Dimension(30, 30));
            W2.setFocusable(false);
            W2.setSelectionColor(new Color(214, 214, 214));
            whitePnl.add(W2, "cell 1 0");

            //---- W3 ----
            W3.setBackground(Color.white);
            W3.setMinimumSize(new Dimension(30, 30));
            W3.setFocusable(false);
            W3.setSelectionColor(new Color(214, 214, 214));
            whitePnl.add(W3, "cell 2 0");

            //---- W4 ----
            W4.setBackground(Color.white);
            W4.setMinimumSize(new Dimension(30, 30));
            W4.setFocusable(false);
            W4.setSelectionColor(new Color(214, 214, 214));
            whitePnl.add(W4, "cell 0 1");

            //---- whiteCenter ----
            whiteCenter.setBackground(Color.white);
            whiteCenter.setMinimumSize(new Dimension(30, 30));
            whiteCenter.setFocusable(false);
            whiteCenter.setSelectionColor(new Color(214, 214, 214));
            whitePnl.add(whiteCenter, "cell 1 1");

            //---- W6 ----
            W6.setBackground(Color.white);
            W6.setMinimumSize(new Dimension(30, 30));
            W6.setFocusable(false);
            W6.setSelectionColor(new Color(214, 214, 214));
            whitePnl.add(W6, "cell 2 1");

            //---- W7 ----
            W7.setBackground(Color.white);
            W7.setMinimumSize(new Dimension(30, 30));
            W7.setFocusable(false);
            W7.setSelectionColor(new Color(214, 214, 214));
            whitePnl.add(W7, "cell 0 2");

            //---- W8 ----
            W8.setBackground(Color.white);
            W8.setMinimumSize(new Dimension(30, 30));
            W8.setFocusable(false);
            W8.setSelectionColor(new Color(214, 214, 214));
            whitePnl.add(W8, "cell 1 2");

            //---- W9 ----
            W9.setBackground(Color.white);
            W9.setMinimumSize(new Dimension(30, 30));
            W9.setFocusable(false);
            W9.setSelectionColor(new Color(214, 214, 214));
            whitePnl.add(W9, "cell 2 2");
        }
        contentPane.add(whitePnl, "cell 1 1");

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
            R1.setBackground(Color.red);
            R1.setMinimumSize(new Dimension(30, 30));
            R1.setFocusable(false);
            R1.setSelectionColor(new Color(214, 214, 214));
            redPnl.add(R1, "cell 0 0");

            //---- R2 ----
            R2.setBackground(Color.red);
            R2.setMinimumSize(new Dimension(30, 30));
            R2.setFocusable(false);
            R2.setSelectionColor(new Color(214, 214, 214));
            redPnl.add(R2, "cell 1 0");

            //---- R3 ----
            R3.setBackground(Color.red);
            R3.setMinimumSize(new Dimension(30, 30));
            R3.setFocusable(false);
            R3.setSelectionColor(new Color(214, 214, 214));
            redPnl.add(R3, "cell 2 0");

            //---- R4 ----
            R4.setBackground(Color.red);
            R4.setMinimumSize(new Dimension(30, 30));
            R4.setFocusable(false);
            R4.setSelectionColor(new Color(214, 214, 214));
            redPnl.add(R4, "cell 0 1");

            //---- redCenter ----
            redCenter.setBackground(Color.red);
            redCenter.setMinimumSize(new Dimension(30, 30));
            redCenter.setFocusable(false);
            redCenter.setSelectionColor(new Color(214, 214, 214));
            redPnl.add(redCenter, "cell 1 1");

            //---- R6 ----
            R6.setBackground(Color.red);
            R6.setMinimumSize(new Dimension(30, 30));
            R6.setFocusable(false);
            R6.setSelectionColor(new Color(214, 214, 214));
            redPnl.add(R6, "cell 2 1");

            //---- R7 ----
            R7.setBackground(Color.red);
            R7.setMinimumSize(new Dimension(30, 30));
            R7.setFocusable(false);
            R7.setSelectionColor(new Color(214, 214, 214));
            redPnl.add(R7, "cell 0 2");

            //---- R8 ----
            R8.setBackground(Color.red);
            R8.setMinimumSize(new Dimension(30, 30));
            R8.setFocusable(false);
            R8.setSelectionColor(new Color(214, 214, 214));
            redPnl.add(R8, "cell 1 2");

            //---- R9 ----
            R9.setBackground(Color.red);
            R9.setMinimumSize(new Dimension(30, 30));
            R9.setFocusable(false);
            R9.setSelectionColor(new Color(214, 214, 214));
            redPnl.add(R9, "cell 2 2");
        }
        contentPane.add(redPnl, "cell 2 1");

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
            Y1.setBackground(Color.yellow);
            Y1.setMinimumSize(new Dimension(30, 30));
            Y1.setFocusable(false);
            Y1.setSelectionColor(new Color(214, 214, 214));
            yellowPnl.add(Y1, "cell 0 0");

            //---- Y2 ----
            Y2.setBackground(Color.yellow);
            Y2.setMinimumSize(new Dimension(30, 30));
            Y2.setFocusable(false);
            Y2.setSelectionColor(new Color(214, 214, 214));
            yellowPnl.add(Y2, "cell 1 0");

            //---- Y3 ----
            Y3.setBackground(Color.yellow);
            Y3.setMinimumSize(new Dimension(30, 30));
            Y3.setFocusable(false);
            Y3.setSelectionColor(new Color(214, 214, 214));
            yellowPnl.add(Y3, "cell 2 0");

            //---- Y4 ----
            Y4.setBackground(Color.yellow);
            Y4.setMinimumSize(new Dimension(30, 30));
            Y4.setFocusable(false);
            Y4.setSelectionColor(new Color(214, 214, 214));
            yellowPnl.add(Y4, "cell 0 1");

            //---- yellowCenter ----
            yellowCenter.setBackground(Color.yellow);
            yellowCenter.setMinimumSize(new Dimension(30, 30));
            yellowCenter.setFocusable(false);
            yellowCenter.setSelectionColor(new Color(214, 214, 214));
            yellowPnl.add(yellowCenter, "cell 1 1");

            //---- Y6 ----
            Y6.setBackground(Color.yellow);
            Y6.setMinimumSize(new Dimension(30, 30));
            Y6.setFocusable(false);
            Y6.setSelectionColor(new Color(214, 214, 214));
            yellowPnl.add(Y6, "cell 2 1");

            //---- Y7 ----
            Y7.setBackground(Color.yellow);
            Y7.setMinimumSize(new Dimension(30, 30));
            Y7.setFocusable(false);
            Y7.setSelectionColor(new Color(214, 214, 214));
            yellowPnl.add(Y7, "cell 0 2");

            //---- Y8 ----
            Y8.setBackground(Color.yellow);
            Y8.setMinimumSize(new Dimension(30, 30));
            Y8.setFocusable(false);
            Y8.setSelectionColor(new Color(214, 214, 214));
            yellowPnl.add(Y8, "cell 1 2");

            //---- Y9 ----
            Y9.setBackground(Color.yellow);
            Y9.setMinimumSize(new Dimension(30, 30));
            Y9.setFocusable(false);
            Y9.setSelectionColor(new Color(214, 214, 214));
            yellowPnl.add(Y9, "cell 2 2");
        }
        contentPane.add(yellowPnl, "cell 3 1");

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
            G1.setBackground(Color.green);
            G1.setMinimumSize(new Dimension(30, 30));
            G1.setFocusable(false);
            G1.setSelectionColor(new Color(214, 214, 214));
            greenPnl.add(G1, "cell 0 0");

            //---- G2 ----
            G2.setBackground(Color.green);
            G2.setMinimumSize(new Dimension(30, 30));
            G2.setFocusable(false);
            G2.setSelectionColor(new Color(214, 214, 214));
            greenPnl.add(G2, "cell 1 0");

            //---- G3 ----
            G3.setBackground(Color.green);
            G3.setMinimumSize(new Dimension(30, 30));
            G3.setFocusable(false);
            G3.setSelectionColor(new Color(214, 214, 214));
            greenPnl.add(G3, "cell 2 0");

            //---- G4 ----
            G4.setBackground(Color.green);
            G4.setMinimumSize(new Dimension(30, 30));
            G4.setFocusable(false);
            G4.setSelectionColor(new Color(214, 214, 214));
            greenPnl.add(G4, "cell 0 1");

            //---- greenCenter ----
            greenCenter.setBackground(Color.green);
            greenCenter.setMinimumSize(new Dimension(30, 30));
            greenCenter.setFocusable(false);
            greenCenter.setSelectionColor(new Color(214, 214, 214));
            greenPnl.add(greenCenter, "cell 1 1");

            //---- G6 ----
            G6.setBackground(Color.green);
            G6.setMinimumSize(new Dimension(30, 30));
            G6.setFocusable(false);
            G6.setSelectionColor(new Color(214, 214, 214));
            greenPnl.add(G6, "cell 2 1");

            //---- G7 ----
            G7.setBackground(Color.green);
            G7.setMinimumSize(new Dimension(30, 30));
            G7.setFocusable(false);
            G7.setSelectionColor(new Color(214, 214, 214));
            greenPnl.add(G7, "cell 0 2");

            //---- G8 ----
            G8.setBackground(Color.green);
            G8.setMinimumSize(new Dimension(30, 30));
            G8.setFocusable(false);
            G8.setSelectionColor(new Color(214, 214, 214));
            greenPnl.add(G8, "cell 1 2");

            //---- G9 ----
            G9.setBackground(Color.green);
            G9.setMinimumSize(new Dimension(30, 30));
            G9.setFocusable(false);
            G9.setSelectionColor(new Color(214, 214, 214));
            greenPnl.add(G9, "cell 2 2");
        }
        contentPane.add(greenPnl, "cell 1 2");

        //======== solutionPnl ========
        {
            solutionPnl.setBorder(LineBorder.createBlackLineBorder());
            solutionPnl.setLayout(new MigLayout(
                    "fill,hidemode 3",
                    // columns
                    "[fill]" +
                            "[fill]",
                    // rows
                    "[]"));

            //---- solutionTxt ----
            solutionTxt.setText("Solution :");
            solutionTxt.setBorder(null);
            solutionPnl.add(solutionTxt, "cell 0 0,alignx center,growx 0");
        }
        contentPane.add(solutionPnl, "cell 0 3 5 1,align left center,grow 0 0");
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    public String[] getTab() {
        return tab;
    }

    public void setTab(String[] tab) {
        this.tab = tab;
    }

    public JPanel getBluePnl() {
        return bluePnl;
    }

    public void setBluePnl(JPanel bluePnl) {
        this.bluePnl = bluePnl;
    }

    public JTextField getB1() {
        return B1;
    }

    public void setB1(JTextField b1) {
        B1 = b1;
    }

    public JTextField getB2() {
        return B2;
    }

    public void setB2(JTextField b2) {
        B2 = b2;
    }

    public JTextField getB3() {
        return B3;
    }

    public void setB3(JTextField b3) {
        B3 = b3;
    }

    public JTextField getB4() {
        return B4;
    }

    public void setB4(JTextField b4) {
        B4 = b4;
    }

    public JTextField getBlueCenter() {
        return blueCenter;
    }

    public void setBlueCenter(JTextField blueCenter) {
        this.blueCenter = blueCenter;
    }

    public JTextField getB6() {
        return B6;
    }

    public void setB6(JTextField b6) {
        B6 = b6;
    }

    public JTextField getB7() {
        return B7;
    }

    public void setB7(JTextField b7) {
        B7 = b7;
    }

    public JTextField getB8() {
        return B8;
    }

    public void setB8(JTextField b8) {
        B8 = b8;
    }

    public JTextField getB9() {
        return B9;
    }

    public void setB9(JTextField b9) {
        B9 = b9;
    }

    public JPanel getActionsPnl() {
        return actionsPnl;
    }

    public void setActionsPnl(JPanel actionsPnl) {
        this.actionsPnl = actionsPnl;
    }

    public JTextField getActionsTextFld() {
        return actionsTextFld;
    }

    public void setActionsTextFld(JTextField actionsTextFld) {
        this.actionsTextFld = actionsTextFld;
    }

    public JButton getMixBtn() {
        return mixBtn;
    }

    public void setMixBtn(JButton mixBtn) {
        this.mixBtn = mixBtn;
    }

    public JButton getSolveBtn() {
        return solveBtn;
    }

    public void setSolveBtn(JButton solveBtn) {
        this.solveBtn = solveBtn;
    }

    public JButton getResetBtn() {
        return resetBtn;
    }

    public void setResetBtn(JButton resetBtn) {
        this.resetBtn = resetBtn;
    }

    public JButton getEditBtn() {
        return editBtn;
    }

    public void setEditBtn(JButton editBtn) {
        this.editBtn = editBtn;
    }

    public JPanel getOrangePnl() {
        return orangePnl;
    }

    public void setOrangePnl(JPanel orangePnl) {
        this.orangePnl = orangePnl;
    }

    public JTextField getO1() {
        return O1;
    }

    public void setO1(JTextField o1) {
        O1 = o1;
    }

    public JTextField getO2() {
        return O2;
    }

    public void setO2(JTextField o2) {
        O2 = o2;
    }

    public JTextField getO3() {
        return O3;
    }

    public void setO3(JTextField o3) {
        O3 = o3;
    }

    public JTextField getO4() {
        return O4;
    }

    public void setO4(JTextField o4) {
        O4 = o4;
    }

    public JTextField getOrangeCenter() {
        return orangeCenter;
    }

    public void setOrangeCenter(JTextField orangeCenter) {
        this.orangeCenter = orangeCenter;
    }

    public JTextField getO6() {
        return O6;
    }

    public void setO6(JTextField o6) {
        O6 = o6;
    }

    public JTextField getO7() {
        return O7;
    }

    public void setO7(JTextField o7) {
        O7 = o7;
    }

    public JTextField getO8() {
        return O8;
    }

    public void setO8(JTextField o8) {
        O8 = o8;
    }

    public JTextField getO9() {
        return O9;
    }

    public void setO9(JTextField o9) {
        O9 = o9;
    }

    public JPanel getWhitePnl() {
        return whitePnl;
    }

    public void setWhitePnl(JPanel whitePnl) {
        this.whitePnl = whitePnl;
    }

    public JTextField getW1() {
        return W1;
    }

    public void setW1(JTextField w1) {
        W1 = w1;
    }

    public JTextField getW2() {
        return W2;
    }

    public void setW2(JTextField w2) {
        W2 = w2;
    }

    public JTextField getW3() {
        return W3;
    }

    public void setW3(JTextField w3) {
        W3 = w3;
    }

    public JTextField getW4() {
        return W4;
    }

    public void setW4(JTextField w4) {
        W4 = w4;
    }

    public JTextField getWhiteCenter() {
        return whiteCenter;
    }

    public void setWhiteCenter(JTextField whiteCenter) {
        this.whiteCenter = whiteCenter;
    }

    public JTextField getW6() {
        return W6;
    }

    public void setW6(JTextField w6) {
        W6 = w6;
    }

    public JTextField getW7() {
        return W7;
    }

    public void setW7(JTextField w7) {
        W7 = w7;
    }

    public JTextField getW8() {
        return W8;
    }

    public void setW8(JTextField w8) {
        W8 = w8;
    }

    public JTextField getW9() {
        return W9;
    }

    public void setW9(JTextField w9) {
        W9 = w9;
    }

    public JPanel getRedPnl() {
        return redPnl;
    }

    public void setRedPnl(JPanel redPnl) {
        this.redPnl = redPnl;
    }

    public JTextField getR1() {
        return R1;
    }

    public void setR1(JTextField r1) {
        R1 = r1;
    }

    public JTextField getR2() {
        return R2;
    }

    public void setR2(JTextField r2) {
        R2 = r2;
    }

    public JTextField getR3() {
        return R3;
    }

    public void setR3(JTextField r3) {
        R3 = r3;
    }

    public JTextField getR4() {
        return R4;
    }

    public void setR4(JTextField r4) {
        R4 = r4;
    }

    public JTextField getRedCenter() {
        return redCenter;
    }

    public void setRedCenter(JTextField redCenter) {
        this.redCenter = redCenter;
    }

    public JTextField getR6() {
        return R6;
    }

    public void setR6(JTextField r6) {
        R6 = r6;
    }

    public JTextField getR7() {
        return R7;
    }

    public void setR7(JTextField r7) {
        R7 = r7;
    }

    public JTextField getR8() {
        return R8;
    }

    public void setR8(JTextField r8) {
        R8 = r8;
    }

    public JTextField getR9() {
        return R9;
    }

    public void setR9(JTextField r9) {
        R9 = r9;
    }

    public JPanel getYellowPnl() {
        return yellowPnl;
    }

    public void setYellowPnl(JPanel yellowPnl) {
        this.yellowPnl = yellowPnl;
    }

    public JTextField getY1() {
        return Y1;
    }

    public void setY1(JTextField y1) {
        Y1 = y1;
    }

    public JTextField getY2() {
        return Y2;
    }

    public void setY2(JTextField y2) {
        Y2 = y2;
    }

    public JTextField getY3() {
        return Y3;
    }

    public void setY3(JTextField y3) {
        Y3 = y3;
    }

    public JTextField getY4() {
        return Y4;
    }

    public void setY4(JTextField y4) {
        Y4 = y4;
    }

    public JTextField getYellowCenter() {
        return yellowCenter;
    }

    public void setYellowCenter(JTextField yellowCenter) {
        this.yellowCenter = yellowCenter;
    }

    public JTextField getY6() {
        return Y6;
    }

    public void setY6(JTextField y6) {
        Y6 = y6;
    }

    public JTextField getY7() {
        return Y7;
    }

    public void setY7(JTextField y7) {
        Y7 = y7;
    }

    public JTextField getY8() {
        return Y8;
    }

    public void setY8(JTextField y8) {
        Y8 = y8;
    }

    public JTextField getY9() {
        return Y9;
    }

    public void setY9(JTextField y9) {
        Y9 = y9;
    }

    public JPanel getGreenPnl() {
        return greenPnl;
    }

    public void setGreenPnl(JPanel greenPnl) {
        this.greenPnl = greenPnl;
    }

    public JTextField getG1() {
        return G1;
    }

    public void setG1(JTextField g1) {
        G1 = g1;
    }

    public JTextField getG2() {
        return G2;
    }

    public void setG2(JTextField g2) {
        G2 = g2;
    }

    public JTextField getG3() {
        return G3;
    }

    public void setG3(JTextField g3) {
        G3 = g3;
    }

    public JTextField getG4() {
        return G4;
    }

    public void setG4(JTextField g4) {
        G4 = g4;
    }

    public JTextField getGreenCenter() {
        return greenCenter;
    }

    public void setGreenCenter(JTextField greenCenter) {
        this.greenCenter = greenCenter;
    }

    public JTextField getG6() {
        return G6;
    }

    public void setG6(JTextField g6) {
        G6 = g6;
    }

    public JTextField getG7() {
        return G7;
    }

    public void setG7(JTextField g7) {
        G7 = g7;
    }

    public JTextField getG8() {
        return G8;
    }

    public void setG8(JTextField g8) {
        G8 = g8;
    }

    public JTextField getG9() {
        return G9;
    }

    public void setG9(JTextField g9) {
        G9 = g9;
    }

    public JPanel getSolutionPnl() {
        return solutionPnl;
    }

    public void setSolutionPnl(JPanel solutionPnl) {
        this.solutionPnl = solutionPnl;
    }

    public JTextField getSolutionTxt() {
        return solutionTxt;
    }

    public void setSolutionTxt(JTextField solutionTxt) {
        this.solutionTxt = solutionTxt;
    }
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
