/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SEARVista;

import SearLogica.VO;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//import net.sf.jasperreports.engine.JREmptyDataSource;
//import net.sf.jasperreports.engine.JRException;
//import net.sf.jasperreports.engine.JasperExportManager;
//import net.sf.jasperreports.engine.JasperFillManager;
//import net.sf.jasperreports.engine.JasperPrint;
//import net.sf.jasperreports.engine.JasperReport;
//import net.sf.jasperreports.engine.util.JRLoader;
//import net.sf.jasperreports.view.JasperViewer; 
//import sear.BDQuery;


/**
 *
 * @author alexX
 */
public class LogeoUsuarios extends javax.swing.JFrame {

    /**
     * Creates new form LogeoUsuarios
     */
    
    VO consultas;
    private String [] mensaje;
    private String [] datosTabla;
    private int controlME = 2;
    private String datos[];
    private String updates[];
    private String mensaje2;
    private String usua;
    private String contra;
    private String datosPagosC[] = new String[4];
    private String idProfesor;
    private String idCE[] = new String[2];;
    private String ceID;
    private String splitt[];
    
    
    public LogeoUsuarios() {
        initComponents();
        consultas = new VO();       
//        setIconImage(new ImageIcon(getClass().getResource("../sear/Imagenes/Logo SEAR.png")).getImage());
    }
    
    
    void mostrarDatosAlumnos(String[] datos)
    {
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellio Paterno");
        modelo.addColumn("Apellido Materno");
        modelo.addColumn("Telefono");
        modelo.addColumn("Celular");
        modelo.addColumn("Nombre del tutor");
        modelo.addColumn("Direccion");
        modelo.addColumn("Municipio");
        TablaAlumnos.setModel(modelo);
        
        String[] datosT;
        
        for(int i=0 ; i< datos.length; i++)
        {
            datosT = datos[i].split("-");
            modelo.addRow(datosT);
        }
        
    }
    
    
    void mostrarDatosAlumnosP(String[] datos)
    {
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellio Paterno");
        modelo.addColumn("Apellido Materno");
        modelo.addColumn("Nombre del tutor");
        tablaAlumnoC.setModel(modelo);
        
        String[] datosT;
        
        for(int i=0 ; i< datos.length; i++)
        {
            datosT = datos[i].split("-");
            modelo.addRow(datosT);
        }
        
    }
    
    
    void mostrarDatosCalifica(String[] datos)
    {
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Apellido Paterno");
        modelo.addColumn("Apellio Materno");
        modelo.addColumn("Nombre");
        modelo.addColumn("Calificación");
        tablaCalificaciones.setModel(modelo);
        
        String[] datosT;
        
        for(int i=0 ; i< datos.length; i++)
        {
            datosT = datos[i].split("-");
            modelo.addRow(datosT);
        }
        
    }
    
    void mostrarDatosUsuarioM(String[] datos)
    {
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellio Paterno");
        modelo.addColumn("Apellido Materno");
        modelo.addColumn("Telefono");
        modelo.addColumn("Celular");
        modelo.addColumn("Domicilio");
        modelo.addColumn("Municipio");
        modelo.addColumn("Tipo de Usuario");
        tablaMUsu.setModel(modelo);
        
        String[] datosT;
        
        for(int i=0 ; i< datos.length; i++)
        {
            datosT = datos[i].split("-");
            modelo.addRow(datosT);
        }
        
    }
    
    void mostrarDatosUsuarioE(String[] datos)
    {
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellio Paterno");
        modelo.addColumn("Apellido Materno");
        modelo.addColumn("Telefono");
        modelo.addColumn("Celular");
        modelo.addColumn("Domicilio");
        modelo.addColumn("Municipio");
        modelo.addColumn("Tipo de Usuario");
        tablaEUsu.setModel(modelo);
        
        String[] datosT;
        
        for(int i=0 ; i< datos.length; i++)
        {
            datosT = datos[i].split("-");
            modelo.addRow(datosT);
        }
        
    }
    
    
    void mostrarDatosPagosC(String[] datos)
    {
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("Cantidad Real");
      
        tablaPagosC.setModel(modelo);
        
        String[] datosT;
        
        for(int i=0 ; i< datos.length; i++)
        {
            datosT = datos[i].split("-");
            modelo.addRow(datosT);
        }
        
    }

    void mostrarDatosPagosG(String[] datos)
    {
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("Cantidad Real");
      
        tablaCPagosC.setModel(modelo);
        
        String[] datosT;
        
        for(int i=0 ; i< datos.length; i++)
        {
            datosT = datos[i].split("-");
            modelo.addRow(datosT);
        }
        
    }
    
    void mostrarDatosPAC(String[] datos)
    {
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellio Paterno");
        modelo.addColumn("Pago");
        modelo.addColumn("Cantidad");
        tablaPagosAlumno.setModel(modelo);
        
        String[] datosT;
        
        for(int i=0 ; i< datos.length; i++)
        {
            datosT = datos[i].split("-");
            modelo.addRow(datosT);
        }
        
    }
    
    
    void mostrarCriterios(String[] datos)
    {
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Clave");
        modelo.addColumn("Nombre");
        TablaCE.setModel(modelo);
        
        String[] datosT;
        
        for(int i=0 ; i< datos.length; i++)
        {
            datosT = datos[i].split("-");
            modelo.addRow(datosT);
        }
        
    }
    
    
    void mostrarCaliD(String[] datos)
    {
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Apellido Paterno");
        modelo.addColumn("Apellio Materno");
        modelo.addColumn("Nombre");
        modelo.addColumn("Calificación");
        tablaCalificaciones1.setModel(modelo);
        
        String[] datosT;
        
        for(int i=0 ; i< datos.length; i++)
        {
            datosT = datos[i].split("-");
            modelo.addRow(datosT);
        }
        
    }
    
    void mostrarGrupos(String[] datos)
    {
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Clave Grupo");
        modelo.addColumn("Nombre");
        TablaG.setModel(modelo);
        
        String[] datosT;
        
        for(int i=0 ; i< datos.length; i++)
        {
            datosT = datos[i].split("-");
            modelo.addRow(datosT);
        }
        
    }

