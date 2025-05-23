/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
import Controller.ReservasController;
import DAO.ReservasDAO;
import Model.Mesa;
import Model.Reserva;
import com.toedter.calendar.JCalendar;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ASUS
 */
public class ClienteFrame extends javax.swing.JFrame {
      private int invitados = 0;
      private String horaSeleccionada = null;
      private String fechaSeleccionada = null;
      private Date fechaTexto;
      private int cornerRadius;
      DefaultTableModel modeloReserva;

      

    /**
     * Creates new form ClienteFrame
     */
    public ClienteFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        modeloReserva = (DefaultTableModel) tablaReservas.getModel();
        cargarReservas(modeloReserva);
        
        
        
        // Labels Postres
         lbPostre1.setSize(248,176);
         lbPostre2.setSize(248,176);
         lbPostre3.setSize(248,176);
         lbPostre4.setSize(248,176);
         lbPostre5.setSize(248,176);
         lbPostre6.setSize(248,176);
         
         // Labels Entradas
         lbEntrada1.setSize(248,176);
         lbEntrada2.setSize(248,176);
         lbEntrada3.setSize(248,176);
         lbEntrada4.setSize(248,176);
         lbEntrada5.setSize(248,176);
         lbEntrada6.setSize(248,176);
         
         // Labels Platos fuertes
         lbPlato1.setSize(248,176);
         lbPlato2.setSize(248,176);
         lbPlato3.setSize(248,176);
         lbPlato4.setSize(248,176);
         lbPlato5.setSize(248,176);
         lbPlato6.setSize(248,176);
         
        // Imagenes Postres
        setimages(lbPostre1, "src/img/postre1.jpg");
        setimages(lbPostre2, "src/img/potre2.jpg");
        setimages(lbPostre3, "src/img/postre3.jpg");
        setimages(lbPostre4, "src/img/postre4.jpg");
        setimages(lbPostre5, "src/img/postre5.jpg");
        setimages(lbPostre6, "src/img/postre6.jpg");
        
        //Imagenes Entradas
        setimages(lbEntrada1, "src/img/entrada1.jpg");
        setimages(lbEntrada2, "src/img/entrada2.jpg");
        setimages(lbEntrada3, "src/img/entrada3.jpg");
        setimages(lbEntrada4, "src/img/entrada4.jpg");
        setimages(lbEntrada5, "src/img/entrada5.jpg");
        setimages(lbEntrada6, "src/img/entrada6.jpg");
        
        // Imagenes Platos fuertes
        setimages(lbPlato1, "src/img/plato1.jpg");
        setimages(lbPlato2, "src/img/plato2.jpg");
        setimages(lbPlato3, "src/img/plato3.jpg");
        setimages(lbPlato4, "src/img/plato4.jpg");
        setimages(lbPlato5, "src/img/plato5.jpg");
        setimages(lbPlato6, "src/img/plato6.jpg");
        
        //Tooltipis :)
         lbPlato1.setToolTipText(""
           +"<html>"
           +"<head>"
           + ""
           +"</head>"
           +"<body>"
           +"<p>Deliciosas costillas de cerdo cocinadas "
           + "<p>a fuego lento y bañadas en una salsa BBQ espesa </p>"
           + "<p>y dulce, acompañadas con papas doradas al romero</p>"
           + "<p> y una ensalada fresca de lechuga y tomate cherry.</p>"
           + "<p> Precio: 50.000</p>"
           +"</body>"
           +"<html>" 
           +"" );
         
          lbPlato2.setToolTipText(""
           +"<html>"
           +"<head>"
           + ""
           +"</head>"
           +"<body>"
           +"<p>Penne cocido al dente servido con una salsa de tomate natural con ajo,</p>"
           + "<p>albahaca fresca y un toque de aceite de oliva virgen extra. </p>"
           + "<p>Ideal para los amantes de la cocina italiana tradicional.</p>"
           + "<p> Precio: 37.000</p>"
           +"</body>"
           +"<html>" 
           +"" );
          
           lbPlato3.setToolTipText(""
           +"<html>"
           +"<head>"
           + ""
           +"</head>"
           +"<body>"
           +"<p>Jugosas rebanadas de lomo de cerdo cocinadas </p>"
           + "<p>a la perfección, cubiertas con una salsa de mostaza, </p>"
           + "<p>miel y especias. Servido con guarnición de vegetales asados.</p>"
           +"</body>"
           +"<html>" 
           +"" );
           
            lbPlato4.setToolTipText(""
           +"<html>"
           +"<head>"
           + ""
           +"</head>"
           +"<body>"
           +"<p>Corte grueso de filete de res servido sobre  </p>"
           + "<p>una cama de puré cremoso, bañado con una reducción de vino tinto</p>"
           + "<p>y decorado con rodajas de ajo o cebolla caramelizada.</p>"
           +"</body>"
           +"<html>" 
           +"" );
            
            lbPlato5.setToolTipText(""
           +"<html>"
           +"<head>"
           + ""
           +"</head>"
           +"<body>"
           +"<p>Capas de pasta intercaladas con ragú de carne molida</p>"
           + "<p>salsa bechamel y abundante queso gratinado.</p>"
           + "<p>Horneada hasta dorar, ofreciendo un sabor cálido y reconfortante.</p>"
           +"</body>"
           +"<html>" 
           +"" ); 
            
           lbPlato6.setToolTipText(""
           +"<html>"
           +"<head>"
           + ""
           +"</head>"
           +"<body>"
           +"<p>Arroz cremoso cocinado lentamente con caldo,</p>"
           + "<p>queso parmesano y mantequilla, coronado con camarones salteados</p>"
           + "<p>y hierbas frescas. Un platillo elegante y sabroso </p>"
           +"</body>"
           +"<html>" 
           +"" ); 
           
            lbEntrada1.setToolTipText(""
           +"<html>"
           +"<head>"
           + ""
           +"</head>"
           +"<body>"
           +"<p>Finas lonchas de jamón serrano servidas elegantemente con brotes frescos</p>"
           + "<p>Una entrada clásica, ligera y llena de sabor, </p>"
           + "<p>ideal para acompañar con pan artesanal o vino tinto. </p>"
           +"</body>"
           +"<html>" 
           +"" ); 
            
              lbEntrada2.setToolTipText(""
           +"<html>"
           +"<head>"
           + ""
           +"</head>"
           +"<body>"
           +"<p>Pequeñas hamburguesas rellenas con carne jugosa</p>"
           + "<p>y vegetales frescos, servidas en panecillos suaves</p>"
           + "<p>Perfectas para abrir el apetito con un toque divertido y delicioso.</p>"
           +"</body>"
           +"<html>" 
           +"" ); 
        
