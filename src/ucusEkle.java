
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chett
 */
public class ucusEkle extends javax.swing.JInternalFrame {

    /**
     * Creates new form ucusEkle
     */
    public ucusEkle() {
        initComponents();
        otoID();
    }
    
    Connection con;
    PreparedStatement ps;
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtUcusId = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUcusAdi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTarih = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        txtKalkisSaati = new javax.swing.JTextField();
        txtVarisSaati = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtUcusUcreti = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtKalkisYeri = new javax.swing.JComboBox();
        txtVarisYeri = new javax.swing.JComboBox();

        jPanel1.setBackground(new java.awt.Color(51, 255, 204));
        jPanel1.setForeground(new java.awt.Color(102, 102, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("Uçuş ID:");

        txtUcusId.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtUcusId.setForeground(new java.awt.Color(255, 0, 51));
        txtUcusId.setText("jLabel2");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 255));
        jLabel3.setText("Uçuş Adı:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 255));
        jLabel4.setText("Kalkış Yeri:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 255));
        jLabel5.setText("Varış Yeri:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 255));
        jLabel6.setText("Tarih:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 255));
        jLabel7.setText("Kalkış Saati:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 255));
        jLabel8.setText("Varış Saati:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 255));
        jLabel9.setText("Uçuş Ücreti:");

        jButton1.setText("Ekle");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("İptal");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtKalkisYeri.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Türkiye", "Hindistan", "Amerika", "İngiltere", "Kanada", "Hollanda", "Çin", "Rusya" }));

        txtVarisYeri.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Türkiye", "Hindistan", "Amerika", "İngiltere", "Kanada", "Hollanda", "Çin", "Rusya" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUcusId)
                    .addComponent(txtUcusAdi, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(txtKalkisYeri, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtVarisYeri, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(94, 94, 94)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTarih, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                    .addComponent(txtKalkisSaati)
                    .addComponent(txtVarisSaati)
                    .addComponent(txtUcusUcreti))
                .addContainerGap(161, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTarih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtUcusId)
                        .addComponent(jLabel6)))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtUcusAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtKalkisSaati, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtVarisSaati, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtKalkisYeri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(txtUcusUcreti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVarisYeri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void otoID()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/havayollari","root","");
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery("select MAX(id) from ucus");
            rs.next();
            rs.getString("MAX(id)");
            //id null sa cs001 ile başlar!
            if(rs.getString("MAX(id)") == null)
            {
                txtUcusId.setText("FO001");               
            }
            else
            {
                long id = Long.parseLong(rs.getString("MAX(id)").substring(2,rs.getString("MAX(id)").length()));
                id++;
                txtUcusId.setText("FO" + String.format("%03d",id));  
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(musteriEkle.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(musteriEkle.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }
    
    
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String id = txtUcusId.getText();
        String ucusAdi = txtUcusAdi.getText();
        String kalkisYeri = txtKalkisYeri.getSelectedItem().toString().trim();
        String varisYeri = txtVarisYeri.getSelectedItem().toString().trim();

        DateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
        String tarih = dt.format(txtTarih.getDate());
       
        String kalkisSaati = txtKalkisSaati.getText();
        String varisSaati = txtVarisSaati.getText();
        String ucusUcreti = txtUcusUcreti.getText();
        
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/havayollari","root","");
            ps = con.prepareStatement("insert into ucus(id,ucusadi,kalkisyeri,varisyeri,tarih,kalkissaati,varissaati,ucusucreti)values(?,?,?,?,?,?,?,?)");
            
            ps.setString(1,id);
            ps.setString(2,ucusAdi);
            ps.setString(3,kalkisYeri);
            ps.setString(4,varisYeri);
            ps.setString(5,tarih);
            ps.setString(6,kalkisSaati);
            ps.setString(7,varisSaati);
            ps.setString(8,ucusUcreti);
          
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Ucuş Oluşturuldu!");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ucusEkle.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ucusEkle.class.getName()).log(Level.SEVERE, null, ex);
        }
           
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       this.hide();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtKalkisSaati;
    private javax.swing.JComboBox txtKalkisYeri;
    private com.toedter.calendar.JDateChooser txtTarih;
    private javax.swing.JTextField txtUcusAdi;
    private javax.swing.JLabel txtUcusId;
    private javax.swing.JTextField txtUcusUcreti;
    private javax.swing.JTextField txtVarisSaati;
    private javax.swing.JComboBox txtVarisYeri;
    // End of variables declaration//GEN-END:variables
}