    void mostrarGruposP(String[] datos)
    {
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Clave Grupo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Prfesor");
        TablaG.setModel(modelo);
        
        String[] datosT;
        
        for(int i=0 ; i< datos.length; i++)
        {
            datosT = datos[i].split("-");
            modelo.addRow(datosT);
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

        GestionDirectora = new javax.swing.JDialog();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem38 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem36 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu34 = new javax.swing.JMenu();
        jMenuItem30 = new javax.swing.JMenuItem();
        jMenuItem88 = new javax.swing.JMenuItem();
        jMenuItem89 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        GestionProfesor = new javax.swing.JDialog();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        MenuAlumnos = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        NombreAlum = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        Ap_pat = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        Ap_mat = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        Celular = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        Telefono = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        NomTutor = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        direccion = new javax.swing.JTextField();
        Municipio = new javax.swing.JComboBox();
        jLabel26 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu25 = new javax.swing.JMenu();
        jMenuItem43 = new javax.swing.JMenuItem();
        jMenuItem41 = new javax.swing.JMenuItem();
        jMenuItem44 = new javax.swing.JMenuItem();
        jMenuItem40 = new javax.swing.JMenuItem();
        jMenuItem42 = new javax.swing.JMenuItem();
        jMenuItem45 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        EliminarModificarAlumno = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        MNombreAlum = new javax.swing.JTextField();
        MApellidoPAlum = new javax.swing.JTextField();
        MApellidoMAlum = new javax.swing.JTextField();
        MDireccionAlum = new javax.swing.JTextField();
        MNTAlum = new javax.swing.JTextField();
        MTelefonoAlum = new javax.swing.JTextField();
        MMunicipioAlum = new javax.swing.JTextField();
        MCelularAlum = new javax.swing.JTextField();
        jPanel = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        mensajeElimnarAlumno = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        NombreElimnarAlumno = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaAlumnos = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jMenuBar5 = new javax.swing.JMenuBar();
        jMenu27 = new javax.swing.JMenu();
        jMenuItem46 = new javax.swing.JMenuItem();
        jMenuItem47 = new javax.swing.JMenuItem();
        jMenuItem48 = new javax.swing.JMenuItem();
        jMenuItem49 = new javax.swing.JMenuItem();
        jMenuItem50 = new javax.swing.JMenuItem();
        jMenuItem51 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();
        TMenuAlumnos = new javax.swing.JPopupMenu();
        ModificarAlumno = new javax.swing.JMenuItem();
        EliminarAlumno = new javax.swing.JMenuItem();
        MenuUsuarios = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        NombreUsuario = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        Ap_patUsua = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        Ap_matUsa = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        CelularUsu = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        TelefonoUsu = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        direccionUsu = new javax.swing.JTextField();
        MunicipioUsu = new javax.swing.JComboBox();
        jLabel46 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        TipoUsuario = new javax.swing.JComboBox();
        jLabel48 = new javax.swing.JLabel();
        aliasUsu = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        contraUsu = new javax.swing.JPasswordField();
        jLabel50 = new javax.swing.JLabel();
        comprobarCUsa = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jMenuBar6 = new javax.swing.JMenuBar();
        jMenu28 = new javax.swing.JMenu();
        jMenuItem52 = new javax.swing.JMenuItem();
        jMenuItem53 = new javax.swing.JMenuItem();
        jMenuItem54 = new javax.swing.JMenuItem();
        jMenuItem55 = new javax.swing.JMenuItem();
        jMenuItem56 = new javax.swing.JMenuItem();
        jMenuItem57 = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenu();
        jMenuItem15 = new javax.swing.JMenuItem();
        EliminarUsuarios = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaEUsu = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        mensajeElimnarAlumno1 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        NombreElimnarUsuario = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jMenuBar7 = new javax.swing.JMenuBar();
        jMenu13 = new javax.swing.JMenu();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenu14 = new javax.swing.JMenu();
        jMenuItem18 = new javax.swing.JMenuItem();
        ModificarUsuario = new javax.swing.JDialog();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaMUsu = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        MNombreUsuario = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        MpaternoUsu = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        MMaternUsu = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        MTelefonoUsu = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        MCelularUsu = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        MDireccionUsu = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        MmunicipioUsu = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        MTipoUsu = new javax.swing.JComboBox();
        jLabel64 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        jButton6 = new javax.swing.JButton();
        jMenuBar8 = new javax.swing.JMenuBar();
        jMenu15 = new javax.swing.JMenu();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenuItem25 = new javax.swing.JMenuItem();
        jMenuItem26 = new javax.swing.JMenuItem();
        jMenu16 = new javax.swing.JMenu();
        jMenuItem23 = new javax.swing.JMenuItem();
        EliminarUsu = new javax.swing.JPopupMenu();
        EliminarUsuario = new javax.swing.JMenuItem();
        ModificarUsu = new javax.swing.JPopupMenu();
        ModificarUsuarioo = new javax.swing.JMenuItem();
        CriteriosEvaluacion = new javax.swing.JDialog();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TablaCE = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jLabel68 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel71 = new javax.swing.JLabel();
        nombreCE = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel69 = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        jLabel72 = new javax.swing.JLabel();
        modificarCE = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel70 = new javax.swing.JLabel();
        jSeparator14 = new javax.swing.JSeparator();
        jLabel73 = new javax.swing.JLabel();
        eliminarCE = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jMenuBar9 = new javax.swing.JMenuBar();
        jMenu29 = new javax.swing.JMenu();
        jMenuItem58 = new javax.swing.JMenuItem();
        jMenuItem59 = new javax.swing.JMenuItem();
        jMenuItem60 = new javax.swing.JMenuItem();
        jMenuItem61 = new javax.swing.JMenuItem();
        jMenuItem62 = new javax.swing.JMenuItem();
        jMenuItem63 = new javax.swing.JMenuItem();
        jMenu17 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        Calificaciones = new javax.swing.JDialog();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        CriteriosCa = new javax.swing.JComboBox();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaCalificaciones = new javax.swing.JTable();
        bimestreC = new javax.swing.JComboBox();
        jLabel77 = new javax.swing.JLabel();
        DiaC = new javax.swing.JComboBox();
        mesC = new javax.swing.JComboBox();
        añoC = new javax.swing.JComboBox();
        jButton10 = new javax.swing.JButton();
        jMenuBar10 = new javax.swing.JMenuBar();
        jMenu18 = new javax.swing.JMenu();
        jMenuItem27 = new javax.swing.JMenuItem();
        GestionPagosC = new javax.swing.JDialog();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tablaPagosC = new javax.swing.JTable();
        jPanel14 = new javax.swing.JPanel();
        jLabel81 = new javax.swing.JLabel();
        jSeparator15 = new javax.swing.JSeparator();
        jLabel82 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jLabel83 = new javax.swing.JLabel();
        jSeparator16 = new javax.swing.JSeparator();
        jLabel84 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jLabel85 = new javax.swing.JLabel();
        jSeparator17 = new javax.swing.JSeparator();
        jLabel86 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton13 = new javax.swing.JButton();
        jMenuBar11 = new javax.swing.JMenuBar();
        jMenu30 = new javax.swing.JMenu();
        jMenuItem64 = new javax.swing.JMenuItem();
        jMenuItem65 = new javax.swing.JMenuItem();
        jMenuItem66 = new javax.swing.JMenuItem();
        jMenuItem67 = new javax.swing.JMenuItem();
        jMenuItem68 = new javax.swing.JMenuItem();
        jMenuItem69 = new javax.swing.JMenuItem();
        jMenu19 = new javax.swing.JMenu();
        jMenuItem28 = new javax.swing.JMenuItem();
        ControlPagosC = new javax.swing.JDialog();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tablaCPagosC = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        tablaAlumnoC = new javax.swing.JTable();
        jScrollPane9 = new javax.swing.JScrollPane();
        tablaPagosAlumno = new javax.swing.JTable();
        jPanel17 = new javax.swing.JPanel();
        jLabel90 = new javax.swing.JLabel();
        AlumnoPC = new javax.swing.JTextField();
        jLabel91 = new javax.swing.JLabel();
        PagoPC = new javax.swing.JTextField();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        cantidadPC = new javax.swing.JTextField();
        DiaPC = new javax.swing.JComboBox();
        MesPC = new javax.swing.JComboBox();
        AñoPC = new javax.swing.JComboBox();
        jButton14 = new javax.swing.JButton();
        jMenuBar12 = new javax.swing.JMenuBar();
        jMenu31 = new javax.swing.JMenu();
        jMenuItem70 = new javax.swing.JMenuItem();
        jMenuItem71 = new javax.swing.JMenuItem();
        jMenuItem72 = new javax.swing.JMenuItem();
        jMenuItem73 = new javax.swing.JMenuItem();
        jMenuItem74 = new javax.swing.JMenuItem();
        jMenuItem75 = new javax.swing.JMenuItem();
        jMenu20 = new javax.swing.JMenu();
        jMenuItem31 = new javax.swing.JMenuItem();
        jMenu21 = new javax.swing.JMenu();
        jMenuItem29 = new javax.swing.JMenuItem();
        menuAlumnoCP = new javax.swing.JPopupMenu();
        Seleccionar = new javax.swing.JMenuItem();
        MenuPagosC = new javax.swing.JPopupMenu();
        SeleccionarP = new javax.swing.JMenuItem();
        LogeoUsuarios = new javax.swing.JDialog();
        Contrasena = new javax.swing.JPasswordField();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jSeparator18 = new javax.swing.JSeparator();
        jSeparator19 = new javax.swing.JSeparator();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        Usuario = new javax.swing.JTextField();
        jButton15 = new javax.swing.JButton();
        jMenuBar13 = new javax.swing.JMenuBar();
        jMenu22 = new javax.swing.JMenu();
        jMenuItem34 = new javax.swing.JMenuItem();
        jMenu23 = new javax.swing.JMenu();
        jMenuItem33 = new javax.swing.JMenuItem();
        MenuCE = new javax.swing.JPopupMenu();
        Eliminar = new javax.swing.JMenuItem();
        Modificar = new javax.swing.JMenuItem();
        VerificarCalificaciones = new javax.swing.JDialog();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        CriteriosCa1 = new javax.swing.JComboBox();
        jScrollPane10 = new javax.swing.JScrollPane();
        tablaCalificaciones1 = new javax.swing.JTable();
        bimestreC1 = new javax.swing.JComboBox();
        jLabel104 = new javax.swing.JLabel();
        ComboPCD = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jMenuBar14 = new javax.swing.JMenuBar();
        jMenu32 = new javax.swing.JMenu();
        jMenuItem76 = new javax.swing.JMenuItem();
        jMenuItem77 = new javax.swing.JMenuItem();
        jMenuItem78 = new javax.swing.JMenuItem();
        jMenuItem79 = new javax.swing.JMenuItem();
        jMenuItem80 = new javax.swing.JMenuItem();
        jMenuItem81 = new javax.swing.JMenuItem();
        jMenu24 = new javax.swing.JMenu();
        jMenuItem37 = new javax.swing.JMenuItem();
        Grupos = new javax.swing.JDialog();
        jPanel18 = new javax.swing.JPanel();
        jLabel105 = new javax.swing.JLabel();
        jSeparator20 = new javax.swing.JSeparator();
        jLabel106 = new javax.swing.JLabel();
        nombreCE1 = new javax.swing.JTextField();
        jButton16 = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        jLabel107 = new javax.swing.JLabel();
        jSeparator21 = new javax.swing.JSeparator();
        jLabel108 = new javax.swing.JLabel();
        eliminarCE1 = new javax.swing.JTextField();
        jButton17 = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        jLabel109 = new javax.swing.JLabel();
        jSeparator22 = new javax.swing.JSeparator();
        jLabel110 = new javax.swing.JLabel();
        modificarCE1 = new javax.swing.JTextField();
        jButton18 = new javax.swing.JButton();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        TablaG = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        ComboGP = new javax.swing.JComboBox();
        jMenuBar15 = new javax.swing.JMenuBar();
        jMenu33 = new javax.swing.JMenu();
        jMenuItem82 = new javax.swing.JMenuItem();
        jMenuItem83 = new javax.swing.JMenuItem();
        jMenuItem84 = new javax.swing.JMenuItem();
        jMenuItem85 = new javax.swing.JMenuItem();
        jMenuItem86 = new javax.swing.JMenuItem();
        jMenuItem87 = new javax.swing.JMenuItem();
        jMenu26 = new javax.swing.JMenu();
        jMenuItem39 = new javax.swing.JMenuItem();
        MenuGrupos = new javax.swing.JPopupMenu();
        EliminarG = new javax.swing.JMenuItem();
        ModficarG = new javax.swing.JMenuItem();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem32 = new javax.swing.JMenuItem();
        jMenuItem35 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        GestionDirectora.setMinimumSize(new java.awt.Dimension(577, 389));

        jLabel6.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 255));
        jLabel6.setText("Portal Directora");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo SEAR Mini.png"))); // NOI18N

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 255));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo.png"))); // NOI18N

        jMenu3.setText("Menu");

        jMenuItem7.setText("Administracion Usuarios");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuItem38.setText("Control Grupos");
        jMenuItem38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem38ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem38);

        jMenuItem5.setText("Control Pagos y Colegiaturas");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem1.setText("Gestion Criterios de Evaluación");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem36.setText("Gestion Alumnos");
        jMenuItem36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem36ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem36);

        jMenuItem3.setText("Verificar Calificaciones");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuBar2.add(jMenu3);

        jMenu34.setText("Otras Opciones");

        jMenuItem30.setText("Imprimir constancia");
        jMenuItem30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem30ActionPerformed(evt);
            }
        });
        jMenu34.add(jMenuItem30);

        jMenuItem88.setText("Imprimir lista de profesores");
        jMenuItem88.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem88ActionPerformed(evt);
            }
        });
        jMenu34.add(jMenuItem88);

        jMenuItem89.setText("Imprimir Historial");
        jMenuItem89.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem89ActionPerformed(evt);
            }
        });
        jMenu34.add(jMenuItem89);

        jMenuBar2.add(jMenu34);

        jMenu4.setText("Salir");

        jMenuItem4.setText("CerrarSesión");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        jMenuBar2.add(jMenu4);

        GestionDirectora.setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout GestionDirectoraLayout = new javax.swing.GroupLayout(GestionDirectora.getContentPane());
        GestionDirectora.getContentPane().setLayout(GestionDirectoraLayout);
        GestionDirectoraLayout.setHorizontalGroup(
            GestionDirectoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GestionDirectoraLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GestionDirectoraLayout.createSequentialGroup()
                .addContainerGap(187, Short.MAX_VALUE)
                .addGroup(GestionDirectoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GestionDirectoraLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GestionDirectoraLayout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(jLabel7)))
                .addGap(32, 32, 32))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GestionDirectoraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(GestionDirectoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator5)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GestionDirectoraLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jSeparator4)
                        .addGap(22, 22, 22)))
                .addContainerGap())
        );
        GestionDirectoraLayout.setVerticalGroup(
            GestionDirectoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GestionDirectoraLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel9)
                .addGap(43, 43, 43)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(34, 34, 34)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        GestionProfesor.setMinimumSize(new java.awt.Dimension(577, 389));

        jSeparator6.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 255));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo.png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo SEAR Mini.png"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 255));
        jLabel11.setText("Portal Profesor");

        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));

        jMenu5.setText("Menu");

        jMenuItem9.setText("Calificaciones");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem9);

        jMenuBar3.add(jMenu5);

        jMenu6.setText("Salir");

        jMenuItem8.setText("CerrarSesión");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem8);

        jMenuBar3.add(jMenu6);

        GestionProfesor.setJMenuBar(jMenuBar3);

        javax.swing.GroupLayout GestionProfesorLayout = new javax.swing.GroupLayout(GestionProfesor.getContentPane());
        GestionProfesor.getContentPane().setLayout(GestionProfesorLayout);
        GestionProfesorLayout.setHorizontalGroup(
            GestionProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GestionProfesorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator6)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GestionProfesorLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(GestionProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator7)
                    .addGroup(GestionProfesorLayout.createSequentialGroup()
                        .addGap(0, 403, Short.MAX_VALUE)
                        .addComponent(jLabel8)))
                .addGap(32, 32, 32))
            .addGroup(GestionProfesorLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GestionProfesorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(203, 203, 203))
        );
        GestionProfesorLayout.setVerticalGroup(
            GestionProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GestionProfesorLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel10)
                .addGap(23, 23, 23)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        MenuAlumnos.setMinimumSize(new java.awt.Dimension(800, 600));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo SEAR Mini.png"))); // NOI18N

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo.png"))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 204));
        jLabel12.setText("Nuevo Registro");

        jLabel17.setText("Nombre");

        jLabel18.setText("Apellido Paterno");

        jLabel19.setText("Apellido Materno");

        jLabel20.setText("Celular");

        jLabel21.setText("Lada+10 Dígitos");

        jLabel22.setText("     Teléfono");

        jLabel23.setText("Nombre del tutor");

        jLabel25.setText("Dirección");

        Municipio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione el municipio", "Acambay", "Acolman", "Aculco", "Almoloya de Alquisiras", "Almoloya de Juárez", "Almoloya del Río", "Amanalco", "Amatepec", "Amecameca", "Apaxco", "Atenco", "Atizapán", "Atizapán de Zaragoza", "Atlacomulco", "Atlautla", "Axapusco", "Ayapango", "Calimaya", "Capulhuac", "Coacalco de Berriozábal", "Coatepec Harinas", "Cocotitlán", "Coyotepec", "Cuautitlán", "Chalco", "Chapa de Mota", "Chapultepec", "Chiautla", "Chicoloapan", "Chiconcuac", "Chimalhuacán", "Donato Guerra", "Ecatepec de Morelos", "Ecatzingo", "Huehuetoca", "Hueypoxtla", "Huixquilucan", "Isidro Fabela", "Ixtapaluca", "Ixtapan de la Sal", "Ixtapan del Oro", "Ixtlahuaca", "Xalatlaco", "Jaltenco", "Jilotepec", "Jilotzingo", "Jiquipilco", "Jocotitlán", "Joquicingo", "Juchitepec", "Lerma", "Malinalco", "Melchor Ocampo", "Metepec", "Mexicaltzingo", "Morelos", "Naucalpan de Juárez", "Nezahualcóyotl", "Nextlalpan", "Nicolás Romero", "Nopaltepec", "Ocoyoacac", "Ocuilan", " " }));
        Municipio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MunicipioActionPerformed(evt);
            }
        });

        jLabel26.setText("Lada+ 8 Dígitos");

        jButton2.setForeground(new java.awt.Color(0, 102, 255));
        jButton2.setText("Enviar Datos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccion de grupo", "1277", "1235", "8645", "2312" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133)
                .addComponent(jLabel15)
                .addGap(74, 74, 74))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NombreAlum, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel21))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Celular, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addGap(22, 22, 22)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel26))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Ap_pat, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel19))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel23)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Ap_mat)
                                    .addComponent(NomTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel25)
                        .addGap(18, 18, 18)
                        .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)
                        .addComponent(Municipio, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(329, 329, 329)
                        .addComponent(jButton2)))
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(37, 37, 37)
                    .addComponent(jLabel14)
                    .addContainerGap(584, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel12)))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Ap_pat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)
                            .addComponent(Ap_mat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17)
                        .addComponent(NombreAlum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23)
                            .addComponent(NomTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel26))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(Celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel21)))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Municipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addGap(34, 34, 34)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton2)
                .addGap(48, 48, 48))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jLabel14)
                    .addContainerGap(386, Short.MAX_VALUE)))
        );

        jMenu25.setText("Menu Principal");

        jMenuItem43.setText("Administracion Usuarios");
        jMenuItem43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem43ActionPerformed(evt);
            }
        });
        jMenu25.add(jMenuItem43);

        jMenuItem41.setText("Control Grupos");
        jMenuItem41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem41ActionPerformed(evt);
            }
        });
        jMenu25.add(jMenuItem41);

        jMenuItem44.setText("Control Pagos y Colegiaturas");
        jMenuItem44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem44ActionPerformed(evt);
            }
        });
        jMenu25.add(jMenuItem44);

        jMenuItem40.setText("Gestión criterios");
        jMenuItem40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem40ActionPerformed(evt);
            }
        });
        jMenu25.add(jMenuItem40);

        jMenuItem42.setText("Gestión Alumnos");
        jMenuItem42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem42ActionPerformed(evt);
            }
        });
        jMenu25.add(jMenuItem42);

        jMenuItem45.setText("Verificar Calificaciones");
        jMenuItem45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem45ActionPerformed(evt);
            }
        });
        jMenu25.add(jMenuItem45);

        jMenuBar4.add(jMenu25);

        jMenu7.setText("Menu Alumno");

        jMenuItem13.setText("Modificar y Elimnar Alumno ");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem13);

        jMenuItem10.setText("Registrar Nuevo Alumno");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem10);

        jMenuBar4.add(jMenu7);

        jMenu8.setText("Salir");

        jMenuItem11.setText("Regresar");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem11);

        jMenuBar4.add(jMenu8);

        MenuAlumnos.setJMenuBar(jMenuBar4);

        javax.swing.GroupLayout MenuAlumnosLayout = new javax.swing.GroupLayout(MenuAlumnos.getContentPane());
        MenuAlumnos.getContentPane().setLayout(MenuAlumnosLayout);
        MenuAlumnosLayout.setHorizontalGroup(
            MenuAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuAlumnosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        MenuAlumnosLayout.setVerticalGroup(
            MenuAlumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuAlumnosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        EliminarModificarAlumno.setMinimumSize(new java.awt.Dimension(810, 629));

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jSeparator8.setForeground(new java.awt.Color(0, 204, 255));

        jLabel16.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 255));
        jLabel16.setText("Modficar");

        jLabel24.setText("Nombre");

        jLabel28.setText("Apellido Paterno");

        jLabel29.setText("Apellido Materno");

        jLabel30.setText("Dirrección");

        jLabel31.setText("Nombre del tutor");

        jLabel32.setText("Municipio");

        jLabel33.setText("Teléfono");

        jLabel34.setText("Celular");

        MDireccionAlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MDireccionAlumActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 78, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel24)
                                        .addComponent(jLabel30)
                                        .addComponent(jLabel33)
                                        .addComponent(jLabel32)
                                        .addComponent(jLabel34))
                                    .addGap(44, 44, 44))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel29)
                                        .addComponent(jLabel28))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel31)
                                .addGap(11, 11, 11)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(MCelularAlum, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(MApellidoMAlum)
                            .addComponent(MDireccionAlum)
                            .addComponent(MApellidoPAlum)
                            .addComponent(MNTAlum)
                            .addComponent(MMunicipioAlum)
                            .addComponent(MTelefonoAlum)
                            .addComponent(MNombreAlum)))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(MNombreAlum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MApellidoPAlum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MApellidoMAlum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MDireccionAlum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30))))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MNTAlum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MMunicipioAlum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MCelularAlum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(MTelefonoAlum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel13.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 255));
        jLabel13.setText("Eliminar");

        jSeparator1.setForeground(new java.awt.Color(0, 204, 255));

        mensajeElimnarAlumno.setText("Seguro de que desea eliminar al siguiente alumno:");

        jLabel27.setText("Nombre");

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addGap(0, 39, Short.MAX_VALUE)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NombreElimnarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mensajeElimnarAlumno)
                .addGap(58, 58, 58))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(mensajeElimnarAlumno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(NombreElimnarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(104, 104, 104))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("")));
        jPanel4.setPreferredSize(new java.awt.Dimension(800, 600));

        TablaAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TablaAlumnos.setComponentPopupMenu(TMenuAlumnos);
        jScrollPane1.setViewportView(TablaAlumnos);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jButton3.setForeground(new java.awt.Color(0, 153, 255));
        jButton3.setText("Aceptar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jMenu27.setText("Menu Principal");

        jMenuItem46.setText("Administracion Usuarios");
        jMenuItem46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem46ActionPerformed(evt);
            }
        });
        jMenu27.add(jMenuItem46);

        jMenuItem47.setText("Control Grupos");
        jMenuItem47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem47ActionPerformed(evt);
            }
        });
        jMenu27.add(jMenuItem47);

        jMenuItem48.setText("Control Pagos y Colegiaturas");
        jMenuItem48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem48ActionPerformed(evt);
            }
        });
        jMenu27.add(jMenuItem48);

        jMenuItem49.setText("Gestión criterios");
        jMenuItem49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem49ActionPerformed(evt);
            }
        });
        jMenu27.add(jMenuItem49);

        jMenuItem50.setText("Gestión Alumnos");
        jMenuItem50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem50ActionPerformed(evt);
            }
        });
        jMenu27.add(jMenuItem50);

        jMenuItem51.setText("Verificar Calificaciones");
        jMenuItem51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem51ActionPerformed(evt);
            }
        });
        jMenu27.add(jMenuItem51);

        jMenuBar5.add(jMenu27);

        jMenu9.setText("Menu");

        jMenuItem12.setText("Registrar nuevo alumno");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem12);

        jMenuBar5.add(jMenu9);

        jMenu10.setText("Salir");

        jMenuItem14.setText("Regresar");
        jMenu10.add(jMenuItem14);

        jMenuBar5.add(jMenu10);

        EliminarModificarAlumno.setJMenuBar(jMenuBar5);

        javax.swing.GroupLayout EliminarModificarAlumnoLayout = new javax.swing.GroupLayout(EliminarModificarAlumno.getContentPane());
        EliminarModificarAlumno.getContentPane().setLayout(EliminarModificarAlumnoLayout);
        EliminarModificarAlumnoLayout.setHorizontalGroup(
            EliminarModificarAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EliminarModificarAlumnoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(EliminarModificarAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE)
                    .addGroup(EliminarModificarAlumnoLayout.createSequentialGroup()
                        .addGap(0, 12, Short.MAX_VALUE)
                        .addGroup(EliminarModificarAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EliminarModificarAlumnoLayout.createSequentialGroup()
                                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EliminarModificarAlumnoLayout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addGap(157, 157, 157)))
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addContainerGap())
        );
        EliminarModificarAlumnoLayout.setVerticalGroup(
            EliminarModificarAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EliminarModificarAlumnoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(EliminarModificarAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EliminarModificarAlumnoLayout.createSequentialGroup()
                        .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76))
        );

        ModificarAlumno.setText("Modificar");
        ModificarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarAlumnoActionPerformed(evt);
            }
        });
        TMenuAlumnos.add(ModificarAlumno);

        EliminarAlumno.setText("Eliminar");
        EliminarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarAlumnoActionPerformed(evt);
            }
        });
        TMenuAlumnos.add(EliminarAlumno);

        MenuUsuarios.setMinimumSize(new java.awt.Dimension(810, 605));

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo SEAR Mini.png"))); // NOI18N

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo.png"))); // NOI18N

        jLabel37.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 0, 204));
        jLabel37.setText("Nuevo Registro");

        jLabel38.setText("Nombre");

        jLabel39.setText("Apellido Paterno");

        jLabel40.setText("Apellido Materno");

        jLabel41.setText("Celular");

        jLabel42.setText("Lada+10 Dígitos");

        jLabel43.setText("     Teléfono");

        jLabel45.setText("Dirección");

        MunicipioUsu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione el municipio", "Acambay", "Acolman", "Aculco", "Almoloya de Alquisiras", "Almoloya de Juárez", "Almoloya del Río", "Amanalco", "Amatepec", "Amecameca", "Apaxco", "Atenco", "Atizapán", "Atizapán de Zaragoza", "Atlacomulco", "Atlautla", "Axapusco", "Ayapango", "Calimaya", "Capulhuac", "Coacalco de Berriozábal", "Coatepec Harinas", "Cocotitlán", "Coyotepec", "Cuautitlán", "Chalco", "Chapa de Mota", "Chapultepec", "Chiautla", "Chicoloapan", "Chiconcuac", "Chimalhuacán", "Donato Guerra", "Ecatepec de Morelos", "Ecatzingo", "Huehuetoca", "Hueypoxtla", "Huixquilucan", "Isidro Fabela", "Ixtapaluca", "Ixtapan de la Sal", "Ixtapan del Oro", "Ixtlahuaca", "Xalatlaco", "Jaltenco", "Jilotepec", "Jilotzingo", "Jiquipilco", "Jocotitlán", "Joquicingo", "Juchitepec", "Lerma", "Malinalco", "Melchor Ocampo", "Metepec", "Mexicaltzingo", "Morelos", "Naucalpan de Juárez", "Nezahualcóyotl", "Nextlalpan", "Nicolás Romero", "Nopaltepec", "Ocoyoacac", "Ocuilan", " " }));
        MunicipioUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MunicipioUsuActionPerformed(evt);
            }
        });

        jLabel46.setText("Lada+ 8 Dígitos");

        jButton4.setForeground(new java.awt.Color(0, 102, 255));
        jButton4.setText("Enviar Datos");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        TipoUsuario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione el tipo de usuario", "Director(a)", "Profesor(a)" }));

        jLabel48.setText("Nombre de usuario");

        jLabel49.setText("Contraseña");

        jLabel50.setText("Comprobrar Contraseña");

        comprobarCUsa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprobarCUsaActionPerformed(evt);
            }
        });

        jLabel1.setText("Correo Electronico");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel38)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel41)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel42)
                                        .addGap(22, 22, 22))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CelularUsu)
                                        .addGap(13, 13, 13)))))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel43)
                        .addGap(22, 22, 22)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel46))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(TelefonoUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel45)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(direccionUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(MunicipioUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(10, 10, 10)
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel48)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(aliasUsu)))
                        .addGap(90, 90, 90)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel50)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comprobarCUsa, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel49)
                                .addGap(31, 31, 31)
                                .addComponent(contraUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(61, 61, 61))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel39)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Ap_patUsua, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel40)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Ap_matUsa, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel36)
                                .addGap(36, 36, 36))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(339, 339, 339))))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(37, 37, 37)
                    .addComponent(jLabel35)
                    .addContainerGap(584, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel36))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel37)))
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel38)
                        .addComponent(NombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Ap_patUsua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel40)
                            .addComponent(Ap_matUsa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel39))))
                .addGap(57, 57, 57)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel41)
                            .addComponent(CelularUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel42))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TelefonoUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel43)
                            .addComponent(jLabel45)
                            .addComponent(direccionUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel46)))
                .addGap(52, 52, 52)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MunicipioUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(aliasUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49)
                    .addComponent(contraUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(comprobarCUsa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addGap(20, 20, 20))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jLabel35)
                    .addContainerGap(386, Short.MAX_VALUE)))
        );

        jMenu28.setText("Menu Principal");

        jMenuItem52.setText("Administracion Usuarios");
        jMenuItem52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem52ActionPerformed(evt);
            }
        });
        jMenu28.add(jMenuItem52);

        jMenuItem53.setText("Control Grupos");
        jMenuItem53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem53ActionPerformed(evt);
            }
        });
        jMenu28.add(jMenuItem53);

        jMenuItem54.setText("Control Pagos y Colegiaturas");
        jMenuItem54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem54ActionPerformed(evt);
            }
        });
        jMenu28.add(jMenuItem54);

        jMenuItem55.setText("Gestión criterios");
        jMenuItem55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem55ActionPerformed(evt);
            }
        });
        jMenu28.add(jMenuItem55);

        jMenuItem56.setText("Gestión Alumnos");
        jMenuItem56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem56ActionPerformed(evt);
            }
        });
        jMenu28.add(jMenuItem56);

        jMenuItem57.setText("Verificar Calificaciones");
        jMenuItem57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem57ActionPerformed(evt);
            }
        });
        jMenu28.add(jMenuItem57);

        jMenuBar6.add(jMenu28);

        jMenu11.setText("Menu");

        jMenuItem16.setText("Eliminar Usuario");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem16);

        jMenuItem17.setText("Nuevo Registro");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem17);

        jMenuItem22.setText("Modificar Usuario");
        jMenuItem22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem22ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem22);

        jMenuBar6.add(jMenu11);

        jMenu12.setText("Salir");

        jMenuItem15.setText("Regresar al portal");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem15);

        jMenuBar6.add(jMenu12);

        MenuUsuarios.setJMenuBar(jMenuBar6);

        javax.swing.GroupLayout MenuUsuariosLayout = new javax.swing.GroupLayout(MenuUsuarios.getContentPane());
        MenuUsuarios.getContentPane().setLayout(MenuUsuariosLayout);
        MenuUsuariosLayout.setHorizontalGroup(
            MenuUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        MenuUsuariosLayout.setVerticalGroup(
            MenuUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        EliminarUsuarios.setMinimumSize(new java.awt.Dimension(800, 570));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("")));
        jPanel5.setPreferredSize(new java.awt.Dimension(800, 600));

        tablaEUsu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaEUsu.setComponentPopupMenu(EliminarUsu);
        jScrollPane2.setViewportView(tablaEUsu);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 727, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel44.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(0, 0, 255));
        jLabel44.setText("Eliminar");

        jSeparator9.setForeground(new java.awt.Color(0, 204, 255));

        mensajeElimnarAlumno1.setText("Seguro de que desea eliminar al siguiente alumno:");

        jLabel47.setText("Nombre");

        jButton5.setForeground(new java.awt.Color(0, 51, 255));
        jButton5.setText("Aceptar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 39, Short.MAX_VALUE)
                .addComponent(jLabel47)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NombreElimnarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(mensajeElimnarAlumno1)
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addGap(145, 145, 145))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(mensajeElimnarAlumno1)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(NombreElimnarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addContainerGap())
        );

        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo SEAR Mini.png"))); // NOI18N

        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo.png"))); // NOI18N

        jMenu13.setText("Menu");

        jMenuItem21.setText("Eliminar Usuario");
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem21);

        jMenuItem19.setText("Nuevo Registro");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem19);

        jMenuItem20.setText("Modificar Usuario");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem20);

        jMenuBar7.add(jMenu13);

        jMenu14.setText("Salir");

        jMenuItem18.setText("Regresar");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu14.add(jMenuItem18);

        jMenuBar7.add(jMenu14);

        EliminarUsuarios.setJMenuBar(jMenuBar7);

        javax.swing.GroupLayout EliminarUsuariosLayout = new javax.swing.GroupLayout(EliminarUsuarios.getContentPane());
        EliminarUsuarios.getContentPane().setLayout(EliminarUsuariosLayout);
        EliminarUsuariosLayout.setHorizontalGroup(
            EliminarUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EliminarUsuariosLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(EliminarUsuariosLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel60)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jLabel61)
                .addGap(27, 27, 27))
        );
        EliminarUsuariosLayout.setVerticalGroup(
            EliminarUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EliminarUsuariosLayout.createSequentialGroup()
                .addGroup(EliminarUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EliminarUsuariosLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(EliminarUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel60)
                            .addComponent(jLabel61))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(EliminarUsuariosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        ModificarUsuario.setMinimumSize(new java.awt.Dimension(830, 650));

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo SEAR Mini.png"))); // NOI18N

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo.png"))); // NOI18N

        jLabel53.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(0, 51, 255));
        jLabel53.setText("Modificar Usuario");

        jSeparator10.setBackground(new java.awt.Color(0, 153, 255));
        jSeparator10.setForeground(new java.awt.Color(0, 153, 255));

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tablaMUsu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaMUsu.setComponentPopupMenu(ModificarUsu);
        tablaMUsu.setMaximumSize(new java.awt.Dimension(816, 599));
        tablaMUsu.setMinimumSize(new java.awt.Dimension(816, 599));
        jScrollPane3.setViewportView(tablaMUsu);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel54.setText("Nombre");

        jLabel55.setText("Apellido Paterno");

        jLabel56.setText("Apellido Materno");

        jLabel57.setText("Teléfono");

        MTelefonoUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MTelefonoUsuActionPerformed(evt);
            }
        });

        jLabel58.setText("Celular");

        jLabel59.setText("Dirección");

        jLabel62.setText("Municipio");

        jLabel63.setText("Tipo d Usuario");

        MTipoUsu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Director(a)", "Profesor(a)", " " }));

        jLabel64.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(0, 204, 255));
        jLabel64.setText("Datos a Modificar");

        jSeparator11.setBackground(new java.awt.Color(0, 204, 255));
        jSeparator11.setForeground(new java.awt.Color(0, 204, 255));

        jButton6.setForeground(new java.awt.Color(0, 0, 204));
        jButton6.setText("Actualizar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel57)
                .addGap(18, 18, 18)
                .addComponent(MTelefonoUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(jLabel58)
                .addGap(32, 32, 32)
                .addComponent(MCelularUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel59)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MDireccionUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel62)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MmunicipioUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel63)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MTipoUsu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(28, 28, 28))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel54)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel55)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MpaternoUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel56)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MMaternUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(28, 28, 28))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(MNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel55)
                    .addComponent(MpaternoUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel56)
                    .addComponent(MMaternUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(MTelefonoUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel58)
                    .addComponent(MCelularUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(MDireccionUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel62)
                    .addComponent(MmunicipioUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel63)
                    .addComponent(MTipoUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        jMenu15.setText("Menu");

        jMenuItem24.setText("Eliminar Usuario");
        jMenuItem24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem24ActionPerformed(evt);
            }
        });
        jMenu15.add(jMenuItem24);

        jMenuItem25.setText("Nuevo Registro");
        jMenuItem25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem25ActionPerformed(evt);
            }
        });
        jMenu15.add(jMenuItem25);

        jMenuItem26.setText("Modificar Usuario");
        jMenuItem26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem26ActionPerformed(evt);
            }
        });
        jMenu15.add(jMenuItem26);

        jMenuBar8.add(jMenu15);

        jMenu16.setText("Salir");

        jMenuItem23.setText("Regresar al portal");
        jMenuItem23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem23ActionPerformed(evt);
            }
        });
        jMenu16.add(jMenuItem23);

        jMenuBar8.add(jMenu16);

        ModificarUsuario.setJMenuBar(jMenuBar8);

        javax.swing.GroupLayout ModificarUsuarioLayout = new javax.swing.GroupLayout(ModificarUsuario.getContentPane());
        ModificarUsuario.getContentPane().setLayout(ModificarUsuarioLayout);
        ModificarUsuarioLayout.setHorizontalGroup(
            ModificarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ModificarUsuarioLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(ModificarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ModificarUsuarioLayout.createSequentialGroup()
                        .addComponent(jLabel51)
                        .addGroup(ModificarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ModificarUsuarioLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(132, 132, 132))
                            .addGroup(ModificarUsuarioLayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jLabel52)))
                .addGap(67, 67, 67))
        );
        ModificarUsuarioLayout.setVerticalGroup(
            ModificarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModificarUsuarioLayout.createSequentialGroup()
                .addGroup(ModificarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ModificarUsuarioLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(ModificarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel52)
                            .addComponent(jLabel51)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ModificarUsuarioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel53)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        EliminarUsuario.setText("Eliminar Usuario");
        EliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarUsuarioActionPerformed(evt);
            }
        });
        EliminarUsu.add(EliminarUsuario);

        ModificarUsuarioo.setText("Modificar Usuario");
        ModificarUsuarioo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarUsuariooActionPerformed(evt);
            }
        });
        ModificarUsu.add(ModificarUsuarioo);

        CriteriosEvaluacion.setMinimumSize(new java.awt.Dimension(800, 600));

        jLabel65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo SEAR Mini.png"))); // NOI18N

        jLabel66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo.png"))); // NOI18N

        jLabel67.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(0, 51, 255));
        jLabel67.setText("Criterios de Evaluación");

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        TablaCE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TablaCE.setComponentPopupMenu(MenuCE);
        jScrollPane4.setViewportView(TablaCE);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel68.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(0, 153, 255));
        jLabel68.setText("Registrar");

        jLabel71.setText("Nombre dle Criterio");

        jButton7.setForeground(new java.awt.Color(0, 0, 255));
        jButton7.setText("Guardar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jButton7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel68, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(jLabel71))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(nombreCE, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel68)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel71)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nombreCE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel69.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(0, 153, 255));
        jLabel69.setText("Modificar");

        jLabel72.setText("Nombre del criterio");

        jButton8.setForeground(new java.awt.Color(0, 0, 255));
        jButton8.setText("Guardar Cambios");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel72))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(modificarCE, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton8)
                .addGap(90, 90, 90))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel69)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel72)
                .addGap(18, 18, 18)
                .addComponent(modificarCE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel70.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(0, 153, 255));
        jLabel70.setText("Eliminar");

        jLabel73.setText("Desea eliminar el siguiente Criterio:");

        jButton9.setForeground(new java.awt.Color(0, 0, 255));
        jButton9.setText("Eliminar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel73))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(eliminarCE, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel70, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addComponent(jButton9)
                        .addGap(117, 117, 117))))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel70)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel73)
                .addGap(18, 18, 18)
                .addComponent(eliminarCE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton9)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jMenu29.setText("Menu Principal");

        jMenuItem58.setText("Administracion Usuarios");
        jMenuItem58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem58ActionPerformed(evt);
            }
        });
        jMenu29.add(jMenuItem58);

        jMenuItem59.setText("Control Grupos");
        jMenuItem59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem59ActionPerformed(evt);
            }
        });
        jMenu29.add(jMenuItem59);

        jMenuItem60.setText("Control Pagos y Colegiaturas");
        jMenuItem60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem60ActionPerformed(evt);
            }
        });
        jMenu29.add(jMenuItem60);

        jMenuItem61.setText("Gestión criterios");
        jMenuItem61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem61ActionPerformed(evt);
            }
        });
        jMenu29.add(jMenuItem61);

        jMenuItem62.setText("Gestión Alumnos");
        jMenuItem62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem62ActionPerformed(evt);
            }
        });
        jMenu29.add(jMenuItem62);

        jMenuItem63.setText("Verificar Calificaciones");
        jMenuItem63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem63ActionPerformed(evt);
            }
        });
        jMenu29.add(jMenuItem63);

        jMenuBar9.add(jMenu29);

        jMenu17.setText("Salir");

        jMenuItem6.setText("Regresar");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu17.add(jMenuItem6);

        jMenuBar9.add(jMenu17);

        CriteriosEvaluacion.setJMenuBar(jMenuBar9);

        javax.swing.GroupLayout CriteriosEvaluacionLayout = new javax.swing.GroupLayout(CriteriosEvaluacion.getContentPane());
        CriteriosEvaluacion.getContentPane().setLayout(CriteriosEvaluacionLayout);
        CriteriosEvaluacionLayout.setHorizontalGroup(
            CriteriosEvaluacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CriteriosEvaluacionLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(CriteriosEvaluacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CriteriosEvaluacionLayout.createSequentialGroup()
                        .addComponent(jLabel65)
                        .addGap(144, 144, 144)
                        .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel66)
                        .addGap(23, 23, 23))
                    .addGroup(CriteriosEvaluacionLayout.createSequentialGroup()
                        .addGroup(CriteriosEvaluacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(110, 110, 110)
                        .addGroup(CriteriosEvaluacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 23, Short.MAX_VALUE))))
        );
        CriteriosEvaluacionLayout.setVerticalGroup(
            CriteriosEvaluacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CriteriosEvaluacionLayout.createSequentialGroup()
                .addGroup(CriteriosEvaluacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CriteriosEvaluacionLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(CriteriosEvaluacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel66)
                            .addComponent(jLabel65)))
                    .addGroup(CriteriosEvaluacionLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel67)))
                .addGap(18, 18, 18)
                .addGroup(CriteriosEvaluacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(CriteriosEvaluacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        Calificaciones.setMinimumSize(new java.awt.Dimension(800, 600));

        jLabel74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo SEAR Mini.png"))); // NOI18N

        jLabel75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo.png"))); // NOI18N

        jLabel76.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(0, 0, 255));
        jLabel76.setText("Registro de Calificaciones");

        CriteriosCa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecciona el criterio a evaluar", " " }));

        tablaCalificaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(tablaCalificaciones);

        bimestreC.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecciona el bimestre", "primer bimestre", "segundo bimestre", "tercer bimestre", "cuarto bimestre" }));

        jLabel77.setText("Fecha la fecha actual");

        DiaC.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dia", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " " }));

        mesC.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mes", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        añoC.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Año", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050", "2051", "2052", "2053", "2054", "2055", "2056", "2057", "2058", "2059", "2060", "2061", "2062", "2063", "2064", "2065", "2066", "2067", "2068", "2069", "2070", "2071", "2072", "2073", "2074", "2075", "2076", "2077", "2078", "2079", "2080", "2081", "2082", "2083", "2084", "2085", "2086", "2087", "2088", "2089", "2090", "2091", "2092", "2093", "2094", "2095", "2096", "2097", "2098", "2099", "2100", "2101", "2102", "2103", "2104", "2105", "2106", "2107", "2108", "2109", "2110", "2111", "2112", "2113", "2114", "2115", "2116", "2117", "2118", "2119", "2120", "2121", "2122", "2123", "2124", "2125", "2126", "2127", "2128", "2129", "2130", "2131", "2132", "2133", "2134", "2135", "2136", "2137", "2138", "2139", "2140", "2141", " " }));

        jButton10.setForeground(new java.awt.Color(0, 0, 255));
        jButton10.setText("Registrar Calificaciones");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jMenu18.setText("Salir");

        jMenuItem27.setText("Regresar");
        jMenuItem27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem27ActionPerformed(evt);
            }
        });
        jMenu18.add(jMenuItem27);

        jMenuBar10.add(jMenu18);

        Calificaciones.setJMenuBar(jMenuBar10);

        javax.swing.GroupLayout CalificacionesLayout = new javax.swing.GroupLayout(Calificaciones.getContentPane());
        Calificaciones.getContentPane().setLayout(CalificacionesLayout);
        CalificacionesLayout.setHorizontalGroup(
            CalificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CalificacionesLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(CalificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CalificacionesLayout.createSequentialGroup()
                        .addComponent(jLabel74)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel76)
                        .addGap(147, 147, 147)
                        .addComponent(jLabel75)
                        .addGap(34, 34, 34))
                    .addGroup(CalificacionesLayout.createSequentialGroup()
                        .addGroup(CalificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CalificacionesLayout.createSequentialGroup()
                                .addComponent(CriteriosCa, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bimestreC, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel77)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DiaC, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mesC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(añoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(54, Short.MAX_VALUE))))
            .addGroup(CalificacionesLayout.createSequentialGroup()
                .addGap(354, 354, 354)
                .addComponent(jButton10)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        CalificacionesLayout.setVerticalGroup(
            CalificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CalificacionesLayout.createSequentialGroup()
                .addGroup(CalificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CalificacionesLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(CalificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel75)
                            .addComponent(jLabel74)))
                    .addGroup(CalificacionesLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel76)))
                .addGap(32, 32, 32)
                .addGroup(CalificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CriteriosCa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bimestreC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel77)
                    .addComponent(DiaC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mesC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(añoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jButton10)
                .addGap(171, 171, 171))
        );

        GestionPagosC.setMinimumSize(new java.awt.Dimension(800, 600));

        jLabel78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo SEAR Mini.png"))); // NOI18N

        jLabel79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo.png"))); // NOI18N

        jLabel80.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(0, 51, 255));
        jLabel80.setText("Gestión pagos y colegiaturas");

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        tablaPagosC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(tablaPagosC);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel14.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel81.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(0, 153, 255));
        jLabel81.setText("Registrar");

        jLabel82.setText("Registrar nuevo pago");

        jButton11.setForeground(new java.awt.Color(0, 0, 255));
        jButton11.setText("Guardar");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addContainerGap(120, Short.MAX_VALUE)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel81, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel14Layout.createSequentialGroup()
                                        .addGap(64, 64, 64)
                                        .addComponent(jLabel82))
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(jButton11)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel81)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel82)
                .addGap(26, 26, 26)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel15.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel83.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(0, 153, 255));
        jLabel83.setText("Modificar");

        jLabel84.setText("Nombre del pago");

        jButton12.setForeground(new java.awt.Color(0, 0, 255));
        jButton12.setText("Guardar Cambios");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(jLabel84)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                                .addComponent(jButton12)
                                .addGap(72, 72, 72)))))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel83)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel84)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel85.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(0, 153, 255));
        jLabel85.setText("Eliminar");

        jLabel86.setText("Desea eliminar el siguiente pago");

        jButton13.setForeground(new java.awt.Color(0, 0, 255));
        jButton13.setText("Eliminar");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel86)
                .addContainerGap(139, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel85, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addComponent(jButton13)
                        .addGap(113, 113, 113))))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel85)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator17, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel86)
                .addGap(18, 18, 18)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu30.setText("Menu Principal");

        jMenuItem64.setText("Administracion Usuarios");
        jMenuItem64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem64ActionPerformed(evt);
            }
        });
        jMenu30.add(jMenuItem64);

        jMenuItem65.setText("Control Grupos");
        jMenuItem65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem65ActionPerformed(evt);
            }
        });
        jMenu30.add(jMenuItem65);

        jMenuItem66.setText("Control Pagos y Colegiaturas");
        jMenuItem66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem66ActionPerformed(evt);
            }
        });
        jMenu30.add(jMenuItem66);

        jMenuItem67.setText("Gestión criterios");
        jMenuItem67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem67ActionPerformed(evt);
            }
        });
        jMenu30.add(jMenuItem67);

        jMenuItem68.setText("Gestión Alumnos");
        jMenuItem68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem68ActionPerformed(evt);
            }
        });
        jMenu30.add(jMenuItem68);

        jMenuItem69.setText("Verificar Calificaciones");
        jMenuItem69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem69ActionPerformed(evt);
            }
        });
        jMenu30.add(jMenuItem69);

        jMenuBar11.add(jMenu30);

        jMenu19.setText("Salir");

        jMenuItem28.setText("Regresar");
        jMenuItem28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem28ActionPerformed(evt);
            }
        });
        jMenu19.add(jMenuItem28);

        jMenuBar11.add(jMenu19);

        GestionPagosC.setJMenuBar(jMenuBar11);

        javax.swing.GroupLayout GestionPagosCLayout = new javax.swing.GroupLayout(GestionPagosC.getContentPane());
        GestionPagosC.getContentPane().setLayout(GestionPagosCLayout);
        GestionPagosCLayout.setHorizontalGroup(
            GestionPagosCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GestionPagosCLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(GestionPagosCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GestionPagosCLayout.createSequentialGroup()
                        .addComponent(jLabel78)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)
                        .addComponent(jLabel79)
                        .addGap(23, 23, 23))
                    .addGroup(GestionPagosCLayout.createSequentialGroup()
                        .addGroup(GestionPagosCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(78, 78, 78)
                        .addGroup(GestionPagosCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 83, Short.MAX_VALUE))))
        );
        GestionPagosCLayout.setVerticalGroup(
            GestionPagosCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GestionPagosCLayout.createSequentialGroup()
                .addGroup(GestionPagosCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GestionPagosCLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(GestionPagosCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel79)
                            .addComponent(jLabel78)))
                    .addGroup(GestionPagosCLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel80)))
                .addGap(18, 18, 18)
                .addGroup(GestionPagosCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(GestionPagosCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        ControlPagosC.setMinimumSize(new java.awt.Dimension(800, 600));

        jLabel87.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo SEAR Mini.png"))); // NOI18N

        jLabel88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo.png"))); // NOI18N

        jLabel89.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel89.setForeground(new java.awt.Color(0, 0, 255));
        jLabel89.setText("Pagos y Colegiaturas");

        tablaCPagosC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaCPagosC.setComponentPopupMenu(MenuPagosC);
        jScrollPane7.setViewportView(tablaCPagosC);

        tablaAlumnoC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaAlumnoC.setComponentPopupMenu(menuAlumnoCP);
        jScrollPane8.setViewportView(tablaAlumnoC);

        tablaPagosAlumno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane9.setViewportView(tablaPagosAlumno);

        jPanel17.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel90.setText("Alumno");

        jLabel91.setText("Nombre del pago");

        PagoPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PagoPCActionPerformed(evt);
            }
        });

        jLabel92.setText("Cantidad");

        jLabel93.setText("Fecha");

        DiaPC.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dia", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " " }));
        DiaPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiaPCActionPerformed(evt);
            }
        });

        MesPC.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mes", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", " " }));

        AñoPC.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Año", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044", "2045", "2046", "2047", "2048", "2049", "2050", "2051", "2052", "2053", "2054", "2055", "2056", "2057", "2058", "2059", "2060", "2061", "2062", "2063", "2064", "2065", "2066", "2067", "2068", "2069", "2070", "2071", "2072", "2073", "2074", "2075", "2076", "2077", "2078", "2079", "2080", "2081", "2082", "2083", "2084", "2085", "2086", "2087", "2088", "2089", "2090", "2091", "2092", "2093", "2094", "2095", "2096", "2097", "2098", "2099", "2100", "2101", "2102", "2103", "2104", "2105", "2106", "2107", "2108", "2109", "2110", "2111", "2112", "2113", "2114", "2115", "2116", "2117", "2118", "2119", "2120", "2121", "2122", "2123", "2124", "2125", "2126", "2127", "2128", "2129", "2130", "2131", "2132", "2133", "2134", "2135", "2136", "2137", "2138", "2139", "2140", "2141", " " }));

        jButton14.setText("Registrar Pago");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel91)
                    .addComponent(jLabel90, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel92, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel93, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(34, 34, 34)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jButton14)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(AlumnoPC)
                                .addComponent(PagoPC)
                                .addComponent(cantidadPC))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(DiaPC, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(MesPC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(AñoPC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(38, 38, 38))))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel90)
                    .addComponent(AlumnoPC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel91)
                    .addComponent(PagoPC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantidadPC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel92))
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AñoPC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MesPC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DiaPC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel93))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton14)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jMenu31.setText("Menu Principal");

        jMenuItem70.setText("Administracion Usuarios");
        jMenuItem70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem70ActionPerformed(evt);
            }
        });
        jMenu31.add(jMenuItem70);

        jMenuItem71.setText("Control Grupos");
        jMenuItem71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem71ActionPerformed(evt);
            }
        });
        jMenu31.add(jMenuItem71);

        jMenuItem72.setText("Control Pagos y Colegiaturas");
        jMenuItem72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem72ActionPerformed(evt);
            }
        });
        jMenu31.add(jMenuItem72);

        jMenuItem73.setText("Gestión criterios");
        jMenuItem73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem73ActionPerformed(evt);
            }
        });
        jMenu31.add(jMenuItem73);

        jMenuItem74.setText("Gestión Alumnos");
        jMenuItem74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem74ActionPerformed(evt);
            }
        });
        jMenu31.add(jMenuItem74);

        jMenuItem75.setText("Verificar Calificaciones");
        jMenuItem75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem75ActionPerformed(evt);
            }
        });
        jMenu31.add(jMenuItem75);

        jMenuBar12.add(jMenu31);

        jMenu20.setText("Arhivo");

        jMenuItem31.setText("Agregar nuevo Pago");
        jMenuItem31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem31ActionPerformed(evt);
            }
        });
        jMenu20.add(jMenuItem31);

        jMenuBar12.add(jMenu20);

        jMenu21.setText("Salir");

        jMenuItem29.setText("Regresar");
        jMenuItem29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem29ActionPerformed(evt);
            }
        });
        jMenu21.add(jMenuItem29);

        jMenuBar12.add(jMenu21);

        ControlPagosC.setJMenuBar(jMenuBar12);

        javax.swing.GroupLayout ControlPagosCLayout = new javax.swing.GroupLayout(ControlPagosC.getContentPane());
        ControlPagosC.getContentPane().setLayout(ControlPagosCLayout);
        ControlPagosCLayout.setHorizontalGroup(
            ControlPagosCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlPagosCLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel87)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(jLabel89)
                .addGap(123, 123, 123)
                .addComponent(jLabel88)
                .addGap(54, 54, 54))
            .addGroup(ControlPagosCLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ControlPagosCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addGroup(ControlPagosCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ControlPagosCLayout.setVerticalGroup(
            ControlPagosCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlPagosCLayout.createSequentialGroup()
                .addGroup(ControlPagosCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ControlPagosCLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(ControlPagosCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel88)
                            .addComponent(jLabel87)))
                    .addGroup(ControlPagosCLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel89)))
                .addGap(33, 33, 33)
                .addGroup(ControlPagosCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(ControlPagosCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ControlPagosCLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ControlPagosCLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(191, Short.MAX_VALUE))
        );

        Seleccionar.setText("Seleccionar Alumno");
        Seleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeleccionarActionPerformed(evt);
            }
        });
        menuAlumnoCP.add(Seleccionar);

        SeleccionarP.setText("Selección pago");
        SeleccionarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeleccionarPActionPerformed(evt);
            }
        });
        MenuPagosC.add(SeleccionarP);

        LogeoUsuarios.setMinimumSize(new java.awt.Dimension(442, 308));
        LogeoUsuarios.setModal(true);
        LogeoUsuarios.setUndecorated(true);

        jLabel94.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo.png"))); // NOI18N

        jLabel95.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo SEAR Mini.png"))); // NOI18N

        jLabel96.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jLabel96.setForeground(new java.awt.Color(0, 51, 255));
        jLabel96.setText("Logeo Usuarios");

        jSeparator18.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator19.setBackground(new java.awt.Color(0, 0, 255));
        jSeparator19.setForeground(new java.awt.Color(0, 0, 255));

        jLabel97.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel97.setForeground(new java.awt.Color(0, 153, 255));
        jLabel97.setText("Usuario");

        jLabel98.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel98.setForeground(new java.awt.Color(0, 153, 255));
        jLabel98.setText("Contraseña");

        Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioActionPerformed(evt);
            }
        });

        jButton15.setForeground(new java.awt.Color(0, 0, 204));
        jButton15.setText("Aceptar");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jMenu22.setText("Archivo");

        jMenuItem34.setText("Cerrar Sesion");
        jMenu22.add(jMenuItem34);

        jMenuBar13.add(jMenu22);

        jMenu23.setText("Salir");

        jMenuItem33.setText("Salir del programa");
        jMenuItem33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem33ActionPerformed(evt);
            }
        });
        jMenu23.add(jMenuItem33);

        jMenuBar13.add(jMenu23);

        LogeoUsuarios.setJMenuBar(jMenuBar13);

        javax.swing.GroupLayout LogeoUsuariosLayout = new javax.swing.GroupLayout(LogeoUsuarios.getContentPane());
        LogeoUsuarios.getContentPane().setLayout(LogeoUsuariosLayout);
        LogeoUsuariosLayout.setHorizontalGroup(
            LogeoUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogeoUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator19)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogeoUsuariosLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(LogeoUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator18)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, LogeoUsuariosLayout.createSequentialGroup()
                        .addGroup(LogeoUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LogeoUsuariosLayout.createSequentialGroup()
                                .addGroup(LogeoUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel95)
                                    .addComponent(jLabel98))
                                .addGap(18, 18, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogeoUsuariosLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel97)
                                .addGap(35, 35, 35)))
                        .addGroup(LogeoUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel96, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(Usuario)
                            .addComponent(Contrasena))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel94)))
                .addGap(32, 32, 32))
            .addGroup(LogeoUsuariosLayout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(jButton15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LogeoUsuariosLayout.setVerticalGroup(
            LogeoUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogeoUsuariosLayout.createSequentialGroup()
                .addGroup(LogeoUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LogeoUsuariosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(LogeoUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel94)
                            .addComponent(jLabel95)))
                    .addGroup(LogeoUsuariosLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel96)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(LogeoUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel97))
                .addGap(18, 18, 18)
                .addGroup(LogeoUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel98)
                    .addComponent(Contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jButton15)
                .addGap(55, 55, 55)
                .addComponent(jSeparator18, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator19, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Eliminar.setText("Eliminar Criterio");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        MenuCE.add(Eliminar);

        Modificar.setText("Modificar Criterios");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });
        MenuCE.add(Modificar);

        VerificarCalificaciones.setMinimumSize(new java.awt.Dimension(756, 591));

        jLabel101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo SEAR Mini.png"))); // NOI18N

        jLabel102.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo.png"))); // NOI18N

        jLabel103.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel103.setForeground(new java.awt.Color(0, 0, 255));
        jLabel103.setText("Verificar Calificaciones");

        CriteriosCa1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecciona el criterio a evaluar", " " }));

        tablaCalificaciones1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane10.setViewportView(tablaCalificaciones1);

        bimestreC1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecciona el bimestre", "primer bimestre", "segundo bimestre", "tercer bimestre", "cuarto bimestre" }));
        bimestreC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bimestreC1ActionPerformed(evt);
            }
        });

        ComboPCD.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione al profesor" }));

        jButton1.setText("Mostrar Datos en la tabla");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenu32.setText("Menu Principal");

        jMenuItem76.setText("Administracion Usuarios");
        jMenuItem76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem76ActionPerformed(evt);
            }
        });
        jMenu32.add(jMenuItem76);

        jMenuItem77.setText("Control Grupos");
        jMenuItem77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem77ActionPerformed(evt);
            }
        });
        jMenu32.add(jMenuItem77);

        jMenuItem78.setText("Control Pagos y Colegiaturas");
        jMenuItem78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem78ActionPerformed(evt);
            }
        });
        jMenu32.add(jMenuItem78);

        jMenuItem79.setText("Gestión criterios");
        jMenuItem79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem79ActionPerformed(evt);
            }
        });
        jMenu32.add(jMenuItem79);

        jMenuItem80.setText("Gestión Alumnos");
        jMenuItem80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem80ActionPerformed(evt);
            }
        });
        jMenu32.add(jMenuItem80);

        jMenuItem81.setText("Verificar Calificaciones");
        jMenuItem81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem81ActionPerformed(evt);
            }
        });
        jMenu32.add(jMenuItem81);

        jMenuBar14.add(jMenu32);

        jMenu24.setText("Salir");

        jMenuItem37.setText("Regresar");
        jMenuItem37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem37ActionPerformed(evt);
            }
        });
        jMenu24.add(jMenuItem37);

        jMenuBar14.add(jMenu24);

        VerificarCalificaciones.setJMenuBar(jMenuBar14);

        javax.swing.GroupLayout VerificarCalificacionesLayout = new javax.swing.GroupLayout(VerificarCalificaciones.getContentPane());
        VerificarCalificaciones.getContentPane().setLayout(VerificarCalificacionesLayout);
        VerificarCalificacionesLayout.setHorizontalGroup(
            VerificarCalificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VerificarCalificacionesLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(VerificarCalificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VerificarCalificacionesLayout.createSequentialGroup()
                        .addComponent(jLabel101)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel103)
                        .addGap(147, 147, 147)
                        .addComponent(jLabel102)
                        .addGap(34, 34, 34))
                    .addGroup(VerificarCalificacionesLayout.createSequentialGroup()
                        .addGroup(VerificarCalificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(VerificarCalificacionesLayout.createSequentialGroup()
                                .addComponent(CriteriosCa1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bimestreC1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(VerificarCalificacionesLayout.createSequentialGroup()
                                .addGap(247, 247, 247)
                                .addComponent(jButton1)
                                .addGap(0, 9, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel104)
                        .addGap(18, 18, 18)
                        .addComponent(ComboPCD, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VerificarCalificacionesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        VerificarCalificacionesLayout.setVerticalGroup(
            VerificarCalificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VerificarCalificacionesLayout.createSequentialGroup()
                .addGroup(VerificarCalificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VerificarCalificacionesLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(VerificarCalificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel102)
                            .addComponent(jLabel101)))
                    .addGroup(VerificarCalificacionesLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel103)))
                .addGap(32, 32, 32)
                .addGroup(VerificarCalificacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CriteriosCa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bimestreC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel104)
                    .addComponent(ComboPCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
        );

        Grupos.setMinimumSize(new java.awt.Dimension(800, 600));

        jPanel18.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel105.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel105.setForeground(new java.awt.Color(0, 153, 255));
        jLabel105.setText("Registrar");

        jLabel106.setText("Nombre del Grupo");

        jButton16.setForeground(new java.awt.Color(0, 0, 255));
        jButton16.setText("Guardar");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                        .addContainerGap(120, Short.MAX_VALUE)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel105, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(jLabel106))
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addComponent(jButton16)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(nombreCE1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel105)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator20, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel106)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreCE1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jButton16)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel19.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel107.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel107.setForeground(new java.awt.Color(0, 153, 255));
        jLabel107.setText("Eliminar");

        jLabel108.setText("Desea eliminar el siguiente Grupo");

        jButton17.setForeground(new java.awt.Color(0, 0, 255));
        jButton17.setText("Eliminar");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel108))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(eliminarCE1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel107, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                        .addComponent(jButton17)
                        .addGap(117, 117, 117))))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel107)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator21, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel108)
                .addGap(18, 18, 18)
                .addComponent(eliminarCE1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton17)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel20.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel109.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel109.setForeground(new java.awt.Color(0, 153, 255));
        jLabel109.setText("Modificar");

        jLabel110.setText("Nombre del Grupo");

        modificarCE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarCE1ActionPerformed(evt);
            }
        });

        jButton18.setForeground(new java.awt.Color(0, 0, 255));
        jButton18.setText("Guardar Cambios");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator22, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel109, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                        .addComponent(modificarCE1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel110)
                        .addGap(142, 142, 142))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                        .addComponent(jButton18)
                        .addGap(124, 124, 124))))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel109)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator22, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel110, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(modificarCE1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton18)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel111.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo SEAR Mini.png"))); // NOI18N

        jLabel112.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo.png"))); // NOI18N

        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        TablaG.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TablaG.setComponentPopupMenu(MenuGrupos);
        jScrollPane11.setViewportView(TablaG);

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Gestion de Grupos");

        ComboGP.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione al profesor" }));

        jMenu33.setText("Menu Principal");

        jMenuItem82.setText("Administracion Usuarios");
        jMenuItem82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem82ActionPerformed(evt);
            }
        });
        jMenu33.add(jMenuItem82);

        jMenuItem83.setText("Control Grupos");
        jMenuItem83.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem83ActionPerformed(evt);
            }
        });
        jMenu33.add(jMenuItem83);

        jMenuItem84.setText("Control Pagos y Colegiaturas");
        jMenuItem84.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem84ActionPerformed(evt);
            }
        });
        jMenu33.add(jMenuItem84);

        jMenuItem85.setText("Gestión criterios");
        jMenuItem85.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem85ActionPerformed(evt);
            }
        });
        jMenu33.add(jMenuItem85);

        jMenuItem86.setText("Gestión Alumnos");
        jMenuItem86.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem86ActionPerformed(evt);
            }
        });
        jMenu33.add(jMenuItem86);

        jMenuItem87.setText("Verificar Calificaciones");
        jMenuItem87.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem87ActionPerformed(evt);
            }
        });
        jMenu33.add(jMenuItem87);

        jMenuBar15.add(jMenu33);

        jMenu26.setText("Salir");

        jMenuItem39.setText("Regresar");
        jMenuItem39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem39ActionPerformed(evt);
            }
        });
        jMenu26.add(jMenuItem39);

        jMenuBar15.add(jMenu26);

        Grupos.setJMenuBar(jMenuBar15);

        javax.swing.GroupLayout GruposLayout = new javax.swing.GroupLayout(Grupos.getContentPane());
        Grupos.getContentPane().setLayout(GruposLayout);
        GruposLayout.setHorizontalGroup(
            GruposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GruposLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel111)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 210, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(279, 279, 279))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GruposLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ComboGP, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
            .addGroup(GruposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(GruposLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(GruposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(GruposLayout.createSequentialGroup()
                            .addGap(638, 638, 638)
                            .addComponent(jLabel112))
                        .addGroup(GruposLayout.createSequentialGroup()
                            .addGroup(GruposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(49, 49, 49)
                            .addGroup(GruposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addContainerGap(47, Short.MAX_VALUE)))
        );
        GruposLayout.setVerticalGroup(
            GruposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GruposLayout.createSequentialGroup()
                .addGroup(GruposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GruposLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel2))
                    .addGroup(GruposLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel111)))
                .addGap(118, 118, 118)
                .addComponent(ComboGP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(323, Short.MAX_VALUE))
            .addGroup(GruposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(GruposLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel112)
                    .addGap(18, 18, 18)
                    .addGroup(GruposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(18, 18, 18)
                    .addGroup(GruposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(76, Short.MAX_VALUE)))
        );

        EliminarG.setText("Eliminar");
        EliminarG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarGActionPerformed(evt);
            }
        });
        MenuGrupos.add(EliminarG);

        ModficarG.setText("Modificar");
        ModficarG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModficarGActionPerformed(evt);
            }
        });
        MenuGrupos.add(ModficarG);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.SystemColor.window);
        setMinimumSize(new java.awt.Dimension(570, 355));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo SEAR.png"))); // NOI18N

        jMenu1.setText("Archivo");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem32.setText("Logeo de Usuarios");
        jMenuItem32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem32ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem32);

        jMenuItem35.setText("Recuperar Contraseña");
        jMenuItem35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem35ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem35);

        jMenuBar1.add(jMenu1);

        jMenu2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu2.setText("Salir");
        jMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuItem2.setText("Salir del programa");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(jLabel3)
                .addContainerGap(160, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String [] datos = new String[8];
        if(!NombreAlum.getText().equals("")&&!Ap_pat.getText().equals("")&&!Ap_mat.getText().equals("")&&!Celular.getText().equals("")
           &&!Telefono.getText().equals("")&&!NomTutor.getText().equals("")&&!direccion.getText().equals("")&&!(Municipio.getSelectedItem().toString()).equals("Seleccione el municipio"))        
        {   
            
            datos[0] = Telefono.getText();
            datos[1] = Celular.getText();
            datos[2] = NombreAlum.getText();
            datos[3] = Ap_pat.getText();
            datos[4] = Ap_mat.getText();
            datos[5] = direccion.getText();
            datos[6] = Municipio.getSelectedItem().toString();
            datos[7] = NomTutor.getText();
            mensaje = consultas.regitroAlum(datos);
            
            if(mensaje.length>=0)
            {
                JOptionPane.showMessageDialog(null,mensaje[1]);
            }
            else
                JOptionPane.showMessageDialog(null, "Error al registrar intente de nuevo");
            
           
            
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Debes de llenar todos los datos");
            
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void MunicipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MunicipioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MunicipioActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
        this.MenuAlumnos.setVisible(false);
        this.GestionDirectora.setVisible(true);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void MDireccionAlumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MDireccionAlumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MDireccionAlumActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:
        MenuAlumnos.setVisible(false);
        EliminarModificarAlumno.setVisible(true);
        NombreElimnarAlumno.setText("");
        MNombreAlum.setText("");
        MApellidoPAlum.setText("");
        MApellidoMAlum.setText("");
        MTelefonoAlum.setText("");
        MCelularAlum.setText("");
        MNTAlum.setText("");
        MDireccionAlum.setText("");
        MMunicipioAlum.setText("");
        
        datosTabla = consultas.datosAlumno();
        mostrarDatosAlumnos(datosTabla);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void ModificarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarAlumnoActionPerformed
        // TODO add your handling code here:
        controlME = 1;
        updates = new String[3];
        
        int fila = TablaAlumnos.getSelectedRow();
        System.out.println("numero de fila"+fila);
        if(fila>=0)
        {
           MNombreAlum.setText(TablaAlumnos.getValueAt(fila, 0).toString());
           MApellidoPAlum.setText(TablaAlumnos.getValueAt(fila, 1).toString());
           MApellidoMAlum.setText(TablaAlumnos.getValueAt(fila, 2).toString());
           MTelefonoAlum.setText(TablaAlumnos.getValueAt(fila, 3).toString());
           MCelularAlum.setText(TablaAlumnos.getValueAt(fila, 4).toString());
           MNTAlum.setText(TablaAlumnos.getValueAt(fila, 5).toString());
           MDireccionAlum.setText(TablaAlumnos.getValueAt(fila, 6).toString());
           MMunicipioAlum.setText(TablaAlumnos.getValueAt(fila, 7).toString());
           
           updates[0] = TablaAlumnos.getValueAt(fila, 0).toString();
           updates[1] = TablaAlumnos.getValueAt(fila, 1).toString();
           updates[2] = TablaAlumnos.getValueAt(fila, 2).toString();
             
        }
        else
        {
           JOptionPane.showMessageDialog(null,"No selecciono fila");
        }
    }//GEN-LAST:event_ModificarAlumnoActionPerformed

    private void EliminarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarAlumnoActionPerformed
        // TODO add your handling code here:
        
        controlME = 0;
        datos = new String[3];
        
        int fila = TablaAlumnos.getSelectedRow();
        System.out.println("numero de fila"+fila);
        if(fila>=0)
        {
            datos[0] = TablaAlumnos.getValueAt(fila, 0).toString();
            datos[1] = TablaAlumnos.getValueAt(fila, 1).toString();
            datos[2] = TablaAlumnos.getValueAt(fila, 2).toString();
            this.NombreElimnarAlumno.setText(TablaAlumnos.getValueAt(fila, 0).toString().concat("\t").concat(TablaAlumnos.getValueAt(fila, 1).toString()).concat("\t").concat(TablaAlumnos.getValueAt(fila, 2).toString()));
        }
        else
        {
           JOptionPane.showMessageDialog(null,"No selecciono fila");
        }
        
    }//GEN-LAST:event_EliminarAlumnoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        if(controlME == 0)
        {
            mensaje2 = consultas.EliminarAlumno(datos);
            if(mensaje2.equals("1"))
                JOptionPane.showMessageDialog(null,"Alumno eliminado");
            else
                JOptionPane.showMessageDialog(null,mensaje2);
                
        }
        else
        {
            if(controlME == 1)
            {

                datos = new String[11];
                
                datos[0] = MNombreAlum.getText();
                datos[1] = MApellidoPAlum.getText();
                datos[2] = MApellidoMAlum.getText();
                datos[3] = MTelefonoAlum.getText();
                datos[4] = MCelularAlum.getText();
                datos[5] = MNTAlum.getText();
                datos[6] = MDireccionAlum.getText();
                datos[7] = MMunicipioAlum.getText();
                datos[8] = updates[0];
                datos[9] = updates[1];
                datos[10] = updates[2];
                
                mensaje2 = consultas.modificarAlumno(datos);
                
                JOptionPane.showMessageDialog(null, mensaje2);
                
            }
            else
                JOptionPane.showMessageDialog(null, "Debe de elegir una opcion del menu en la tabla (Dar clic derecho para visualizar el menu)");
        }
        
        datosTabla = consultas.datosAlumno();
        mostrarDatosAlumnos(datosTabla);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
        NombreAlum.setText("");
        Ap_pat.setText("");
        Ap_mat.setText("");
        Celular.setText("");
        Telefono.setText("");
        direccion.setText("");
        NomTutor.setText("");
        Municipio.setSelectedIndex(0);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
        EliminarModificarAlumno.setVisible(false);
        MenuAlumnos.setVisible(true);
        NombreAlum.setText("");
        Ap_pat.setText("");
        Ap_mat.setText("");
        Celular.setText("");
        Telefono.setText("");
        direccion.setText("");
        NomTutor.setText("");
        Municipio.setSelectedIndex(0);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void MunicipioUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MunicipioUsuActionPerformed
        // TODO add your handling code here:
 
    }//GEN-LAST:event_MunicipioUsuActionPerformed


    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String [] datos = new String[11];
        if(!NombreUsuario.getText().equals("")&&!Ap_patUsua.getText().equals("")&&!Ap_matUsa.getText().equals("")&&!CelularUsu.getText().equals("")
           &&!TelefonoUsu.getText().equals("")&&!aliasUsu.getText().equals("")&&!direccionUsu.getText().equals("")&&!contraUsu.getText().equals("")
           &&!comprobarCUsa.getText().equals("")&&!(MunicipioUsu.getSelectedItem().toString()).equals("Seleccione el municipio")&&!(TipoUsuario.getSelectedItem().toString()).equals("Seleccione el tipo de usuario"))        
        {   
            
            if(contraUsu.getText().equals(comprobarCUsa.getText()))
            {
                datos[0] = "U".concat( String.valueOf(NombreUsuario.getText().charAt(0)).concat(String.valueOf(Ap_patUsua.getText().charAt(0))).concat(String.valueOf(Ap_matUsa.getText().charAt(0))).concat(String.valueOf(Ap_matUsa.getText().charAt(Ap_matUsa.getText().length()-1))));
                datos[1] = aliasUsu.getText();
                datos[2] = contraUsu.getText();
                datos[3] = Ap_patUsua.getText();
                datos[4] = Ap_matUsa.getText();
                datos[5] = TelefonoUsu.getText();
                datos[6] = CelularUsu.getText();
                datos[7] = direccionUsu.getText();
                datos[8] = MunicipioUsu.getSelectedItem().toString();
                datos[9] = NombreUsuario.getText();
                if(TipoUsuario.getSelectedItem().toString().equals("Directora"))
                    datos[10] = "0";
                else
                    datos[10] = "1";
                
                mensaje = consultas.regitroUsuario(datos);
            
                if(mensaje.length>=0)
                {
                    JOptionPane.showMessageDialog(null,mensaje[1]);
                }
                else
                    JOptionPane.showMessageDialog(null, "Error al registrar intente de nuevo");


            }
            else
            {
                contraUsu.setText("");
                comprobarCUsa.setText("");
                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
            }
            
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Debes de llenar todos los datos");
            
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        // TODO add your handling code here:
        MenuUsuarios.setVisible(false);
        EliminarUsuarios.setVisible(true);
        NombreElimnarUsuario.setText("");
        
        datosTabla = consultas.datosUsu();
        mostrarDatosUsuarioE(datosTabla);
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void MTelefonoUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MTelefonoUsuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MTelefonoUsuActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        GestionDirectora.setVisible(false);
        MenuUsuarios.setVisible(true);
        NombreUsuario.setText("");
        Ap_patUsua.setText("");
        Ap_matUsa.setText("");
        CelularUsu.setText("");
        TelefonoUsu.setText("");
        direccionUsu.setText("");
        MunicipioUsu.setSelectedIndex(0);
        TipoUsuario.setSelectedIndex(0);
        aliasUsu.setText("");
        contraUsu.setText("");
        comprobarCUsa.setText("");
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        // TODO add your handling code here:
        GestionDirectora.setVisible(false);
        MenuUsuarios.setVisible(true);
        NombreUsuario.setText("");
        Ap_patUsua.setText("");
        Ap_matUsa.setText("");
        CelularUsu.setText("");
        TelefonoUsu.setText("");
        direccionUsu.setText("");
        MunicipioUsu.setSelectedIndex(1);
        TipoUsuario.setSelectedIndex(1);
        aliasUsu.setText("");
        contraUsu.setText("");
        comprobarCUsa.setText("");
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem22ActionPerformed
        // TODO add your handling code here:
        MenuUsuarios.setVisible(false);
        ModificarUsuario.setVisible(true);
        
        MNombreUsuario.setText("");
        MpaternoUsu.setText("");
        MMaternUsu.setText("");
        MTelefonoUsu.setText("");
        MCelularUsu.setText("");
        MDireccionUsu.setText("");
        MmunicipioUsu.setText("");
        
        
        datosTabla = consultas.datosUsu();
        mostrarDatosUsuarioM(datosTabla);
        
        
        
    }//GEN-LAST:event_jMenuItem22ActionPerformed

    private void jMenuItem23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem23ActionPerformed
        // TODO add your handling code here:
        ModificarUsuario.setVisible(false);
        GestionDirectora.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem23ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        // TODO add your handling code here:
         ModificarUsuario.setVisible(false);
        GestionDirectora.setVisible(true);
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        // TODO add your handling code here:
         ModificarUsuario.setVisible(false);
        GestionDirectora.setVisible(true);
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem24ActionPerformed
        // TODO add your handling code here:
        ModificarUsuario.setVisible(false);
        EliminarUsuarios.setVisible(true);
        NombreElimnarUsuario.setText("");
        
        datosTabla = consultas.datosUsu();
        mostrarDatosUsuarioE(datosTabla);
        
    }//GEN-LAST:event_jMenuItem24ActionPerformed

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
        // TODO add your handling code here:
        NombreElimnarUsuario.setText("");
        datosTabla = consultas.datosUsu();
        mostrarDatosUsuarioM(datosTabla);
    }//GEN-LAST:event_jMenuItem21ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
        // TODO add your handling code here:
        this.EliminarUsuarios.setVisible(false);
        this.MenuUsuarios.setVisible(true);
        NombreAlum.setText("");
        Ap_pat.setText("");
        Ap_mat.setText("");
        Celular.setText("");
        Telefono.setText("");
        direccion.setText("");
        NomTutor.setText("");
        Municipio.setSelectedIndex(0);
        
        datosTabla = consultas.datosUsu();
        mostrarDatosUsuarioE(datosTabla);
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenuItem25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem25ActionPerformed
        // TODO add your handling code here:
        this.ModificarUsuario.setVisible(false);
        this.MenuUsuarios.setVisible(true);
        NombreAlum.setText("");
        Ap_pat.setText("");
        Ap_mat.setText("");
        Celular.setText("");
        Telefono.setText("");
        direccion.setText("");
        NomTutor.setText("");
        Municipio.setSelectedIndex(0);
    }//GEN-LAST:event_jMenuItem25ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
        // TODO add your handling code here:
        EliminarUsuarios.setVisible(false);
        ModificarUsuario.setVisible(true);
        MNombreUsuario.setText("");
        MpaternoUsu.setText("");
        MMaternUsu.setText("");
        MTelefonoUsu.setText("");
        MCelularUsu.setText("");
        MDireccionUsu.setText("");
        MmunicipioUsu.setText("");
        
        datosTabla = consultas.datosUsu();
        mostrarDatosUsuarioM(datosTabla);
        
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jMenuItem26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem26ActionPerformed
        // TODO add your handling code here:
        MNombreUsuario.setText("");
        MpaternoUsu.setText("");
        MMaternUsu.setText("");
        MTelefonoUsu.setText("");
        MCelularUsu.setText("");
        MDireccionUsu.setText("");
        MmunicipioUsu.setText("");
        
        datosTabla = consultas.datosUsu();
        mostrarDatosUsuarioM(datosTabla);
    }//GEN-LAST:event_jMenuItem26ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        String salir;
        salir = JOptionPane.showInputDialog("¿Desea cerrar el programa? Si / No");
        if(salir.equals("SI") || salir.equals("Si") || salir.equals("sI") || salir.equals("si")|| salir.equals("S")|| salir.equals("s"))
            System.exit(0);
        else
            System.out.println("");
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void EliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarUsuarioActionPerformed
        // TODO add your handling code here:
        datos = new String[3];
        
        int fila = tablaEUsu.getSelectedRow();
        System.out.println("numero de fila"+fila);
        if(fila>=0)
        {
            datos[0] = tablaEUsu.getValueAt(fila, 0).toString();
            datos[1] = tablaEUsu.getValueAt(fila, 1).toString();
            datos[2] = tablaEUsu.getValueAt(fila, 2).toString();
            this.NombreElimnarUsuario.setText(tablaEUsu.getValueAt(fila, 0).toString().concat("\t").concat(tablaEUsu.getValueAt(fila, 1).toString()).concat("\t").concat(tablaEUsu.getValueAt(fila, 2).toString()));
        }
        else
        {
           JOptionPane.showMessageDialog(null,"No selecciono fila");
        }
    }//GEN-LAST:event_EliminarUsuarioActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if(NombreElimnarUsuario.getText().equals(""))
            JOptionPane.showMessageDialog(null, "Debe de seleccion un usuario para eliminar (Dar clic derecho en la tabla para seleccionar la opción)");
        else
        {
            mensaje2 = consultas.EliminarUsuario(datos);
            JOptionPane.showMessageDialog(null, mensaje2);
            
            datosTabla = consultas.datosUsu();
            mostrarDatosUsuarioE(datosTabla);
        }
            
    }//GEN-LAST:event_jButton5ActionPerformed

    private void ModificarUsuariooActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarUsuariooActionPerformed
        // TODO add your handling code here:
        updates = new String[3];
        
        int fila = tablaMUsu.getSelectedRow();
        System.out.println("numero de fila"+fila);
        if(fila>=0)
        {
           MNombreUsuario.setText(tablaMUsu.getValueAt(fila, 0).toString());
           MpaternoUsu.setText(tablaMUsu.getValueAt(fila, 1).toString());
           MMaternUsu.setText(tablaMUsu.getValueAt(fila, 2).toString());
           MTelefonoUsu.setText(tablaMUsu.getValueAt(fila, 3).toString());
           MCelularUsu.setText(tablaMUsu.getValueAt(fila, 4).toString());
           MDireccionUsu.setText(tablaMUsu.getValueAt(fila, 5).toString());
           MmunicipioUsu.setText(tablaMUsu.getValueAt(fila, 6).toString());
           
           if(tablaMUsu.getValueAt(fila, 7).toString().equals("Director(a)"))
               MTipoUsu.setSelectedIndex(0);
           else
               MTipoUsu.setSelectedIndex(1);
           
           updates[0] = tablaMUsu.getValueAt(fila, 0).toString();
           updates[1] = tablaMUsu.getValueAt(fila, 1).toString();
           updates[2] = tablaMUsu.getValueAt(fila, 2).toString();
             
        }
        else
        {
           JOptionPane.showMessageDialog(null,"No selecciono fila");
        }
    }//GEN-LAST:event_ModificarUsuariooActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        
        datos = new String[11];
                
                datos[0] = MNombreUsuario.getText();
                datos[1] = MpaternoUsu.getText();
                datos[2] = MMaternUsu.getText();
                datos[3] = MTelefonoUsu.getText();
                datos[4] = MCelularUsu.getText();
                datos[5] = MDireccionUsu.getText();
                datos[6] = MmunicipioUsu.getText();
                if(MTipoUsu.getSelectedItem().toString().equals("Director(a)"))
                    datos[7] = "0";
                else
                    datos[7] = "1";
                
                datos[8] = updates[0];
                datos[9] = updates[1];
                datos[10] = updates[2];
                
                mensaje2 = consultas.modificarUsu(datos);
                
                JOptionPane.showMessageDialog(null, mensaje2);
                
                datosTabla = consultas.datosUsu();
                mostrarDatosUsuarioM(datosTabla);
                
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        GestionDirectora.setVisible(false);
        Usuario.setText("");
        Contrasena.setText("");
        usua = "";
        contra = "";
        
        
        this.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        datos = consultas.datosCriterios();
        
        if(datos.length>0)
            mostrarCriterios(datos);
        this.GestionDirectora.setVisible(false);
        CriteriosEvaluacion.setVisible(true);
        
        modificarCE.setText("");
        eliminarCE.setText("");
        nombreCE.setText("");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        CriteriosEvaluacion.setVisible(false);
        GestionDirectora.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        GestionProfesor.setVisible(false);
        Calificaciones.setVisible(true);
        datosTabla = consultas.datosAlumnosCali(idProfesor);
        mostrarDatosCalifica(datosTabla);
        
        String criterios[] = consultas.datosCriterios();
        CriteriosCa.removeAllItems();
        CriteriosCa.addItem("Selección de criterios");
        if(criterios.length>0)
        {
            
            for(int i=0; i<criterios.length; i++)
                CriteriosCa.addItem( (String) criterios[i]);
        }
        
        
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem28ActionPerformed
        // TODO add your handling code here:
        GestionPagosC.setVisible(false);
        ControlPagosC.setVisible(true);
    }//GEN-LAST:event_jMenuItem28ActionPerformed

    private void PagoPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PagoPCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PagoPCActionPerformed

    private void DiaPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiaPCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DiaPCActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        GestionDirectora.setVisible(false);
        ControlPagosC.setVisible(true);
        datosTabla = consultas.datosPagos();
        mostrarDatosPagosG(datosTabla);
        datosTabla = consultas.datosAlumnoPagos();
        mostrarDatosAlumnosP(datosTabla);
        AlumnoPC.setEditable(false);
        PagoPC.setEditable(false);
        cantidadPC.setEditable(false);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem29ActionPerformed
        // TODO add your handling code here:
        ControlPagosC.setVisible(false);
        GestionDirectora.setVisible(true);
    }//GEN-LAST:event_jMenuItem29ActionPerformed

    private void jMenuItem31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem31ActionPerformed
        // TODO add your handling code here:
        ControlPagosC.setVisible(false);
        GestionPagosC.setVisible(true);
        datosTabla = consultas.datosPagos();
        mostrarDatosPagosG(datosTabla);
    }//GEN-LAST:event_jMenuItem31ActionPerformed

    private void SeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccionarActionPerformed
        // TODO add your handling code here:
        
        int fila = tablaAlumnoC.getSelectedRow();
        System.out.println("numero de fila"+fila);
        if(fila>=0)
        {
          String idAlumno[] = tablaAlumnoC.getValueAt(fila, 0).toString().split("¬");
          AlumnoPC.setText(idAlumno[1]);
          datosTabla = consultas.datosPagosControl(idAlumno[0]);
          datosPagosC[0] = idAlumno[0];
          mostrarDatosPAC(datosTabla);
                      
        }
        else
        {
           JOptionPane.showMessageDialog(null,"No selecciono fila");
        }
    }//GEN-LAST:event_SeleccionarActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
       
        if(!AlumnoPC.getText().equals("")&&!PagoPC.getText().equals("")&&!cantidadPC.getText().equals("")&&!DiaPC.getSelectedItem().toString().equals("Dia")&&!MesPC.getSelectedItem().toString().equals("Mes")&&!AñoPC.getSelectedItem().toString().equals("año"))
        {
            datosPagosC[2] = cantidadPC.getText();
            datosPagosC[3] = AñoPC.getSelectedItem().toString().concat("-").concat(MesPC.getSelectedItem().toString().concat("-").concat(DiaPC.getSelectedItem().toString()));

           mensaje = consultas.regitroPago(datosPagosC);

           if(mensaje.length>0)
           {
               if(mensaje[0].equals("1"))
                   JOptionPane.showMessageDialog(null, mensaje[1]);
               else
                   JOptionPane.showMessageDialog(null, mensaje[1]);
           }
           else
               JOptionPane.showMessageDialog(null, "Error con el servidor");

          datosTabla = consultas.datosPagosControl(datosPagosC[0]);
          mostrarDatosPAC(datosTabla);



        }
        else
            JOptionPane.showMessageDialog(null, "Debe de llenar todos los campos (click derecho en la tabla para seleccionar los datos)");

        
                        
    }//GEN-LAST:event_jButton14ActionPerformed

    private void SeleccionarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccionarPActionPerformed
        // TODO add your handling code here:
        
        int fila = tablaCPagosC.getSelectedRow();
        System.out.println("numero de fila"+fila);
        if(fila>=0)
        {
          cantidadPC.setText(tablaCPagosC.getValueAt(fila, 1).toString());
          String idAlumno[] = tablaCPagosC.getValueAt(fila, 0).toString().split("¬");
          PagoPC.setText(idAlumno[1]);
          datosPagosC[1] = idAlumno[0];
                   
          
        }
        else
        {
           JOptionPane.showMessageDialog(null,"No selecciono fila");
        }
        
    }//GEN-LAST:event_SeleccionarPActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        
        
        int fila = tablaCalificaciones.getRowCount();
        System.out.println("numero de fila"+fila);
        String insertar[] = new String[fila];
        String fecha = añoC.getSelectedItem().toString().concat("-").concat(mesC.getSelectedItem().toString().concat("-").concat(DiaC.getSelectedItem().toString()));
        String datosCa[] = null;
        String datosBi;
        String datosAlum[];
        if(fila>=0&&!bimestreC.getSelectedItem().toString().equals("Selecciona el bimestre")&&!CriteriosCa.getSelectedItem().toString().equals("Selecciona el criterio a evaluar")&&!añoC.getSelectedItem().toString().equals("Año")&&!mesC.getSelectedItem().toString().equals("Mes")&&!DiaC.getSelectedItem().toString().equals("Dia"))
        {
            for(int i=0; i<tablaCalificaciones.getRowCount(); i++)
            {
                datosAlum=((String)tablaCalificaciones.getValueAt(i, 0)).split("¬");
                datosBi= bimestreC.getSelectedItem().toString();
                datosCa= CriteriosCa.getSelectedItem().toString().split("-");
                
                
                 insertar[i]= datosBi.concat("¬").concat(fecha).concat("¬").concat(datosAlum[0]).concat("¬").concat(datosCa[0]).concat("¬").concat(((String)tablaCalificaciones.getValueAt(i, 3))).concat("¬").concat(idProfesor);
                 
                 System.out.println(i+" : "+insertar[i]);
            }
                           
            mensaje = consultas.regitroCali(insertar);
            
            if(mensaje.length>=2)
            {
                if(mensaje[0].equals(1))
                {
                    System.out.println(mensaje[0]);
                }
                else
                    JOptionPane.showMessageDialog(null, mensaje[1]);
            }
            
        }
        else
        {
           JOptionPane.showMessageDialog(null,"No existen alumnos para evaluar o no selecciono todas las opciones");
        }
        
       
        
        
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jMenuItem27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem27ActionPerformed
        // TODO add your handling code here:
        Calificaciones.setVisible(false);
        GestionProfesor.setVisible(true);
    }//GEN-LAST:event_jMenuItem27ActionPerformed

    private void UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsuarioActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        
         usua = Usuario.getText();
        contra = Contrasena.getText();
        
        if(usua.equals("")&&contra.equals(""))
            JOptionPane.showMessageDialog(null,"Hace falta llenar los datos");
        else
        {
            mensaje = consultas.comprobarUsu(usua, contra);
            String comprobar[] = mensaje[1].split("-");
            if(mensaje[0].equals("1")&&comprobar[0].equals("0"))
            {
                JOptionPane.showMessageDialog(null,"Bienvenido al portal");
                this.LogeoUsuarios.setVisible(false);
                GestionDirectora.setVisible(true);
            }
            else 
            {
                if(mensaje[0].equals("1")&&comprobar[0].equals("1"))
                {
                    JOptionPane.showMessageDialog(null,"Bienvenida al portal");
                    this.LogeoUsuarios.setVisible(false);
                    GestionProfesor.setVisible(true);      
                    idProfesor = comprobar[1];
                }
                else
                    JOptionPane.showMessageDialog(null, mensaje[1]);
            }
            
        }
        
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem32ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        LogeoUsuarios.setVisible(true);
    }//GEN-LAST:event_jMenuItem32ActionPerformed

    private void jMenuItem33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem33ActionPerformed
        // TODO add your handling code here:
        String salir;
        salir = JOptionPane.showInputDialog("¿Desea cerrar el programa? Si / No");
        if(salir.equals("SI") || salir.equals("Si") || salir.equals("sI") || salir.equals("si")|| salir.equals("S")|| salir.equals("s"))
            System.exit(0);
        else
            System.out.println("");
    }//GEN-LAST:event_jMenuItem33ActionPerformed

    private void comprobarCUsaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprobarCUsaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comprobarCUsaActionPerformed

    private void jMenuItem35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem35ActionPerformed
        // TODO add your handling code here:
       String x = JOptionPane.showInputDialog("Ingresa tu correo electronio");
       
       if(x.equals(""))
           JOptionPane.showMessageDialog(null, "Debe de ingresar un correo electronico ");
       else
           JOptionPane.showMessageDialog(null, "Tu usuario y contraseña sera enviado a tu correo");
    }//GEN-LAST:event_jMenuItem35ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        this.GestionDirectora.setVisible(false);
        VerificarCalificaciones.setVisible(true);
        
        String criterios[] = consultas.datosCriterios();
        CriteriosCa1.removeAllItems();
        CriteriosCa1.addItem("Selección de criterios");
        if(criterios.length>0)
        {
            
            for(int i=0; i<criterios.length; i++)
                CriteriosCa1.addItem( (String) criterios[i]);
        }
        
        
        String profes[] = consultas.datosUsuProf();
        ComboPCD.removeAllItems();
        ComboPCD.addItem("Seleccione al profesor");
        if(profes.length>0)
        {
            
            for(int i=0; i<profes.length; i++)
                ComboPCD.addItem( (String) profes[i]);
        }
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        // TODO add your handling code here:
               
        modificarCE.setText("");
        nombreCE.setText("");
        int fila = TablaCE.getSelectedRow();
        System.out.println("numero de fila"+fila);
        
        if(fila>=0)
        {
            
            ceID = TablaCE.getValueAt(fila, 0).toString();
            this.eliminarCE.setText(TablaCE.getValueAt(fila, 1).toString());
        }
        else
        {
           JOptionPane.showMessageDialog(null,"No selecciono fila");
        }
    }//GEN-LAST:event_EliminarActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        // TODO add your handling code here:
        eliminarCE.setText("");
        nombreCE.setText("");
        int fila = TablaCE.getSelectedRow();
        System.out.println("numero de fila"+fila);
        
        if(fila>=0)
        {
            idCE[0] = TablaCE.getValueAt(fila, 0).toString();
            this.modificarCE.setText(TablaCE.getValueAt(fila, 1).toString());
        }
        else
        {
           JOptionPane.showMessageDialog(null,"No selecciono fila");
        }
    }//GEN-LAST:event_ModificarActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        
        
         if(!nombreCE.getText().equals(""))
        {
                       
            mensaje = consultas.regitroCE(nombreCE.getText());
            
            JOptionPane.showMessageDialog(null, mensaje[1]);
        }
        else
             JOptionPane.showMessageDialog(null, "Debe de ingresar el nombre del nuevo criterio");
            datos = consultas.datosCriterios();
        
        if(datos.length>0)
            mostrarCriterios(datos);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        if(!modificarCE.getText().equals("")&&!idCE[0].equals(null))
        {
            idCE[1] = modificarCE.getText();
            
            mensaje2 = consultas.modificarCE(idCE);
            
            JOptionPane.showMessageDialog(null, mensaje2);
        }
        else
             JOptionPane.showMessageDialog(null, "Debe de ingresar el nombre del nuevo criterio");
        
        datos = consultas.datosCriterios();
        
        if(datos.length>0)
            mostrarCriterios(datos);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        
        mensaje2 = consultas.EliminarCE(ceID);
        JOptionPane.showMessageDialog(null, mensaje2);
        
        datos = consultas.datosCriterios();
        
        if(datos.length>0)
            mostrarCriterios(datos);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jMenuItem36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem36ActionPerformed
        // TODO add your handling code here:
         this.GestionDirectora.setVisible(false);
        this.MenuAlumnos.setVisible(true);
        NombreAlum.setText("");
        Ap_pat.setText("");
        Ap_mat.setText("");
        Celular.setText("");
        Telefono.setText("");
        direccion.setText("");
        NomTutor.setText("");
        Municipio.setSelectedIndex(0);
    }//GEN-LAST:event_jMenuItem36ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        if(!ComboPCD.getSelectedItem().toString().equals("Seleccione al profesor"))
        {
            splitt = ComboPCD.getSelectedItem().toString().split("¬");
            datos = new String[3];
            datos[0] = splitt[0];
            datos[1] = bimestreC1.getSelectedItem().toString();
            splitt = CriteriosCa1.getSelectedItem().toString().split("-");
            datos[2]= splitt[0];
            
            datosTabla = consultas.datosCaliD(datos);
            if(!(datosTabla.length>0))
                JOptionPane.showMessageDialog(null, "Los alumnos de este maestro en la materia seleccionada no han sido evaluados");
            
            mostrarCaliD(datosTabla);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bimestreC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bimestreC1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bimestreC1ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        this.GestionProfesor.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem37ActionPerformed
        // TODO add your handling code here:
        this.VerificarCalificaciones.setVisible(false);
        this.GestionDirectora.setVisible(true);
    }//GEN-LAST:event_jMenuItem37ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        
        if(!ComboGP.getSelectedItem().toString().equals("Seleccione al profesor")&&!nombreCE1.getText().equals(""))
        {
            datos = new String[2];
            datos[0] = nombreCE1.getText();
            splitt =  ComboGP.getSelectedItem().toString().split("¬");
            datos[1] = splitt[0];
            mensaje = consultas.regitroG(datos);
            JOptionPane.showMessageDialog(null, mensaje[1]);
        }
        else
            JOptionPane.showMessageDialog(null, "Debes de llenar todos los campos del registro");
        
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        
        mensaje2 = consultas.EliminarG(ceID);
        JOptionPane.showMessageDialog(null, mensaje2);
        
        datos = consultas.datosGruposv();
        
        if(datos.length>0)
            mostrarGrupos(datos);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
        
        if(!modificarCE1.getText().equals("")&&!idCE[0].equals(null))
        {
            idCE[1] = modificarCE1.getText();
            
            mensaje2 = consultas.modificarG(idCE);
            
            JOptionPane.showMessageDialog(null, mensaje2);
        }
        else
             JOptionPane.showMessageDialog(null, "Debe de ingresar el nuevo nombre del grupo y seleccionarlo de la tabla");
        
        datos = consultas.datosGruposv();
        
        if(datos.length>0)
            mostrarGrupos(datos);
    }//GEN-LAST:event_jButton18ActionPerformed

    private void modificarCE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarCE1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modificarCE1ActionPerformed

    private void jMenuItem38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem38ActionPerformed
        // TODO add your handling code here:
        datos = consultas.datosGruposv();
        
        if(datos.length>0)
            mostrarGrupos(datos);
        this.GestionDirectora.setVisible(false);
        Grupos.setVisible(true);
        
        String profes[] = consultas.datosUsuProf();
        ComboGP.removeAllItems();
        ComboGP.addItem("Seleccione al profesor");
        if(profes.length>0)
        {
            
            for(int i=0; i<profes.length; i++)
                ComboGP.addItem( (String) profes[i]);
        }
        
        modificarCE1.setText("");
        eliminarCE1.setText("");
        nombreCE1.setText("");
    }//GEN-LAST:event_jMenuItem38ActionPerformed

    private void EliminarGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarGActionPerformed
        // TODO add your handling code here:
         
        modificarCE1.setText("");
        nombreCE1.setText("");
        int fila = TablaG.getSelectedRow();
        System.out.println("numero de fila"+fila);
        
        if(fila>=0)
        {
            
            ceID = TablaG.getValueAt(fila, 0).toString();
            this.eliminarCE1.setText(TablaG.getValueAt(fila, 1).toString());
        }
        else
        {
           JOptionPane.showMessageDialog(null,"No selecciono fila");
        }
        
    }//GEN-LAST:event_EliminarGActionPerformed

    private void ModficarGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModficarGActionPerformed
        // TODO add your handling code here:
               
        eliminarCE1.setText("");
        nombreCE1.setText("");
        int fila = TablaG.getSelectedRow();
        System.out.println("numero de fila"+fila);
        
        if(fila>=0)
        {
            idCE[0] = TablaG.getValueAt(fila, 0).toString();
            this.modificarCE1.setText(TablaG.getValueAt(fila, 1).toString());
        }
        else
        {
           JOptionPane.showMessageDialog(null,"No selecciono fila");
        }
    }//GEN-LAST:event_ModficarGActionPerformed

    private void jMenuItem39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem39ActionPerformed
        // TODO add your handling code here:
        this.Grupos.setVisible(false);
        this.GestionDirectora.setVisible(true);
    }//GEN-LAST:event_jMenuItem39ActionPerformed

    private void jMenuItem40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem40ActionPerformed
        // TODO add your handling code here:
        
        datos = consultas.datosCriterios();
        
        if(datos.length>0)
            mostrarCriterios(datos);
        this.MenuAlumnos.setVisible(false);
        CriteriosEvaluacion.setVisible(true);
        
        modificarCE.setText("");
        eliminarCE.setText("");
        nombreCE.setText("");

    }//GEN-LAST:event_jMenuItem40ActionPerformed

    private void jMenuItem43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem43ActionPerformed
        // TODO add your handling code here:
        
        MenuAlumnos.setVisible(false);
        MenuUsuarios.setVisible(true);
        NombreUsuario.setText("");
        Ap_patUsua.setText("");
        Ap_matUsa.setText("");
        CelularUsu.setText("");
        TelefonoUsu.setText("");
        direccionUsu.setText("");
        MunicipioUsu.setSelectedIndex(0);
        TipoUsuario.setSelectedIndex(0);
        aliasUsu.setText("");
        contraUsu.setText("");
        comprobarCUsa.setText("");
        
        
        
    }//GEN-LAST:event_jMenuItem43ActionPerformed

    private void jMenuItem41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem41ActionPerformed
        // TODO add your handling code here:
        
        
        datos = consultas.datosGruposv();
        
        if(datos.length>0)
            mostrarGrupos(datos);
         MenuAlumnos.setVisible(false);
        Grupos.setVisible(true);
        
        String profes[] = consultas.datosUsuProf();
        ComboGP.removeAllItems();
        ComboGP.addItem("Seleccione al profesor");
        if(profes.length>0)
        {
            
            for(int i=0; i<profes.length; i++)
                ComboGP.addItem( (String) profes[i]);
        }
        
        modificarCE1.setText("");
        eliminarCE1.setText("");
        nombreCE1.setText("");
        
    }//GEN-LAST:event_jMenuItem41ActionPerformed

    private void jMenuItem44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem44ActionPerformed
        // TODO add your handling code here:
        
        MenuAlumnos.setVisible(false);
        ControlPagosC.setVisible(true);
        datosTabla = consultas.datosPagos();
        mostrarDatosPagosG(datosTabla);
        datosTabla = consultas.datosAlumnoPagos();
        mostrarDatosAlumnosP(datosTabla);
        AlumnoPC.setEditable(false);
        PagoPC.setEditable(false);
        cantidadPC.setEditable(false);
        
        
    }//GEN-LAST:event_jMenuItem44ActionPerformed

    private void jMenuItem42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem42ActionPerformed
        // TODO add your handling code here:
        
        this.MenuAlumnos.setVisible(true);
        NombreAlum.setText("");
        Ap_pat.setText("");
        Ap_mat.setText("");
        Celular.setText("");
        Telefono.setText("");
        direccion.setText("");
        NomTutor.setText("");
        Municipio.setSelectedIndex(0);

        
        
    }//GEN-LAST:event_jMenuItem42ActionPerformed

    private void jMenuItem45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem45ActionPerformed
        // TODO add your handling code here:
        
        
        this.MenuAlumnos.setVisible(false);
               VerificarCalificaciones.setVisible(true);

               String criterios[] = consultas.datosCriterios();
               CriteriosCa1.removeAllItems();
               CriteriosCa1.addItem("Selección de criterios");
               if(criterios.length>0)
               {

                   for(int i=0; i<criterios.length; i++)
                       CriteriosCa1.addItem( (String) criterios[i]);
               }


               String profes[] = consultas.datosUsuProf();
               ComboPCD.removeAllItems();
               ComboPCD.addItem("Seleccione al profesor");
               if(profes.length>0)
               {

                   for(int i=0; i<profes.length; i++)
                       ComboPCD.addItem( (String) profes[i]);
               }
        
    }//GEN-LAST:event_jMenuItem45ActionPerformed

    private void jMenuItem46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem46ActionPerformed
        // TODO add your handling code here:
        
        EliminarModificarAlumno.setVisible(false);
        MenuUsuarios.setVisible(true);
        NombreUsuario.setText("");
        Ap_patUsua.setText("");
        Ap_matUsa.setText("");
        CelularUsu.setText("");
        TelefonoUsu.setText("");
        direccionUsu.setText("");
        MunicipioUsu.setSelectedIndex(0);
        TipoUsuario.setSelectedIndex(0);
        aliasUsu.setText("");
        contraUsu.setText("");
        comprobarCUsa.setText("");
        
    }//GEN-LAST:event_jMenuItem46ActionPerformed

    private void jMenuItem47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem47ActionPerformed
        // TODO add your handling code here:
        
        datos = consultas.datosGruposv();
        
        if(datos.length>0)
            mostrarGrupos(datos);
        this.EliminarModificarAlumno.setVisible(false);
        Grupos.setVisible(true);
        
        String profes[] = consultas.datosUsuProf();
        ComboGP.removeAllItems();
        ComboGP.addItem("Seleccione al profesor");
        if(profes.length>0)
        {
            
            for(int i=0; i<profes.length; i++)
                ComboGP.addItem( (String) profes[i]);
        }
        
        modificarCE1.setText("");
        eliminarCE1.setText("");
        nombreCE1.setText("");

        
    }//GEN-LAST:event_jMenuItem47ActionPerformed

    private void jMenuItem48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem48ActionPerformed
        // TODO add your handling code here:
        
        EliminarModificarAlumno.setVisible(false);
        ControlPagosC.setVisible(true);
        datosTabla = consultas.datosPagos();
        mostrarDatosPagosG(datosTabla);
        datosTabla = consultas.datosAlumnoPagos();
        mostrarDatosAlumnosP(datosTabla);
        AlumnoPC.setEditable(false);
        PagoPC.setEditable(false);
        cantidadPC.setEditable(false);

    }//GEN-LAST:event_jMenuItem48ActionPerformed

    private void jMenuItem49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem49ActionPerformed
        // TODO add your handling code here:
        
        
        datos = consultas.datosCriterios();
        
        if(datos.length>0)
            mostrarCriterios(datos);
        this.EliminarModificarAlumno.setVisible(false);
        CriteriosEvaluacion.setVisible(true);
        
        modificarCE.setText("");
        eliminarCE.setText("");
        nombreCE.setText("");
        
    }//GEN-LAST:event_jMenuItem49ActionPerformed

    private void jMenuItem50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem50ActionPerformed
        // TODO add your handling code here:
        
         this.EliminarModificarAlumno.setVisible(false);
        this.MenuAlumnos.setVisible(true);
        NombreAlum.setText("");
        Ap_pat.setText("");
        Ap_mat.setText("");
        Celular.setText("");
        Telefono.setText("");
        direccion.setText("");
        NomTutor.setText("");
        Municipio.setSelectedIndex(0);


    }//GEN-LAST:event_jMenuItem50ActionPerformed

    private void jMenuItem51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem51ActionPerformed
        // TODO add your handling code here:
        
        
        this.EliminarModificarAlumno.setVisible(false);
        VerificarCalificaciones.setVisible(true);
        
        String criterios[] = consultas.datosCriterios();
        CriteriosCa1.removeAllItems();
        CriteriosCa1.addItem("Selección de criterios");
        if(criterios.length>0)
        {
            
            for(int i=0; i<criterios.length; i++)
                CriteriosCa1.addItem( (String) criterios[i]);
        }
        
        
        String profes[] = consultas.datosUsuProf();
        ComboPCD.removeAllItems();
        ComboPCD.addItem("Seleccione al profesor");
        if(profes.length>0)
        {
            
            for(int i=0; i<profes.length; i++)
                ComboPCD.addItem( (String) profes[i]);
        }
    }//GEN-LAST:event_jMenuItem51ActionPerformed

    private void jMenuItem52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem52ActionPerformed
        // TODO add your handling code here:
        GestionDirectora.setVisible(false);
        MenuUsuarios.setVisible(true);
        NombreUsuario.setText("");
        Ap_patUsua.setText("");
        Ap_matUsa.setText("");
        CelularUsu.setText("");
        TelefonoUsu.setText("");
        direccionUsu.setText("");
        MunicipioUsu.setSelectedIndex(0);
        TipoUsuario.setSelectedIndex(0);
        aliasUsu.setText("");
        contraUsu.setText("");
        comprobarCUsa.setText("");
    }//GEN-LAST:event_jMenuItem52ActionPerformed

    private void jMenuItem53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem53ActionPerformed
        // TODO add your handling code here:
        datos = consultas.datosGruposv();
        
        if(datos.length>0)
            mostrarGrupos(datos);
        this.MenuUsuarios.setVisible(false);
        Grupos.setVisible(true);
        
        String profes[] = consultas.datosUsuProf();
        ComboGP.removeAllItems();
        ComboGP.addItem("Seleccione al profesor");
        if(profes.length>0)
        {
            
            for(int i=0; i<profes.length; i++)
                ComboGP.addItem( (String) profes[i]);
        }
        
        modificarCE1.setText("");
        eliminarCE1.setText("");
        nombreCE1.setText("");

    }//GEN-LAST:event_jMenuItem53ActionPerformed

    private void jMenuItem54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem54ActionPerformed
        // TODO add your handling code here:
        MenuUsuarios.setVisible(false);
        ControlPagosC.setVisible(true);
        datosTabla = consultas.datosPagos();
        mostrarDatosPagosG(datosTabla);
        datosTabla = consultas.datosAlumnoPagos();
        mostrarDatosAlumnosP(datosTabla);
        AlumnoPC.setEditable(false);
        PagoPC.setEditable(false);
        cantidadPC.setEditable(false);

    }//GEN-LAST:event_jMenuItem54ActionPerformed

    private void jMenuItem55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem55ActionPerformed
        // TODO add your handling code here:
        datos = consultas.datosCriterios();
        
        if(datos.length>0)
            mostrarCriterios(datos);
        this.MenuUsuarios.setVisible(false);
        CriteriosEvaluacion.setVisible(true);
        
        modificarCE.setText("");
        eliminarCE.setText("");
        nombreCE.setText("");

    }//GEN-LAST:event_jMenuItem55ActionPerformed

    private void jMenuItem56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem56ActionPerformed
        // TODO add your handling code here:
        this.MenuUsuarios.setVisible(false);
        this.MenuAlumnos.setVisible(true);
        NombreAlum.setText("");
        Ap_pat.setText("");
        Ap_mat.setText("");
        Celular.setText("");
        Telefono.setText("");
        direccion.setText("");
        NomTutor.setText("");
        Municipio.setSelectedIndex(0);

    }//GEN-LAST:event_jMenuItem56ActionPerformed

    private void jMenuItem57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem57ActionPerformed
        // TODO add your handling code here:
         this.MenuUsuarios.setVisible(false);
        VerificarCalificaciones.setVisible(true);
        
        String criterios[] = consultas.datosCriterios();
        CriteriosCa1.removeAllItems();
        CriteriosCa1.addItem("Selección de criterios");
        if(criterios.length>0)
        {
            
            for(int i=0; i<criterios.length; i++)
                CriteriosCa1.addItem( (String) criterios[i]);
        }
        
        
        String profes[] = consultas.datosUsuProf();
        ComboPCD.removeAllItems();
        ComboPCD.addItem("Seleccione al profesor");
        if(profes.length>0)
        {
            
            for(int i=0; i<profes.length; i++)
                ComboPCD.addItem( (String) profes[i]);
        }
    }//GEN-LAST:event_jMenuItem57ActionPerformed

    private void jMenuItem58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem58ActionPerformed
        // TODO add your handling code here:
        CriteriosEvaluacion.setVisible(false);
        MenuUsuarios.setVisible(true);
        NombreUsuario.setText("");
        Ap_patUsua.setText("");
        Ap_matUsa.setText("");
        CelularUsu.setText("");
        TelefonoUsu.setText("");
        direccionUsu.setText("");
        MunicipioUsu.setSelectedIndex(0);
        TipoUsuario.setSelectedIndex(0);
        aliasUsu.setText("");
        contraUsu.setText("");
        comprobarCUsa.setText("");
    }//GEN-LAST:event_jMenuItem58ActionPerformed

    private void jMenuItem59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem59ActionPerformed
        // TODO add your handling code here:
        datos = consultas.datosGruposv();
        
        if(datos.length>0)
            mostrarGrupos(datos);
        this.CriteriosEvaluacion.setVisible(false);
        Grupos.setVisible(true);
        
        String profes[] = consultas.datosUsuProf();
        ComboGP.removeAllItems();
        ComboGP.addItem("Seleccione al profesor");
        if(profes.length>0)
        {
            
            for(int i=0; i<profes.length; i++)
                ComboGP.addItem( (String) profes[i]);
        }
        
        modificarCE1.setText("");
        eliminarCE1.setText("");
        nombreCE1.setText("");

    }//GEN-LAST:event_jMenuItem59ActionPerformed

    private void jMenuItem60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem60ActionPerformed
        // TODO add your handling code here:
        CriteriosEvaluacion.setVisible(false);
        ControlPagosC.setVisible(true);
        datosTabla = consultas.datosPagos();
        mostrarDatosPagosG(datosTabla);
        datosTabla = consultas.datosAlumnoPagos();
        mostrarDatosAlumnosP(datosTabla);
        AlumnoPC.setEditable(false);
        PagoPC.setEditable(false);
        cantidadPC.setEditable(false);

    }//GEN-LAST:event_jMenuItem60ActionPerformed

    private void jMenuItem61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem61ActionPerformed
        // TODO add your handling code here:
        datos = consultas.datosCriterios();
        
        if(datos.length>0)
            mostrarCriterios(datos);
        
        CriteriosEvaluacion.setVisible(true);
        
        modificarCE.setText("");
        eliminarCE.setText("");
        nombreCE.setText("");


    }//GEN-LAST:event_jMenuItem61ActionPerformed

    private void jMenuItem62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem62ActionPerformed
        // TODO add your handling code here:
         this.CriteriosEvaluacion.setVisible(false);
        this.MenuAlumnos.setVisible(true);
        NombreAlum.setText("");
        Ap_pat.setText("");
        Ap_mat.setText("");
        Celular.setText("");
        Telefono.setText("");
        direccion.setText("");
        NomTutor.setText("");
        Municipio.setSelectedIndex(0);

    }//GEN-LAST:event_jMenuItem62ActionPerformed

    private void jMenuItem63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem63ActionPerformed
        // TODO add your handling code here:
         this.CriteriosEvaluacion.setVisible(false);
        VerificarCalificaciones.setVisible(true);
        
        String criterios[] = consultas.datosCriterios();
        CriteriosCa1.removeAllItems();
        CriteriosCa1.addItem("Selección de criterios");
        if(criterios.length>0)
        {
            
            for(int i=0; i<criterios.length; i++)
                CriteriosCa1.addItem( (String) criterios[i]);
        }
        
        
        String profes[] = consultas.datosUsuProf();
        ComboPCD.removeAllItems();
        ComboPCD.addItem("Seleccione al profesor");
        if(profes.length>0)
        {
            
            for(int i=0; i<profes.length; i++)
                ComboPCD.addItem( (String) profes[i]);
        }
    }//GEN-LAST:event_jMenuItem63ActionPerformed

    private void jMenuItem64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem64ActionPerformed
        // TODO add your handling code here:
        
        GestionPagosC.setVisible(false);
        MenuUsuarios.setVisible(true);
        NombreUsuario.setText("");
        Ap_patUsua.setText("");
        Ap_matUsa.setText("");
        CelularUsu.setText("");
        TelefonoUsu.setText("");
        direccionUsu.setText("");
        MunicipioUsu.setSelectedIndex(0);
        TipoUsuario.setSelectedIndex(0);
        aliasUsu.setText("");
        contraUsu.setText("");
        comprobarCUsa.setText("");
    }//GEN-LAST:event_jMenuItem64ActionPerformed

    private void jMenuItem65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem65ActionPerformed
        // TODO add your handling code here:
        
