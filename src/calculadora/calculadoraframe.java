/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculadora;

import java.awt.Color;

/**
 *
 * @author USUARIO
 */
public class calculadoraframe extends javax.swing.JFrame {
    
    Double memoria1=0.0;
    Double memoria2=0.0;
    Double resultado;
    int contador=0;
    Double acum=0.0;
    String num1;
    String num2;
    String signo;
    Boolean apagar=false;
    Boolean prender;
    Boolean e=false;
    String cadena;
    Boolean entero=false;
   
    public calculadoraframe() {
        
        
        initComponents();
        txtPantalla1.setText("");
        this.setLocationRelativeTo(null);
        mem.setVisible(false);
        error.setVisible(false);
        comilla1.setVisible(false);
        comilla2.setVisible(false);
        nega.setVisible(false);
        txtPantalla2.setVisible(false);
        txtPantalla3.setVisible(false);
    }


   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonMC = new javax.swing.JButton();
        ButtonPorcentaje = new javax.swing.JButton();
        ButtonMasyMenos = new javax.swing.JButton();
        ButtonBorrar = new javax.swing.JButton();
        ButtonBorrarTdo = new javax.swing.JButton();
        Button0 = new javax.swing.JButton();
        ButtonMR = new javax.swing.JButton();
        Button7 = new javax.swing.JButton();
        Button4 = new javax.swing.JButton();
        Button1 = new javax.swing.JButton();
        ButtonMmenos = new javax.swing.JButton();
        Button8 = new javax.swing.JButton();
        Button5 = new javax.swing.JButton();
        Button2 = new javax.swing.JButton();
        ButtonPunto = new javax.swing.JButton();
        ButtonMmas = new javax.swing.JButton();
        Button9 = new javax.swing.JButton();
        Button6 = new javax.swing.JButton();
        Button3 = new javax.swing.JButton();
        ButtonIgual = new javax.swing.JButton();
        ButtonDivi = new javax.swing.JButton();
        ButtonMulti = new javax.swing.JButton();
        ButtonMenos = new javax.swing.JButton();
        ButtonMas = new javax.swing.JButton();
        ButtonRaiz = new javax.swing.JButton();
        ButtonOFF = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        nega = new javax.swing.JLabel();
        comilla2 = new javax.swing.JLabel();
        comilla1 = new javax.swing.JLabel();
        mem = new javax.swing.JTextField();
        error = new javax.swing.JTextField();
        txtPantalla2 = new javax.swing.JLabel();
        txtPantalla1 = new javax.swing.JTextField();
        txtPantalla3 = new javax.swing.JTextField();
        txtPantalla = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ButtonMC.setBackground(new java.awt.Color(0, 0, 0));
        ButtonMC.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ButtonMC.setForeground(new java.awt.Color(255, 255, 255));
        ButtonMC.setText("MC");
        ButtonMC.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ButtonMC.setBorderPainted(false);
        ButtonMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMCActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonMC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 275, 55, 50));

        ButtonPorcentaje.setBackground(new java.awt.Color(0, 0, 0));
        ButtonPorcentaje.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ButtonPorcentaje.setForeground(new java.awt.Color(255, 255, 255));
        ButtonPorcentaje.setText("%");
        ButtonPorcentaje.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonPorcentaje.setBorderPainted(false);
        ButtonPorcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPorcentajeActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonPorcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 55, 50));

        ButtonMasyMenos.setBackground(new java.awt.Color(0, 0, 0));
        ButtonMasyMenos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ButtonMasyMenos.setForeground(new java.awt.Color(255, 255, 255));
        ButtonMasyMenos.setText("+/-");
        ButtonMasyMenos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonMasyMenos.setBorderPainted(false);
        ButtonMasyMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMasyMenosActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonMasyMenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 385, 55, 50));

        ButtonBorrar.setBackground(new java.awt.Color(153, 73, 94));
        ButtonBorrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ButtonBorrar.setForeground(new java.awt.Color(255, 255, 255));
        ButtonBorrar.setText("C");
        ButtonBorrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonBorrar.setBorderPainted(false);
        ButtonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 55, 50));

        ButtonBorrarTdo.setBackground(new java.awt.Color(153, 73, 94));
        ButtonBorrarTdo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ButtonBorrarTdo.setForeground(new java.awt.Color(255, 255, 255));
        ButtonBorrarTdo.setText("AC");
        ButtonBorrarTdo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonBorrarTdo.setBorderPainted(false);
        ButtonBorrarTdo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBorrarTdoActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonBorrarTdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 495, 55, 50));

        Button0.setBackground(new java.awt.Color(0, 0, 0));
        Button0.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Button0.setForeground(new java.awt.Color(255, 255, 255));
        Button0.setText("0");
        Button0.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button0.setBorderPainted(false);
        Button0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button0ActionPerformed(evt);
            }
        });
        getContentPane().add(Button0, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 495, 55, 50));

        ButtonMR.setBackground(new java.awt.Color(0, 0, 0));
        ButtonMR.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ButtonMR.setForeground(new java.awt.Color(255, 255, 255));
        ButtonMR.setText("MR");
        ButtonMR.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ButtonMR.setBorderPainted(false);
        ButtonMR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMRActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonMR, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 275, 55, 50));

        Button7.setBackground(new java.awt.Color(0, 0, 0));
        Button7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Button7.setForeground(new java.awt.Color(255, 255, 255));
        Button7.setText("7");
        Button7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button7.setBorderPainted(false);
        Button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button7ActionPerformed(evt);
            }
        });
        getContentPane().add(Button7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 55, 50));

        Button4.setBackground(new java.awt.Color(0, 0, 0));
        Button4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Button4.setForeground(new java.awt.Color(255, 255, 255));
        Button4.setText("4");
        Button4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button4.setBorderPainted(false);
        Button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button4ActionPerformed(evt);
            }
        });
        getContentPane().add(Button4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 385, 55, 50));

        Button1.setBackground(new java.awt.Color(0, 0, 0));
        Button1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Button1.setForeground(new java.awt.Color(255, 255, 255));
        Button1.setText("1");
        Button1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button1.setBorderPainted(false);
        Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1ActionPerformed(evt);
            }
        });
        getContentPane().add(Button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 55, 50));

        ButtonMmenos.setBackground(new java.awt.Color(0, 0, 0));
        ButtonMmenos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ButtonMmenos.setForeground(new java.awt.Color(255, 255, 255));
        ButtonMmenos.setText("M-");
        ButtonMmenos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ButtonMmenos.setBorderPainted(false);
        ButtonMmenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMmenosActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonMmenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 275, 55, 50));

        Button8.setBackground(new java.awt.Color(0, 0, 0));
        Button8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Button8.setForeground(new java.awt.Color(255, 255, 255));
        Button8.setText("8");
        Button8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button8.setBorderPainted(false);
        Button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button8ActionPerformed(evt);
            }
        });
        getContentPane().add(Button8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 55, 50));

        Button5.setBackground(new java.awt.Color(0, 0, 0));
        Button5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Button5.setForeground(new java.awt.Color(255, 255, 255));
        Button5.setText("5");
        Button5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button5.setBorderPainted(false);
        Button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button5ActionPerformed(evt);
            }
        });
        getContentPane().add(Button5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 385, 55, 50));

        Button2.setBackground(new java.awt.Color(0, 0, 0));
        Button2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Button2.setForeground(new java.awt.Color(255, 255, 255));
        Button2.setText("2");
        Button2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button2.setBorderPainted(false);
        Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button2ActionPerformed(evt);
            }
        });
        getContentPane().add(Button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, 55, 50));

        ButtonPunto.setBackground(new java.awt.Color(0, 0, 0));
        ButtonPunto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ButtonPunto.setForeground(new java.awt.Color(255, 255, 255));
        ButtonPunto.setText(".");
        ButtonPunto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonPunto.setBorderPainted(false);
        ButtonPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPuntoActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonPunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 495, 55, 50));

        ButtonMmas.setBackground(new java.awt.Color(0, 0, 0));
        ButtonMmas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ButtonMmas.setForeground(new java.awt.Color(255, 255, 255));
        ButtonMmas.setText("M+");
        ButtonMmas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ButtonMmas.setBorderPainted(false);
        ButtonMmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMmasActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonMmas, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 275, 55, 50));

        Button9.setBackground(new java.awt.Color(0, 0, 0));
        Button9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Button9.setForeground(new java.awt.Color(255, 255, 255));
        Button9.setText("9");
        Button9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button9.setBorderPainted(false);
        Button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button9ActionPerformed(evt);
            }
        });
        getContentPane().add(Button9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 55, 50));

        Button6.setBackground(new java.awt.Color(0, 0, 0));
        Button6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Button6.setForeground(new java.awt.Color(255, 255, 255));
        Button6.setText("6");
        Button6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button6.setBorderPainted(false);
        Button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button6ActionPerformed(evt);
            }
        });
        getContentPane().add(Button6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 385, 55, 50));

        Button3.setBackground(new java.awt.Color(0, 0, 0));
        Button3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Button3.setForeground(new java.awt.Color(255, 255, 255));
        Button3.setText("3");
        Button3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Button3.setBorderPainted(false);
        Button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button3ActionPerformed(evt);
            }
        });
        getContentPane().add(Button3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, 55, 50));

        ButtonIgual.setBackground(new java.awt.Color(0, 0, 0));
        ButtonIgual.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ButtonIgual.setForeground(new java.awt.Color(255, 255, 255));
        ButtonIgual.setText("=");
        ButtonIgual.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonIgual.setBorderPainted(false);
        ButtonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonIgualActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonIgual, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 495, 55, 50));

        ButtonDivi.setBackground(new java.awt.Color(0, 0, 0));
        ButtonDivi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ButtonDivi.setForeground(new java.awt.Color(255, 255, 255));
        ButtonDivi.setText("÷");
        ButtonDivi.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ButtonDivi.setBorderPainted(false);
        ButtonDivi.setMaximumSize(new java.awt.Dimension(55, 55));
        ButtonDivi.setMinimumSize(null);
        ButtonDivi.setName(""); // NOI18N
        ButtonDivi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDiviActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonDivi, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 275, 55, 50));

        ButtonMulti.setBackground(new java.awt.Color(0, 0, 0));
        ButtonMulti.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ButtonMulti.setForeground(new java.awt.Color(255, 255, 255));
        ButtonMulti.setText("x");
        ButtonMulti.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonMulti.setBorderPainted(false);
        ButtonMulti.setMaximumSize(new java.awt.Dimension(55, 55));
        ButtonMulti.setMinimumSize(null);
        ButtonMulti.setName(""); // NOI18N
        ButtonMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMultiActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonMulti, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 55, 50));

        ButtonMenos.setBackground(new java.awt.Color(0, 0, 0));
        ButtonMenos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ButtonMenos.setForeground(new java.awt.Color(255, 255, 255));
        ButtonMenos.setText("-");
        ButtonMenos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonMenos.setBorderPainted(false);
        ButtonMenos.setMaximumSize(new java.awt.Dimension(55, 55));
        ButtonMenos.setMinimumSize(null);
        ButtonMenos.setName(""); // NOI18N
        ButtonMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMenosActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonMenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 385, 55, 50));

        ButtonMas.setBackground(new java.awt.Color(0, 0, 0));
        ButtonMas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ButtonMas.setForeground(new java.awt.Color(255, 255, 255));
        ButtonMas.setText("+");
        ButtonMas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButtonMas.setBorderPainted(false);
        ButtonMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMasActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonMas, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, 55, 105));

        ButtonRaiz.setBackground(new java.awt.Color(0, 0, 0));
        ButtonRaiz.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ButtonRaiz.setForeground(new java.awt.Color(255, 255, 255));
        ButtonRaiz.setText("√");
        ButtonRaiz.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.pink, java.awt.Color.red, java.awt.Color.red, java.awt.Color.white));
        ButtonRaiz.setBorderPainted(false);
        ButtonRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRaizActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonRaiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 55, 50));

        ButtonOFF.setBackground(new java.awt.Color(0, 0, 0));
        ButtonOFF.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ButtonOFF.setForeground(new java.awt.Color(255, 255, 255));
        ButtonOFF.setText("OFF");
        ButtonOFF.setToolTipText("");
        ButtonOFF.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ButtonOFF.setBorderPainted(false);
        ButtonOFF.setMaximumSize(new java.awt.Dimension(55, 55));
        ButtonOFF.setMinimumSize(null);
        ButtonOFF.setName(""); // NOI18N
        ButtonOFF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonOFFActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonOFF, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 55, 50));

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(213, 214, 219));
        jTextField4.setText("ON");
        jTextField4.setBorder(null);
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 540, 90, 20));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(213, 214, 219));
        jTextField1.setText("SL - 300SV");
        jTextField1.setBorder(null);
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 90, 20));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(213, 214, 218));
        jTextField2.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        jTextField2.setText("CASIO");
        jTextField2.setBorder(null);
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 99, 30));

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(199, 201, 205));
        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jTextField3.setText("TWO WAY POWER");
        jTextField3.setBorder(null);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 91, 16));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        jPanel3.setToolTipText("");
        jPanel3.setPreferredSize(new java.awt.Dimension(120, 40));

        jPanel7.setBackground(new java.awt.Color(168, 140, 118));
        jPanel7.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel7.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        jPanel7.setToolTipText("");
        jPanel7.setPreferredSize(new java.awt.Dimension(100, 20));

        jPanel8.setBackground(new java.awt.Color(153, 153, 153));
        jPanel8.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel8.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        jPanel8.setToolTipText("");
        jPanel8.setPreferredSize(new java.awt.Dimension(100, 20));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel19.setBackground(new java.awt.Color(153, 153, 153));
        jPanel19.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel19.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        jPanel19.setToolTipText("");
        jPanel19.setPreferredSize(new java.awt.Dimension(100, 20));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        jPanel21.setBackground(new java.awt.Color(153, 153, 153));
        jPanel21.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel21.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        jPanel21.setToolTipText("");
        jPanel21.setPreferredSize(new java.awt.Dimension(100, 20));

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 8, Short.MAX_VALUE)
            .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, 8, Short.MAX_VALUE)
            .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, 8, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 124, -1));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/image calculadora.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(103, 106, 110));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setForeground(new java.awt.Color(102, 102, 102));
        jPanel2.setToolTipText("");
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nega.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/image (5).png"))); // NOI18N
        jPanel2.add(nega, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 50, -1, -1));

        comilla2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/image (2).png"))); // NOI18N
        jPanel2.add(comilla2, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 29, -1, -1));

        comilla1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/image (2).png"))); // NOI18N
        jPanel2.add(comilla1, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 29, -1, -1));

        mem.setEditable(false);
        mem.setBackground(new java.awt.Color(209, 230, 231));
        mem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mem.setText("M");
        mem.setBorder(null);
        mem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memActionPerformed(evt);
            }
        });
        jPanel2.add(mem, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        error.setEditable(false);
        error.setBackground(new java.awt.Color(209, 230, 231));
        error.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        error.setText("E");
        error.setBorder(null);
        error.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                errorActionPerformed(evt);
            }
        });
        jPanel2.add(error, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 10, -1));

        txtPantalla2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/punto 2.png"))); // NOI18N
        jPanel2.add(txtPantalla2, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 52, 10, 40));

        txtPantalla1.setEditable(false);
        txtPantalla1.setBackground(new java.awt.Color(136, 131, 109));
        txtPantalla1.setColumns(1);
        txtPantalla1.setFont(new java.awt.Font("OPTICalculator", 0, 52)); // NOI18N
        txtPantalla1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPantalla1.setText("87654312");
        txtPantalla1.setToolTipText("");
        txtPantalla1.setBorder(null);
        txtPantalla1.setDoubleBuffered(true);
        txtPantalla1.setDragEnabled(true);
        txtPantalla1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPantalla1ActionPerformed(evt);
            }
        });
        jPanel2.add(txtPantalla1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 295, 100));
        txtPantalla1.getAccessibleContext().setAccessibleName("");

        txtPantalla3.setEditable(false);
        txtPantalla3.setBackground(new java.awt.Color(136, 131, 109));
        txtPantalla3.setColumns(1);
        txtPantalla3.setFont(new java.awt.Font("OPTICalculator", 0, 20)); // NOI18N
        txtPantalla3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPantalla3.setText("Error no se puede operar");
        txtPantalla3.setToolTipText("");
        txtPantalla3.setBorder(null);
        txtPantalla3.setDoubleBuffered(true);
        txtPantalla3.setDragEnabled(true);
        txtPantalla3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPantalla3ActionPerformed(evt);
            }
        });
        jPanel2.add(txtPantalla3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 295, 100));

        txtPantalla.setEditable(false);
        txtPantalla.setBackground(new java.awt.Color(136, 131, 109));
        txtPantalla.setColumns(1);
        txtPantalla.setFont(new java.awt.Font("OPTICalculator", 0, 52)); // NOI18N
        txtPantalla.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPantalla.setToolTipText("");
        txtPantalla.setBorder(null);
        txtPantalla.setDoubleBuffered(true);
        txtPantalla.setDragEnabled(true);
        txtPantalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPantallaActionPerformed(evt);
            }
        });
        jPanel2.add(txtPantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 295, 100));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 320, 120));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed

    }//GEN-LAST:event_jTextField3ActionPerformed

    private void txtPantallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPantallaActionPerformed

    }//GEN-LAST:event_txtPantallaActionPerformed

    private void txtPantalla1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPantalla1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPantalla1ActionPerformed

    private void errorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_errorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_errorActionPerformed

    private void memActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memActionPerformed

    }//GEN-LAST:event_memActionPerformed

    private void ButtonOFFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonOFFActionPerformed
        txtPantalla1.setVisible(false);
        txtPantalla2.setVisible(false);
        txtPantalla.setBackground(new Color(136, 131, 109));
        mem.setVisible(false);

        txtPantalla.setText("");
        Double memoria1 = 0.0;
        Double memoria2 = 0.0;
        Double acum = 0.0;
        prender = false;
        apagar = true;
        reiniciar();
    }//GEN-LAST:event_ButtonOFFActionPerformed

    private void ButtonRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRaizActionPerformed
        txtPantalla.setText("√");
        Double op = 0.0;

        num1 = txtPantalla.getText();
        txtPantalla.setText(" ");
        op = Math.sqrt(Double.parseDouble(num1));

        if (op%1==0) {
            txtPantalla.setText(""+sincero(op));
        } else{
            txtPantalla.setText("");
            txtPantalla.setText(String.format("%.7f", op));
        }

    }//GEN-LAST:event_ButtonRaizActionPerformed

    private void ButtonMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMasActionPerformed
       
        num1 = txtPantalla.getText();
        acum = acum + Double.parseDouble(num1);
        signo = "+";
        reiniciar();
        txtPantalla.setText("");

    }//GEN-LAST:event_ButtonMasActionPerformed

    private void ButtonMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMenosActionPerformed
        // TODO add your handling code here:

        num1 = txtPantalla.getText();
        if (acum==0) {
            acum=acum+Double.parseDouble(num1);
        } else {
            acum = acum - Double.parseDouble(num1);
        }
        signo = "-";
        reiniciar();
        
        txtPantalla.setText("");
    }//GEN-LAST:event_ButtonMenosActionPerformed

    private void ButtonMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMultiActionPerformed

        num1 = txtPantalla.getText();

        if (acum==0) {
            acum=acum+Double.parseDouble(num1);
        } else {
            acum = acum * Double.parseDouble(num1);
        }
        signo = "*";
        reiniciar();
        comprobar1(acum);
        txtPantalla.setText("");
    }//GEN-LAST:event_ButtonMultiActionPerformed

    private void ButtonDiviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDiviActionPerformed
        // TODO add your handling code here:
        num1 = txtPantalla.getText();
        if (acum == 0) {
            acum = acum + Double.parseDouble(num1);
        } else {
            acum = acum / Double.parseDouble(num1);
        }
        signo = "/";
        reiniciar();
        comprobar1(acum);
        txtPantalla.setText("");
    }//GEN-LAST:event_ButtonDiviActionPerformed

    private void ButtonIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonIgualActionPerformed

        var s = new Suma();
        var r = new Resta();
        var m = new Multipli();
        var d = new Divi();
        
        Double op = 0.0, t;
        int R=1;
        comprobar1(acum);
        num2 = txtPantalla.getText();
        comprobar2(Double.parseDouble(num2));

        switch (signo) {
            case "+":

                op = s.ver(acum, Double.parseDouble(num2));
                if (op < 0) {
                    nega.setVisible(true);
                    negativo(op);
                } else if (op >=0) {
                    positivo();
                    txtPantalla.setText(""+sincero(op));
                }

                acum = 0.0;
                cadena();
                negativo(op);
                break;
            case "-":

                op = r.ver(acum, Double.parseDouble(num2));
                if (op < 0) {
                    nega.setVisible(true);
                    negativo(op);
                } else if (op >=0) {
                    positivo();
                    txtPantalla.setText(sincero(op));
                }
                acum = 0.0;
                cadena();
                break;
            case "*":

                op = m.ver(acum, Double.parseDouble(num2));
                if (op < 0) {
                    nega.setVisible(true);
                    negativo(op);
                } else if (op >=0) {
                    positivo();
                    txtPantalla.setText(sincero(op));
                }
                acum = 0.0;
                cadena();
                break;
            case "/":
                op = d.ver(acum, Double.parseDouble(num2));

                if (op < 0) {
                    nega.setVisible(true);
                    negativo(op);
                } else if (op >=0) {
                    positivo();
                    txtPantalla.setText(sincero(op));
                }

                acum = 0.0;
                cadena();
                acum = 0.0;
                cadena();
                break;

        }
    }//GEN-LAST:event_ButtonIgualActionPerformed

    private void Button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button3ActionPerformed

        if (apagar==true) {
            txtPantalla.setText(txtPantalla.getText()+"");
        }
        if (prender == true) {
            txtPantalla1.setVisible(false);
            if (e == false) {
                txtPantalla.setText(txtPantalla.getText() + "3");

            }
            if (e == true) {
                txtPantalla.setText(txtPantalla.getText() + "");
            }
            cadena();
        }
    }//GEN-LAST:event_Button3ActionPerformed

    private void Button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button6ActionPerformed
        if (apagar==true) {
            txtPantalla.setText(txtPantalla.getText() + "");
        }
        if (prender == true) {
            txtPantalla1.setVisible(false);
            if (e == false) {
                txtPantalla.setText(txtPantalla.getText() + "6");

            }
            if (e == true) {
                txtPantalla.setText(txtPantalla.getText() + "");
            }
            cadena();
        }
    }//GEN-LAST:event_Button6ActionPerformed

    private void Button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button9ActionPerformed
        if (apagar==true) {
            txtPantalla.setText(txtPantalla.getText()+"");
        }
        if (prender == true) {
            txtPantalla1.setVisible(false);
            if (e == false) {
                txtPantalla.setText(txtPantalla.getText() + "9");

            }
            if (e == true) {
                txtPantalla.setText(txtPantalla.getText() + "");
            }
            cadena();
        }
    }//GEN-LAST:event_Button9ActionPerformed

    private void ButtonMmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMmasActionPerformed

        num1 = txtPantalla.getText();
        memoria1 = memoria1 + Double.parseDouble(num1);
        txtPantalla.setText(sincero(Double.parseDouble(num1)));
        
       
        cadena();
        mem.setVisible(true);//hacer visible el signo de memoria en la ´pantalla

    }//GEN-LAST:event_ButtonMmasActionPerformed

    private void ButtonPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPuntoActionPerformed
        // TODO add your handling code here:
        String cadena;
        cadena=txtPantalla.getText();
        if (cadena.length() <= 0) {
            if (apagar == true) {
                txtPantalla.setText(txtPantalla.getText() + "");
            } else if (prender == true) {

                txtPantalla.setText(txtPantalla.getText() + "0.");
            }
        }
        else{
            if (!exsistepunto(txtPantalla.getText())) {
                txtPantalla.setText((txtPantalla.getText()+"."));
            }
        }
    }//GEN-LAST:event_ButtonPuntoActionPerformed

    private void Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button2ActionPerformed

        if (apagar == true) {
            txtPantalla.setText(txtPantalla.getText()+"");
        }
        if (prender == true) {
            txtPantalla1.setVisible(false);
            if (e == false) {
                txtPantalla.setText(txtPantalla.getText() + "2");

            }
            if (e == true) {
                txtPantalla.setText(txtPantalla.getText() + "");
            }
            cadena();
        }

    }//GEN-LAST:event_Button2ActionPerformed

    private void Button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button5ActionPerformed
        if (apagar==true) {
            txtPantalla.setText(txtPantalla.getText()+"");
        }
        if (prender == true) {
            txtPantalla1.setVisible(false);
            if (e == false) {
                txtPantalla.setText(txtPantalla.getText() + "5");

            }
            if (e == true) {
                txtPantalla.setText(txtPantalla.getText() + "");
            }
            cadena();
        }
    }//GEN-LAST:event_Button5ActionPerformed

    private void Button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button8ActionPerformed
        if (apagar==true) {
            txtPantalla.setText(txtPantalla.getText()+"");
        }
        if (prender == true) {
            txtPantalla1.setVisible(false);
            if (e == false) {
                txtPantalla.setText(txtPantalla.getText() + "8");

            }
            if (e == true) {
                txtPantalla.setText(txtPantalla.getText() + "");
            }
            cadena();
        }
    }//GEN-LAST:event_Button8ActionPerformed

    private void ButtonMmenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMmenosActionPerformed
        var r = new Resta();
        double memo;
        num1 = txtPantalla.getText();

        if (memoria2==0.0) {
            memoria2=(memoria2)+(Double.parseDouble(num1));
        }
        else{
            memoria2 = r.ver(memoria2, -(Double.parseDouble(num1)));
        }
        
        txtPantalla.setText(sincero(Double.parseDouble(num1)));
        
         cadena();
         mem.setVisible(true);//hacer visible el signo de memoria en la ´pantalla

    }//GEN-LAST:event_ButtonMmenosActionPerformed

    private void Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button1ActionPerformed

        if (apagar == true) {
            txtPantalla.setText(txtPantalla.getText() + "");
        }
        if (prender == true) {
            txtPantalla1.setVisible(false);
            if (e == false) {
                txtPantalla.setText(txtPantalla.getText() + "1");

            }
            if (e == true) {
                txtPantalla.setText(txtPantalla.getText() + "");
            }
            cadena();
        }

    }//GEN-LAST:event_Button1ActionPerformed

    private void Button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button4ActionPerformed
        if (apagar==true) {
            txtPantalla.setText(txtPantalla.getText()+"");
        }
        if (prender == true) {
            txtPantalla1.setVisible(false);
            if (e == false) {
                txtPantalla.setText(txtPantalla.getText() + "4");

            }
            if (e == true) {
                txtPantalla.setText(txtPantalla.getText() + "");
            }
            cadena();
        }
    }//GEN-LAST:event_Button4ActionPerformed

    private void Button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button7ActionPerformed
        // TODO add your handling code here:
        if (apagar==true) {
            txtPantalla.setText(txtPantalla.getText()+"");
        }
        if (prender == true) {
            txtPantalla1.setVisible(false);
            if (e == false) {
                txtPantalla.setText(txtPantalla.getText() + "7");

            }
            if (e == true) {
                txtPantalla.setText(txtPantalla.getText() + "");
            }
            cadena();
        }
    }//GEN-LAST:event_Button7ActionPerformed

    private void ButtonMRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMRActionPerformed
     
        double r=0;

        resultado = memoria1 - (memoria2);
        
        if (resultado < 0) {
            nega.setVisible(true);
            negativo(resultado);
            
            
        } else if (resultado > 0) {
            positivo();
            txtPantalla.setText(sincero(resultado));
        }
        
        
        txtPantalla1.setVisible(false);
        cadena();
        

    }//GEN-LAST:event_ButtonMRActionPerformed

    private void Button0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button0ActionPerformed
        // TODO add your handling code here:
        if (apagar==true) {
            txtPantalla.setText(txtPantalla.getText()+"");
        }
        if (prender == true) {
            txtPantalla1.setVisible(false);
            if (e == false) {
                txtPantalla.setText(txtPantalla.getText() + "0");

            }
            if (e == true) {
                txtPantalla.setText(txtPantalla.getText() + "");
            }
            cadena();
        }

    }//GEN-LAST:event_Button0ActionPerformed

    private void ButtonBorrarTdoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBorrarTdoActionPerformed
        txtPantalla1.setText("0.");
        txtPantalla.setBackground(new Color(209, 230, 231));
        txtPantalla1.setBackground(new Color(209, 230, 231));
        txtPantalla2.setBackground(new Color(209, 230, 231));

        //
        txtPantalla.setText("");
        acum = 0.0;
        contador = 0;
        prender = true;
        txtPantalla1.setVisible(true);
        txtPantalla2.setVisible(false);
        reiniciar();
        e=false;
        
        entero=false;
    }//GEN-LAST:event_ButtonBorrarTdoActionPerformed

    private void ButtonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBorrarActionPerformed

        String cadena;
        cadena=txtPantalla.getText();
        if (cadena.length()>0) {
            cadena=cadena.substring(0, cadena.length()-1);
            txtPantalla.setText(cadena);
        }
        cadenainver();
    }//GEN-LAST:event_ButtonBorrarActionPerformed

    private void ButtonMasyMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMasyMenosActionPerformed

        Double num;
        String cadena;

        cadena=txtPantalla.getText();
        
        if (cadena.length() > 0) {
            num = (-1) * Double.parseDouble(cadena);
            nega.setVisible(true);
            txtPantalla.setText(sincero(num));
            Double opera = 0.0;
            Double valor;
            valor = num;
            txtPantalla.setText("" + sincero(valor));

            opera = num * -1;
            txtPantalla1.setVisible(true);
            txtPantalla1.setText("" + sincero(opera));
        }

        
    }//GEN-LAST:event_ButtonMasyMenosActionPerformed
