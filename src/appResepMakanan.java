/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;              
import java.awt.event.ActionEvent;          
import java.util.HashMap;          
import java.util.Map; 
import java.io.*;
import javax.swing.*;
 
/**
 *
 * @author User
 */
public class appResepMakanan extends javax.swing.JFrame {

      private DefaultListModel<String> model; // Model untuk JList
      private Map<String, String> deskripsiResep; // Penyimpanan deskripsi resep
    
    public appResepMakanan() {
        initComponents();
        deskripsiResep = new HashMap<>(); // Inisialisasi penyimpanan
         // Tambahkan deskripsi resep
    deskripsiResep.put("Nasi Goreng", "Nasi goreng dengan bumbu spesial yang terdiri dari kecap, bawang putih, cabai, dan telur orak-arik.");
    deskripsiResep.put("Mie Ayam", "Mie ayam dengan kuah gurih, potongan ayam berbumbu kecap, sawi hijau, dan taburan bawang goreng.");
    deskripsiResep.put("Bakso", "Bakso sapi dengan kuah kaldu gurih, ditambah pelengkap seperti mie kuning, bihun, tahu, dan daun bawang.");
    deskripsiResep.put("Rawon", "Rawon khas Jawa Timur yang menggunakan bumbu kluwek, disajikan dengan daging sapi, tauge, dan sambal.");
    deskripsiResep.put("Soto Ayam", "Soto ayam dengan kuah bening beraroma rempah, dilengkapi ayam suwir, telur rebus, dan sambal.");
    deskripsiResep.put("Gado-Gado", "Gado-gado terdiri dari sayuran rebus, lontong, tahu, dan tempe dengan siraman bumbu kacang.");
    deskripsiResep.put("Rendang", "Rendang daging sapi khas Minang yang dimasak lama dengan santan dan bumbu rempah.");
    deskripsiResep.put("Sate Ayam", "Sate ayam dengan bumbu kacang manis, disajikan dengan lontong dan acar.");
    deskripsiResep.put("Pecel Lele", "Pecel lele goreng dengan sambal pedas dan lalapan seperti kemangi, kol, dan mentimun.");
    deskripsiResep.put("Capcay", "Capcay tumis aneka sayur dengan kuah kental berbumbu bawang putih dan saus tiram.");
        model = new DefaultListModel<>(); // Inisialisasi model JList
        listResep.setModel(model); // Hubungkan model ke JList
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listResep = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        btnTambah = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnPilihResep = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        listResep.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { " ", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listResep);

        txtArea.setColumns(20);
        txtArea.setRows(5);
        txtArea.setText("\n");
        jScrollPane2.setViewportView(txtArea);

        btnTambah.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnUbah.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        btnUbah.setText("Ubah");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        btnHapus.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("APLIKASI RESEP MAKANAN");

        btnPilihResep.setBackground(new java.awt.Color(204, 204, 204));
        btnPilihResep.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        btnPilihResep.setText("Pilih Resep");
        btnPilihResep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPilihResepActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Pilih Resep");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Daftar Resep Makanan");

        jLabel4.setText("1.Nasi Goreng");

        jLabel5.setText("2.Mie Ayam");

        jLabel6.setText("3.Bakso");

        jLabel7.setText("4.Rawon");

        jLabel8.setText("5.Soto Ayam");

        jLabel9.setText("6.Gado-Gado");

        jLabel10.setText("7.Rendang");

        jLabel11.setText("8.Sate Ayam");

        jLabel12.setText("9.Pecel Lele");

        jLabel13.setText("10.Capcay");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel14.setText("Deskripsi Resep ");