datos = consultas.datosGruposv();
        
        if(datos.length>0)
            mostrarGrupos(datos);
        this.GestionPagosC.setVisible(false);
        Grupos.setVisible(true);
        
        String profes[] = consultas.datosUsuProf();
        ComboGP.removeAllItems();
        ComboGP.addItem("Seleccione al profesor");
        if(profes.length>0)
        {
            
            for(int i=0; i<profes.length; i++)
                ComboGP.addItem( (String) profes[i]);
        }
        
        modificarCE1.setText("");
        eliminarCE1.setText("");
        nombreCE1.setText("");

    }//GEN-LAST:event_jMenuItem65ActionPerformed

    private void jMenuItem66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem66ActionPerformed
        // TODO add your handling code here:
        
        ControlPagosC.setVisible(true);
        datosTabla = consultas.datosPagos();
        mostrarDatosPagosG(datosTabla);
        datosTabla = consultas.datosAlumnoPagos();
        mostrarDatosAlumnosP(datosTabla);
        AlumnoPC.setEditable(false);
        PagoPC.setEditable(false);
        cantidadPC.setEditable(false);


    }//GEN-LAST:event_jMenuItem66ActionPerformed

    private void jMenuItem67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem67ActionPerformed
        // TODO add your handling code here:
        

datos = consultas.datosCriterios();
        
        if(datos.length>0)
            mostrarCriterios(datos);
        this.GestionPagosC.setVisible(false);
        CriteriosEvaluacion.setVisible(true);
        
        modificarCE.setText("");
        eliminarCE.setText("");
        nombreCE.setText("");


    }//GEN-LAST:event_jMenuItem67ActionPerformed

    private void jMenuItem68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem68ActionPerformed
        // TODO add your handling code here:
        
 this.GestionPagosC.setVisible(false);
        this.MenuAlumnos.setVisible(true);
        NombreAlum.setText("");
        Ap_pat.setText("");
        Ap_mat.setText("");
        Celular.setText("");
        Telefono.setText("");
        direccion.setText("");
        NomTutor.setText("");
        Municipio.setSelectedIndex(0);

    }//GEN-LAST:event_jMenuItem68ActionPerformed

    private void jMenuItem69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem69ActionPerformed
        // TODO add your handling code here:
        
 this.GestionPagosC.setVisible(false);
        VerificarCalificaciones.setVisible(true);
        
        String criterios[] = consultas.datosCriterios();
        CriteriosCa1.removeAllItems();
        CriteriosCa1.addItem("Selección de criterios");
        if(criterios.length>0)
        {
            
            for(int i=0; i<criterios.length; i++)
                CriteriosCa1.addItem( (String) criterios[i]);
        }
        
        
        String profes[] = consultas.datosUsuProf();
        ComboPCD.removeAllItems();
        ComboPCD.addItem("Seleccione al profesor");
        if(profes.length>0)
        {
            
            for(int i=0; i<profes.length; i++)
                ComboPCD.addItem( (String) profes[i]);
        }
    }//GEN-LAST:event_jMenuItem69ActionPerformed

    private void jMenuItem70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem70ActionPerformed
        // TODO add your handling code here:
        ControlPagosC.setVisible(false);
        MenuUsuarios.setVisible(true);
        NombreUsuario.setText("");
        Ap_patUsua.setText("");
        Ap_matUsa.setText("");
        CelularUsu.setText("");
        TelefonoUsu.setText("");
        direccionUsu.setText("");
        MunicipioUsu.setSelectedIndex(0);
        TipoUsuario.setSelectedIndex(0);
        aliasUsu.setText("");
        contraUsu.setText("");
        comprobarCUsa.setText("");
    }//GEN-LAST:event_jMenuItem70ActionPerformed

    private void jMenuItem71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem71ActionPerformed
        // TODO add your handling code here:
        datos = consultas.datosGruposv();
        
        if(datos.length>0)
            mostrarGrupos(datos);
        this.ControlPagosC.setVisible(false);
        Grupos.setVisible(true);
        
        String profes[] = consultas.datosUsuProf();
        ComboGP.removeAllItems();
        ComboGP.addItem("Seleccione al profesor");
        if(profes.length>0)
        {
            
            for(int i=0; i<profes.length; i++)
                ComboGP.addItem( (String) profes[i]);
        }
        
        modificarCE1.setText("");
        eliminarCE1.setText("");
        nombreCE1.setText("");

    }//GEN-LAST:event_jMenuItem71ActionPerformed

    private void jMenuItem72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem72ActionPerformed
        // TODO add your handling code here:
        
        
        ControlPagosC.setVisible(true);
        datosTabla = consultas.datosPagos();
        mostrarDatosPagosG(datosTabla);
        datosTabla = consultas.datosAlumnoPagos();
        mostrarDatosAlumnosP(datosTabla);
        AlumnoPC.setEditable(false);
        PagoPC.setEditable(false);
        cantidadPC.setEditable(false);

    }//GEN-LAST:event_jMenuItem72ActionPerformed

    private void jMenuItem73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem73ActionPerformed
        // TODO add your handling code here:
        
        datos = consultas.datosCriterios();
        
        if(datos.length>0)
            mostrarCriterios(datos);
        this.ControlPagosC.setVisible(false);
        CriteriosEvaluacion.setVisible(true);
        
        modificarCE.setText("");
        eliminarCE.setText("");
        nombreCE.setText("");

        
    }//GEN-LAST:event_jMenuItem73ActionPerformed

    private void jMenuItem74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem74ActionPerformed
        // TODO add your handling code here:
        this.ControlPagosC.setVisible(false);
        this.MenuAlumnos.setVisible(true);
        NombreAlum.setText("");
        Ap_pat.setText("");
        Ap_mat.setText("");
        Celular.setText("");
        Telefono.setText("");
        direccion.setText("");
        NomTutor.setText("");
        Municipio.setSelectedIndex(0);

        
    }//GEN-LAST:event_jMenuItem74ActionPerformed

    private void jMenuItem75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem75ActionPerformed
        // TODO add your handling code here:
        
        
        this.ControlPagosC.setVisible(false);
        VerificarCalificaciones.setVisible(true);
        
        String criterios[] = consultas.datosCriterios();
        CriteriosCa1.removeAllItems();
        CriteriosCa1.addItem("Selección de criterios");
        if(criterios.length>0)
        {
            
            for(int i=0; i<criterios.length; i++)
                CriteriosCa1.addItem( (String) criterios[i]);
        }
        
        
        String profes[] = consultas.datosUsuProf();
        ComboPCD.removeAllItems();
        ComboPCD.addItem("Seleccione al profesor");
        if(profes.length>0)
        {
            
            for(int i=0; i<profes.length; i++)
                ComboPCD.addItem( (String) profes[i]);
        }
    }//GEN-LAST:event_jMenuItem75ActionPerformed

    private void jMenuItem76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem76ActionPerformed
        // TODO add your handling code here:
        
        VerificarCalificaciones.setVisible(false);
        MenuUsuarios.setVisible(true);
        NombreUsuario.setText("");
        Ap_patUsua.setText("");
        Ap_matUsa.setText("");
        CelularUsu.setText("");
        TelefonoUsu.setText("");
        direccionUsu.setText("");
        MunicipioUsu.setSelectedIndex(0);
        TipoUsuario.setSelectedIndex(0);
        aliasUsu.setText("");
        contraUsu.setText("");
        comprobarCUsa.setText("");
    }//GEN-LAST:event_jMenuItem76ActionPerformed

    private void jMenuItem77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem77ActionPerformed
        // TODO add your handling code here:
        
        datos = consultas.datosGruposv();
        
        if(datos.length>0)
            mostrarGrupos(datos);
        this.VerificarCalificaciones.setVisible(false);
        Grupos.setVisible(true);
        
        String profes[] = consultas.datosUsuProf();
        ComboGP.removeAllItems();
        ComboGP.addItem("Seleccione al profesor");
        if(profes.length>0)
        {
            
            for(int i=0; i<profes.length; i++)
                ComboGP.addItem( (String) profes[i]);
        }
        
        modificarCE1.setText("");
        eliminarCE1.setText("");
        nombreCE1.setText("");
    }//GEN-LAST:event_jMenuItem77ActionPerformed

    private void jMenuItem78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem78ActionPerformed
        // TODO add your handling code here:
        
        
        VerificarCalificaciones.setVisible(false);
        ControlPagosC.setVisible(true);
        datosTabla = consultas.datosPagos();
        mostrarDatosPagosG(datosTabla);
        datosTabla = consultas.datosAlumnoPagos();
        mostrarDatosAlumnosP(datosTabla);
        AlumnoPC.setEditable(false);
        PagoPC.setEditable(false);
        cantidadPC.setEditable(false);
    }//GEN-LAST:event_jMenuItem78ActionPerformed

    private void jMenuItem79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem79ActionPerformed
        // TODO add your handling code here:
        
        
