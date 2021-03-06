
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

 /*
 * Users.java
 *
 * Created on 22 Sep, 2017, 8:11:17 PM
 */
/**
 *
 * @author paksh
 */
public class Users extends javax.swing.JFrame {

    Connection conn;
    PreparedStatement pst;
    ResultSet rs;

    /**
     * Creates new form Users
     */
    public Users() {
        initComponents();
        conn = DBConnect.connect();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        txtRetypePass = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        btnLog = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtFullName = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        rdoUser = new javax.swing.JRadioButton();
        rdoAdmin = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(600, 400));

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 400));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("Enter Username:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setText("Enter Password:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 0));
        jLabel4.setText("Retype Password:");

        btnAdd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(153, 0, 0));
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnHome.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnHome.setForeground(new java.awt.Color(153, 0, 0));
        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnLog.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnLog.setForeground(new java.awt.Color(153, 0, 0));
        btnLog.setText("Logout");
        btnLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 0));
        jLabel5.setText("Enter User ID:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 0));
        jLabel6.setText("Enter Full Name:");

        btnSearch.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(153, 0, 0));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 0));
        jLabel7.setText("Acess Type");

        rdoUser.setBackground(new java.awt.Color(255, 204, 0));
        buttonGroup1.add(rdoUser);
        rdoUser.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rdoUser.setForeground(new java.awt.Color(153, 0, 0));
        rdoUser.setSelected(true);
        rdoUser.setText("User");
        rdoUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoUserActionPerformed(evt);
            }
        });

        rdoAdmin.setBackground(new java.awt.Color(255, 204, 0));
        buttonGroup1.add(rdoAdmin);
        rdoAdmin.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rdoAdmin.setForeground(new java.awt.Color(153, 0, 0));
        rdoAdmin.setText("Admin");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home.jpg"))); // NOI18N

        btnReset.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnReset.setForeground(new java.awt.Color(153, 0, 0));
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(153, 0, 0));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2))
                                        .addGap(23, 23, 23)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtRetypePass, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtUsername)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtFullName))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabel7)
                                                .addGap(35, 35, 35)
                                                .addComponent(rdoUser)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(rdoAdmin))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(35, 35, 35)
                                                .addComponent(btnDelete)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnReset)))
                                        .addGap(26, 26, 26)
                                        .addComponent(btnHome)))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSearch)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(btnLog)))))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtFullName, txtId, txtPassword, txtRetypePass, txtUsername});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtRetypePass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(rdoUser)
                    .addComponent(rdoAdmin))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnHome)
                    .addComponent(btnReset)
                    .addComponent(btnLog)
                    .addComponent(btnDelete))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(545, 420));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        addUser();
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        new Home().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogActionPerformed
        new Authentication().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnLogActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        txtFullName.setText("");
        txtPassword.setText("");
        txtRetypePass.setText("");
        txtUsername.setText("");
        String id = txtId.getText();
        if (!id.equals("") || id != null) {
            try {
                pst = conn.prepareStatement("SELECT * FROM users WHERE id = ?");
                pst.setString(1, id);

                rs = pst.executeQuery();
                if (rs.next()) {
                    String fullName = rs.getString("full_name");
                    txtFullName.setText(fullName);
                    String user=rs.getString("username");
                    txtUsername.setText(user);
                    String access=rs.getString("access_level");
                    if (access.equals("admin"))
                    {
                        rdoAdmin.setSelected(true);
                    }
                    else
                    {
                        rdoUser.setSelected(true);
                    }
                    
                } else {
                    JOptionPane.showMessageDialog(this, "Employee with this ID does not exist!!", "Error", JOptionPane.ERROR_MESSAGE);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }//GEN-LAST:event_btnSearchActionPerformed

    private void rdoUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoUserActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtId.setText("");
        txtFullName.setText("");
        txtPassword.setText("");
        txtRetypePass.setText("");
        txtUsername.setText("");
        rdoAdmin.setSelected(false);
        rdoUser.setSelected(true);
       
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
       
        Validation validation = new Validation();
        //check if any fields are empty
        if (validation.isFieldEmpty(txtId, txtFullName) > 0) {
            JOptionPane.showMessageDialog(this, "All fields are required!!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
          int id=Integer.parseInt(txtId.getText());
          if (!txtId.equals("")) {
            try {
                String query="DELETE from users where id=?";
                PreparedStatement pst1=conn.prepareStatement(query);
                pst1.setInt(1,id);
                pst1.executeUpdate();
                
                    JOptionPane.showMessageDialog(this, "User Deleted Successfully!!", "Confirm", JOptionPane.INFORMATION_MESSAGE);
                    txtId.setText("");
                    txtFullName.setText("");
                    txtPassword.setText("");
                    txtRetypePass.setText("");
                    txtUsername.setText("");
                    rdoAdmin.setSelected(false);
                    rdoUser.setSelected(true);
                    setVisible(false);
                    new Home().setVisible(true);
                
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Employee with this ID does not exist!!", "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        }
          else
          {
              JOptionPane.showMessageDialog(this, "Please enter employee id!!", "Error", JOptionPane.ERROR_MESSAGE);
          }
        }
       
    }//GEN-LAST:event_btnDeleteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Users().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLog;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSearch;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rdoAdmin;
    private javax.swing.JRadioButton rdoUser;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtRetypePass;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    private void addUser() {
        String id = txtId.getText();
        String name = txtFullName.getText();
        String username = txtUsername.getText();
        String password1 = txtPassword.getText();
        String password2 = txtRetypePass.getText();
        String accessLevel = rdoUser.isSelected() ? "user" : "admin";
        String hashedPassword = "";//to store the hashed password

        Validation validation = new Validation();
        //check if any fields are empty
        if (validation.isFieldEmpty(txtId, txtFullName, txtPassword, txtRetypePass, txtUsername) > 0) {
            JOptionPane.showMessageDialog(this, "All fields are required!!", "Error", JOptionPane.ERROR_MESSAGE);
        }
         if (password1.equals(password2)) {
                //if password matches the hash the password
                PasswordAuthentication passwordAuthentication = new PasswordAuthentication();
                hashedPassword = passwordAuthentication.hash(password1.toCharArray());

                if (checkUsername(username)) {
                    JOptionPane.showMessageDialog(this, "Username already exist.Please choose another username", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    try {
                        pst = conn.prepareStatement("INSERT INTO users (id,full_name,username, password, access_level) VALUES (?,?, ?, ?, ?)");
                        pst.setString(1, id);
                        pst.setString(2, name);
                        
                        pst.setString(3, username);
                        pst.setString(4, hashedPassword);
                        pst.setString(5, accessLevel);

                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(this, "User added successfully...", "Information", JOptionPane.INFORMATION_MESSAGE);
                        setVisible(false);
                        new Home().setVisible(true);

                    } catch (Exception e) {

                        JOptionPane.showMessageDialog(this, "Error!!!Unable to add user.", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                }

            } else {
                JOptionPane.showMessageDialog(this, "Password did not match!!!", "Error", JOptionPane.ERROR_MESSAGE);
            }
    }
        

        
    private boolean checkUsername(String username) {
        boolean exist = false;
        try {
            pst = conn.prepareStatement("SELECT username FROM users WHERE username = ?");
            pst.setString(1, username);
            rs = pst.executeQuery();
            if (rs.next()) {
                exist = true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return exist;
    }

  

}
