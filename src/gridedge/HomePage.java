/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gridedge;
import gridedge.BatteryUnit;
import java.awt.Color;
/**
 *
 * @author jakechoward
 */
public class HomePage extends javax.swing.JFrame {

    BatteryUnit Battery1 = new BatteryUnit(500, 30, 54, 433, 20, 4, 22, 20, 0);
    BatteryUnit Battery2 = new BatteryUnit(232, 422, 432, 3322, 5999, 322, 55, 100, 1);
    BatteryUnit Battery3 = new BatteryUnit(33, 25, 25, 232, 322, 134, 523, 23, 0);
    BatteryUnit Battery4 = new BatteryUnit(252, 543, 59, 599, 29, 200, 40, 50, 2);
    
    BatteryUnit[] BatList = {Battery1, Battery2, Battery3, Battery4};
    BatteryUnit[] SubSysBatList = {Battery1, Battery2};
    BatterySystem BatSystem = new BatterySystem(BatList);
    BatterySystem BatSubsystem1 = new BatterySystem(SubSysBatList);
    
    /**
     * Creates new form NewJFrame
     */
    public HomePage() {
        initComponents();
        

        
        if (this.BatSubsystem1.getState() == 0) {
            this.GreenSubSys.setVisible(true);
        }
        else if (this.BatSubsystem1.getState() == 1) {
            this.GreenSubSys.setBackground(Color.red);
        }
        else if (this.BatSubsystem1.getState() == 2) {
            this.GreenSubSys.setBackground(Color.yellow);
        }
        
        if (this.Battery1.getState() == 0 || this.Battery2.getState() == 0) {
            this.GreenSub.setBackground(Color.green);
            this.GreenSub.setVisible(true);
            this.GreenSubSys.setBackground(Color.green);
            this.GreenSubSys.setVisible(true);
        }
        
        else if (this.Battery1.getState() == 2 || this.Battery2.getState() == 2) {
            this.GreenSub.setBackground(Color.yellow);
            this.GreenSubSys.setBackground(Color.yellow);
            this.GreenSub.setVisible(true);
            this.GreenSubSys.setVisible(true);
        }
        
        else {
            this.GreenSub.setBackground(Color.red);
            this.GreenSubSys.setBackground(Color.yellow);
            this.GreenSub.setVisible(true);
            this.GreenSubSys.setVisible(true);
        }
        
        if (this.Battery1.getState() == 0) {
            this.GreenSubHz2.setVisible(true);
        }
        else if (this.Battery1.getState() == 1) {
            this.GreenSubHz2.setBackground(Color.red);
        }
        else if (this.Battery1.getState() == 2) {
            this.GreenSubHz2.setBackground(Color.yellow);
        }
        
        
        if (this.Battery2.getState() == 0) {
            this.GreenSubHz.setVisible(true);
        }
        else if (this.Battery2.getState() == 1) {
            this.GreenSubHz.setBackground(Color.red);
        }
        else if (this.Battery2.getState() == 2) {
            this.GreenSubHz.setBackground(Color.yellow);
        }
        
        if (this.Battery3.getState() == 0) {
            this.GreenB3.setVisible(true);
        }
        else if (this.Battery3.getState() == 1) {
            this.GreenB3.setBackground(Color.red);
        }
        else if (this.Battery3.getState() == 2) {
            this.GreenB3.setBackground(Color.yellow);
        }
        
        if (this.Battery4.getState() == 0) {
            this.GreenB4.setVisible(true);
        }
        else if (this.Battery4.getState() == 1) {
            this.GreenB4.setBackground(Color.red);
        }
        else if (this.Battery4.getState() == 2) {
            this.GreenB4.setBackground(Color.yellow);
        }
        
        
        if (this.Battery1.getState() == 0 || this.Battery2.getState() == 0 
                || this.Battery3.getState() == 0 || this.Battery4.getState() == 0) {
            this.GreenTop.setVisible(true);
        }
        
        else if (this.Battery1.getState() == 2 || this.Battery2.getState() == 2
                || this.Battery3.getState() == 2 || this.Battery4.getState() == 2) {
            this.GreenTop.setBackground(Color.yellow);
        }
        else {
            this.GreenTop.setBackground(Color.red);
        }
    }