datos = consultas.datosCriterios();
        
        if(datos.length>0)
            mostrarCriterios(datos);
        this.VerificarCalificaciones.setVisible(false);
        CriteriosEvaluacion.setVisible(true);
        
        modificarCE.setText("");
        eliminarCE.setText("");
        nombreCE.setText("");

        
    }//GEN-LAST:event_jMenuItem79ActionPerformed

    private void jMenuItem80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem80ActionPerformed
        // TODO add your handling code here:
        
         this.VerificarCalificaciones.setVisible(false);
        this.MenuAlumnos.setVisible(true);
        NombreAlum.setText("");
        Ap_pat.setText("");
        Ap_mat.setText("");
        Celular.setText("");
        Telefono.setText("");
        direccion.setText("");
        NomTutor.setText("");
        Municipio.setSelectedIndex(0);
    }//GEN-LAST:event_jMenuItem80ActionPerformed

    private void jMenuItem81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem81ActionPerformed
        // TODO add your handling code here:
        
        

 this.GestionDirectora.setVisible(false);
        VerificarCalificaciones.setVisible(true);
        
        String criterios[] = consultas.datosCriterios();
        CriteriosCa1.removeAllItems();
        CriteriosCa1.addItem("Selección de criterios");
        if(criterios.length>0)
        {
            
            for(int i=0; i<criterios.length; i++)
                CriteriosCa1.addItem( (String) criterios[i]);
        }
        
        
        String profes[] = consultas.datosUsuProf();
        ComboPCD.removeAllItems();
        ComboPCD.addItem("Seleccione al profesor");
        if(profes.length>0)
        {
            
            for(int i=0; i<profes.length; i++)
                ComboPCD.addItem( (String) profes[i]);
        }
        
    }//GEN-LAST:event_jMenuItem81ActionPerformed

    private void jMenuItem82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem82ActionPerformed
        // TODO add your handling code here:
        GestionDirectora.setVisible(false);
        MenuUsuarios.setVisible(true);
        NombreUsuario.setText("");
        Ap_patUsua.setText("");
        Ap_matUsa.setText("");
        CelularUsu.setText("");
        TelefonoUsu.setText("");
        direccionUsu.setText("");
        MunicipioUsu.setSelectedIndex(0);
        TipoUsuario.setSelectedIndex(0);
        aliasUsu.setText("");
        contraUsu.setText("");
        comprobarCUsa.setText("");
    }//GEN-LAST:event_jMenuItem82ActionPerformed

    private void jMenuItem83ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem83ActionPerformed
        // TODO add your handling code here:
        datos = consultas.datosGruposv();
        
        if(datos.length>0)
            mostrarGrupos(datos);
        this.GestionDirectora.setVisible(false);
        Grupos.setVisible(true);
        
        String profes[] = consultas.datosUsuProf();
        ComboGP.removeAllItems();
        ComboGP.addItem("Seleccione al profesor");
        if(profes.length>0)
        {
            
            for(int i=0; i<profes.length; i++)
                ComboGP.addItem( (String) profes[i]);
        }
        
        modificarCE1.setText("");
        eliminarCE1.setText("");
        nombreCE1.setText("");

    }//GEN-LAST:event_jMenuItem83ActionPerformed

    private void jMenuItem84ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem84ActionPerformed
        // TODO add your handling code here:
        
