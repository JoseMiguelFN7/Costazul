package Main;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class vCompras extends javax.swing.JFrame {
    static Tienda tiendaSeleccionada = null;
    
    public vCompras() {
        initComponents();
        setVisible(true);
        setSize(1670, 675); //Tamano de la ventana.
        setLocationRelativeTo(null); //Para que la ventana se ubique en el centro de la pantalla.
        for(int i=0; i<Bienvenido.nombresTiendas.length; i++){
            jComboTiendas.addItem(Bienvenido.nombresTiendas[i]);
        }
        jPanelNoTienda.setVisible(false);
        jLabelCVacio.setVisible(false);
        jPanelTienda.setVisible(false);
    }

    public void conseguirValorTienda(int numLocal){ //Para mostrar los datos de la tienda seleccionada en el panel
        jPanelTienda.setVisible(true);
        Tienda t = Bienvenido.tiendas.buscarTienda(numLocal);
        jLabelNombreTienda.setText("Nombre: " + t.getNombre());
        jLabelEncargado.setText("Encargado: " + t.getEncargado());
        jLabelUbicacion.setText("Ubicación: Entrada " + t.getUbicacion());
        jLabelLocal.setText("Local: L" + t.getLocal());
        tiendaSeleccionada = t;
        jLabelFoto.setIcon(determinarLogo(numLocal));
    }
    public void mostrarNombreTienda(int numLocal, javax.swing.JLabel jlabel){
        jLabelCVacio.setVisible(true);
        Tienda t = Bienvenido.tiendas.buscarTienda(numLocal);
        jLabelCVacio.setText(t.getNombre());
        jLabelCVacio.setBounds(jlabel.getX()-jLabelCVacio.getWidth()/2+jlabel.getWidth()/2, jlabel.getY()-jLabelCVacio.getHeight()+jlabel.getHeight()/2, jLabelCVacio.getWidth(), jLabelCVacio.getHeight());
    }
    
    public Icon determinarLogo(int numLocal){ //Para determinar el logo que se mostrara en el panel
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

        jLabelCVacio = new javax.swing.JLabel();
        jLabelEntradaPalma = new javax.swing.JLabel();
        jLabelEntradaMangle = new javax.swing.JLabel();
        jLabelEntradaSaman = new javax.swing.JLabel();
        jLabelEntradaRoble = new javax.swing.JLabel();
        jLabelEntradaGuayacan = new javax.swing.JLabel();
        jPanelTienda = new javax.swing.JPanel();
        jLabelFoto = new javax.swing.JLabel();
        jLabelNombreTienda = new javax.swing.JLabel();
        jLabelEncargado = new javax.swing.JLabel();
        jLabelUbicacion = new javax.swing.JLabel();
        jLabelLocal = new javax.swing.JLabel();
        Local1 = new javax.swing.JLabel();
        Local2 = new javax.swing.JLabel();
        Local3 = new javax.swing.JLabel();
        Local4 = new javax.swing.JLabel();
        Local5 = new javax.swing.JLabel();
        Local6 = new javax.swing.JLabel();
        Local7 = new javax.swing.JLabel();
        Local8 = new javax.swing.JLabel();
        Local9 = new javax.swing.JLabel();
        Local10 = new javax.swing.JLabel();
        Local11 = new javax.swing.JLabel();
        Local12 = new javax.swing.JLabel();
        Local13 = new javax.swing.JLabel();
        Local26 = new javax.swing.JLabel();
        Local14 = new javax.swing.JLabel();
        jLabelEntradaBambu = new javax.swing.JLabel();
        Local15 = new javax.swing.JLabel();
        Local17 = new javax.swing.JLabel();
        Local18 = new javax.swing.JLabel();
        Local19 = new javax.swing.JLabel();
        Local20 = new javax.swing.JLabel();
        Local21 = new javax.swing.JLabel();
        Local22 = new javax.swing.JLabel();
        Local23 = new javax.swing.JLabel();
        Local24 = new javax.swing.JLabel();
        Local25 = new javax.swing.JLabel();
        Local27 = new javax.swing.JLabel();
        Local29 = new javax.swing.JLabel();
        Local30 = new javax.swing.JLabel();
        Local31 = new javax.swing.JLabel();
        Local32 = new javax.swing.JLabel();
        Local33 = new javax.swing.JLabel();
        Local34 = new javax.swing.JLabel();
        Local35 = new javax.swing.JLabel();
        Local36 = new javax.swing.JLabel();
        Local37 = new javax.swing.JLabel();
        Local38 = new javax.swing.JLabel();
        Local39 = new javax.swing.JLabel();
        Local40 = new javax.swing.JLabel();
        Local41 = new javax.swing.JLabel();
        Local42 = new javax.swing.JLabel();
        Local43 = new javax.swing.JLabel();
        Local44 = new javax.swing.JLabel();
        Local45 = new javax.swing.JLabel();
        Local46 = new javax.swing.JLabel();
        Local47 = new javax.swing.JLabel();
        Local48 = new javax.swing.JLabel();
        Local49 = new javax.swing.JLabel();
        Local50 = new javax.swing.JLabel();
        Local51 = new javax.swing.JLabel();
        Local52 = new javax.swing.JLabel();
        Local53 = new javax.swing.JLabel();
        Local54 = new javax.swing.JLabel();
        Local55 = new javax.swing.JLabel();
        Local56 = new javax.swing.JLabel();
        Local57 = new javax.swing.JLabel();
        Local58 = new javax.swing.JLabel();
        Local59 = new javax.swing.JLabel();
        Local60 = new javax.swing.JLabel();
        jComboTiendas = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jPanelNoTienda = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Local16 = new javax.swing.JLabel();
        Local28 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Seleccione la tienda");
        setResizable(false);
        getContentPane().setLayout(null);

        jLabelCVacio.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelCVacio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCVacio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CVacio.png"))); // NOI18N
        jLabelCVacio.setText("dbfdfv");
        jLabelCVacio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabelCVacio);
        jLabelCVacio.setBounds(780, 510, 351, 94);

        jLabelEntradaPalma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cartelEntradaPalma.png"))); // NOI18N
        getContentPane().add(jLabelEntradaPalma);
        jLabelEntradaPalma.setBounds(130, 20, 167, 101);

        jLabelEntradaMangle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cartelEntradaMangle.png"))); // NOI18N
        getContentPane().add(jLabelEntradaMangle);
        jLabelEntradaMangle.setBounds(70, 290, 176, 101);

        jLabelEntradaSaman.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabelEntradaSaman.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEntradaSaman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cartelEntradaSaman.png"))); // NOI18N
        getContentPane().add(jLabelEntradaSaman);
        jLabelEntradaSaman.setBounds(430, 370, 187, 107);

        jLabelEntradaRoble.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cartelEntradaRoble.png"))); // NOI18N
        getContentPane().add(jLabelEntradaRoble);
        jLabelEntradaRoble.setBounds(570, 470, 187, 107);

        jLabelEntradaGuayacan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cartelEntradaGuayacan.png"))); // NOI18N
        getContentPane().add(jLabelEntradaGuayacan);
        jLabelEntradaGuayacan.setBounds(1180, 480, 189, 108);

        jPanelTienda.setBackground(new java.awt.Color(204, 255, 255));
        jPanelTienda.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 102), 5, true));

        jLabelFoto.setText("foto");

        jLabelNombreTienda.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabelNombreTienda.setText("Nombre");

        jLabelEncargado.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabelEncargado.setText("Encargado");

        jLabelUbicacion.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabelUbicacion.setText("Ubicacion");

        jLabelLocal.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabelLocal.setText("Local");

        javax.swing.GroupLayout jPanelTiendaLayout = new javax.swing.GroupLayout(jPanelTienda);
        jPanelTienda.setLayout(jPanelTiendaLayout);
        jPanelTiendaLayout.setHorizontalGroup(
            jPanelTiendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTiendaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelTiendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelLocal)
                    .addComponent(jLabelUbicacion)
                    .addComponent(jLabelEncargado)
                    .addComponent(jLabelNombreTienda))
                .addContainerGap(171, Short.MAX_VALUE))
        );
        jPanelTiendaLayout.setVerticalGroup(
            jPanelTiendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTiendaLayout.createSequentialGroup()
                .addGroup(jPanelTiendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTiendaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelNombreTienda)
                        .addGap(10, 10, 10)
                        .addComponent(jLabelEncargado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelUbicacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelLocal))
                    .addGroup(jPanelTiendaLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelTienda);
        jPanelTienda.setBounds(20, 420, 390, 150);

        Local1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Local1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Local1.setText("L1");
        Local1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Local1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Local1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EsconderCartelMouseExit(evt);
            }
        });
        getContentPane().add(Local1);
        Local1.setBounds(170, 140, 110, 50);

        Local2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Local2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Local2.setText("L2");
        Local2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Local2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Local2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EsconderCartelMouseExit(evt);
            }
        });
        getContentPane().add(Local2);
        Local2.setBounds(341, 116, 60, 63);

        Local3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Local3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Local3.setText("L3");
        Local3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Local3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Local3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EsconderCartelMouseExit(evt);
            }
        });
        getContentPane().add(Local3);
        Local3.setBounds(401, 116, 40, 60);

        Local4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Local4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Local4.setText("L4");
        Local4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Local4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Local4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EsconderCartelMouseExit(evt);
            }
        });
        getContentPane().add(Local4);
        Local4.setBounds(441, 116, 32, 60);

        Local5.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Local5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Local5.setText("L5");
        Local5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Local5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Local5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EsconderCartelMouseExit(evt);
            }
        });
        getContentPane().add(Local5);
        Local5.setBounds(476, 118, 34, 60);

        Local6.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Local6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Local6.setText("L6");
        Local6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Local6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Local6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EsconderCartelMouseExit(evt);
            }
        });
        getContentPane().add(Local6);
        Local6.setBounds(510, 126, 37, 60);

        Local7.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Local7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Local7.setText("L7");
        Local7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Local7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Local7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EsconderCartelMouseExit(evt);
            }
        });
        getContentPane().add(Local7);
        Local7.setBounds(550, 136, 30, 50);

        Local8.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Local8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Local8.setText("L8");
        Local8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Local8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Local8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EsconderCartelMouseExit(evt);
            }
        });
        getContentPane().add(Local8);
        Local8.setBounds(584, 144, 31, 60);

        Local9.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Local9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Local9.setText("L9");
        Local9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Local9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Local9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EsconderCartelMouseExit(evt);
            }
        });
        getContentPane().add(Local9);
        Local9.setBounds(618, 156, 33, 70);

        Local10.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Local10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Local10.setText("L10");
        Local10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Local10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Local10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EsconderCartelMouseExit(evt);
            }
        });
        getContentPane().add(Local10);
        Local10.setBounds(652, 166, 30, 70);

        Local11.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Local11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Local11.setText("L11");
        Local11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Local11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Local11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EsconderCartelMouseExit(evt);
            }
        });
        getContentPane().add(Local11);
        Local11.setBounds(683, 160, 57, 90);

        Local12.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Local12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Local12.setText("L12");
        Local12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Local12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Local12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EsconderCartelMouseExit(evt);
            }
        });
        getContentPane().add(Local12);
        Local12.setBounds(740, 170, 37, 84);

        Local13.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Local13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Local13.setText("L13");
        Local13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Local13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Local13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EsconderCartelMouseExit(evt);
            }
        });
        getContentPane().add(Local13);
        Local13.setBounds(778, 186, 59, 70);

        Local26.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Local26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Local26.setText("L26");
        Local26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Local26MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Local26MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EsconderCartelMouseExit(evt);
            }
        });
        getContentPane().add(Local26);
        Local26.setBounds(1450, 96, 70, 110);

        Local14.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Local14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Local14.setText("L14");
        Local14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Local14MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Local14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EsconderCartelMouseExit(evt);
            }
        });
        getContentPane().add(Local14);
        Local14.setBounds(840, 192, 55, 65);

        jLabelEntradaBambu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cartelEntradaBambu.png"))); // NOI18N
        getContentPane().add(jLabelEntradaBambu);
        jLabelEntradaBambu.setBounds(1490, 50, 155, 192);

        Local15.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Local15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Local15.setText("L15");
        Local15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Local15MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Local15MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EsconderCartelMouseExit(evt);
            }
        });
        getContentPane().add(Local15);
        Local15.setBounds(896, 196, 50, 60);

        Local17.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Local17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Local17.setText("L17");
        Local17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Local17MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Local17MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EsconderCartelMouseExit(evt);
            }
        });
        getContentPane().add(Local17);
        Local17.setBounds(996, 176, 44, 80);

        Local18.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Local18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Local18.setText("L18");
        Local18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Local18MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Local18MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EsconderCartelMouseExit(evt);
            }
        });
        getContentPane().add(Local18);
        Local18.setBounds(1040, 156, 74, 90);

        Local19.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Local19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Local19.setText("L19");
        Local19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Local19MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Local19MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EsconderCartelMouseExit(evt);
            }
        });
        getContentPane().add(Local19);
        Local19.setBounds(1117, 143, 60, 93);

        Local20.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Local20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Local20.setText("L20");
        Local20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Local20MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Local20MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EsconderCartelMouseExit(evt);
            }
        });
        getContentPane().add(Local20);
        Local20.setBounds(1180, 140, 40, 93);

        Local21.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Local21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Local21.setText("L21");
        Local21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Local21MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Local21MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EsconderCartelMouseExit(evt);
            }
        });
        getContentPane().add(Local21);
        Local21.setBounds(1222, 146, 55, 83);

        Local22.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Local22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Local22.setText("L22");
        Local22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Local22MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Local22MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EsconderCartelMouseExit(evt);
            }
        });
        getContentPane().add(Local22);
        Local22.setBounds(1278, 147, 50, 82);

        Local23.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Local23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Local23.setText("L23");
        Local23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Local23MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Local23MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EsconderCartelMouseExit(evt);
            }
        });
        getContentPane().add(Local23);
        Local23.setBounds(1330, 136, 38, 85);

        Local24.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Local24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Local24.setText("L24");
        Local24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Local24MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Local24MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EsconderCartelMouseExit(evt);
            }
        });
        getContentPane().add(Local24);
        Local24.setBounds(1368, 126, 40, 90);

        Local25.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Local25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Local25.setText("L25");
        Local25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Local25MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Local25MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EsconderCartelMouseExit(evt);
            }
        });
        getContentPane().add(Local25);
        Local25.setBounds(1410, 106, 40, 100);

        Local27.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Local27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Local27.setText("L27");
        Local27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Local27MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Local27MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EsconderCartelMouseExit(evt);
            }
        });
        getContentPane().add(Local27);
        Local27.setBounds(1498, 294, 60, 79);

        Local29.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Local29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Local29.setText("L29");
        Local29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Local29MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Local29MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EsconderCartelMouseExit(evt);
            }
        });
        getContentPane().add(Local29);
        Local29.setBounds(1406, 326, 42, 70);

        Local30.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Local30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Local30.setText("L30");
        Local30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Local30MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Local30MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EsconderCartelMouseExit(evt);
            }
        });
        getContentPane().add(Local30);
        Local30.setBounds(1360, 356, 46, 90);

        Local31.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Local31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Local31.setText("L31");
        Local31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Local31MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Local31MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EsconderCartelMouseExit(evt);
            }
        });
        getContentPane().add(Local31);
        Local31.setBounds(1314, 376, 45, 80);

        Local32.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Local32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Local32.setText("L32");
        Local32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Local32MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Local32MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EsconderCartelMouseExit(evt);
            }
        });
        getContentPane().add(Local32);
        Local32.setBounds(1230, 396, 84, 64);

        Local33.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Local33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Local33.setText("L33");
        Local33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Local33MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Local33MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EsconderCartelMouseExit(evt);
            }
        });
        getContentPane().add(Local33);
        Local33.setBounds(1130, 424, 42, 47);

        Local34.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Local34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Local34.setText("L34");
        Local34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Local34MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Local34MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EsconderCartelMouseExit(evt);
            }
        });
        getContentPane().add(Local34);
        Local34.setBounds(1090, 416, 40, 50);

        Local35.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Local35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Local35.setText("L35");
        Local35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Local35MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Local35MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EsconderCartelMouseExit(evt);
            }
        });
        getContentPane().add(Local35);
        Local35.setBounds(1033, 404, 58, 53);

        Local36.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Local36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Local36.setText("L36");
        Local36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Local36MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Local36MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EsconderCartelMouseExit(evt);
            }
        });
        getContentPane().add(Local36);
        Local36.setBounds(712, 345, 30, 40);

        Local37.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Local37.setForeground(new java.awt.Color(255, 255, 255));
        Local37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Local37.setText("L37");
        Local37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Local37MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Local37MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EsconderCartelMouseExit(evt);
            }
        });
        getContentPane().add(Local37);
        Local37.setBounds(670, 344, 40, 40);

        Local38.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Local38.setForeground(new java.awt.Color(255, 255, 255));
        Local38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Local38.setText("L38");
        Local38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Local38MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Local38MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EsconderCartelMouseExit(evt);
            }
        });
        getContentPane().add(Local38);
        Local38.setBounds(628, 329, 40, 42);

        Local39.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Local39.setForeground(new java.awt.Color(255, 255, 255));
        Local39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Local39.setText("L39");
        Local39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Local39MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Local39MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EsconderCartelMouseExit(evt);
            }
        });
        getContentPane().add(Local39);
        Local39.setBounds(525, 324, 50, 38);

        Local40.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Local40.setForeground(new java.awt.Color(255, 255, 255));
        Local40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Local40.setText("L40");
        Local40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Local40MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Local40MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EsconderCartelMouseExit(evt);
            }
        });
        getContentPane().add(Local40);
        Local40.setBounds(474, 310, 50, 41);

        Local41.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Local41.setForeground(new java.awt.Color(255, 255, 255));
        Local41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Local41.setText("L41");
        Local41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Local41MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Local41MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EsconderCartelMouseExit(evt);
            }
        });
        getContentPane().add(Local41);
        Local41.setBounds(426, 312, 50, 60);

        Local42.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Local42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Local42.setText("L42");
        Local42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Local42MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Local42MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EsconderCartelMouseExit(evt);
            }
        });
        getContentPane().add(Local42);
        Local42.setBounds(395, 323, 30, 45);

        Local43.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Local43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Local43.setText("L43");
        Local43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Local43MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Local43MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EsconderCartelMouseExit(evt);
            }
        });
        getContentPane().add(Local43);
        Local43.setBounds(363, 315, 30, 48);

        Local44.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Local44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Local44.setText("L44");
        Local44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Local44MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Local44MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EsconderCartelMouseExit(evt);
            }
        });
        getContentPane().add(Local44);
        Local44.setBounds(332, 303, 30, 52);

        Local45.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Local45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Local45.setText("L45");
        Local45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Local45MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Local45MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EsconderCartelMouseExit(evt);
            }
        });
        getContentPane().add(Local45);
        Local45.setBounds(280, 290, 50, 50);

        Local46.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Local46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Local46.setText("L46");
        Local46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Local46MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Local46MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EsconderCartelMouseExit(evt);
            }
        });
        getContentPane().add(Local46);
        Local46.setBounds(177, 194, 103, 70);

        Local47.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Local47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Local47.setText("L47");
        Local47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Local47MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Local47MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EsconderCartelMouseExit(evt);
            }
        });
        getContentPane().add(Local47);
        Local47.setBounds(360, 216, 40, 50);

        Local48.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Local48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Local48.setText("L48");
        Local48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Local48MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Local48MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EsconderCartelMouseExit(evt);
            }
        });
        getContentPane().add(Local48);
        Local48.setBounds(399, 226, 30, 50);

        Local49.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Local49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Local49.setText("L49");
        Local49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Local49MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Local49MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EsconderCartelMouseExit(evt);
            }
        });
        getContentPane().add(Local49);
        Local49.setBounds(431, 228, 37, 50);

        Local50.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Local50.setForeground(new java.awt.Color(255, 255, 255));
        Local50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Local50.setText("L50");
        Local50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Local50MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Local50MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EsconderCartelMouseExit(evt);
            }
        });
        getContentPane().add(Local50);
        Local50.setBounds(470, 230, 34, 50);

        Local51.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Local51.setForeground(new java.awt.Color(255, 255, 255));
        Local51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Local51.setText("L51");
        Local51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Local51MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Local51MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EsconderCartelMouseExit(evt);
            }
        });
        getContentPane().add(Local51);
        Local51.setBounds(505, 234, 30, 50);

        Local52.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Local52.setForeground(new java.awt.Color(255, 255, 255));
        Local52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Local52.setText("L52");
        Local52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Local52MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Local52MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EsconderCartelMouseExit(evt);
            }
        });
        getContentPane().add(Local52);
        Local52.setBounds(538, 236, 38, 52);

        Local53.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Local53.setForeground(new java.awt.Color(255, 255, 255));
        Local53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Local53.setText("L53");
        Local53.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Local53MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Local53MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EsconderCartelMouseExit(evt);
            }
        });
        getContentPane().add(Local53);
        Local53.setBounds(578, 246, 48, 48);

        Local54.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Local54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Local54.setText("L54");
        Local54.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Local54MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Local54MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EsconderCartelMouseExit(evt);
            }
        });
        getContentPane().add(Local54);
        Local54.setBounds(800, 306, 41, 40);

        Local55.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Local55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Local55.setText("L55");
        Local55.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Local55MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Local55MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EsconderCartelMouseExit(evt);
            }
        });
        getContentPane().add(Local55);
        Local55.setBounds(844, 310, 40, 35);

        Local56.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Local56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Local56.setText("L56");
        Local56.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Local56MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Local56MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EsconderCartelMouseExit(evt);
            }
        });
        getContentPane().add(Local56);
        Local56.setBounds(887, 310, 48, 40);

        Local57.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Local57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Local57.setText("L57");
        Local57.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Local57MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Local57MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EsconderCartelMouseExit(evt);
            }
        });
        getContentPane().add(Local57);
        Local57.setBounds(1130, 296, 50, 50);

        Local58.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Local58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Local58.setText("L58");
        Local58.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Local58MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Local58MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EsconderCartelMouseExit(evt);
            }
        });
        getContentPane().add(Local58);
        Local58.setBounds(1180, 296, 43, 47);

        Local59.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Local59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Local59.setText("L59");
        Local59.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Local59MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Local59MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EsconderCartelMouseExit(evt);
            }
        });
        getContentPane().add(Local59);
        Local59.setBounds(1224, 293, 50, 50);

        Local60.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Local60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Local60.setText("L60");
        Local60.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Local60MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Local60MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EsconderCartelMouseExit(evt);
            }
        });
        getContentPane().add(Local60);
        Local60.setBounds(1275, 277, 58, 56);

        jComboTiendas.setBackground(new java.awt.Color(204, 255, 255));
        jComboTiendas.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jComboTiendas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una tienda..." }));
        jComboTiendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboTiendasActionPerformed(evt);
            }
        });
        getContentPane().add(jComboTiendas);
        jComboTiendas.setBounds(690, 50, 200, 40);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Confirmar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(910, 50, 140, 40);

        jPanelNoTienda.setBackground(new java.awt.Color(204, 255, 255));
        jPanelNoTienda.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 102), 5, true));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("No seleccionó ninguna tienda.");
        jPanelNoTienda.add(jLabel3);

        getContentPane().add(jPanelNoTienda);
        jPanelNoTienda.setBounds(1080, 50, 280, 40);

        Local16.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Local16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Local16.setText("L16");
        Local16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Local16MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Local16MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EsconderCartelMouseExit(evt);
            }
        });
        getContentPane().add(Local16);
        Local16.setBounds(948, 188, 46, 70);

        Local28.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        Local28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Local28.setText("L28");
        Local28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Local28MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Local28MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EsconderCartelMouseExit(evt);
            }
        });
        getContentPane().add(Local28);
        Local28.setBounds(1450, 310, 45, 73);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MapaCostazulTiendas.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1665, 642);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Local1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local1MouseClicked
        conseguirValorTienda(1);
    }//GEN-LAST:event_Local1MouseClicked

    private void Local2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local2MouseClicked
        conseguirValorTienda(2);
    }//GEN-LAST:event_Local2MouseClicked

    private void Local3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local3MouseClicked
        conseguirValorTienda(3);
    }//GEN-LAST:event_Local3MouseClicked

    private void Local4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local4MouseClicked
        conseguirValorTienda(4);
    }//GEN-LAST:event_Local4MouseClicked

    private void Local5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local5MouseClicked
        conseguirValorTienda(5);
    }//GEN-LAST:event_Local5MouseClicked

    private void Local6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local6MouseClicked
        conseguirValorTienda(6);
    }//GEN-LAST:event_Local6MouseClicked

    private void Local7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local7MouseClicked
        conseguirValorTienda(7);
    }//GEN-LAST:event_Local7MouseClicked

    private void Local8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local8MouseClicked
        conseguirValorTienda(8);
    }//GEN-LAST:event_Local8MouseClicked

    private void Local9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local9MouseClicked
        conseguirValorTienda(9);
    }//GEN-LAST:event_Local9MouseClicked

    private void Local10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local10MouseClicked
        conseguirValorTienda(10);
    }//GEN-LAST:event_Local10MouseClicked

    private void Local11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local11MouseClicked
        conseguirValorTienda(11);
    }//GEN-LAST:event_Local11MouseClicked

    private void Local12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local12MouseClicked
        conseguirValorTienda(12);
    }//GEN-LAST:event_Local12MouseClicked

    private void Local13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local13MouseClicked
        conseguirValorTienda(13);
    }//GEN-LAST:event_Local13MouseClicked

    private void Local14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local14MouseClicked
        conseguirValorTienda(14);
    }//GEN-LAST:event_Local14MouseClicked

    private void Local15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local15MouseClicked
        conseguirValorTienda(15);
    }//GEN-LAST:event_Local15MouseClicked

    private void Local16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local16MouseClicked
        conseguirValorTienda(16);
    }//GEN-LAST:event_Local16MouseClicked

    private void Local17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local17MouseClicked
        conseguirValorTienda(17);
    }//GEN-LAST:event_Local17MouseClicked

    private void Local18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local18MouseClicked
        conseguirValorTienda(18);
    }//GEN-LAST:event_Local18MouseClicked

    private void Local19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local19MouseClicked
        conseguirValorTienda(19);
    }//GEN-LAST:event_Local19MouseClicked

    private void Local20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local20MouseClicked
        conseguirValorTienda(20);
    }//GEN-LAST:event_Local20MouseClicked

    private void Local21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local21MouseClicked
        conseguirValorTienda(21);
    }//GEN-LAST:event_Local21MouseClicked

    private void Local22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local22MouseClicked
        conseguirValorTienda(22);
    }//GEN-LAST:event_Local22MouseClicked

    private void Local23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local23MouseClicked
        conseguirValorTienda(23);
    }//GEN-LAST:event_Local23MouseClicked

    private void Local24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local24MouseClicked
        conseguirValorTienda(24);
    }//GEN-LAST:event_Local24MouseClicked

    private void Local25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local25MouseClicked
        conseguirValorTienda(25);
    }//GEN-LAST:event_Local25MouseClicked

    private void Local26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local26MouseClicked
        conseguirValorTienda(26);
    }//GEN-LAST:event_Local26MouseClicked

    private void Local27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local27MouseClicked
        conseguirValorTienda(27);
    }//GEN-LAST:event_Local27MouseClicked

    private void Local28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local28MouseClicked
        conseguirValorTienda(28);
    }//GEN-LAST:event_Local28MouseClicked

    private void Local29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local29MouseClicked
        conseguirValorTienda(29);
    }//GEN-LAST:event_Local29MouseClicked

    private void Local30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local30MouseClicked
        conseguirValorTienda(30);
    }//GEN-LAST:event_Local30MouseClicked

    private void Local31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local31MouseClicked
        conseguirValorTienda(31);
    }//GEN-LAST:event_Local31MouseClicked

    private void Local32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local32MouseClicked
        conseguirValorTienda(32);
    }//GEN-LAST:event_Local32MouseClicked

    private void Local33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local33MouseClicked
        conseguirValorTienda(33);
    }//GEN-LAST:event_Local33MouseClicked

    private void Local34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local34MouseClicked
        conseguirValorTienda(34);
    }//GEN-LAST:event_Local34MouseClicked

    private void Local35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local35MouseClicked
        conseguirValorTienda(35);
    }//GEN-LAST:event_Local35MouseClicked

    private void Local36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local36MouseClicked
        conseguirValorTienda(36);
    }//GEN-LAST:event_Local36MouseClicked

    private void Local37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local37MouseClicked
        conseguirValorTienda(37);
    }//GEN-LAST:event_Local37MouseClicked

    private void Local38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local38MouseClicked
        conseguirValorTienda(38);
    }//GEN-LAST:event_Local38MouseClicked

    private void Local39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local39MouseClicked
        conseguirValorTienda(39);
    }//GEN-LAST:event_Local39MouseClicked

    private void Local40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local40MouseClicked
        conseguirValorTienda(40);
    }//GEN-LAST:event_Local40MouseClicked

    private void Local41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local41MouseClicked
        conseguirValorTienda(41);
    }//GEN-LAST:event_Local41MouseClicked

    private void Local42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local42MouseClicked
        conseguirValorTienda(42);
    }//GEN-LAST:event_Local42MouseClicked

    private void Local43MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local43MouseClicked
        conseguirValorTienda(43);
    }//GEN-LAST:event_Local43MouseClicked

    private void Local44MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local44MouseClicked
        conseguirValorTienda(44);
    }//GEN-LAST:event_Local44MouseClicked

    private void Local45MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local45MouseClicked
        conseguirValorTienda(45);
    }//GEN-LAST:event_Local45MouseClicked

    private void Local46MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local46MouseClicked
        conseguirValorTienda(46);
    }//GEN-LAST:event_Local46MouseClicked

    private void Local47MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local47MouseClicked
        conseguirValorTienda(47);
    }//GEN-LAST:event_Local47MouseClicked

    private void Local48MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local48MouseClicked
        conseguirValorTienda(48);
    }//GEN-LAST:event_Local48MouseClicked

    private void Local49MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local49MouseClicked
        conseguirValorTienda(49);
    }//GEN-LAST:event_Local49MouseClicked

    private void Local50MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local50MouseClicked
        conseguirValorTienda(50);
    }//GEN-LAST:event_Local50MouseClicked

    private void Local51MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local51MouseClicked
        conseguirValorTienda(51);
    }//GEN-LAST:event_Local51MouseClicked

    private void Local52MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local52MouseClicked
        conseguirValorTienda(52);
    }//GEN-LAST:event_Local52MouseClicked

    private void Local53MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local53MouseClicked
        conseguirValorTienda(53);
    }//GEN-LAST:event_Local53MouseClicked

    private void Local54MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local54MouseClicked
        conseguirValorTienda(54);
    }//GEN-LAST:event_Local54MouseClicked

    private void Local55MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local55MouseClicked
        conseguirValorTienda(55);
    }//GEN-LAST:event_Local55MouseClicked

    private void Local56MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local56MouseClicked
        conseguirValorTienda(56);
    }//GEN-LAST:event_Local56MouseClicked

    private void Local57MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local57MouseClicked
        conseguirValorTienda(57);
    }//GEN-LAST:event_Local57MouseClicked

    private void Local58MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local58MouseClicked
        conseguirValorTienda(58);
    }//GEN-LAST:event_Local58MouseClicked

    private void Local59MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local59MouseClicked
        conseguirValorTienda(59);
    }//GEN-LAST:event_Local59MouseClicked

    private void Local60MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local60MouseClicked
        conseguirValorTienda(60);
    }//GEN-LAST:event_Local60MouseClicked

    private void jComboTiendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboTiendasActionPerformed
        if(jComboTiendas.getSelectedIndex()!=0){
            conseguirValorTienda(jComboTiendas.getSelectedIndex());
        } else{
            jLabelNombreTienda.setText("Nombre: ");
            jLabelEncargado.setText("Encargado: ");
            jLabelUbicacion.setText("Ubicación: Entrada ");
            jLabelLocal.setText("Local:");
            tiendaSeleccionada = null;
        }
    }//GEN-LAST:event_jComboTiendasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (tiendaSeleccionada!=null){
            MenuCompra MC = new MenuCompra();
            MC.setVisible(true);
            dispose();
        } else{
            jPanelNoTienda.setVisible(true);
            new Thread(){
                public void run(){
                    try{
                        Thread.sleep(2500);
                        jPanelNoTienda.setVisible(false);
                    }catch(Exception q){}
                }
            }.start();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Local1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local1MouseEntered
        mostrarNombreTienda(1, Local1);
    }//GEN-LAST:event_Local1MouseEntered

    private void Local2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local2MouseEntered
        mostrarNombreTienda(2, Local2);
    }//GEN-LAST:event_Local2MouseEntered

    private void Local3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local3MouseEntered
        mostrarNombreTienda(3, Local3);
    }//GEN-LAST:event_Local3MouseEntered

    private void Local4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local4MouseEntered
        mostrarNombreTienda(4, Local4);
    }//GEN-LAST:event_Local4MouseEntered

    private void Local5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local5MouseEntered
        mostrarNombreTienda(5, Local5);
    }//GEN-LAST:event_Local5MouseEntered

    private void Local6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local6MouseEntered
        mostrarNombreTienda(6, Local6);
    }//GEN-LAST:event_Local6MouseEntered

    private void Local7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local7MouseEntered
        mostrarNombreTienda(7, Local7);
    }//GEN-LAST:event_Local7MouseEntered

    private void Local8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local8MouseEntered
        mostrarNombreTienda(8, Local8);
    }//GEN-LAST:event_Local8MouseEntered

    private void Local9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local9MouseEntered
        mostrarNombreTienda(9, Local9);
    }//GEN-LAST:event_Local9MouseEntered

    private void Local10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local10MouseEntered
        mostrarNombreTienda(10, Local10);
    }//GEN-LAST:event_Local10MouseEntered

    private void Local11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local11MouseEntered
        mostrarNombreTienda(11, Local11);
    }//GEN-LAST:event_Local11MouseEntered

    private void Local12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local12MouseEntered
        mostrarNombreTienda(12, Local12);
    }//GEN-LAST:event_Local12MouseEntered

    private void Local13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local13MouseEntered
        mostrarNombreTienda(13, Local13);
    }//GEN-LAST:event_Local13MouseEntered

    private void Local14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local14MouseEntered
        mostrarNombreTienda(14, Local14);
    }//GEN-LAST:event_Local14MouseEntered

    private void Local15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local15MouseEntered
        mostrarNombreTienda(15, Local15);
    }//GEN-LAST:event_Local15MouseEntered

    private void Local16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local16MouseEntered
        mostrarNombreTienda(16, Local16);
    }//GEN-LAST:event_Local16MouseEntered

    private void Local17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local17MouseEntered
        mostrarNombreTienda(17, Local17);
    }//GEN-LAST:event_Local17MouseEntered

    private void Local18MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local18MouseEntered
        mostrarNombreTienda(18, Local18);
    }//GEN-LAST:event_Local18MouseEntered

    private void Local19MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local19MouseEntered
        mostrarNombreTienda(19, Local19);
    }//GEN-LAST:event_Local19MouseEntered

    private void Local20MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local20MouseEntered
        mostrarNombreTienda(20, Local20);
    }//GEN-LAST:event_Local20MouseEntered

    private void Local21MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local21MouseEntered
        mostrarNombreTienda(21, Local21);
    }//GEN-LAST:event_Local21MouseEntered

    private void Local22MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local22MouseEntered
        mostrarNombreTienda(22, Local22);
    }//GEN-LAST:event_Local22MouseEntered

    private void Local23MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local23MouseEntered
        mostrarNombreTienda(23, Local23);
    }//GEN-LAST:event_Local23MouseEntered

    private void Local24MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local24MouseEntered
        mostrarNombreTienda(24, Local24);
    }//GEN-LAST:event_Local24MouseEntered

    private void Local25MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local25MouseEntered
        mostrarNombreTienda(25, Local25);
    }//GEN-LAST:event_Local25MouseEntered

    private void Local26MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local26MouseEntered
        mostrarNombreTienda(26, Local26);
    }//GEN-LAST:event_Local26MouseEntered

    private void Local27MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local27MouseEntered
        mostrarNombreTienda(27, Local27);
    }//GEN-LAST:event_Local27MouseEntered

    private void Local28MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local28MouseEntered
        mostrarNombreTienda(28, Local28);
    }//GEN-LAST:event_Local28MouseEntered

    private void Local29MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local29MouseEntered
        mostrarNombreTienda(29, Local29);
    }//GEN-LAST:event_Local29MouseEntered

    private void Local30MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local30MouseEntered
        mostrarNombreTienda(30, Local30);
    }//GEN-LAST:event_Local30MouseEntered

    private void Local31MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local31MouseEntered
        mostrarNombreTienda(31, Local31);
    }//GEN-LAST:event_Local31MouseEntered

    private void Local32MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local32MouseEntered
        mostrarNombreTienda(32, Local32);
    }//GEN-LAST:event_Local32MouseEntered

    private void Local33MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local33MouseEntered
        mostrarNombreTienda(33, Local33);
    }//GEN-LAST:event_Local33MouseEntered

    private void Local34MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local34MouseEntered
        mostrarNombreTienda(34, Local34);
    }//GEN-LAST:event_Local34MouseEntered

    private void Local35MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local35MouseEntered
        mostrarNombreTienda(35, Local35);
    }//GEN-LAST:event_Local35MouseEntered

    private void Local36MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local36MouseEntered
        mostrarNombreTienda(36, Local36);
    }//GEN-LAST:event_Local36MouseEntered

    private void Local37MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local37MouseEntered
        mostrarNombreTienda(37, Local37);
    }//GEN-LAST:event_Local37MouseEntered

    private void Local38MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local38MouseEntered
        mostrarNombreTienda(38, Local38);
    }//GEN-LAST:event_Local38MouseEntered

    private void Local39MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local39MouseEntered
        mostrarNombreTienda(39, Local39);
    }//GEN-LAST:event_Local39MouseEntered

    private void Local40MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local40MouseEntered
        mostrarNombreTienda(40, Local40);
    }//GEN-LAST:event_Local40MouseEntered

    private void Local41MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local41MouseEntered
        mostrarNombreTienda(41, Local41);
    }//GEN-LAST:event_Local41MouseEntered

    private void Local42MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local42MouseEntered
        mostrarNombreTienda(42, Local42);
    }//GEN-LAST:event_Local42MouseEntered

    private void Local43MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local43MouseEntered
        mostrarNombreTienda(43, Local43);
    }//GEN-LAST:event_Local43MouseEntered

    private void Local44MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local44MouseEntered
        mostrarNombreTienda(44, Local44);
    }//GEN-LAST:event_Local44MouseEntered

    private void Local45MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local45MouseEntered
        mostrarNombreTienda(45, Local45);
    }//GEN-LAST:event_Local45MouseEntered

    private void Local46MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local46MouseEntered
        mostrarNombreTienda(46, Local46);
    }//GEN-LAST:event_Local46MouseEntered

    private void Local47MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local47MouseEntered
        mostrarNombreTienda(47, Local47);
    }//GEN-LAST:event_Local47MouseEntered

    private void Local48MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local48MouseEntered
        mostrarNombreTienda(48, Local48);
    }//GEN-LAST:event_Local48MouseEntered

    private void Local49MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local49MouseEntered
        mostrarNombreTienda(49, Local49);
    }//GEN-LAST:event_Local49MouseEntered

    private void Local50MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local50MouseEntered
        mostrarNombreTienda(50, Local50);
    }//GEN-LAST:event_Local50MouseEntered

    private void Local51MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local51MouseEntered
        mostrarNombreTienda(51, Local51);
    }//GEN-LAST:event_Local51MouseEntered

    private void Local52MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local52MouseEntered
        mostrarNombreTienda(52, Local52);
    }//GEN-LAST:event_Local52MouseEntered

    private void Local53MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local53MouseEntered
        mostrarNombreTienda(53, Local53);
    }//GEN-LAST:event_Local53MouseEntered

    private void Local54MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local54MouseEntered
        mostrarNombreTienda(54, Local54);
    }//GEN-LAST:event_Local54MouseEntered

    private void Local55MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local55MouseEntered
        mostrarNombreTienda(55, Local55);
    }//GEN-LAST:event_Local55MouseEntered

    private void Local56MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local56MouseEntered
        mostrarNombreTienda(56, Local56);
    }//GEN-LAST:event_Local56MouseEntered

    private void Local57MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local57MouseEntered
        mostrarNombreTienda(57, Local57);
    }//GEN-LAST:event_Local57MouseEntered

    private void Local58MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local58MouseEntered
        mostrarNombreTienda(58, Local58);
    }//GEN-LAST:event_Local58MouseEntered

    private void Local59MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local59MouseEntered
        mostrarNombreTienda(59, Local59);
    }//GEN-LAST:event_Local59MouseEntered

    private void Local60MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Local60MouseEntered
        mostrarNombreTienda(60, Local60);
    }//GEN-LAST:event_Local60MouseEntered

    private void EsconderCartelMouseExit(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EsconderCartelMouseExit
        jLabelCVacio.setVisible(false);
    }//GEN-LAST:event_EsconderCartelMouseExit

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
            java.util.logging.Logger.getLogger(vCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vCompras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Local1;
    private javax.swing.JLabel Local10;
    private javax.swing.JLabel Local11;
    private javax.swing.JLabel Local12;
    private javax.swing.JLabel Local13;
    private javax.swing.JLabel Local14;
    private javax.swing.JLabel Local15;
    private javax.swing.JLabel Local16;
    private javax.swing.JLabel Local17;
    private javax.swing.JLabel Local18;
    private javax.swing.JLabel Local19;
    private javax.swing.JLabel Local2;
    private javax.swing.JLabel Local20;
    private javax.swing.JLabel Local21;
    private javax.swing.JLabel Local22;
    private javax.swing.JLabel Local23;
    private javax.swing.JLabel Local24;
    private javax.swing.JLabel Local25;
    private javax.swing.JLabel Local26;
    private javax.swing.JLabel Local27;
    private javax.swing.JLabel Local28;
    private javax.swing.JLabel Local29;
    private javax.swing.JLabel Local3;
    private javax.swing.JLabel Local30;
    private javax.swing.JLabel Local31;
    private javax.swing.JLabel Local32;
    private javax.swing.JLabel Local33;
    private javax.swing.JLabel Local34;
    private javax.swing.JLabel Local35;
    private javax.swing.JLabel Local36;
    private javax.swing.JLabel Local37;
    private javax.swing.JLabel Local38;
    private javax.swing.JLabel Local39;
    private javax.swing.JLabel Local4;
    private javax.swing.JLabel Local40;
    private javax.swing.JLabel Local41;
    private javax.swing.JLabel Local42;
    private javax.swing.JLabel Local43;
    private javax.swing.JLabel Local44;
    private javax.swing.JLabel Local45;
    private javax.swing.JLabel Local46;
    private javax.swing.JLabel Local47;
    private javax.swing.JLabel Local48;
    private javax.swing.JLabel Local49;
    private javax.swing.JLabel Local5;
    private javax.swing.JLabel Local50;
    private javax.swing.JLabel Local51;
    private javax.swing.JLabel Local52;
    private javax.swing.JLabel Local53;
    private javax.swing.JLabel Local54;
    private javax.swing.JLabel Local55;
    private javax.swing.JLabel Local56;
    private javax.swing.JLabel Local57;
    private javax.swing.JLabel Local58;
    private javax.swing.JLabel Local59;
    private javax.swing.JLabel Local6;
    private javax.swing.JLabel Local60;
    private javax.swing.JLabel Local7;
    private javax.swing.JLabel Local8;
    private javax.swing.JLabel Local9;
    private javax.swing.JButton jButton1;
    static javax.swing.JComboBox<String> jComboTiendas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelCVacio;
    private javax.swing.JLabel jLabelEncargado;
    private javax.swing.JLabel jLabelEntradaBambu;
    private javax.swing.JLabel jLabelEntradaGuayacan;
    private javax.swing.JLabel jLabelEntradaMangle;
    private javax.swing.JLabel jLabelEntradaPalma;
    private javax.swing.JLabel jLabelEntradaRoble;
    private javax.swing.JLabel jLabelEntradaSaman;
    private javax.swing.JLabel jLabelFoto;
    private javax.swing.JLabel jLabelLocal;
    private javax.swing.JLabel jLabelNombreTienda;
    private javax.swing.JLabel jLabelUbicacion;
    private javax.swing.JPanel jPanelNoTienda;
    private javax.swing.JPanel jPanelTienda;
    // End of variables declaration//GEN-END:variables
}
