package Main;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Bienvenido extends javax.swing.JFrame {
    static int idPersona; //El ID que se le asignara a cada persona.
    static String diaActual; //Guarda el dia actual seleccionado
    static int horaActual; //Guarda la hora actual seleccionada
    static int minActual;//Guarda el minuto actual seleccionado
    static puestoEst[][] sectoresCarros = new puestoEst[5][500]; //Arreglo con los puestos de los carros
    static puestoEst[][] sectoresMotos = new puestoEst[2][100]; //Arreglo con los puestos de las motos
    static boolean primerInicio = true; //Para determinar si el programa se esta iniciando por primera vez o no
    static AVL tiendas = new AVL(); //Arbol balanceado de tiendas
    static String[] nombresTiendas = new String[60]; //Donde se guardan los nombres de las tiendas para los JCombo
    static AVL personas = new AVL(); //Arbol de personas registradas
    
    public Bienvenido() throws IOException {
        
        if (primerInicio){
            idPersona = 0;
            //Carga informacion de los puestos, tiendas y personas desde los archivos al sistema.
            archivoPuestos();
            archivoTiendas();
            archivoPersonas();
            primerInicio = false;
        } else{
            //Actualiza el archivo de puestos
            String s="";
            for (int i=0; i<5; i++){
                for (int j=0; j<500; j++){
                    if (sectoresCarros[i][j].getOcupantes().esVacia()){
                        s+= sectoresCarros[i][j].getSector() + "_" + sectoresCarros[i][j].getNumero() + "_" + "no" + "\n";
                    } else{
                        s+= sectoresCarros[i][j].getSector() + "_" + sectoresCarros[i][j].getNumero() + "_" + sectoresCarros[i][j].getOcupantes().datosOcupantes() + "\n";
                    }
                }
                if(i!=4){
                    s+= "-" + "\n";
                }
            }
            s+= "%" + "\n";
            for (int i=0; i<2; i++){
                for (int j=0; j<100; j++){
                    if (sectoresMotos[i][j].getOcupantes().esVacia()){
                        s+= sectoresMotos[i][j].getSector() + "_" + sectoresMotos[i][j].getNumero() + "_" + "no" + "\n";
                    } else{
                        s+= sectoresMotos[i][j].getSector() + "_" + sectoresMotos[i][j].getNumero() + "_" + sectoresMotos[i][j].getOcupantes().datosOcupantes() + "\n";
                    }
                }
                if(i!=1){
                    s+= "-" + "\n";
                }
            }
            Archivos.escribirArchivo(s, "Puestos.txt");
            //-----------------------------------------------------------------------------------------------------------------------------------------------------------------//
            //Actualiza archivo de personas.
            s = personas.obtenerDatosPersonas();
            Archivos.escribirArchivo(s, "Personas.txt");
        }
        
        initComponents();
        setSize(488, 660); //Tamano de la ventana.
        setLocationRelativeTo(null); //Para que la ventana se ubique en el centro de la pantalla.
        JComboDias.setVisible(false);
        JComboHoras.setVisible(false);
        jComboMinutos.setVisible(false);
        text1.setVisible(false);
        text2.setVisible(false);
        SubmitButton.setVisible(false);
        jButtonEditarInfo.setVisible(false);
    }

    public void archivoPuestos() throws IOException{ //Carga info del archivo Puestos.txt
        String s = Archivos.leerArchivo("Puestos.txt");
        if (s==null){
            for (int i=0; i<5; i++){
                for (int j=0; j<500; j++){
                    switch (i){
                        case 0:
                            s="M";
                            break;
                        case 1:
                            s="S";
                            break;
                        case 2:
                            s="R";
                            break;
                        case 3:
                            s="G";
                            break;
                        case 4:
                            s="B1";
                            break;
                    }
                sectoresCarros[i][j]= new puestoEst(s, j+1);
                }
            }
        
            for (int i=0; i<2; i++){
                for (int j=0; j<100; j++){
                    switch (i){
                        case 0:
                            s="P";
                            break;
                        case 1:
                            s="B2";
                            break;
                    }
                    sectoresMotos[i][j]= new puestoEst(s, j+1);
                }
            }

            s="";
            for (int i=0; i<5; i++){
                for (int j=0; j<500; j++){
                    s+= sectoresCarros[i][j].getSector() + "_" + sectoresCarros[i][j].getNumero() + "_" + "no" + "\n";
                }
                if(i!=4){
                    s+= "-" + "\n";
                }
            }
            s+= "%" + "\n";
            for (int i=0; i<2; i++){
                for (int j=0; j<100; j++){
                    s+= sectoresMotos[i][j].getSector() + "_" + sectoresMotos[i][j].getNumero() + "_" + "no" + "\n";
                }
                if(i!=1){
                    s+= "-" + "\n";
                }
            }
                
            Archivos.escribirArchivo(s, "Puestos.txt");
        } else{ //En caso de no existir, lo crea.
            String[] arreglosCM = s.split("%\n");
            String[] sectoresC = arreglosCM[0].split("-\n");
            String[] sectoresM = arreglosCM[1].split("-\n");
            String[] puestosP = sectoresM[0].split("\n");
            String[] puestosM = sectoresC[0].split("\n");
            String[] puestosS = sectoresC[1].split("\n");
            String[] puestosR = sectoresC[2].split("\n");
            String[] puestosG = sectoresC[3].split("\n");
            String[] puestosB1 = sectoresC[4].split("\n");
            String[] puestosB2 = sectoresM[1].split("\n");
            String[][] pM = new String[500][3];
            String[][] pS = new String[500][3];
            String[][] pR = new String[500][3];
            String[][] pG = new String[500][3];
            String[][] pB1 = new String[500][3];
            for (int i=0; i<500; i++){
                pM[i]=puestosM[i].split("_");
                pS[i]=puestosS[i].split("_");
                pR[i]=puestosR[i].split("_");
                pG[i]=puestosG[i].split("_");
                pB1[i]=puestosB1[i].split("_");
            }
            for(String[] p: pM){
                sectoresCarros[0][Integer.parseInt(p[1])-1]= new puestoEst(p[0], Integer.parseInt(p[1]));
                if (!p[2].equals("no")){
                    sectoresCarros[0][Integer.parseInt(p[1])-1].agregarOcupantes(p[2]);
                }
            }
            for(String[] p: pS){
                sectoresCarros[1][Integer.parseInt(p[1])-1]= new puestoEst(p[0], Integer.parseInt(p[1]));
                if (!p[2].equals("no")){
                    sectoresCarros[1][Integer.parseInt(p[1])-1].agregarOcupantes(p[2]);
                }
            }
            for(String[] p: pR){
                sectoresCarros[2][Integer.parseInt(p[1])-1]= new puestoEst(p[0], Integer.parseInt(p[1]));
                if (!p[2].equals("no")){
                    sectoresCarros[2][Integer.parseInt(p[1])-1].agregarOcupantes(p[2]);
                }
            }
            for(String[] p: pG){
                sectoresCarros[3][Integer.parseInt(p[1])-1]= new puestoEst(p[0], Integer.parseInt(p[1]));
                if (!p[2].equals("no")){
                    sectoresCarros[3][Integer.parseInt(p[1])-1].agregarOcupantes(p[2]);
                }
            }
            for(String[] p: pB1){
                sectoresCarros[4][Integer.parseInt(p[1])-1]= new puestoEst(p[0], Integer.parseInt(p[1]));
                if (!p[2].equals("no")){
                    sectoresCarros[4][Integer.parseInt(p[1])-1].agregarOcupantes(p[2]);
                }
            }
            String[][] pP = new String[100][3];
            String[][] pB2 = new String[100][3];
            for (int i=0; i<100; i++){
                pP[i]=puestosP[i].split("_");
                pB2[i]=puestosB2[i].split("_");
            }
            for(String[] p: pP){
                sectoresMotos[0][Integer.parseInt(p[1])-1]= new puestoEst(p[0], Integer.parseInt(p[1]));
                if (!p[2].equals("no")){
                    sectoresMotos[0][Integer.parseInt(p[1])-1].agregarOcupantes(p[2]);
                }
            }
            for(String[] p: pB2){
                sectoresMotos[1][Integer.parseInt(p[1])-1]= new puestoEst(p[0], Integer.parseInt(p[1]));
                if (!p[2].equals("no")){
                    sectoresMotos[1][Integer.parseInt(p[1])-1].agregarOcupantes(p[2]);
                }
            }
        }
    }
    
    public void archivoTiendas() throws IOException{ //Carga info del archivo Tiendas.txt
        String s = Archivos.leerArchivo("Tiendas.txt");
        String[] arrayTiendas = s.split("\n");
        int i=0;
        for (String tienda : arrayTiendas) {
            String[] datosTienda = tienda.split("_");
            tiendas.insertarTienda(new Tienda(datosTienda[0], datosTienda[1], datosTienda[2], Integer.parseInt(datosTienda[3]), datosTienda[4]));
            if(i<nombresTiendas.length){
                nombresTiendas[i++]=datosTienda[0];
            }
        }
    }
    
    public void archivoPersonas() throws IOException{ //Carga indo del archivo Personas.txt
        String s = Archivos.leerArchivo("Personas.txt");
        if(s==null || s.equals("")){
            Archivos.escribirArchivo("", "Personas.txt"); //Si no existe, lo crea
            return;
        }
        String[] arrayPersonas = s.split("\n");
        for (String persona : arrayPersonas) {
            String[] datosPersona = persona.split("_");
            Persona p = new Persona(Integer.parseInt(datosPersona[0]), datosPersona[1], datosPersona[2], datosPersona[3], datosPersona[4], datosPersona[5], Integer.parseInt(datosPersona[6]), Integer.parseInt(datosPersona[7]), Integer.parseInt(datosPersona[8]), Integer.parseInt(datosPersona[9]));
            if(datosPersona[10].equals("no")){
                p.setCarro(null);
            } else{
                String[] datosVehiculo = datosPersona[10].split("/");
                p.setCarro(new Vehiculo(p, datosVehiculo[0], datosVehiculo[1], datosVehiculo[2], datosVehiculo[3]));
            }
            if (!datosPersona[11].equals("no")){
                String[] datoscompras = datosPersona[11].split("-");
                for (String datoscompra : datoscompras) {
                    String[] compra = datoscompra.split("/");
                    Compra c = new Compra(p, Bienvenido.tiendas.buscarTienda(Integer.parseInt(compra[0])), Bienvenido.tiendas.buscarTienda(Integer.parseInt(compra[0])).getProductos().buscarProducto(compra[1]), Integer.parseInt(compra[2]), Double.parseDouble(compra[3]), compra[4], compra[5]);
                    p.getCompras().agregarCompraAlFinal(c);
                }
            }
            if(p.getID()>=Bienvenido.idPersona){
                Bienvenido.idPersona=p.getID()+1;
            }
            personas.insertarPersona(p); //Se insertan las personas en el archivo al arbol AVL
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

        SubmitButton = new javax.swing.JButton();
        text1 = new javax.swing.JLabel();
        JComboHoras = new javax.swing.JComboBox<>();
        JComboDias = new javax.swing.JComboBox<>();
        text2 = new javax.swing.JLabel();
        entrar = new javax.swing.JButton();
        jComboMinutos = new javax.swing.JComboBox<>();
        jButtonEditarInfo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bienvenido al Parque Costazul");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        setSize(new java.awt.Dimension(488, 488));
        getContentPane().setLayout(null);

        SubmitButton.setBackground(new java.awt.Color(153, 255, 255));
        SubmitButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SubmitButton.setText("Aceptar");
        SubmitButton.setEnabled(false);
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SubmitButton);
        SubmitButton.setBounds(180, 490, 130, 60);

        text1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        text1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text1.setText("Ingrese el día y hora actual");
        getContentPane().add(text1);
        text1.setBounds(130, 400, 240, 20);

        JComboHoras.setBackground(new java.awt.Color(204, 255, 255));
        JComboHoras.setMaximumRowCount(7);
        JComboHoras.setEnabled(false);
        JComboHoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JComboHorasActionPerformed(evt);
            }
        });
        getContentPane().add(JComboHoras);
        JComboHoras.setBounds(240, 430, 60, 40);

        JComboDias.setBackground(new java.awt.Color(204, 255, 255));
        JComboDias.setMaximumRowCount(7);
        JComboDias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"}));
        JComboDias.setEnabled(false);
        JComboDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JComboDiasActionPerformed(evt);
            }
        });
        getContentPane().add(JComboDias);
        JComboDias.setBounds(110, 430, 110, 40);

        text2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        text2.setText(":");
        getContentPane().add(text2);
        text2.setBounds(310, 440, 10, 16);

        entrar.setBackground(new java.awt.Color(153, 255, 255));
        entrar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        entrar.setText("Entrar");
        entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarActionPerformed(evt);
            }
        });
        getContentPane().add(entrar);
        entrar.setBounds(180, 410, 130, 60);

        jComboMinutos.setBackground(new java.awt.Color(204, 255, 255));
        jComboMinutos.setMaximumRowCount(7);
        jComboMinutos.setEnabled(false);
        getContentPane().add(jComboMinutos);
        jComboMinutos.setBounds(320, 430, 60, 40);

        jButtonEditarInfo.setBackground(new java.awt.Color(153, 255, 255));
        jButtonEditarInfo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonEditarInfo.setText("Editar Informacion");
        jButtonEditarInfo.setEnabled(false);
        jButtonEditarInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarInfoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEditarInfo);
        jButtonEditarInfo.setBounds(160, 560, 170, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Bienvenido.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -3, 490, 630);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarActionPerformed
        entrar.setVisible(false);
        entrar.setEnabled(false);
        JComboDias.setVisible(true);
        JComboDias.setEnabled(true);
        text1.setVisible(true);
        SubmitButton.setVisible(true);
        SubmitButton.setEnabled(false);
        jButtonEditarInfo.setVisible(true);
        jButtonEditarInfo.setEnabled(true);
    }//GEN-LAST:event_entrarActionPerformed

    private void JComboDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JComboDiasActionPerformed
        JComboHoras.setVisible(true);
        JComboHoras.setEnabled(true);
        jComboMinutos.setVisible(true);
        jComboMinutos.setEnabled(true);
        text2.setVisible(true);
        JComboHoras.removeAllItems();
        for(int i=11; i<21;i++){
            JComboHoras.addItem(i);
        }
        switch (JComboDias.getSelectedIndex()){
            case 0:
                diaActual = "Lunes";
                break;
            case 1:
                diaActual = "Martes";
                break;
            case 2:
                diaActual = "Miércoles";
                break;
            case 3:
                diaActual = "Jueves";
                break;
            case 4:
                diaActual = "Viernes";
                break;
            case 5:
                diaActual = "Sábado";
                break;
            case 6:
                diaActual = "Domingo";
                JComboHoras.removeAllItems();
                for(int i=12; i<20;i++){
                    JComboHoras.addItem(i);
                }
                break;
        }
    }//GEN-LAST:event_JComboDiasActionPerformed

    private void JComboHorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JComboHorasActionPerformed
        SubmitButton.setEnabled(true);
        jComboMinutos.removeAllItems();
        for(int i=0; i<60;i++){
            if (i<10){
                jComboMinutos.addItem("0"+i);
            } else{
                jComboMinutos.addItem(String.valueOf(i));
            }
        }
    }//GEN-LAST:event_JComboHorasActionPerformed

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
        horaActual = Integer.parseInt(JComboHoras.getSelectedItem().toString());
        minActual = Integer.parseInt(jComboMinutos.getSelectedItem().toString());
        dispose();
        DatosUsuario DU = new DatosUsuario();
    }//GEN-LAST:event_SubmitButtonActionPerformed

    private void jButtonEditarInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarInfoActionPerformed
        dispose();
        menuEditar MU = new menuEditar();
    }//GEN-LAST:event_jButtonEditarInfoActionPerformed

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
            java.util.logging.Logger.getLogger(Bienvenido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bienvenido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bienvenido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bienvenido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Bienvenido().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Bienvenido.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JComboDias;
    private javax.swing.JComboBox<Integer> JComboHoras;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JButton entrar;
    private javax.swing.JButton jButtonEditarInfo;
    private javax.swing.JComboBox<String> jComboMinutos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel text2;
    // End of variables declaration//GEN-END:variables
}
