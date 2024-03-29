package Windows;
/**
 * @author Evencio Hernández
 * @author Danny Caldeira
 */
import java.awt.Dimension;
import java.awt.Toolkit;
import proyecto_pdyf.Proyecto_PDyF;

public class LoginInterface extends javax.swing.JFrame {
    private final Proyecto_PDyF mainClass;
    
    /**
     * Creates new form LoginInterface
     * @param mainClass
     */
    public LoginInterface(Proyecto_PDyF mainClass) {
        this.mainClass = mainClass;
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logoLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ciTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        backgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        setMinimumSize(new java.awt.Dimension(300, 600));
        setPreferredSize(new java.awt.Dimension(400, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(400, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo-100x100.png"))); // NOI18N
        getContentPane().add(logoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 100, 100));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Contraseña");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 260, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Sistema de Gestión de Casos");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 400, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("de Investigación");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 400, 30));

        ciTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ciTextField.setForeground(new java.awt.Color(102, 102, 102));
        ciTextField.setToolTipText("");
        ciTextField.setMargin(new java.awt.Insets(5, 10, 5, 10));
        getContentPane().add(ciTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 260, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Cedula");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 260, 30));

        passwordTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        passwordTextField.setMargin(new java.awt.Insets(5, 10, 5, 10));
        getContentPane().add(passwordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 260, -1));

        loginButton.setBackground(new java.awt.Color(0, 153, 255));
        loginButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Entrar");
        loginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        loginButton.setFocusPainted(false);
        loginButton.setInheritsPopupMenu(true);
        loginButton.setMargin(new java.awt.Insets(5, 16, 5, 16));
        loginButton.setRequestFocusEnabled(false);
        loginButton.setRolloverEnabled(false);
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, -1, -1));

        backgroundLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fondo-login.png"))); // NOI18N
        backgroundLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        backgroundLabel.setAlignmentY(0.0F);
        getContentPane().add(backgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        String ci = ciTextField.getText();
        String password = new String(passwordTextField.getPassword());
        if (ci.length()==0){
            Proyecto_PDyF.print("Debe introducir la cedula de indentidad.");
            return;
        }
        if (password.length()==0){
            Proyecto_PDyF.print("Debe introducir la contraseña.");
            return;
        }
        mainClass.login(ci, password);
    }//GEN-LAST:event_loginButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JTextField ciTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPasswordField passwordTextField;
    // End of variables declaration//GEN-END:variables
}