        btnSimpan.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSimpan)
                            .addComponent(btnPilihResep, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTambah))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2))
                                        .addGap(59, 59, 59)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel4)
                                                    .addComponent(jLabel5)
                                                    .addComponent(jLabel6)
                                                    .addComponent(jLabel7)
                                                    .addComponent(jLabel8))
                                                .addGap(65, 65, 65)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel13)
                                                    .addComponent(jLabel12)
                                                    .addComponent(jLabel11)
                                                    .addComponent(jLabel10)
                                                    .addComponent(jLabel9)))))
                                    .addComponent(jLabel14)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(114, 114, 114)
                                        .addComponent(jLabel1)))
                                .addGap(0, 184, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnUbah, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHapus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnPilihResep)
                        .addGap(26, 26, 26)
                        .addComponent(btnTambah)
                        .addGap(26, 26, 26)
                        .addComponent(btnUbah)
                        .addGap(29, 29, 29))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnHapus)
                            .addComponent(jLabel3))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel13)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(btnSimpan))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
      String namaResep = JOptionPane.showInputDialog(this, "Masukkan Nama Resep:");

        if (namaResep != null && !namaResep.trim().isEmpty()) {
            model.addElement(namaResep);
            updateTextArea();
        } else {
            JOptionPane.showMessageDialog(this, "Nama resep tidak boleh kosong.", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        // Ambil indeks resep yang dipilih
    int selectedIndex = listResep.getSelectedIndex();

    if (selectedIndex != -1) {
        // Ambil nama resep lama
        String namaLama = model.getElementAt(selectedIndex);

        // Tampilkan dialog input untuk nama baru
        String namaBaru = JOptionPane.showInputDialog(this, "Ubah Nama Resep:", namaLama);

        // Jika input valid, ubah nama di model
        if (namaBaru != null && !namaBaru.trim().isEmpty()) {
            model.setElementAt(namaBaru, selectedIndex);
            updateTextArea(); // Perbarui JTextArea
        } else {
            JOptionPane.showMessageDialog(this, "Nama resep tidak boleh kosong.", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    } else {
        // Jika tidak ada yang dipilih, tampilkan pesan
        JOptionPane.showMessageDialog(this, "Pilih resep yang ingin diubah.", "Peringatan", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
       int selectedIndex = listResep.getSelectedIndex();

        if (selectedIndex != -1) {
            model.remove(selectedIndex);
            updateTextArea();
        } else {
            JOptionPane.showMessageDialog(this, "Pilih resep yang ingin dihapus.", "Peringatan", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnPilihResepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPilihResepActionPerformed
        // Ambil nama resep yang dipilih dari JList
    String namaResep = listResep.getSelectedValue();

    if (namaResep != null) {
        // Cari deskripsi resep dari HashMap
        String deskripsi = deskripsiResep.get(namaResep);

        // Tampilkan nama resep dan deskripsi di JTextArea
        txtArea.setText("Nama Resep: " + namaResep + "\n\nDeskripsi:\n" + deskripsi);
    } else {
        // Tampilkan pesan jika tidak ada item yang dipilih
        JOptionPane.showMessageDialog(this, "Pilih resep terlebih dahulu!", "Peringatan", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_btnPilihResepActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        String[] options = {"Simpan ke File", "Baca dari File"};
        int choice = JOptionPane.showOptionDialog(this,
                "Pilih operasi:",
                "File Operations",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null, options, options[0]);

        if (choice == 0) { // Simpan ke File
            simpanKeFile();
        } else if (choice == 1) { // Baca dari File
            bacaDariFile();
        }
    }

    // Simpan data ke file .txt
    private void simpanKeFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("data_resep.txt"))) {
            for (String namaResep : deskripsiResep.keySet()) {
                String deskripsi = deskripsiResep.get(namaResep);
                writer.write(namaResep + ";" + deskripsi);
                writer.newLine();
            }
            JOptionPane.showMessageDialog(this, "Data berhasil disimpan ke file!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat menyimpan file.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Baca data dari file .txt
    private void bacaDariFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader("data_resep.txt"))) {
            deskripsiResep.clear();
            model.clear();
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";", 2);
                if (parts.length == 2) {
                    deskripsiResep.put(parts[0], parts[1]);
                    model.addElement(parts[0]);
                }
            }
            JOptionPane.showMessageDialog(this, "Data berhasil dibaca dari file!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat membaca file.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    
    }//GEN-LAST:event_btnSimpanActionPerformed

    
     private void updateTextArea() {
        StringBuilder semuaResep = new StringBuilder();
        for (int i = 0; i < model.size(); i++) {
            semuaResep.append(model.getElementAt(i)).append("\n");
        }
        txtArea.setText(semuaResep.toString());
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       java.awt.EventQueue.invokeLater(() -> new appResepMakanan().setVisible(true));
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
            java.util.logging.Logger.getLogger(appResepMakanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(appResepMakanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(appResepMakanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(appResepMakanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new appResepMakanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnPilihResep;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUbah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listResep;
    private javax.swing.JTextArea txtArea;
    // End of variables declaration//GEN-END:variables
}