           lbEntrada3.setToolTipText(""
           +"<html>"
           +"<head>"
           + ""
           +"</head>"
           +"<body>"
           +"<p>Pan crujiente cubierto con tomate triturado, jamón curado</p>"
           + "<p>y hojas de albahaca fresca. Una entrada mediterránea sencilla</p>"
           + "<p>pero sabrosa, ideal para compartir. </p>"
           +"</body>"
           +"<html>" 
           +"" ); 
           
           
           lbEntrada4.setToolTipText(""
           +"<html>"
           +"<head>"
           + ""
           +"</head>"
           +"<body>"
           +"<p>Rodajas de tomate fresco, mozzarella y albahaca bañadas</p>"
           + "<p>con aceite de oliva y un toque de vinagre balsámico. </p>"
           + "<p>Una opción fresca y saludable con el sabor típico de Italia. </p>"
           +"</body>"
           +"<html>" 
           +"" ); 
           
           
             lbEntrada5.setToolTipText(""
           +"<html>"
           +"<head>"
           + ""
           +"</head>"
           +"<body>"
           +"<p>Papas cortadas en forma de abanico, horneadas hasta quedar</p>"
           + "<p>doradas, y cubiertas con queso, crema agria,</p>"
           + "<p>tocineta crocante y cebollín picado.</p>"
           +"</body>"
           +"<html>" 
           +"" ); 
             
             lbEntrada6.setToolTipText(""
           +"<html>"
           +"<head>"
           + ""
           +"</head>"
           +"<body>"
           +"<p>Mitades de papa horneadas rellenas con una mezcla de queso fundido</p>"
           + "<p>, tocineta crujiente y cebollín. Una opción cálida </p>"
           + "<p>y reconfortante, ideal para empezar la comida. </p>"
           +"</body>"
           +"<html>" 
           +"" );   
             
         lbPostre1.setToolTipText(""
           +"<html>"
           +"<head>"
           + ""
           +"</head>"
           +"<body>"
           +"<p>Delicados y crujientes por fuera, suaves por dentro.</p>"
           + "<p>Rellenos de una crema de frambuesa, estos dulces </p>"
           + "<p>franceses son ideales como postre ligero o para acompañar el café.</p>"
           +"</body>"
           +"<html>" 
           +"" );   
         
         
          lbPostre2.setToolTipText(""
           +"<html>"
           +"<head>"
           + ""
           +"</head>"
           +"<body>"
           +"<p>Capas suaves de mousse de chocolate negro y leche, coronadas</p>"
           + "<p>con virutas de chocolate y frambuesas frescas.</p>"
           + "<p>Elegante y perfecto para los amantes del cacao.</p>"
           +"</body>"
           +"<html>" 
           +"" );   
          
          
           lbPostre3.setToolTipText(""
           +"<html>"
           +"<head>"
           + ""
           +"</head>"
           +"<body>"
           +"<p>Tres bolas de helado servidas con chispas de chocolate,</p>"
           + "<p> trozos de nuez, sirope de chocolate y una cereza al tope.</p>"
           + "<p>Refrescante y lleno de textura. </p>"
           +"</body>"
           +"<html>" 
           +"" );   
           
           
            lbPostre4.setToolTipText(""
           +"<html>"
           +"<head>"
           + ""
           +"</head>"
           +"<body>"
           +"<p>Crujientes waffles dorados, decorados con crema batida,</p>"
           + "<p>fresas frescas y un toque de sirope de chocolate.</p>"
           + "<p>Un postre abundante y reconfortante.</p>"
           +"</body>"
           +"<html>" 
           +"" );   
            
             lbPostre5.setToolTipText(""
           +"<html>"
           +"<head>"
           + ""
           +"</head>"
           +"<body>"
           +"<p>Pastel decorado con fondant blanco y rosa, ideal</p>"
           + "<p>para ocasiones especiales o temáticas. Relleno </p>"
           + "<p>de crema y frutas, con un diseño encantador. </p>"
           +"</body>"
           +"<html>" 
           +"" );   
             
