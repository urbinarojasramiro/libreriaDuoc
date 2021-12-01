/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Registro;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Libro;

/**
 *
 * @author administrador
 */
public class Actualizar extends javax.swing.JFrame {
    private int idLibro = 0;
    /**
     * Creates new form Agregar
     */
    public Actualizar() {
        initComponents();
        btnVolver.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JTextField();
        txtAutor = new javax.swing.JTextField();
        txtDia = new javax.swing.JTextField();
        txtMes = new javax.swing.JTextField();
        txtAcno = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        chkDisponible = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnEnviar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        textFieldBuscarTitulo = new javax.swing.JTextField();
        botonBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar Libro");

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        txtTitulo.setText("Ingrese título");
        txtTitulo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTituloFocusGained(evt);
            }
        });

        txtAutor.setText("Ingrese autor");
        txtAutor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAutorFocusGained(evt);
            }
        });

        txtDia.setText("dd");
        txtDia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDiaFocusGained(evt);
            }
        });

        txtMes.setText("mm");
        txtMes.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMesFocusGained(evt);
            }
        });

        txtAcno.setText("yyyy");
        txtAcno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAcnoFocusGained(evt);
            }
        });

        txtPrecio.setText("Ingrese precio");
        txtPrecio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPrecioFocusGained(evt);
            }
        });
        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });

        chkDisponible.setText("disponible");

        jLabel1.setText("fecha publicación");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtAcno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel1))
                        .addComponent(txtAutor)
                        .addComponent(txtTitulo))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtPrecio, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(chkDisponible, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAcno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(chkDisponible)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(btnEnviar)
                .addGap(27, 27, 27)
                .addComponent(btnVolver)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnviar)
                    .addComponent(btnVolver))
                .addContainerGap())
        );

        jLabel2.setText("Titulo Libro:");

        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldBuscarTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonBuscar)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textFieldBuscarTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscar))
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        String titulo, autor, dia, mes, acno, fechaStr;
        Date fecha;
        int precio;
        boolean disponible;

        titulo = txtTitulo.getText();
        if (titulo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese título", "Validación", JOptionPane.WARNING_MESSAGE);
            txtTitulo.requestFocus();
            return;
        }

        autor = txtAutor.getText();
        if (autor.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese autor", "Validación", JOptionPane.WARNING_MESSAGE);
            txtAutor.requestFocus();
            return;
        }

        dia = txtDia.getText();
        mes = txtMes.getText();
        acno = txtAcno.getText();

        if (dia.isEmpty() || mes.isEmpty() || acno.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese fecha", "Validación", JOptionPane.WARNING_MESSAGE);
            txtDia.requestFocus();
            return;
        }
        fechaStr = dia + "/" + mes + "/" + acno;
        SimpleDateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
        try {
            fecha = formatter1.parse(fechaStr);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese fecha en el formato dd/mm/yyyy", "Validación", JOptionPane.WARNING_MESSAGE);
            txtDia.requestFocus();
            return;
        }

        try {
            precio = Integer.parseInt(txtPrecio.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Elprecio debe ser un número", "Validación", JOptionPane.WARNING_MESSAGE);
            txtPrecio.requestFocus();
            return;
        }

        disponible = chkDisponible.isSelected();

        Libro libro = new Libro(idLibro, titulo, autor, fecha, precio, disponible);

        Registro rg = new Registro();

        
        if (rg.actualizar(libro)) {
            JOptionPane.showMessageDialog(this, "Se Actualizo libro " + libro.getTitulo(), "Información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "No se actualizó libro " + libro.getTitulo(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void txtTituloFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTituloFocusGained
        txtTitulo.setText("");
    }//GEN-LAST:event_txtTituloFocusGained

    private void txtAutorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAutorFocusGained
        txtAutor.setText("");
    }//GEN-LAST:event_txtAutorFocusGained

    private void txtDiaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDiaFocusGained
        txtDia.setText("");
    }//GEN-LAST:event_txtDiaFocusGained

    private void txtMesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMesFocusGained
        txtMes.setText("");
    }//GEN-LAST:event_txtMesFocusGained

    private void txtAcnoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAcnoFocusGained
        txtAcno.setText("");
    }//GEN-LAST:event_txtAcnoFocusGained

    private void txtPrecioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecioFocusGained
        txtPrecio.setText("");
    }//GEN-LAST:event_txtPrecioFocusGained

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        String nombreLibro = textFieldBuscarTitulo.getText();
        Registro reg = new Registro();
        Libro libro = reg.buscarPorTitulo(nombreLibro);
        if(libro.getIdLibro() != 0){
            Date fechaLibro = libro.getPublicacion();
            txtTitulo.setText(libro.getTitulo());
            txtAutor.setText(libro.getAutor());
            txtPrecio.setText(String.valueOf(libro.getPrecio()));
            txtDia.setText(String.valueOf(fechaLibro.getDay()));
            txtMes.setText(String.valueOf(fechaLibro.getMonth()));
            txtAcno.setText(String.valueOf(fechaLibro.getYear()));
            idLibro = libro.getIdLibro();
            chkDisponible.setSelected(libro.isDisponible());
        }else{
            JOptionPane.showMessageDialog(null, "Libro no encontrado");
        }
    }//GEN-LAST:event_botonBuscarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JCheckBox chkDisponible;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField textFieldBuscarTitulo;
    private javax.swing.JTextField txtAcno;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtDia;
    private javax.swing.JTextField txtMes;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