GestionDirectora.setVisible(false);
        ControlPagosC.setVisible(true);
        datosTabla = consultas.datosPagos();
        mostrarDatosPagosG(datosTabla);
        datosTabla = consultas.datosAlumnoPagos();
        mostrarDatosAlumnosP(datosTabla);
        AlumnoPC.setEditable(false);
        PagoPC.setEditable(false);
        cantidadPC.setEditable(false);


    }//GEN-LAST:event_jMenuItem84ActionPerformed

    private void jMenuItem85ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem85ActionPerformed
        // TODO add your handling code here:
        


datos = consultas.datosCriterios();
        
        if(datos.length>0)
            mostrarCriterios(datos);
        this.GestionDirectora.setVisible(false);
        CriteriosEvaluacion.setVisible(true);
        
        modificarCE.setText("");
        eliminarCE.setText("");
        nombreCE.setText("");
    }//GEN-LAST:event_jMenuItem85ActionPerformed

    private void jMenuItem86ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem86ActionPerformed
        // TODO add your handling code here:
        
        

 this.GestionDirectora.setVisible(false);
        this.MenuAlumnos.setVisible(true);
        NombreAlum.setText("");
        Ap_pat.setText("");
        Ap_mat.setText("");
        Celular.setText("");
        Telefono.setText("");
        direccion.setText("");
        NomTutor.setText("");
        Municipio.setSelectedIndex(0);

    }//GEN-LAST:event_jMenuItem86ActionPerformed

    private void jMenuItem87ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem87ActionPerformed
        // TODO add your handling code here:
         this.GestionDirectora.setVisible(false);
        VerificarCalificaciones.setVisible(true);
        
        String criterios[] = consultas.datosCriterios();
        CriteriosCa1.removeAllItems();
        CriteriosCa1.addItem("Selección de criterios");
        if(criterios.length>0)
        {
            
            for(int i=0; i<criterios.length; i++)
                CriteriosCa1.addItem( (String) criterios[i]);
        }
        
        
        String profes[] = consultas.datosUsuProf();
        ComboPCD.removeAllItems();
        ComboPCD.addItem("Seleccione al profesor");
        if(profes.length>0)
        {
            
            for(int i=0; i<profes.length; i++)
                ComboPCD.addItem( (String) profes[i]);
        }
        
    }//GEN-LAST:event_jMenuItem87ActionPerformed

    private void jMenuItem30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem30ActionPerformed
        // TODO add your handling code here:
//        
//            conectar cn= new conectar();
//  
//                   
//           
//          
//             
//               try {
//                   
//                   JasperReport reporte=(JasperReport)JRLoader.loadObject("Constancia.jasper");
//                   Map parametros=new HashMap();
//                   
//                                      
//                   
//                   JasperPrint jasperPrint= JasperFillManager.fillReport(reporte,parametros, cn.conexion());
//                   
//                   JasperViewer view=new JasperViewer(jasperPrint, false);
//                   view.setTitle("CONSTANCIA");
//                   view.setVisible(true);
//               } catch (JRException ex) {
//                   Logger.getLogger(LogeoAspirante.class.getName()).log(Level.SEVERE, null, ex);
//               }
    }//GEN-LAST:event_jMenuItem30ActionPerformed

    private void jMenuItem88ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem88ActionPerformed
        // TODO add your handling code here:
        
        
// conectar cn= new conectar();
//  
//                   
//           
//          
//             
//               try {
//                   
//                   JasperReport reporte=(JasperReport)JRLoader.loadObject("Lista_Profesores.jasper");
//                   Map parametros=new HashMap();
//                   
//                                      
//                   
//                   JasperPrint jasperPrint= JasperFillManager.fillReport(reporte,parametros, cn.conexion());
//                   
//                   JasperViewer view=new JasperViewer(jasperPrint, false);
//                   view.setTitle("CONSTANCIA");
//                   view.setVisible(true);
//               } catch (JRException ex) {
//                   Logger.getLogger(LogeoAspirante.class.getName()).log(Level.SEVERE, null, ex);
//               }
    }//GEN-LAST:event_jMenuItem88ActionPerformed

    private void jMenuItem89ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem89ActionPerformed
        // TODO add your handling code here:
        
        