           lbPostre6.setToolTipText(""
           +"<html>"
           +"<head>"
           + ""
           +"</head>"
           +"<body>"
           +"<p>Brownie tibio, servido con una bola de helado de vainilla</p>"
           + "<p>y bañado con salsa caliente de chocolate.</p>"
           + "<p>Una mezcla irresistible de temperatura y sabor. </p>"
           +"</body>"
           +"<html>" 
           +"" );      
        RoundedPanel panel = new RoundedPanel(20);
        
    }
     private void setimages(JLabel labelname, String root){
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelname.getWidth(), labelname.getHeight(), Image.SCALE_DEFAULT));
        labelname.setIcon(icon);
        this.repaint();
    }
     
     
        
    public void cargarReservas(DefaultTableModel modeloReserva) {
     ReservasController reservaController = new ReservasController();//instancia de la clase ReservasController.
     modeloReserva.setRowCount(0);//Limpia todas las filas
     reservaController.cargarReservasPorCliente(modeloReserva);//carga las reservas específicas del cliente
}
    public void cargarReservasPorEmail(DefaultTableModel modelo, String email){
    modelo.setRowCount(0);
    ReservasDAO reservaDao = new ReservasDAO();
    List<Reserva> reservas = reservaDao.listarReservasPorCliente(email);

    for (Reserva reserva : reservas) {
        Object[] fila = {
                reserva.getNombreCliente(),
                reserva.getApellidoCliente(),
                reserva.getNumeroMesa(),
                reserva.getEmail(),
                reserva.getTelefonoCliente(),
                reserva.getCantidadPersonas(),
                reserva.getFecha(),
                reserva.getHora(),
        };
        modelo.addRow(fila);
    }
}
    
    public class RoundedPanel extends JPanel {
    private int cornerRadius;

    public RoundedPanel(int radius) {
        this.cornerRadius = radius;
        setOpaque(false); // Importante para que se vea el fondo redondeado
    }

    @Override
    protected void paintComponent(Graphics g) {//Dibujar panel con bordes redondeados
        super.paintComponent(g);
        Dimension arcs = new Dimension(cornerRadius, cornerRadius);
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Fondo blanco o el color de fondo del panel
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), arcs.width, arcs.height);

        g2.dispose();
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

        jLabel32 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        panelLateral = new javax.swing.JPanel();
        panelLogo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panelReservas = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        panelVerReserva = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        panelPLatos = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        panelSalones = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        tabbedCliente = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        botonReserva = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        botonModificar = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        botonPlatos = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        botonVerReserva = new javax.swing.JPanel();
        jLabel72 = new javax.swing.JLabel();
        botonSalones = new javax.swing.JPanel();
        jLabel73 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtEmail1 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        btnMas = new javax.swing.JButton();
        txtInvitados = new javax.swing.JTextField();
        btnMenos = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        btnHora1 = new javax.swing.JButton();
        btnHora2 = new javax.swing.JButton();
        btnHora3 = new javax.swing.JButton();
        btnHora4 = new javax.swing.JButton();
        btnHora5 = new javax.swing.JButton();
        btnHora6 = new javax.swing.JButton();
        btnReservar = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        btnMesas = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        btnFecha1 = new javax.swing.JButton();
        btnFecha2 = new javax.swing.JButton();
        btnFecha3 = new javax.swing.JButton();
        btnFecha4 = new javax.swing.JButton();
        btnFecha5 = new javax.swing.JButton();
        btnFecha6 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        JcomboMesas = new javax.swing.JComboBox<>();
        jPanel8 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaReservas = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtEmailBuscar = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        txtNombreMod = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        txtApellidosMod = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        txtTelefonoMod = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        txtInvitadosMod = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        txtFechaMod = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        txtHoraMod = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        txtMesaMod = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        JscPlatos = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        lbEntrada2 = new javax.swing.JLabel();
        lbEntrada3 = new javax.swing.JLabel();
        lbPlato2 = new javax.swing.JLabel();
        lbEntrada5 = new javax.swing.JLabel();
        lbEntrada6 = new javax.swing.JLabel();
        lbEntrada1 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        lbPlato3 = new javax.swing.JLabel();
        lbEntrada4 = new javax.swing.JLabel();
        lbPlato5 = new javax.swing.JLabel();
        lbPlato1 = new javax.swing.JLabel();
        lbPlato6 = new javax.swing.JLabel();
        lbPostre2 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        lbPlato4 = new javax.swing.JLabel();
        lbPostre1 = new javax.swing.JLabel();
        lbPostre4 = new javax.swing.JLabel();
        lbPostre5 = new javax.swing.JLabel();
        lbPostre6 = new javax.swing.JLabel();
        lbPostre3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        panelSalon1 = new RoundedPanel(20) ;
        jLabel55 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        ReservaSalonA = new RoundedPanel(20) ;
        jLabel59 = new javax.swing.JLabel();
        panelSalon4 = new RoundedPanel(20) ;
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        ReservaSalonB = new RoundedPanel(20) ;
        jLabel65 = new javax.swing.JLabel();
        panelSalon5 = new RoundedPanel(20) ;
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        ReservaSalonC = new RoundedPanel(20) ;
        jLabel71 = new javax.swing.JLabel();
        panelverReserva = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();

        jLabel32.setText("jLabel22");
        jLabel32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel35.setText("jLabel22");
        jLabel35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel37.setText("jLabel22");
        jLabel37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel48.setText("jLabel22");
        jLabel48.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelLateral.setBackground(new java.awt.Color(255, 255, 255));
        panelLateral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        panelLogo.setBackground(new java.awt.Color(0, 153, 153));
        panelLogo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-tenedor-y-cuchillo-cruzados-100.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        panelLogo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 104, -1));

        panelReservas.setBackground(new java.awt.Color(255, 255, 255));
        panelReservas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelReservasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelReservasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelReservasMouseExited(evt);
            }
        });
        panelReservas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setText("Nueva Reserva");
        panelReservas.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 130, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calendario.png"))); // NOI18N
        panelReservas.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 264, 70, 70));

        panelVerReserva.setBackground(new java.awt.Color(255, 255, 255));
        panelVerReserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelVerReservaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelVerReservaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelVerReservaMouseExited(evt);
            }
        });
        panelVerReserva.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setText("Ver Reservas");
        panelVerReserva.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Sistema de Reservas");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("De Restaurante");

        panelPLatos.setBackground(new java.awt.Color(255, 255, 255));
        panelPLatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelPLatosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelPLatosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelPLatosMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setText("Ver Platos");

        javax.swing.GroupLayout panelPLatosLayout = new javax.swing.GroupLayout(panelPLatos);
        panelPLatos.setLayout(panelPLatosLayout);
        panelPLatosLayout.setHorizontalGroup(
            panelPLatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPLatosLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPLatosLayout.setVerticalGroup(
            panelPLatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPLatosLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(26, 26, 26))
        );

        panelSalones.setBackground(new java.awt.Color(255, 255, 255));
        panelSalones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelSalonesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelSalonesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelSalonesMouseExited(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel7.setText("Ver Salones");

        javax.swing.GroupLayout panelSalonesLayout = new javax.swing.GroupLayout(panelSalones);
        panelSalones.setLayout(panelSalonesLayout);
        panelSalonesLayout.setHorizontalGroup(
            panelSalonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSalonesLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelSalonesLayout.setVerticalGroup(
            panelSalonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSalonesLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout panelLateralLayout = new javax.swing.GroupLayout(panelLateral);
        panelLateral.setLayout(panelLateralLayout);
        panelLateralLayout.setHorizontalGroup(
            panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(panelVerReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelLateralLayout.createSequentialGroup()
                .addGroup(panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(panelLateralLayout.createSequentialGroup()
                        .addGroup(panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLateralLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel9))
                            .addGroup(panelLateralLayout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel10)))
                        .addGap(0, 32, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(panelPLatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelSalones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelLateralLayout.setVerticalGroup(
            panelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLateralLayout.createSequentialGroup()
                .addComponent(panelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addGap(3, 3, 3)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelVerReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelPLatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelSalones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 88, Short.MAX_VALUE))
        );

        jPanel1.add(panelLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 680));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Segoe UI Variable", 0, 70)); // NOI18N
        jLabel11.setText("Bienvenido!");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel12.setText("¿Que desea hacer?");

        botonReserva.setBackground(new java.awt.Color(255, 255, 255));
        botonReserva.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        botonReserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonReservaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonReservaMouseEntered(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel13.setText("Nueva Reserva");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout botonReservaLayout = new javax.swing.GroupLayout(botonReserva);
        botonReserva.setLayout(botonReservaLayout);
        botonReservaLayout.setHorizontalGroup(
            botonReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botonReservaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(26, 26, 26))
        );
        botonReservaLayout.setVerticalGroup(
            botonReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonReservaLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel13)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        botonModificar.setBackground(new java.awt.Color(255, 255, 255));
        botonModificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        botonModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonModificarMouseClicked(evt);
            }
        });
        botonModificar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel15.setText("Modificar Reserva");
        botonModificar.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        botonPlatos.setBackground(new java.awt.Color(255, 255, 255));
        botonPlatos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        botonPlatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonPlatosMouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel14.setText("Platos");

        javax.swing.GroupLayout botonPlatosLayout = new javax.swing.GroupLayout(botonPlatos);
        botonPlatos.setLayout(botonPlatosLayout);
        botonPlatosLayout.setHorizontalGroup(
            botonPlatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonPlatosLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel14)
                .addContainerGap(87, Short.MAX_VALUE))
        );
        botonPlatosLayout.setVerticalGroup(
            botonPlatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonPlatosLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel14)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        botonVerReserva.setBackground(new java.awt.Color(255, 255, 255));
        botonVerReserva.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        botonVerReserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonVerReservaMouseClicked(evt);
            }
        });

        jLabel72.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel72.setText("Ver Reservas");

        javax.swing.GroupLayout botonVerReservaLayout = new javax.swing.GroupLayout(botonVerReserva);
        botonVerReserva.setLayout(botonVerReservaLayout);
        botonVerReservaLayout.setHorizontalGroup(
            botonVerReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonVerReservaLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel72)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        botonVerReservaLayout.setVerticalGroup(
            botonVerReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonVerReservaLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel72)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        botonSalones.setBackground(new java.awt.Color(255, 255, 255));
        botonSalones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        botonSalones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonSalonesMouseClicked(evt);
            }
        });

        jLabel73.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel73.setText("Salones");

        javax.swing.GroupLayout botonSalonesLayout = new javax.swing.GroupLayout(botonSalones);
        botonSalones.setLayout(botonSalonesLayout);
        botonSalonesLayout.setHorizontalGroup(
            botonSalonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonSalonesLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel73)
                .addContainerGap(75, Short.MAX_VALUE))
        );
        botonSalonesLayout.setVerticalGroup(
            botonSalonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonSalonesLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel73)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(698, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel11))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(botonReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(botonVerReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(botonSalones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(botonPlatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVolver)
                .addGap(56, 56, 56))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel11))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnVolver)))
                .addGap(6, 6, 6)
                .addComponent(jLabel12)
                .addGap(46, 46, 46)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonVerReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonSalones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonPlatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(185, Short.MAX_VALUE))
        );

        tabbedCliente.addTab("tab1", jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(153, 153, 153));
        jLabel18.setText("Nombre");

        txtNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(153, 153, 153));
        jLabel19.setText("Apellidos");

        txtApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(153, 153, 153));
        jLabel21.setText("Email");

        txtEmail1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmail1ActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(153, 153, 153));
        jLabel23.setText("Telefono");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(153, 153, 153));
        jLabel24.setText("Invitados ");

        btnMas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnMas.setText("+");
        btnMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasActionPerformed(evt);
            }
        });

        btnMenos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnMenos.setText("-");
        btnMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(153, 153, 153));
        jLabel25.setText("Hora");

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        btnHora1.setText("11:00");
        btnHora1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHora1ActionPerformed(evt);
            }
        });

        btnHora2.setText("13:00");
        btnHora2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHora2ActionPerformed(evt);
            }
        });

        btnHora3.setText("17:00");
        btnHora3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHora3ActionPerformed(evt);
            }
        });

        btnHora4.setText("18:30");
        btnHora4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHora4ActionPerformed(evt);
            }
        });

        btnHora5.setText("15:00");
        btnHora5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHora5ActionPerformed(evt);
            }
        });

        btnHora6.setText("20:00");
        btnHora6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHora6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHora1)
                    .addComponent(btnHora2))
                .addGap(32, 32, 32)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(btnHora4)
                        .addGap(18, 18, 18)
                        .addComponent(btnHora5))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(btnHora3)
                        .addGap(18, 18, 18)
                        .addComponent(btnHora6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHora1)
                    .addComponent(btnHora3)
                    .addComponent(btnHora6))
                .addGap(19, 19, 19)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHora2)
                    .addComponent(btnHora4)
                    .addComponent(btnHora5))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        btnReservar.setFont(new java.awt.Font("Segoe UI Emoji", 0, 18)); // NOI18N
        btnReservar.setText("Reservar");
        btnReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservarActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(153, 153, 153));
        jLabel29.setText("Mesa:");

        btnMesas.setText("Ver Mesas");
        btnMesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesasActionPerformed(evt);
            }
        });

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        btnFecha1.setText("25-05-20");
        btnFecha1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecha1ActionPerformed(evt);
            }
        });

        btnFecha2.setText("25-05-21");
        btnFecha2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecha2ActionPerformed(evt);
            }
        });

        btnFecha3.setText("25-05-23");
        btnFecha3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecha3ActionPerformed(evt);
            }
        });

        btnFecha4.setText("25-05-24");
        btnFecha4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecha4ActionPerformed(evt);
            }
        });

        btnFecha5.setText("25-05-26");
        btnFecha5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecha5ActionPerformed(evt);
            }
        });

        btnFecha6.setText("25-05-27");
        btnFecha6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecha6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnFecha4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFecha1, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnFecha2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnFecha3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btnFecha5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnFecha6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFecha1)
                    .addComponent(btnFecha2)
                    .addComponent(btnFecha3))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFecha4)
                    .addComponent(btnFecha5)
                    .addComponent(btnFecha6))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(153, 153, 153));
        jLabel26.setText("Fecha");

        JcomboMesas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mesa 1", "Mesa 2", "Mesa 3", "Mesa 4", "Mesa 5", "Mesa 6", "Mesa 7", "Mesa 8", "Mesa 9", " " }));

        jPanel8.setBackground(new java.awt.Color(0, 153, 153));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("New Reservation!");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(376, 376, 376)
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel17)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel19)
                    .addComponent(jLabel18))
                .addGap(44, 44, 44)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel25)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(btnMas, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtInvitados, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnMenos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(JcomboMesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnMesas))
                            .addComponent(btnReservar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(141, Short.MAX_VALUE))
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(jLabel29))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtInvitados, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMesas)
                            .addComponent(JcomboMesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnReservar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel26)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel19)
                        .addGap(18, 18, 18)
                        .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel21)
                        .addGap(18, 18, 18)
                        .addComponent(txtEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel23)
                        .addGap(18, 18, 18)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92))))
        );

        tabbedCliente.addTab("tab2", jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel27.setText("Ver Reservas");

        tablaReservas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellidos", "Mesa", "Email", "Telefono", "Invitados", "Fecha", "Hora"
            }
        ));
        tablaReservas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaReservasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaReservas);

        btnBuscar.setText("Buscar Reservas");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jButton2.setText("Cargar Reservas");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(0, 153, 153));
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Eliminar");

        javax.swing.GroupLayout btnEliminarLayout = new javax.swing.GroupLayout(btnEliminar);
        btnEliminar.setLayout(btnEliminarLayout);
        btnEliminarLayout.setHorizontalGroup(
            btnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnEliminarLayout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(42, 42, 42))
        );
        btnEliminarLayout.setVerticalGroup(
            btnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnEliminarLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(16, 16, 16))
        );

        btnModificar.setBackground(new java.awt.Color(0, 153, 153));
        btnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarMouseClicked(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Modificar");

        javax.swing.GroupLayout btnModificarLayout = new javax.swing.GroupLayout(btnModificar);
        btnModificar.setLayout(btnModificarLayout);
        btnModificarLayout.setHorizontalGroup(
            btnModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnModificarLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel28)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        btnModificarLayout.setVerticalGroup(
            btnModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnModificarLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel28)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel31.setText("Nombre:");

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel33.setText("Apellidos:");

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel38.setText("Telefono:");

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel39.setText("Invitados");

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel40.setText("Fecha:");

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel41.setText("Hora:");

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel42.setText("Mesa:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                    .addGap(46, 46, 46)
                                    .addComponent(btnBuscar)
                                    .addGap(31, 31, 31)
                                    .addComponent(txtEmailBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel31)
                                                .addComponent(txtInvitadosMod, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(66, 66, 66)
                                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel33)
                                                .addComponent(txtApellidosMod)
                                                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtFechaMod, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)))
                                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(82, 82, 82)
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel38)
                                        .addComponent(txtTelefonoMod)
                                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtHoraMod, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))))
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreMod, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMesaMod, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel27)
                        .addGap(2, 2, 2)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmailBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jLabel33)
                    .addComponent(jLabel38)
                    .addComponent(jLabel42))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombreMod)
                    .addComponent(txtApellidosMod)
                    .addComponent(txtMesaMod, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(txtTelefonoMod, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel39)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel40)
                        .addComponent(jLabel41)))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFechaMod, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtInvitadosMod, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHoraMod)))
                .addContainerGap(145, Short.MAX_VALUE))
        );

        tabbedCliente.addTab("tab3", jPanel7);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        JscPlatos.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(245, 245, 245));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Entradas ");

        lbEntrada2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbEntrada3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbPlato2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbEntrada5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbEntrada6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbEntrada1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel36.setText("Platos Fuertes");

        lbPlato3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbEntrada4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbPlato5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbPlato1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbPlato6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbPostre2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel45.setText("Postres");

        lbPlato4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbPostre1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbPostre4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbPostre5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbPostre6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbPostre3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Platos");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lbPostre3, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lbEntrada1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbEntrada4, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbEntrada5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbEntrada2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(lbPlato4, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lbPlato1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(97, 97, 97)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lbPlato2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lbPlato5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(lbPostre1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lbPostre4, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lbPostre5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lbPostre2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(76, 76, 76)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lbEntrada3, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbEntrada6, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbPlato3, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbPlato6, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(85, 85, 85)
                                        .addComponent(lbPostre6, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(99, 99, 99))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel8)
                                .addGap(243, 243, 243)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel36))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel8))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEntrada2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEntrada3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEntrada1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEntrada5, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEntrada6, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEntrada4, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jLabel36)
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPlato1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPlato2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPlato3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPlato5, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPlato6, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPlato4, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jLabel45)
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPostre2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPostre1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPostre3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPostre6, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPostre4, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPostre5, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(122, Short.MAX_VALUE))
        );

        JscPlatos.setViewportView(jPanel2);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JscPlatos, javax.swing.GroupLayout.DEFAULT_SIZE, 1010, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JscPlatos, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
        );

        tabbedCliente.addTab("tab5", jPanel11);

        jPanel4.setBackground(new java.awt.Color(245, 245, 245));

        jLabel53.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel53.setText("Salones de Eventos");

        panelSalon1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cena (2).png"))); // NOI18N

        jLabel54.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel54.setText("Salon  A");

        jLabel56.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel56.setText("Capacidad: 70 personas");

        jLabel57.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel57.setText("Espacio amplio para banquetes");

        jLabel58.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel58.setText("y eventos corporativos");

        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ReservaSalonA.setBackground(new java.awt.Color(0, 153, 153));
        ReservaSalonA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReservaSalonAMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ReservaSalonAMouseEntered(evt);
            }
        });

        jLabel59.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setText("Reservar");

        javax.swing.GroupLayout ReservaSalonALayout = new javax.swing.GroupLayout(ReservaSalonA);
        ReservaSalonA.setLayout(ReservaSalonALayout);
        ReservaSalonALayout.setHorizontalGroup(
            ReservaSalonALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReservaSalonALayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel59)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        ReservaSalonALayout.setVerticalGroup(
            ReservaSalonALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReservaSalonALayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jLabel59)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelSalon1Layout = new javax.swing.GroupLayout(panelSalon1);
        panelSalon1.setLayout(panelSalon1Layout);
        panelSalon1Layout.setHorizontalGroup(
            panelSalon1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSalon1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(ReservaSalonA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelSalon1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(panelSalon1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel54))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelSalon1Layout.createSequentialGroup()
                .addGap(0, 32, Short.MAX_VALUE)
                .addGroup(panelSalon1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel56)
                    .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel57))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        panelSalon1Layout.setVerticalGroup(
            panelSalon1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSalon1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel54)
                .addGap(31, 31, 31)
                .addComponent(jLabel55)
                .addGap(38, 38, 38)
                .addComponent(jLabel56)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel57)
                .addGroup(panelSalon1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSalon1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelSalon1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel58)
                        .addGap(30, 30, 30)
                        .addComponent(ReservaSalonA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        panelSalon4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reunion.png"))); // NOI18N

        jLabel61.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel61.setText("Salon  B");

        jLabel62.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel62.setText("Capacidad: 50 personas");

        jLabel63.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel63.setText("Perfecto para conferencias");

        jLabel64.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel64.setText("y reuniones");

        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ReservaSalonB.setBackground(new java.awt.Color(0, 153, 153));
        ReservaSalonB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReservaSalonBMouseClicked(evt);
            }
        });

        jLabel65.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        jLabel65.setText("Reservar");

        javax.swing.GroupLayout ReservaSalonBLayout = new javax.swing.GroupLayout(ReservaSalonB);
        ReservaSalonB.setLayout(ReservaSalonBLayout);
        ReservaSalonBLayout.setHorizontalGroup(
            ReservaSalonBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReservaSalonBLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel65)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        ReservaSalonBLayout.setVerticalGroup(
            ReservaSalonBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReservaSalonBLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jLabel65)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelSalon4Layout = new javax.swing.GroupLayout(panelSalon4);
        panelSalon4.setLayout(panelSalon4Layout);
        panelSalon4Layout.setHorizontalGroup(
            panelSalon4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSalon4Layout.createSequentialGroup()
                .addGroup(panelSalon4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSalon4Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(ReservaSalonB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelSalon4Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(panelSalon4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel61)
                            .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelSalon4Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(panelSalon4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel62)
                            .addComponent(jLabel63))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        panelSalon4Layout.setVerticalGroup(
            panelSalon4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSalon4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel61)
                .addGap(34, 34, 34)
                .addComponent(jLabel60)
                .addGap(36, 36, 36)
                .addComponent(jLabel62)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel63)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel64)
                .addGroup(panelSalon4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSalon4Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSalon4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ReservaSalonB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );

        panelSalon5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salud.png"))); // NOI18N

        jLabel67.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel67.setText("Salon  C");

        jLabel68.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel68.setText("Capacidad: 80 personas");

        jLabel69.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel69.setText("Ideal para bodas y celebraciones");

        jLabel70.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel70.setText("familiares");

        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ReservaSalonC.setBackground(new java.awt.Color(0, 153, 153));
        ReservaSalonC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReservaSalonCMouseClicked(evt);
            }
        });

        jLabel71.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(255, 255, 255));
        jLabel71.setText("Reservar");
        jLabel71.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel71MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ReservaSalonCLayout = new javax.swing.GroupLayout(ReservaSalonC);
        ReservaSalonC.setLayout(ReservaSalonCLayout);
        ReservaSalonCLayout.setHorizontalGroup(
            ReservaSalonCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReservaSalonCLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel71)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        ReservaSalonCLayout.setVerticalGroup(
            ReservaSalonCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReservaSalonCLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jLabel71)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelSalon5Layout = new javax.swing.GroupLayout(panelSalon5);
        panelSalon5.setLayout(panelSalon5Layout);
        panelSalon5Layout.setHorizontalGroup(
            panelSalon5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSalon5Layout.createSequentialGroup()
                .addGroup(panelSalon5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSalon5Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(panelSalon5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel67)))
                    .addGroup(panelSalon5Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(ReservaSalonC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
            .addGroup(panelSalon5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelSalon5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSalon5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel69)
                        .addComponent(jLabel68, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelSalon5Layout.setVerticalGroup(
            panelSalon5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSalon5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel67)
                .addGap(38, 38, 38)
                .addComponent(jLabel66)
                .addGap(35, 35, 35)
                .addComponent(jLabel68)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel69)
                .addGroup(panelSalon5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSalon5Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelSalon5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel70)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ReservaSalonC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );

        panelverReserva.setBackground(new java.awt.Color(0, 153, 153));
        panelverReserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelverReservaMouseClicked(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Ver Reservas");
        jLabel30.setToolTipText("");

        javax.swing.GroupLayout panelverReservaLayout = new javax.swing.GroupLayout(panelverReserva);
        panelverReserva.setLayout(panelverReservaLayout);
        panelverReservaLayout.setHorizontalGroup(
            panelverReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelverReservaLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );
        panelverReservaLayout.setVerticalGroup(
            panelverReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelverReservaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel30)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(335, 335, 335)
                        .addComponent(jLabel53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelSalon1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(panelSalon4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelSalon5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelverReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(99, 99, 99))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel53)
                .addGap(13, 13, 13)
                .addComponent(panelverReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelSalon1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelSalon4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelSalon5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(163, Short.MAX_VALUE))
        );

        tabbedCliente.addTab("tab6", jPanel4);

        jPanel1.add(tabbedCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, -30, 1010, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
          tabbedCliente.setSelectedIndex(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void panelReservasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelReservasMouseClicked
           tabbedCliente.setSelectedIndex(1);
// TODO add your handling code here:
    }//GEN-LAST:event_panelReservasMouseClicked

    private void panelVerReservaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelVerReservaMouseClicked
          tabbedCliente.setSelectedIndex(2);
        // TODO add your handling code here:
    }//GEN-LAST:event_panelVerReservaMouseClicked

    private void panelReservasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelReservasMouseEntered
         panelReservas.setBackground(new Color(0,153,153));
// TODO add your handling code here:
    }//GEN-LAST:event_panelReservasMouseEntered

    private void panelReservasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelReservasMouseExited
        panelReservas.setBackground(new Color(255,255,255));