    //state values - 0:BatSystem, 1:Battery1, 
    //               2:Battery2, 3:Battery3, 4:Battery4
    public HomePage(int[] StateValues) {
        initComponents();
        this.BatSystem.setState(StateValues[0]);
        this.Battery1.setState(StateValues[1]);
        this.Battery2.setState(StateValues[2]);
        this.Battery3.setState(StateValues[3]);
        this.Battery4.setState(StateValues[4]);
        

        if (this.Battery1.getState() == 0 || this.Battery2.getState() == 0) {
            this.GreenSub.setBackground(Color.green);
            this.GreenSub.setVisible(true);
            this.GreenSubSys.setBackground(Color.green);
            this.GreenSubSys.setVisible(true);
        }
        
        else if (this.Battery1.getState() == 2 || this.Battery2.getState() == 2) {
            this.GreenSub.setBackground(Color.yellow);
            this.GreenSubSys.setBackground(Color.yellow);
            this.GreenSub.setVisible(true);
            this.GreenSubSys.setVisible(true);
        }
        
        else {
            this.GreenSub.setBackground(Color.red);
            this.GreenSubSys.setBackground(Color.red);
            this.GreenSub.setVisible(true);
            this.GreenSubSys.setVisible(true);
        }
      
        
        if (this.Battery1.getState() == 0) {
            this.GreenSubHz2.setVisible(true);
        }
        else if (this.Battery1.getState() == 1) {
            this.GreenSubHz2.setBackground(Color.red);
        }
        else if (this.Battery1.getState() == 2) {
            this.GreenSubHz2.setBackground(Color.yellow);
        }
        
        
        if (this.Battery2.getState() == 0) {
            this.GreenSubHz.setVisible(true);
        }
        else if (this.Battery2.getState() == 1) {
            this.GreenSubHz.setBackground(Color.red);
        }
        else if (this.Battery2.getState() == 2) {
            this.GreenSubHz.setBackground(Color.yellow);
        }
        
        if (this.Battery3.getState() == 0) {
            this.GreenB3.setVisible(true);
        }
        else if (this.Battery3.getState() == 1) {
            this.GreenB3.setBackground(Color.red);
        }
        else if (this.Battery3.getState() == 2) {
            this.GreenB3.setBackground(Color.yellow);
        }
        
        if (this.Battery4.getState() == 0) {
            this.GreenB4.setVisible(true);
        }
        else if (this.Battery4.getState() == 1) {
            this.GreenB4.setBackground(Color.red);
        }
        else if (this.Battery4.getState() == 2) {
            this.GreenB4.setBackground(Color.yellow);
        }
        
        if (this.Battery1.getState() == 0 || this.Battery2.getState() == 0 
            || this.Battery3.getState() == 0 || this.Battery4.getState() == 0) {
            this.GreenTop.setVisible(true);
        }
        
        else if (this.Battery1.getState() == 2 || this.Battery2.getState() == 2
                || this.Battery3.getState() == 2 || this.Battery4.getState() == 2) {
            this.GreenTop.setBackground(Color.yellow);
        }
        else {
            this.GreenTop.setBackground(Color.red);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        YellowSubHz = new javax.swing.JPanel();
        GreenSubHz = new javax.swing.JPanel();
        RedSubHz = new javax.swing.JPanel();
        GreenB3 = new javax.swing.JPanel();
        GreenSubSys = new javax.swing.JPanel();
        GreenSubHz2 = new javax.swing.JPanel();
        GreenTop = new javax.swing.JPanel();
        GreenB4 = new javax.swing.JPanel();
        GreenSub = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton4.setText("Battery System");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("B3");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Subsystem 1");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("B2");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("B1");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel1.setText("GridEdge Networks Battery Management System");

        jButton1.setText("B4");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        YellowSubHz.setBackground(new java.awt.Color(255, 255, 68));

        javax.swing.GroupLayout YellowSubHzLayout = new javax.swing.GroupLayout(YellowSubHz);
        YellowSubHz.setLayout(YellowSubHzLayout);
        YellowSubHzLayout.setHorizontalGroup(
            YellowSubHzLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        YellowSubHzLayout.setVerticalGroup(
            YellowSubHzLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        GreenSubHz.setBackground(new java.awt.Color(0, 255, 0));

        javax.swing.GroupLayout GreenSubHzLayout = new javax.swing.GroupLayout(GreenSubHz);
        GreenSubHz.setLayout(GreenSubHzLayout);
        GreenSubHzLayout.setHorizontalGroup(
            GreenSubHzLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        GreenSubHzLayout.setVerticalGroup(
            GreenSubHzLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        RedSubHz.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout RedSubHzLayout = new javax.swing.GroupLayout(RedSubHz);
        RedSubHz.setLayout(RedSubHzLayout);
        RedSubHzLayout.setHorizontalGroup(
            RedSubHzLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        RedSubHzLayout.setVerticalGroup(
            RedSubHzLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        GreenB3.setBackground(new java.awt.Color(0, 255, 0));

        javax.swing.GroupLayout GreenB3Layout = new javax.swing.GroupLayout(GreenB3);
        GreenB3.setLayout(GreenB3Layout);
        GreenB3Layout.setHorizontalGroup(
            GreenB3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );
        GreenB3Layout.setVerticalGroup(
            GreenB3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        GreenSubSys.setBackground(new java.awt.Color(0, 255, 0));

        javax.swing.GroupLayout GreenSubSysLayout = new javax.swing.GroupLayout(GreenSubSys);
        GreenSubSys.setLayout(GreenSubSysLayout);
        GreenSubSysLayout.setHorizontalGroup(
            GreenSubSysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 92, Short.MAX_VALUE)
        );
        GreenSubSysLayout.setVerticalGroup(
            GreenSubSysLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        GreenSubHz2.setBackground(new java.awt.Color(0, 255, 0));

        javax.swing.GroupLayout GreenSubHz2Layout = new javax.swing.GroupLayout(GreenSubHz2);
        GreenSubHz2.setLayout(GreenSubHz2Layout);
        GreenSubHz2Layout.setHorizontalGroup(
            GreenSubHz2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        GreenSubHz2Layout.setVerticalGroup(
            GreenSubHz2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        GreenTop.setBackground(new java.awt.Color(0, 255, 0));

        javax.swing.GroupLayout GreenTopLayout = new javax.swing.GroupLayout(GreenTop);
        GreenTop.setLayout(GreenTopLayout);
        GreenTopLayout.setHorizontalGroup(
            GreenTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        GreenTopLayout.setVerticalGroup(
            GreenTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );

        GreenB4.setBackground(new java.awt.Color(0, 255, 9));

        javax.swing.GroupLayout GreenB4Layout = new javax.swing.GroupLayout(GreenB4);
        GreenB4.setLayout(GreenB4Layout);
        GreenB4Layout.setHorizontalGroup(
            GreenB4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 96, Short.MAX_VALUE)
        );
        GreenB4Layout.setVerticalGroup(
            GreenB4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        GreenSub.setBackground(new java.awt.Color(0, 255, 0));

        javax.swing.GroupLayout GreenSubLayout = new javax.swing.GroupLayout(GreenSub);
        GreenSub.setLayout(GreenSubLayout);
        GreenSubLayout.setHorizontalGroup(
            GreenSubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        GreenSubLayout.setVerticalGroup(
            GreenSubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(YellowSubHz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(RedSubHz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(143, 143, 143))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(GreenSubHz2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(20, 20, 20)
                                                        .addComponent(GreenSubSys, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(GreenTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(GreenSub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(GreenSubHz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(GreenB3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(GreenB4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(118, 118, 118)
                                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 59, Short.MAX_VALUE)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(142, 142, 142)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(110, 110, 110))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(GreenB3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GreenB4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GreenTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GreenSubSys, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(GreenSubHz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(GreenSubHz2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(GreenSub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)))
                .addComponent(YellowSubHz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RedSubHz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Switches to BatterySystemPage
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new BatterySystemPage(this.jButton4.getText(), BatSystem, this.BatSystem.getStateList()).setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed
//B1
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new BatteryUnitPage(this.jButton8.getText(), Battery1, this.BatSystem.getStateList(), 1).setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed
//B2
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new BatteryUnitPage(this.jButton7.getText(), Battery2, this.BatSystem.getStateList(), 2).setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed
//B3
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new BatteryUnitPage(this.jButton5.getText(), Battery3, this.BatSystem.getStateList(), 3).setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new BatterySubsystemPage(this.jButton6.getText(), BatSubsystem1, this.BatSystem.getStateList()).setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new BatteryUnitPage(this.jButton1.getText(), Battery4, this.BatSystem.getStateList(), 4).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel GreenB3;
    private javax.swing.JPanel GreenB4;
    private javax.swing.JPanel GreenSub;
    private javax.swing.JPanel GreenSubHz;
    private javax.swing.JPanel GreenSubHz2;
    private javax.swing.JPanel GreenSubSys;
    private javax.swing.JPanel GreenTop;
    private javax.swing.JPanel RedSubHz;
    private javax.swing.JPanel YellowSubHz;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
    
}