public  void negativo(Double numero){
    txtPantalla1.setText("");
   
    if (numero < 0) {
        Double opera = 0.0;
        Double valor;
        valor = numero;
        txtPantalla.setText("" + sincero(valor));

        opera = numero * -1;
        
    txtPantalla1.setVisible(true);
        txtPantalla1.setText("" + sincero(opera));
    }
    
}

public void positivo(){
    txtPantalla1.setVisible(false);
    nega.setVisible(false);
}
    private void ButtonPorcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPorcentajeActionPerformed

        Double r = 0.0;

        num1 = txtPantalla.getText();
        r = (Double.parseDouble(num1) / 100);
        txtPantalla.setText(r.toString());

    }//GEN-LAST:event_ButtonPorcentajeActionPerformed

    private void ButtonMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMCActionPerformed
        memoria1=0.0;
        memoria2=0.0;
        mem.setVisible(false);
        nega.setVisible(false);
    }//GEN-LAST:event_ButtonMCActionPerformed

    private void txtPantalla3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPantalla3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPantalla3ActionPerformed
    public void cadenainver() {
        cadena = txtPantalla.getText();
        if (cadena.length() < 4) {
            comilla2.setVisible(false);
        }
        if (cadena.length() < 7) {
            comilla1.setVisible(false);
        }

    }

    public void reiniciar() {
        comilla1.setVisible(false);
        comilla2.setVisible(false);
        error.setVisible(false);
        nega.setVisible(false);
    }

    public void cadena() {
        cadena = txtPantalla.getText();
        
        if (!exsistepunto(txtPantalla.getText())) {
            if (cadena.length() > 3) {
                comilla2.setVisible(true);
            }
            if (cadena.length() > 6) {
                comilla1.setVisible(true);
            }
        }
        if (exsistepunto(txtPantalla.getText())) {
            reiniciar();
        }
        if (cadena.length() >7) {
            error.setVisible(true);
            e = true;
        }
        if (exsistepunto(txtPantalla.getText())) {
            txtPantalla2.setVisible(false);
        } else{
            txtPantalla2.setVisible(true);
        }
    }
    public static boolean exsistepunto (String cadena){
        boolean resultado;
        resultado=false;
        
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.substring(i, i+1).equals(".")) {
                resultado=true;
                break;
            }
        }
        return resultado;
    }
    
    
    public void comprobar1(Double r){
    String respuesta="";
        
        //respuesta=Double.toString(r);
        if (r%1==0) {
            entero=true;
            r=Double.parseDouble(acum.toString());
        }
        
}
      public void comprobar2(Double r){
    String respuesta="";
        
       // respuesta=Double.toString(r);
        if (r%1==0) {
            entero=true;
            r=Double.parseDouble(num2);
        }
        
}
    public static boolean exsistecero(String cadena) {
        boolean resultado;
        resultado = false;

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.substring(i, i + 1).equals("0.")) {
                resultado = true;
                break;
            }
        }
        return resultado;
    }
    public String sincero (Double resultado){
        String respuesta="";
        
        respuesta=Double.toString(resultado);
        if (resultado%1==0) {
            respuesta=respuesta.substring(0, respuesta.length()-2);
            
        }
        return respuesta;
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(calculadoraframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculadoraframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculadoraframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculadoraframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    
        //</editor-fold>
    
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculadoraframe().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button0;
    private javax.swing.JButton Button1;
    private javax.swing.JButton Button2;
    private javax.swing.JButton Button3;
    private javax.swing.JButton Button4;
    private javax.swing.JButton Button5;
    private javax.swing.JButton Button6;
    private javax.swing.JButton Button7;
    private javax.swing.JButton Button8;
    private javax.swing.JButton Button9;
    private javax.swing.JButton ButtonBorrar;
    private javax.swing.JButton ButtonBorrarTdo;
    private javax.swing.JButton ButtonDivi;
    private javax.swing.JButton ButtonIgual;
    private javax.swing.JButton ButtonMC;
    private javax.swing.JButton ButtonMR;
    private javax.swing.JButton ButtonMas;
    private javax.swing.JButton ButtonMasyMenos;
    private javax.swing.JButton ButtonMenos;
    private javax.swing.JButton ButtonMmas;
    private javax.swing.JButton ButtonMmenos;
    private javax.swing.JButton ButtonMulti;
    private javax.swing.JButton ButtonOFF;
    private javax.swing.JButton ButtonPorcentaje;
    private javax.swing.JButton ButtonPunto;
    private javax.swing.JButton ButtonRaiz;
    private javax.swing.JLabel comilla1;
    private javax.swing.JLabel comilla2;
    private javax.swing.JTextField error;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField mem;
    private javax.swing.JLabel nega;
    private javax.swing.JTextField txtPantalla;
    private javax.swing.JTextField txtPantalla1;
    private javax.swing.JLabel txtPantalla2;
    private javax.swing.JTextField txtPantalla3;
    // End of variables declaration//GEN-END:variables
}