// conectar cn= new conectar();
//  
//                   
//           
//          
//             
//               try {
//                   
//                   JasperReport reporte=(JasperReport)JRLoader.loadObject("Historial.jasper");
//                   Map parametros=new HashMap();
//                   
//                                      
//                   
//                   JasperPrint jasperPrint= JasperFillManager.fillReport(reporte,parametros, cn.conexion());
//                   
//                   JasperViewer view=new JasperViewer(jasperPrint, false);
//                   view.setTitle("CONSTANCIA");
//                   view.setVisible(true);
//               } catch (JRException ex) {
//                   Logger.getLogger(LogeoAspirante.class.getName()).log(Level.SEVERE, null, ex);
//               }

        
        
    }//GEN-LAST:event_jMenuItem89ActionPerformed

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
            java.util.logging.Logger.getLogger(LogeoUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogeoUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogeoUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogeoUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogeoUsuarios().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AlumnoPC;
    private javax.swing.JTextField Ap_mat;
    private javax.swing.JTextField Ap_matUsa;
    private javax.swing.JTextField Ap_pat;
    private javax.swing.JTextField Ap_patUsua;
    private javax.swing.JComboBox AñoPC;
    private javax.swing.JDialog Calificaciones;
    private javax.swing.JTextField Celular;
    private javax.swing.JTextField CelularUsu;
    private javax.swing.JComboBox ComboGP;
    private javax.swing.JComboBox ComboPCD;
    private javax.swing.JPasswordField Contrasena;
    private javax.swing.JDialog ControlPagosC;
    private javax.swing.JComboBox CriteriosCa;
    private javax.swing.JComboBox CriteriosCa1;
    private javax.swing.JDialog CriteriosEvaluacion;
    private javax.swing.JComboBox DiaC;
    private javax.swing.JComboBox DiaPC;
    private javax.swing.JMenuItem Eliminar;
    private javax.swing.JMenuItem EliminarAlumno;
    private javax.swing.JMenuItem EliminarG;
    private javax.swing.JDialog EliminarModificarAlumno;
    private javax.swing.JPopupMenu EliminarUsu;
    private javax.swing.JMenuItem EliminarUsuario;
    private javax.swing.JDialog EliminarUsuarios;
    private javax.swing.JDialog GestionDirectora;
    private javax.swing.JDialog GestionPagosC;
    private javax.swing.JDialog GestionProfesor;
    private javax.swing.JDialog Grupos;
    private javax.swing.JDialog LogeoUsuarios;
    private javax.swing.JTextField MApellidoMAlum;
    private javax.swing.JTextField MApellidoPAlum;
    private javax.swing.JTextField MCelularAlum;
    private javax.swing.JTextField MCelularUsu;
    private javax.swing.JTextField MDireccionAlum;
    private javax.swing.JTextField MDireccionUsu;
    private javax.swing.JTextField MMaternUsu;
    private javax.swing.JTextField MMunicipioAlum;
    private javax.swing.JTextField MNTAlum;
    private javax.swing.JTextField MNombreAlum;
    private javax.swing.JTextField MNombreUsuario;
    private javax.swing.JTextField MTelefonoAlum;
    private javax.swing.JTextField MTelefonoUsu;
    private javax.swing.JComboBox MTipoUsu;
    private javax.swing.JDialog MenuAlumnos;
    private javax.swing.JPopupMenu MenuCE;
    private javax.swing.JPopupMenu MenuGrupos;
    private javax.swing.JPopupMenu MenuPagosC;
    private javax.swing.JDialog MenuUsuarios;
    private javax.swing.JComboBox MesPC;
    private javax.swing.JTextField MmunicipioUsu;
    private javax.swing.JMenuItem ModficarG;
    private javax.swing.JMenuItem Modificar;
    private javax.swing.JMenuItem ModificarAlumno;
    private javax.swing.JPopupMenu ModificarUsu;
    private javax.swing.JDialog ModificarUsuario;
    private javax.swing.JMenuItem ModificarUsuarioo;
    private javax.swing.JTextField MpaternoUsu;
    private javax.swing.JComboBox Municipio;
    private javax.swing.JComboBox MunicipioUsu;
    private javax.swing.JTextField NomTutor;
    private javax.swing.JTextField NombreAlum;
    private javax.swing.JTextField NombreElimnarAlumno;
    private javax.swing.JTextField NombreElimnarUsuario;
    private javax.swing.JTextField NombreUsuario;
    private javax.swing.JTextField PagoPC;
    private javax.swing.JMenuItem Seleccionar;
    private javax.swing.JMenuItem SeleccionarP;
    private javax.swing.JPopupMenu TMenuAlumnos;
    private javax.swing.JTable TablaAlumnos;
    private javax.swing.JTable TablaCE;
    private javax.swing.JTable TablaG;
    private javax.swing.JTextField Telefono;
    private javax.swing.JTextField TelefonoUsu;
    private javax.swing.JComboBox TipoUsuario;
    private javax.swing.JTextField Usuario;
    private javax.swing.JDialog VerificarCalificaciones;
    private javax.swing.JTextField aliasUsu;
    private javax.swing.JComboBox añoC;
    private javax.swing.JComboBox bimestreC;
    private javax.swing.JComboBox bimestreC1;
    private javax.swing.JTextField cantidadPC;
    private javax.swing.JPasswordField comprobarCUsa;
    private javax.swing.JPasswordField contraUsu;
    private javax.swing.JTextField direccion;
    private javax.swing.JTextField direccionUsu;
    private javax.swing.JTextField eliminarCE;
    private javax.swing.JTextField eliminarCE1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
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
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
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
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu16;
    private javax.swing.JMenu jMenu17;
    private javax.swing.JMenu jMenu18;
    private javax.swing.JMenu jMenu19;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu20;
    private javax.swing.JMenu jMenu21;
    private javax.swing.JMenu jMenu22;
    private javax.swing.JMenu jMenu23;
    private javax.swing.JMenu jMenu24;
    private javax.swing.JMenu jMenu25;
    private javax.swing.JMenu jMenu26;
    private javax.swing.JMenu jMenu27;
    private javax.swing.JMenu jMenu28;
    private javax.swing.JMenu jMenu29;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu30;
    private javax.swing.JMenu jMenu31;
    private javax.swing.JMenu jMenu32;
    private javax.swing.JMenu jMenu33;
    private javax.swing.JMenu jMenu34;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar10;
    private javax.swing.JMenuBar jMenuBar11;
    private javax.swing.JMenuBar jMenuBar12;
    private javax.swing.JMenuBar jMenuBar13;
    private javax.swing.JMenuBar jMenuBar14;
    private javax.swing.JMenuBar jMenuBar15;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuBar jMenuBar5;
    private javax.swing.JMenuBar jMenuBar6;
    private javax.swing.JMenuBar jMenuBar7;
    private javax.swing.JMenuBar jMenuBar8;
    private javax.swing.JMenuBar jMenuBar9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JMenuItem jMenuItem28;
    private javax.swing.JMenuItem jMenuItem29;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem30;
    private javax.swing.JMenuItem jMenuItem31;
    private javax.swing.JMenuItem jMenuItem32;
    private javax.swing.JMenuItem jMenuItem33;
    private javax.swing.JMenuItem jMenuItem34;
    private javax.swing.JMenuItem jMenuItem35;
    private javax.swing.JMenuItem jMenuItem36;
    private javax.swing.JMenuItem jMenuItem37;
    private javax.swing.JMenuItem jMenuItem38;
    private javax.swing.JMenuItem jMenuItem39;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem40;
    private javax.swing.JMenuItem jMenuItem41;
    private javax.swing.JMenuItem jMenuItem42;
    private javax.swing.JMenuItem jMenuItem43;
    private javax.swing.JMenuItem jMenuItem44;
    private javax.swing.JMenuItem jMenuItem45;
    private javax.swing.JMenuItem jMenuItem46;
    private javax.swing.JMenuItem jMenuItem47;
    private javax.swing.JMenuItem jMenuItem48;
    private javax.swing.JMenuItem jMenuItem49;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem50;
    private javax.swing.JMenuItem jMenuItem51;
    private javax.swing.JMenuItem jMenuItem52;
    private javax.swing.JMenuItem jMenuItem53;
    private javax.swing.JMenuItem jMenuItem54;
    private javax.swing.JMenuItem jMenuItem55;
    private javax.swing.JMenuItem jMenuItem56;
    private javax.swing.JMenuItem jMenuItem57;
    private javax.swing.JMenuItem jMenuItem58;
    private javax.swing.JMenuItem jMenuItem59;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem60;
    private javax.swing.JMenuItem jMenuItem61;
    private javax.swing.JMenuItem jMenuItem62;
    private javax.swing.JMenuItem jMenuItem63;
    private javax.swing.JMenuItem jMenuItem64;
    private javax.swing.JMenuItem jMenuItem65;
    private javax.swing.JMenuItem jMenuItem66;
    private javax.swing.JMenuItem jMenuItem67;
    private javax.swing.JMenuItem jMenuItem68;
    private javax.swing.JMenuItem jMenuItem69;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem70;
    private javax.swing.JMenuItem jMenuItem71;
    private javax.swing.JMenuItem jMenuItem72;
    private javax.swing.JMenuItem jMenuItem73;
    private javax.swing.JMenuItem jMenuItem74;
    private javax.swing.JMenuItem jMenuItem75;
    private javax.swing.JMenuItem jMenuItem76;
    private javax.swing.JMenuItem jMenuItem77;
    private javax.swing.JMenuItem jMenuItem78;
    private javax.swing.JMenuItem jMenuItem79;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem80;
    private javax.swing.JMenuItem jMenuItem81;
    private javax.swing.JMenuItem jMenuItem82;
    private javax.swing.JMenuItem jMenuItem83;
    private javax.swing.JMenuItem jMenuItem84;
    private javax.swing.JMenuItem jMenuItem85;
    private javax.swing.JMenuItem jMenuItem86;
    private javax.swing.JMenuItem jMenuItem87;
    private javax.swing.JMenuItem jMenuItem88;
    private javax.swing.JMenuItem jMenuItem89;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JLabel mensajeElimnarAlumno;
    private javax.swing.JLabel mensajeElimnarAlumno1;
    private javax.swing.JPopupMenu menuAlumnoCP;
    private javax.swing.JComboBox mesC;
    private javax.swing.JTextField modificarCE;
    private javax.swing.JTextField modificarCE1;
    private javax.swing.JTextField nombreCE;
    private javax.swing.JTextField nombreCE1;
    private javax.swing.JTable tablaAlumnoC;
    private javax.swing.JTable tablaCPagosC;
    private javax.swing.JTable tablaCalificaciones;
    private javax.swing.JTable tablaCalificaciones1;
    private javax.swing.JTable tablaEUsu;
    private javax.swing.JTable tablaMUsu;
    private javax.swing.JTable tablaPagosAlumno;
    private javax.swing.JTable tablaPagosC;
    // End of variables declaration//GEN-END:variables
}