// TODO add your handling code here:
    }//GEN-LAST:event_panelReservasMouseExited

    private void panelVerReservaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelVerReservaMouseEntered
         panelVerReserva.setBackground(new Color(0,153,153));
// TODO add your handling code here:
    }//GEN-LAST:event_panelVerReservaMouseEntered

    private void panelVerReservaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelVerReservaMouseExited
       panelVerReserva.setBackground(new Color(255,255,255));
        // TODO add your handling code here:
    }//GEN-LAST:event_panelVerReservaMouseExited

    private void panelPLatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelPLatosMouseClicked
         tabbedCliente.setSelectedIndex(3);

// TODO add your handling code here:
    }//GEN-LAST:event_panelPLatosMouseClicked

    private void panelPLatosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelPLatosMouseEntered
        panelPLatos.setBackground(new Color(0,153,153));
// TODO add your handling code here:
    }//GEN-LAST:event_panelPLatosMouseEntered

    private void panelPLatosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelPLatosMouseExited
        panelPLatos.setBackground(new Color(255,255,255));
// TODO add your handling code here:
    }//GEN-LAST:event_panelPLatosMouseExited

    private void panelSalonesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSalonesMouseEntered
        panelSalones.setBackground(new Color(0,153,153));
// TODO add your handling code here:
    }//GEN-LAST:event_panelSalonesMouseEntered

    private void panelSalonesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSalonesMouseExited
       panelSalones.setBackground(new Color(255,255,255));
        // TODO add your handling code here:
    }//GEN-LAST:event_panelSalonesMouseExited

    private void panelSalonesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSalonesMouseClicked
                 tabbedCliente.setSelectedIndex(4);


    }//GEN-LAST:event_panelSalonesMouseClicked

    private void panelverReservaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelverReservaMouseClicked
        ModificarSalon dialog = new ModificarSalon(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_panelverReservaMouseClicked

    private void ReservaSalonCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReservaSalonCMouseClicked
        ReservaSalones dialog = new ReservaSalones(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_ReservaSalonCMouseClicked

    private void jLabel71MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel71MouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel71MouseClicked

    private void ReservaSalonBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReservaSalonBMouseClicked
        ReservaSalones dialog = new ReservaSalones(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_ReservaSalonBMouseClicked

    private void ReservaSalonAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReservaSalonAMouseEntered

        // TODO add your handling code here:
    }//GEN-LAST:event_ReservaSalonAMouseEntered

    private void ReservaSalonAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReservaSalonAMouseClicked
        ReservaSalones dialog = new ReservaSalones(new javax.swing.JFrame(), true);
        dialog.setVisible(true);

    }//GEN-LAST:event_ReservaSalonAMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String email = txtEmailBuscar.getText();
        cargarReservasPorEmail((DefaultTableModel) tablaReservas.getModel(), email);
        
        ReservasController controller = new ReservasController();
        List<Reserva> reservas = controller.buscarReservaPorEmail(email);//Llama a buscarReservaPorEmail(email) para obtener una lista de reservas
        
        //Llena los textfields con los datos de la reserva
          if (!reservas.isEmpty()) {
            Reserva r = reservas.get(0); 
            txtNombreMod.setText(r.getNombreCliente());
            txtApellidosMod.setText(r.getApellidoCliente());
            txtTelefonoMod.setText(r.getTelefonoCliente());
            txtFechaMod.setText(r.getFecha());
            txtHoraMod.setText(r.getHora());
            txtInvitadosMod.setText(String.valueOf(r.getCantidadPersonas()));
            txtMesaMod.setText(r.getNumeroMesa());
        } else {
            JOptionPane.showMessageDialog(this, "Reserva no encontrada.");
        }
// TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tablaReservasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaReservasMouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_tablaReservasMouseClicked

    private void btnFecha6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecha6ActionPerformed
        fechaSeleccionada = "25-05-27";
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFecha6ActionPerformed

    private void btnFecha5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecha5ActionPerformed
        fechaSeleccionada = "25-05-26";
    }//GEN-LAST:event_btnFecha5ActionPerformed

    private void btnFecha4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecha4ActionPerformed
        fechaSeleccionada = "25-05-24";
    }//GEN-LAST:event_btnFecha4ActionPerformed

    private void btnFecha3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecha3ActionPerformed
        fechaSeleccionada = "25-05-23";
    }//GEN-LAST:event_btnFecha3ActionPerformed

    private void btnFecha2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecha2ActionPerformed
        fechaSeleccionada = "25-05-21";

    }//GEN-LAST:event_btnFecha2ActionPerformed

    private void btnFecha1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecha1ActionPerformed
        fechaSeleccionada = "25-05-20";
    }//GEN-LAST:event_btnFecha1ActionPerformed

    private void btnMesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesasActionPerformed
        new ReservaMesas().setVisible(true);

    }//GEN-LAST:event_btnMesasActionPerformed

    private void btnReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservarActionPerformed
        String nombre = txtNombre.getText();
        String apellidos = txtApellidos.getText();
        String correo = txtEmail1.getText();
        String telefono = txtTelefono.getText();
        String  mesa = (String) JcomboMesas.getSelectedItem();
        
        if (!ReservasController.validarNombre(nombre)) {
    JOptionPane.showMessageDialog(this, "Nombre inválido");
    return;
    }if (!ReservasController.validarApellidos(apellidos)) {
        JOptionPane.showMessageDialog(this, "Apellidos inválidos.");
        return;
    }

    if (!ReservasController.validarEmail(correo)) {
        JOptionPane.showMessageDialog(this, "Email inválido.");
        return;
    }

    if (!ReservasController.validarTelefono(telefono)) {
        JOptionPane.showMessageDialog(this, "Teléfono inválido.");
        return;
    }

        if (nombre.isEmpty() || apellidos.isEmpty() || correo.isEmpty() || telefono.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor completa todos los campos y selecciona una mesa.");
            return;
        }

        Reserva reserva= new Reserva(nombre, apellidos, horaSeleccionada,invitados, mesa, fechaSeleccionada, telefono  ,correo);

        ReservasController reservaController = new ReservasController();
        reservaController.crearReserva(reserva);
        JOptionPane.showMessageDialog(null, "Reservación hecha con éxito.");

        // TODO add your handling code here:
    }//GEN-LAST:event_btnReservarActionPerformed

    private void btnHora6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHora6ActionPerformed
        horaSeleccionada = "15:00";
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHora6ActionPerformed

    private void btnHora5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHora5ActionPerformed
        horaSeleccionada = "20:00";
    }//GEN-LAST:event_btnHora5ActionPerformed

    private void btnHora4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHora4ActionPerformed
        horaSeleccionada = "18:30";
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHora4ActionPerformed

    private void btnHora3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHora3ActionPerformed
        horaSeleccionada = "17:00";
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHora3ActionPerformed

    private void btnHora2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHora2ActionPerformed
        horaSeleccionada = "13:00";
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHora2ActionPerformed

    private void btnHora1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHora1ActionPerformed
        horaSeleccionada = "11:00";
    }//GEN-LAST:event_btnHora1ActionPerformed

    private void btnMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosActionPerformed
        if (invitados > 0) {
            invitados--;
            txtInvitados.setText(String.valueOf(invitados));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMenosActionPerformed

    private void btnMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasActionPerformed
        invitados++;
        txtInvitados.setText(String.valueOf(invitados));
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMasActionPerformed

    private void txtEmail1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmail1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmail1ActionPerformed

    private void txtApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidosActionPerformed

    private void botonSalonesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSalonesMouseClicked
        tabbedCliente.setSelectedIndex(5);

        // TODO add your handling code here:
    }//GEN-LAST:event_botonSalonesMouseClicked

    private void botonVerReservaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVerReservaMouseClicked
        tabbedCliente.setSelectedIndex(2);
        // TODO add your handling code here:
    }//GEN-LAST:event_botonVerReservaMouseClicked

    private void botonPlatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonPlatosMouseClicked
        tabbedCliente.setSelectedIndex(4);
        // TODO add your handling code here:
    }//GEN-LAST:event_botonPlatosMouseClicked

    private void botonModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonModificarMouseClicked
        tabbedCliente.setSelectedIndex(3);
        // TODO add your handling code here:
    }//GEN-LAST:event_botonModificarMouseClicked

    private void botonReservaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonReservaMouseClicked
        tabbedCliente.setSelectedIndex(1);
        // TODO add your handling code here:
    }//GEN-LAST:event_botonReservaMouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        tabbedCliente.setSelectedIndex(1);
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       cargarReservas(modeloReserva);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseClicked
         String email = txtEmailBuscar.getText().trim();
        if (email.isEmpty()) return;

        Reserva nueva = new Reserva();// nuevo objeto Reserva llamado nueva para almacenar los datos que 
        //el usuario quiere actualizar.
       
        nueva.setNombre(txtNombreMod.getText().trim());
        nueva.setApellidos(txtApellidosMod.getText().trim());
        nueva.setTelefono(txtTelefonoMod.getText().trim());
        nueva.setEmail(email);
        nueva.setMesa(txtMesaMod.getText().trim());
        nueva.setFecha(txtFechaMod.getText().trim());
        nueva.setHora(txtHoraMod.getText().trim());
        nueva.setInvitados(Integer.parseInt(txtInvitados.getText().trim()));
        
        ReservasController controller = new ReservasController();
        boolean ok = controller.modificarReserva(email, nueva);
        if (ok) {
            JOptionPane.showMessageDialog(this, "Reserva actualizada correctamente.");
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo actualizar la reserva.");
        }

    }//GEN-LAST:event_btnModificarMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
         int filaSeleccionada = tablaReservas.getSelectedRow();
          if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(null, "Selecciona una reserva para eliminar.");
            return;
        }
          
        String email = tablaReservas.getValueAt(filaSeleccionada, 3).toString();

        int confirm = JOptionPane.showConfirmDialog(null,
            "¿Estás seguro de eliminar la reserva con correo: " + email + "?", "Confirmar", JOptionPane.YES_NO_OPTION);
      if (confirm == JOptionPane.YES_OPTION) {
           ReservasController controller = new ReservasController();
            boolean eliminado = controller.EliminarReserva(email);
            if (eliminado) {
                ((DefaultTableModel) tablaReservas.getModel()).removeRow(filaSeleccionada);
                JOptionPane.showMessageDialog(null, "Reserva eliminada correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar la reserva.");
            }
        }
// TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
          new Login().setVisible(true);
          this.dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_btnVolverActionPerformed

    private void botonReservaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonReservaMouseEntered
        
// TODO add your handling code here:
    }//GEN-LAST:event_botonReservaMouseEntered

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
            java.util.logging.Logger.getLogger(ClienteFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JcomboMesas;
    private javax.swing.JScrollPane JscPlatos;
    private javax.swing.JPanel ReservaSalonA;
    private javax.swing.JPanel ReservaSalonB;
    private javax.swing.JPanel ReservaSalonC;
    private javax.swing.JPanel botonModificar;
    private javax.swing.JPanel botonPlatos;
    private javax.swing.JPanel botonReserva;
    private javax.swing.JPanel botonSalones;
    private javax.swing.JPanel botonVerReserva;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JPanel btnEliminar;
    private javax.swing.JButton btnFecha1;
    private javax.swing.JButton btnFecha2;
    private javax.swing.JButton btnFecha3;
    private javax.swing.JButton btnFecha4;
    private javax.swing.JButton btnFecha5;
    private javax.swing.JButton btnFecha6;
    private javax.swing.JButton btnHora1;
    private javax.swing.JButton btnHora2;
    private javax.swing.JButton btnHora3;
    private javax.swing.JButton btnHora4;
    private javax.swing.JButton btnHora5;
    private javax.swing.JButton btnHora6;
    private javax.swing.JButton btnMas;
    private javax.swing.JButton btnMenos;
    private javax.swing.JButton btnMesas;
    private javax.swing.JPanel btnModificar;
    private javax.swing.JButton btnReservar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbEntrada1;
    private javax.swing.JLabel lbEntrada2;
    private javax.swing.JLabel lbEntrada3;
    private javax.swing.JLabel lbEntrada4;
    private javax.swing.JLabel lbEntrada5;
    private javax.swing.JLabel lbEntrada6;
    private javax.swing.JLabel lbPlato1;
    private javax.swing.JLabel lbPlato2;
    private javax.swing.JLabel lbPlato3;
    private javax.swing.JLabel lbPlato4;
    private javax.swing.JLabel lbPlato5;
    private javax.swing.JLabel lbPlato6;
    private javax.swing.JLabel lbPostre1;
    private javax.swing.JLabel lbPostre2;
    private javax.swing.JLabel lbPostre3;
    private javax.swing.JLabel lbPostre4;
    private javax.swing.JLabel lbPostre5;
    private javax.swing.JLabel lbPostre6;
    private javax.swing.JPanel panelLateral;
    private javax.swing.JPanel panelLogo;
    private javax.swing.JPanel panelPLatos;
    private javax.swing.JPanel panelReservas;
    private javax.swing.JPanel panelSalon1;
    private javax.swing.JPanel panelSalon4;
    private javax.swing.JPanel panelSalon5;
    private javax.swing.JPanel panelSalones;
    private javax.swing.JPanel panelVerReserva;
    private javax.swing.JPanel panelverReserva;
    private javax.swing.JTabbedPane tabbedCliente;
    private javax.swing.JTable tablaReservas;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtApellidosMod;
    private javax.swing.JTextField txtEmail1;
    private javax.swing.JTextField txtEmailBuscar;
    private javax.swing.JTextField txtFechaMod;
    private javax.swing.JTextField txtHoraMod;
    private javax.swing.JTextField txtInvitados;
    private javax.swing.JTextField txtInvitadosMod;
    private javax.swing.JTextField txtMesaMod;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreMod;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTelefonoMod;
    // End of variables declaration//GEN-END:variables
}
