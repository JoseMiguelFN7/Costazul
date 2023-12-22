package Main;

import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MenuCompra extends javax.swing.JFrame {
    
    Tienda tiendaSeleccionada = vCompras.tiendaSeleccionada;
    Persona personaActual = DatosUsuario.usuariosEnSesion.verTope();
    Producto productoSeleccionado;
    int unidades;
    double precioTotal;
    public MenuCompra() {
        initComponents();
        setVisible(true);
        setSize(400, 565); //Tamano de la ventana.
        setLocationRelativeTo(null); //Para que la ventana se ubique en el centro de la pantalla.
        jLabelNombreTienda.setText(vCompras.tiendaSeleccionada.getNombre());
        for(int i=0; i<vCompras.tiendaSeleccionada.getProductos().getTamanio(); i++){
            jComboProductos.addItem(vCompras.tiendaSeleccionada.getProductos().getArrayProductos()[i].getNombre());
        }
        jLabelFoto.setIcon(determinarLogo(tiendaSeleccionada.getLocal()));
                        
    }

    public Icon determinarLogo(int numLocal){ //Para determinar el logo de la tienda que debe mostrarse
        switch(numLocal){
            case 1:
                return new ImageIcon(getClass().getResource("/Imagenes/Multimax.png"));
            case 2:
                return new ImageIcon(getClass().getResource("/Imagenes/GamePlanet.png"));
            case 3:
                return new ImageIcon(getClass().getResource("/Imagenes/Her&Him.png"));
            case 4:
                return new ImageIcon(getClass().getResource("/Imagenes/Koko_Superstore.png"));
            case 5:
                return new ImageIcon(getClass().getResource("/Imagenes/Blasco_Joyeria.png"));
            case 6:
                return new ImageIcon(getClass().getResource("/Imagenes/Unilook.png"));
            case 7:
                return new ImageIcon(getClass().getResource("/Imagenes/Blackphone.png"));
            case 8:
                return new ImageIcon(getClass().getResource("/Imagenes/Mundo_Virtual.png"));
            case 9:
                return new ImageIcon(getClass().getResource("/Imagenes/Ecomascotas.png"));
            case 10:
                return new ImageIcon(getClass().getResource("/Imagenes/Rori.png"));
            case 11:
                return new ImageIcon(getClass().getResource("/Imagenes/Aero_store.png"));
            case 12:
                return new ImageIcon(getClass().getResource("/Imagenes/Girl_MissLulu.png"));
            case 13:
                return new ImageIcon(getClass().getResource("/Imagenes/Baby_Love.png"));
            case 14:
                return new ImageIcon(getClass().getResource("/Imagenes/City_movil.png"));
            case 15:
                return new ImageIcon(getClass().getResource("/Imagenes/Carolina_Herrera.png"));
            case 16:
                return new ImageIcon(getClass().getResource("/Imagenes/Sunglass.png"));
            case 17:
                return new ImageIcon(getClass().getResource("/Imagenes/Fitlab.png"));
            case 18:
                return new ImageIcon(getClass().getResource("/Imagenes/Oro_margarita.png"));
            case 19:
                return new ImageIcon(getClass().getResource("/Imagenes/Wrangler.png"));
            case 20:
                return new ImageIcon(getClass().getResource("/Imagenes/BANDOLERA.png"));
            case 21:
                return new ImageIcon(getClass().getResource("/Imagenes/Champions.png"));
            case 22:
                return new ImageIcon(getClass().getResource("/Imagenes/Mele_Divani.png"));
            case 23:
                return new ImageIcon(getClass().getResource("/Imagenes/GSL.png"));
            case 24:
                return new ImageIcon(getClass().getResource("/Imagenes/Tarbay.png"));
            case 25:
                return new ImageIcon(getClass().getResource("/Imagenes/Marisol_import.png"));
            case 26:
                return new ImageIcon(getClass().getResource("/Imagenes/lucy_lingeries.png"));
            case 27:
                return new ImageIcon(getClass().getResource("/Imagenes/Ferremetro.png"));
            case 28:
                return new ImageIcon(getClass().getResource("/Imagenes/Sigo.png"));
            case 29:
                return new ImageIcon(getClass().getResource("/Imagenes/Karamba_ninos.png"));
            case 30:
                return new ImageIcon(getClass().getResource("/Imagenes/Nivel_surf.png"));
            case 31:
                return new ImageIcon(getClass().getResource("/Imagenes/Nice_Toys.png"));
            case 32:
                return new ImageIcon(getClass().getResource("/Imagenes/Monikerias.png"));
            case 33:
                return new ImageIcon(getClass().getResource("/Imagenes/cerere.png"));
            case 34:
                return new ImageIcon(getClass().getResource("/Imagenes/Miss_lulu.png"));
            case 35:
                return new ImageIcon(getClass().getResource("/Imagenes/Tech_Star.png"));
            case 36:
                return new ImageIcon(getClass().getResource("/Imagenes/Go_sport.png"));
            case 37:
                return new ImageIcon(getClass().getResource("/Imagenes/Sweet_Ice.png"));
            case 38:
                return new ImageIcon(getClass().getResource("/Imagenes/Perfumes_factory.png"));
            case 39:
                return new ImageIcon(getClass().getResource("/Imagenes/Alta_vision.png"));
            case 40:
                return new ImageIcon(getClass().getResource("/Imagenes/Mario_Hernandez.png"));
            case 41:
                return new ImageIcon(getClass().getResource("/Imagenes/DIGITEC.png"));
            case 42:
                return new ImageIcon(getClass().getResource("/Imagenes/Isha_Accessories.png"));
            case 43:
                return new ImageIcon(getClass().getResource("/Imagenes/McPostres.png"));
            case 44:
                return new ImageIcon(getClass().getResource("/Imagenes/Samsung.png"));
            case 45:
                return new ImageIcon(getClass().getResource("/Imagenes/Poker_plus.png"));
            case 46:
                return new ImageIcon(getClass().getResource("/Imagenes/Mundo_escolar.png"));
            case 47:
                return new ImageIcon(getClass().getResource("/Imagenes/Shoe_Box.png"));
            case 48:
                return new ImageIcon(getClass().getResource("/Imagenes/FLB.png"));
            case 49:
                return new ImageIcon(getClass().getResource("/Imagenes/AQUA.png"));
            case 50:
                return new ImageIcon(getClass().getResource("/Imagenes/Grupo_Selecto's.png"));
            case 51:
                return new ImageIcon(getClass().getResource("/Imagenes/Galaxy.png"));
            case 52:
                return new ImageIcon(getClass().getResource("/Imagenes/Stylo_Import.png"));
            case 53:
                return new ImageIcon(getClass().getResource("/Imagenes/Fashion_world.png"));
            case 54:
                return new ImageIcon(getClass().getResource("/Imagenes/Techzone.png"));
            case 55:
                return new ImageIcon(getClass().getResource("/Imagenes/Sporty_World.png"));
            case 56:
                return new ImageIcon(getClass().getResource("/Imagenes/Rodito.png"));
            case 57:
                return new ImageIcon(getClass().getResource("/Imagenes/McDonald's.png"));
            case 58:
                return new ImageIcon(getClass().getResource("/Imagenes/Arturos.png"));
            case 59:
                return new ImageIcon(getClass().getResource("/Imagenes/Accessories_Galore.png"));
            case 60:
                return new ImageIcon(getClass().getResource("/Imagenes/Glamour_Beauty.png"));
            default: return null;
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

        botonesTCompra = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabelPrecio = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescripcion = new javax.swing.JTextArea();
        jComboProductos = new javax.swing.JComboBox<>();
        jRadioButtonCOnline = new javax.swing.JRadioButton();
        jRadioButtonCPresencial = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jComboMetodoPago = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jTextUnidades = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabelFoto = new javax.swing.JLabel();
        jButtonConfirmar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanelNombreT = new javax.swing.JPanel();
        jLabelNombreTienda = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Datos de la compra");
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Producto:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 150, 100, 22);

        jLabelPrecio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelPrecio.setText("precio");
        getContentPane().add(jLabelPrecio);
        jLabelPrecio.setBounds(30, 310, 170, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Tipo de");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 390, 70, 22);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextAreaDescripcion.setEditable(false);
        jTextAreaDescripcion.setColumns(20);
        jTextAreaDescripcion.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        jTextAreaDescripcion.setLineWrap(true);
        jTextAreaDescripcion.setRows(5);
        jTextAreaDescripcion.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextAreaDescripcion);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 190, 340, 110);

        jComboProductos.setBackground(new java.awt.Color(204, 255, 255));
        jComboProductos.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jComboProductos.setMaximumRowCount(5);
        jComboProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboProductosActionPerformed(evt);
            }
        });
        getContentPane().add(jComboProductos);
        jComboProductos.setBounds(120, 140, 180, 40);

        botonesTCompra.add(jRadioButtonCOnline);
        jRadioButtonCOnline.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jRadioButtonCOnline.setText("Online");
        jRadioButtonCOnline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonCOnlineActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonCOnline);
        jRadioButtonCOnline.setBounds(120, 390, 80, 29);

        botonesTCompra.add(jRadioButtonCPresencial);
        jRadioButtonCPresencial.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jRadioButtonCPresencial.setText("Presencial");
        jRadioButtonCPresencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonCPresencialActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonCPresencial);
        jRadioButtonCPresencial.setBounds(120, 420, 99, 29);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Unidades:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(210, 313, 90, 22);

        jComboMetodoPago.setBackground(new java.awt.Color(204, 255, 255));
        jComboMetodoPago.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        getContentPane().add(jComboMetodoPago);
        jComboMetodoPago.setBounds(240, 400, 140, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Total:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 350, 150, 22);

        jTextUnidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextUnidadesActionPerformed(evt);
            }
        });
        getContentPane().add(jTextUnidades);
        jTextUnidades.setBounds(310, 310, 50, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("compra:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 410, 80, 22);
        getContentPane().add(jLabelFoto);
        jLabelFoto.setBounds(20, 20, 100, 100);

        jButtonConfirmar.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButtonConfirmar.setText("Confirmar compra");
        jButtonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfirmarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonConfirmar);
        jButtonConfirmar.setBounds(110, 470, 180, 40);

        jLabel8.setText("Presione \"Enter\" para");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(240, 350, 130, 16);

        jLabel9.setText("confirmar las unidades.");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(230, 370, 140, 16);

        jPanelNombreT.setBackground(new java.awt.Color(204, 255, 255));
        jPanelNombreT.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 102), 5, true));
        jPanelNombreT.setLayout(new java.awt.GridBagLayout());

        jLabelNombreTienda.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabelNombreTienda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombreTienda.setText("Nombre de la tienda");
        jPanelNombreT.add(jLabelNombreTienda, new java.awt.GridBagConstraints());

        getContentPane().add(jPanelNombreT);
        jPanelNombreT.setBounds(140, 40, 240, 60);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoCostazul3.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 400, 533);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboProductosActionPerformed
        productoSeleccionado = vCompras.tiendaSeleccionada.getProductos().buscarProducto(jComboProductos.getSelectedItem().toString());
        jTextAreaDescripcion.setText(productoSeleccionado.getDescripcion());
        jLabelPrecio.setText("Precio: " + productoSeleccionado.getPrecio() + "$");
    }//GEN-LAST:event_jComboProductosActionPerformed

    private void jRadioButtonCOnlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonCOnlineActionPerformed
        jComboMetodoPago.removeAllItems();
        jComboMetodoPago.addItem("Zelle");
        jComboMetodoPago.addItem("PagoMovil");
        jComboMetodoPago.addItem("Transferencia");
    }//GEN-LAST:event_jRadioButtonCOnlineActionPerformed

    private void jRadioButtonCPresencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonCPresencialActionPerformed
        jComboMetodoPago.removeAllItems();
        jComboMetodoPago.addItem("Efectivo");
        jComboMetodoPago.addItem("TDC");
        jComboMetodoPago.addItem("TDD");
    }//GEN-LAST:event_jRadioButtonCPresencialActionPerformed

    private void jTextUnidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextUnidadesActionPerformed
        if(!jTextUnidades.getText().matches("^[0-9]+$") && Integer.parseInt(jTextUnidades.getText())==0){
            jLabel3.setText("Total:");
            jTextUnidades.setForeground(Color.red);
        } else{
            jTextUnidades.setForeground(Color.black);
            unidades = Integer.parseInt(jTextUnidades.getText());
            precioTotal = unidades*productoSeleccionado.getPrecio();
            jLabel3.setText("Total: " + precioTotal + "$");
        }
    }//GEN-LAST:event_jTextUnidadesActionPerformed

    private void jButtonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfirmarActionPerformed
        if(jTextUnidades.getText().matches("^[1-9]+$") && (jRadioButtonCOnline.isSelected() || jRadioButtonCPresencial.isSelected()) && !jLabel3.getText().equals("Total:")){
            if(jRadioButtonCOnline.isSelected()){
                personaActual.getCompras().agregarCompraAlFinal(new Compra(personaActual, tiendaSeleccionada, productoSeleccionado, unidades, precioTotal, jRadioButtonCOnline.getText(), jComboMetodoPago.getSelectedItem().toString()));
            } else{
                personaActual.getCompras().agregarCompraAlFinal(new Compra(personaActual, tiendaSeleccionada, productoSeleccionado, unidades, precioTotal, jRadioButtonCPresencial.getText(), jComboMetodoPago.getSelectedItem().toString()));
            }
            int c=JOptionPane.showConfirmDialog(this, "¿Desea realizar otra compra?", "Seleccione una opción:", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (c==0){
                vCompras VC = new vCompras();
            } else{
                if (DatosUsuario.usuariosEnSesion.getTamanio()<DatosUsuario.numUsuariosEnSesion){
                    DatosUsuario.puedeCarro=false;
                    DatosUsuario DU = new DatosUsuario();
                } else{
                    DatosUsuario.puedeCarro=true;
                    while (!DatosUsuario.usuariosEnSesion.esVacia()){
                        Bienvenido.personas.insertarPersona(DatosUsuario.usuariosEnSesion.sacarPersonaDePila());
                    }
                    try {
                        Bienvenido B = new Bienvenido();
                        B.setVisible(true);
                    } catch (IOException ex) {
                        Logger.getLogger(DatosUsuario.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            dispose();
        }
    }//GEN-LAST:event_jButtonConfirmarActionPerformed

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
            java.util.logging.Logger.getLogger(MenuCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuCompra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup botonesTCompra;
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JComboBox<String> jComboMetodoPago;
    private javax.swing.JComboBox<String> jComboProductos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelFoto;
    private javax.swing.JLabel jLabelNombreTienda;
    private javax.swing.JLabel jLabelPrecio;
    private javax.swing.JPanel jPanelNombreT;
    private javax.swing.JRadioButton jRadioButtonCOnline;
    private javax.swing.JRadioButton jRadioButtonCPresencial;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDescripcion;
    private javax.swing.JTextField jTextUnidades;
    // End of variables declaration//GEN-END:variables
}
