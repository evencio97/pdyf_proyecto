package Windows;
/**
 * @author Evencio Hernández
 * @author Danny Caldeira
 */
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import proyecto_pdyf.Proyecto_PDyF;

public class DashboardInterface extends javax.swing.JFrame {
    private final Proyecto_PDyF mainClass;
    
    /**
     * Creates new form DashboardInterface
     * @param mainClass
     */
    public DashboardInterface(Proyecto_PDyF mainClass) {
        this.mainClass = mainClass;
        initComponents();
        this.setIconImage (new ImageIcon(getClass().getResource("../Images/logo-100x100.png")).getImage());
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        username.setText(mainClass.getFullName());
        usertype.setText(mainClass.getType());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        numberTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        numberTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        numberTextField2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        numberTextField3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        numberTextField4 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        numberTextField5 = new javax.swing.JTextField();
        newCaseButton1 = new javax.swing.JButton();
        exitButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();
        newUserButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        newCaseButton = new javax.swing.JButton();
        username = new javax.swing.JLabel();
        usertype = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Escritorio");
        setFocusable(false);
        setSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Crear caso de investigación");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Numero de caso");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 220, 30));

        numberTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        numberTextField.setForeground(new java.awt.Color(102, 102, 102));
        numberTextField.setToolTipText("");
        numberTextField.setMargin(new java.awt.Insets(5, 10, 5, 10));
        getContentPane().add(numberTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 220, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Investigador");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, 220, 30));

        numberTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        numberTextField1.setForeground(new java.awt.Color(102, 102, 102));
        numberTextField1.setToolTipText("");
        numberTextField1.setMargin(new java.awt.Insets(5, 10, 5, 10));
        getContentPane().add(numberTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 220, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Tipo");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 220, 30));

        numberTextField2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        numberTextField2.setForeground(new java.awt.Color(102, 102, 102));
        numberTextField2.setToolTipText("");
        numberTextField2.setMargin(new java.awt.Insets(5, 10, 5, 10));
        getContentPane().add(numberTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 220, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Estatus");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, 220, 30));

        numberTextField3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        numberTextField3.setForeground(new java.awt.Color(102, 102, 102));
        numberTextField3.setToolTipText("");
        numberTextField3.setMargin(new java.awt.Insets(5, 10, 5, 10));
        getContentPane().add(numberTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, 220, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Modus operandi");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 220, 30));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(null);
        jTextArea1.setMargin(new java.awt.Insets(5, 10, 5, 10));
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 450, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Irregularidad");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 220, 30));

        numberTextField4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        numberTextField4.setForeground(new java.awt.Color(102, 102, 102));
        numberTextField4.setToolTipText("");
        numberTextField4.setMargin(new java.awt.Insets(5, 10, 5, 10));
        getContentPane().add(numberTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, 220, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Subirregularidad");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 390, 220, 30));

        numberTextField5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        numberTextField5.setForeground(new java.awt.Color(102, 102, 102));
        numberTextField5.setToolTipText("");
        numberTextField5.setMargin(new java.awt.Insets(5, 10, 5, 10));
        getContentPane().add(numberTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 420, 220, -1));

        newCaseButton1.setBackground(new java.awt.Color(0, 153, 255));
        newCaseButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        newCaseButton1.setForeground(new java.awt.Color(255, 255, 255));
        newCaseButton1.setText("Guardar");
        newCaseButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newCaseButton1.setFocusPainted(false);
        newCaseButton1.setInheritsPopupMenu(true);
        newCaseButton1.setMargin(new java.awt.Insets(5, 16, 5, 16));
        newCaseButton1.setRequestFocusEnabled(false);
        newCaseButton1.setRolloverEnabled(false);
        getContentPane().add(newCaseButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 500, 150, -1));

        exitButton2.setBackground(new java.awt.Color(255, 51, 51));
        exitButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        exitButton2.setForeground(new java.awt.Color(255, 255, 255));
        exitButton2.setText("Cancelar");
        exitButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitButton2.setFocusPainted(false);
        exitButton2.setInheritsPopupMenu(true);
        exitButton2.setMargin(new java.awt.Insets(5, 16, 5, 16));
        exitButton2.setRequestFocusEnabled(false);
        exitButton2.setRolloverEnabled(false);
        getContentPane().add(exitButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 500, 150, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo-100x100.png"))); // NOI18N
        logoLabel.setFocusable(false);
        logoLabel.setRequestFocusEnabled(false);
        logoLabel.setVerifyInputWhenFocusTarget(false);

        newUserButton.setBackground(new java.awt.Color(0, 153, 255));
        newUserButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        newUserButton.setForeground(new java.awt.Color(255, 255, 255));
        newUserButton.setText("Nuevo usuario");
        newUserButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newUserButton.setFocusPainted(false);
        newUserButton.setInheritsPopupMenu(true);
        newUserButton.setMargin(new java.awt.Insets(5, 16, 5, 16));
        newUserButton.setRequestFocusEnabled(false);
        newUserButton.setRolloverEnabled(false);
        newUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newUserButtonActionPerformed(evt);
            }
        });

        exitButton.setBackground(new java.awt.Color(255, 51, 51));
        exitButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        exitButton.setForeground(new java.awt.Color(255, 255, 255));
        exitButton.setText("Salir");
        exitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitButton.setFocusPainted(false);
        exitButton.setInheritsPopupMenu(true);
        exitButton.setMargin(new java.awt.Insets(5, 16, 5, 16));
        exitButton.setRequestFocusEnabled(false);
        exitButton.setRolloverEnabled(false);
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        newCaseButton.setBackground(new java.awt.Color(0, 153, 255));
        newCaseButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        newCaseButton.setForeground(new java.awt.Color(255, 255, 255));
        newCaseButton.setText("Nuevo caso");
        newCaseButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newCaseButton.setFocusPainted(false);
        newCaseButton.setInheritsPopupMenu(true);
        newCaseButton.setMargin(new java.awt.Insets(5, 16, 5, 16));
        newCaseButton.setRequestFocusEnabled(false);
        newCaseButton.setRolloverEnabled(false);
        newCaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newCaseButtonActionPerformed(evt);
            }
        });

        username.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        username.setForeground(new java.awt.Color(102, 102, 102));
        username.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        username.setText("Name+Lastname");

        usertype.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        usertype.setForeground(new java.awt.Color(102, 102, 102));
        usertype.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usertype.setText("Admin");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newCaseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(username, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
            .addComponent(usertype, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(usertype, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(newUserButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(newCaseButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 214, Short.MAX_VALUE)
                .addComponent(exitButton)
                .addGap(28, 28, 28))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 600));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fondo.png"))); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newUserButtonActionPerformed
        
    }//GEN-LAST:event_newUserButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        mainClass.exit();
    }//GEN-LAST:event_exitButtonActionPerformed

    private void newCaseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newCaseButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newCaseButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitButton;
    private javax.swing.JButton exitButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JButton newCaseButton;
    private javax.swing.JButton newCaseButton1;
    private javax.swing.JButton newUserButton;
    private javax.swing.JTextField numberTextField;
    private javax.swing.JTextField numberTextField1;
    private javax.swing.JTextField numberTextField2;
    private javax.swing.JTextField numberTextField3;
    private javax.swing.JTextField numberTextField4;
    private javax.swing.JTextField numberTextField5;
    private javax.swing.JLabel username;
    private javax.swing.JLabel usertype;
    // End of variables declaration//GEN-END:variables
}
