/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SearLogica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alexX
 */
public class VO {
    
    Connection cn;
    private Statement st;
    private PreparedStatement pS;
    
    public VO()
    {
        Conexion.sinlenton();
        DAO dao = new DAO();
        cn = dao.DAOConection();
              
    }
    
    
    //************ Gestion Usuarios****************************
    
    
    
    public String[] comprobarUsu(String usuario, String contrasena)
    {
        String mensaje[] = new String[2];
        
         try {
             
             pS = cn.prepareStatement(" SELECT  id_usuario ,`TipoUsuario`\n" +
                                        "FROM  `usuarios` \n" +
                                        "WHERE  `Usuario` =  '"+usuario+"'\n" +
                                        "AND  `Contraseña` =  '"+contrasena+"'\n" +
                                        "AND  `Status` =1\n");
//             
//             System.out.print(" SELECT  `TipoUsuario`\n" +
//                                        "FROM  `usuarios` \n" +
//                                        "WHERE  `Usuario` =  '"+usuario+"'\n" +
//                                        "AND  `Contraseña` =  '"+contrasena+"'\n" +
//                                        "AND  `Status` =1\n");
             
             ResultSet rs = pS.executeQuery();
             
             if(rs.next())
             {
                 mensaje[0] = "1";
                 mensaje[1] = rs.getString("TipoUsuario").concat("-").concat(rs.getString("id_usuario"));
                 return mensaje;
                 
             }
             else
             {
                 mensaje[0] = "0";
                 mensaje[1] = "Error con usuario o contraseña";
                 return mensaje;
             }
             
             
         } catch (SQLException ex) {
             Logger.getLogger(VO.class.getName()).log(Level.SEVERE, null, ex);
             System.err.println("Este es un error: \t"+ex.getMessage());
             mensaje[0] = "0";
             mensaje[1] = "Error en el sistema";
             return mensaje;
         }
        
    }
    
    
    public String[] regitroUsuario(String[] datosA)
    {
        String [] mensaje = new String[2];
         try {
             
            PreparedStatement pS2 = cn.prepareStatement("SELECT * \n" +
                                                            "FROM  `usuarios` \n" +
                                                            "WHERE  (`Usuario` =  '"+datosA[1]+"'\n" +
                                                            "AND  `Nombre` =  '"+datosA[9]+"'\n" +
                                                            "AND  `Ap_p` =  '"+datosA[3]+"'\n" +
                                                            "AND  `Ap_mat` =  '"+datosA[5]+"') OR  `Usuario` =  '"+datosA[1]+"'");
            
            ResultSet rs2 = pS2.executeQuery();
            
            if(!rs2.next())
             {
                 pS = cn.prepareStatement("INSERT INTO  `sear`.`usuarios` (\n" +
                                            "`id_usuario` ,\n" +
                                            "`Status` ,\n" +
                                            "`Usuario` ,\n" +
                                            "`Contraseña` ,\n" +
                                            "`Ap_p` ,\n" +
                                            "`Ap_mat` ,\n" +
                                            "`Telefono` ,\n" +
                                            "`Celular` ,\n" +
                                            "`Calle` ,\n" +
                                            "`Municipio` ,\n" +
                                            "`Nombre` ,\n" +
                                            "`TipoUsuario`\n" +
                                            ")\n" +
                                            "VALUES (\n" +
                                            "'"+datosA[0]+"',  '1',  '"+datosA[1]+"',  '"+datosA[2]+"',  '"+datosA[3]+"',  '"+datosA[4]+"',  '"+datosA[5]+"',  '"+datosA[6]+"',  '"+datosA[7]+"',  '"+datosA[8]+"',  '"+datosA[9]+"',  '"+datosA[10]+"'\n" +
                                            ");");
         
                 System.out.println("INSERT INTO  `sear`.`usuarios` (\n" +
                                            "`id_usuario` ,\n" +
                                            "`Status` ,\n" +
                                            "`Usuario` ,\n" +
                                            "`Contraseña` ,\n" +
                                            "`Ap_p` ,\n" +
                                            "`Ap_mat` ,\n" +
                                            "`Telefono` ,\n" +
                                            "`Celular` ,\n" +
                                            "`Calle` ,\n" +
                                            "`Municipio` ,\n" +
                                            "`Nombre` ,\n" +
                                            "`TipoUsuario`\n" +
                                            ")\n" +
                                            "VALUES (\n" +
                                            "'"+datosA[0]+"',  '1',  '"+datosA[1]+"',  '"+datosA[2]+"',  '"+datosA[3]+"',  '"+datosA[4]+"',  '"+datosA[5]+"',  '"+datosA[6]+"',  '"+datosA[7]+"',  '"+datosA[8]+"',  '"+datosA[9]+"',  '"+datosA[10]+"'\n" +
                                            ");");
                 
                int n = pS.executeUpdate();

                if(n>0)
                {
                    mensaje[0] = "1";
                    mensaje[1] = "Datos Dados de alta correctamente";
                    return mensaje;

                }
                else
                {
                   mensaje[0] = "0";
                   mensaje[1] = "Error al registrar al aspirante";
                   return mensaje;              
                }
                        
                 
             }
             else
            {
                mensaje[0] = "0";
                mensaje[1] = "Usuario ya registrado";
                return mensaje;
                
            }
                
             
             
             
         } catch (SQLException ex) {
             Logger.getLogger(VO.class.getName()).log(Level.SEVERE, null, ex);
             System.err.println("MEnsaje:"+ ex.getMessage());
             mensaje[0] = "0";
             mensaje[1] = "Error con el servidor";
             return mensaje;
         }
        
    }
    
    
    public String[] datosUsu()
    {
                
        String[] datos;
        int contador= 0;
        int i;
        String tipoUsu;
        

        try {
             
             pS = cn.prepareStatement("SELECT  `Nombre` ,  `Ap_p` ,  `ap_mat` ,  `Telefono` ,  `Celular` ,  `Calle` ,  `Municipio` ,  `TipoUsuario` \n" +
                                        "FROM  `usuarios` \n" +
                                        "WHERE  `Status` =1\n" +
                                        "ORDER BY Nombre ASC ");
             
             ResultSet rs = pS.executeQuery();
             
                         
             while(rs.next())
             {
                 contador += 1;
                 System.out.println("no."+ contador);
             }
             
             rs.first();
             
             datos = new String [contador];
             
            for(i=0;i<contador;i++)
             {
               
                 if(rs.getString("TipoUsuario").equals("0"))
                     tipoUsu = "Director(a)";
                 else
                     tipoUsu = "profesor(a)";
                 
                 datos[i] = rs.getString("Nombre").concat("-").concat(rs.getString("Ap_p")).concat("-").concat(rs.getString("ap_mat")).concat("-").concat(rs.getString("Telefono")).concat("-").concat(rs.getString("Celular")).concat("-").concat(rs.getString("Calle")).concat("-").concat(rs.getString("Municipio").concat("-").concat(tipoUsu));
                 rs.next();
                 System.out.println("datos: "+datos[i]);
             }
             
             return datos;
        
         } catch (SQLException ex) {
             Logger.getLogger(VO.class.getName()).log(Level.SEVERE, null, ex);
             System.err.println("Este es un error: \t"+ex.getMessage());
             return null;
         }
        
        
    }
    
    
    public String EliminarUsuario(String datos[])
    {
        
        try 
        {
            pS = cn.prepareStatement("DELETE FROM usuarios "
                                        + "WHERE `Nombre` = '"+datos[0]+"' AND `Ap_p` = '"+datos[1]+"' AND `Ap_mat` = '"+datos[2]+"'");
         
            int n = pS.executeUpdate();
             
            if(n>0)
            {
                return "Dado de baja correctamente";
            }
            else
                return "Error al dar de baja";

         } catch (SQLException ex) {
             Logger.getLogger(VO.class.getName()).log(Level.SEVERE, null, ex);
             System.err.println("MEnsaje:"+ ex.getMessage());
             return "Error con la base de datos";
         }
        
        
    }
    
    public String modificarUsu(String datos[])
    {

        
         try {
             pS = cn.prepareStatement("UPDATE  `sear`.`usuarios` SET \n" +
                                            "`Nombre` =  '"+datos[0]+"',\n" +
                                            "`Ap_p` =  '"+datos[1]+"',\n" +
                                            "`Ap_mat` =  '"+datos[2]+"',\n" +
                                            "`Telefono` =  '"+datos[3]+"',\n" +
                                            "`Celular` =  '"+datos[4]+"',\n" +
                                            "`Calle` =  '"+datos[5]+"',\n" +
                                            "`Municipio` =  '"+datos[6]+"',\n" +
                                            "`TipoUsuario` =  '"+datos[7]+"' WHERE `Nombre` =  '"+datos[8]+"' AND `Ap_p` =  '"+datos[9]+"' AND `Ap_mat` =  '"+datos[10]+"'");
             
             
           System.out.println("UPDATE  `sear`.`usuarios` SET \n" +
                                            "`Nombre` =  '"+datos[0]+"',\n" +
                                            "`Ap_p` =  '"+datos[1]+"',\n" +
                                            "`Ap_mat` =  '"+datos[2]+"',\n" +
                                            "`Telefono` =  '"+datos[3]+"',\n" +
                                            "`Celular` =  '"+datos[4]+"',\n" +
                                            "`Calle` =  '"+datos[5]+"',\n" +
                                            "`Municipio` =  '"+datos[6]+"',\n" +
                                            "`TipoUsuario` =  '"+datos[7]+"' WHERE `Nombre` =  '"+datos[8]+" AND `Ap_p` =  '"+datos[9]+"' AND `Ap_mat` =  '"+datos[10]+"'");
             int rs = pS.executeUpdate();
             
             if(rs>0)
             {
                 return "Actualización Correctamente";
             }
             else
             {
                 return "Error al registrar intente mas tarde";
             }
             
             
         } catch (SQLException ex) {
             Logger.getLogger(VO.class.getName()).log(Level.SEVERE, null, ex);
             System.err.println("Mensaje: "+ex.getMessage());
             return "Error con el servidor";
         }
        
        
    }
   
    
    public String[] datosUsuProf()
   {
        
        
        String[] datos;
        int contador= 0;
        int i;
        

        try {
             
             pS = cn.prepareStatement("SELECT  `id_usuario` ,  `Ap_p` ,  `Ap_mat` ,  `Ap_mat` ,  `Nombre` \n" +
                                        "FROM  `usuarios` \n" +
                                        "WHERE  `TipoUsuario` =  '1'  ");
             
           
             
             ResultSet rs = pS.executeQuery();
             
                         
             while(rs.next())
             {
                 contador += 1;
                 System.out.println("no."+ contador);
             }
             
             rs.first();
             
             datos = new String [contador];
             
            for(i=0;i<contador;i++)
             {
               
                 datos[i] = rs.getString("id_usuario").concat("¬").concat(rs.getString("Ap_p")).concat(" ").concat(rs.getString("Ap_mat")).concat(" ").concat(rs.getString("Nombre"));
                 rs.next();
                 System.out.println("datos: "+datos[i]);
             }
             
             return datos;
        
         } catch (SQLException ex) {
             Logger.getLogger(VO.class.getName()).log(Level.SEVERE, null, ex);
             System.err.println("Este es un error: \t"+ex.getMessage());
             return null;
         }
        
        
    }
    
    
    //************* Gestión del alumno*********************
    
    
   public String[] regitroAlum(String[] datosA)
    {
        String [] mensaje = new String[2];
         try {
             
            PreparedStatement pS2 = cn.prepareStatement("SELECT * \n" +
                                                    "FROM  `alumno_aspirante` \n" +
                                                    "WHERE  `Nombre` =  '"+datosA[2]+"'\n" +
                                                    "AND  `ap_pat` =  '"+datosA[3]+"'\n" +
                                                    "AND  `ap_mat` =  '"+datosA[4]+"'\n" +
                                                    "AND  `NombreTutor` =  '"+datosA[7]+"'");
            
            ResultSet rs2 = pS2.executeQuery();
            
            if(!rs2.next())
             {
                 pS = cn.prepareStatement("INSERT INTO  `sear`.`alumno_aspirante` (\n" +
                                "`Id_alumno` ,\n" +
                                "`Telefono` ,\n" +
                                "`Celular` ,\n" +
                                "`Nombre` ,\n" +
                                "`ap_pat` ,\n" +
                                "`ap_mat` ,\n" +
                                "`Calle` ,\n" +
                                "`Municipio` ,\n" +
                                "`NombreTutor` ,\n" +
                                "`Status` ,\n" +
                                "`cursando`\n" +
                                ")\n" +
                                "VALUES (\n" +
                                "NULL ,  '"+datosA[0]+"','"+datosA[1]+"',  '"+datosA[2]+"',  '"+datosA[3]+"',  '"+datosA[4]+"',  '"+datosA[5]+"',  '"+datosA[6]+"',  '"+datosA[7]+"',  '1',  'año 1'\n" +
                                ");");
         
                 System.out.println("Codigo SQL: INSERT INTO  `sear`.`alumno_aspirante` (\n" +
                                "`Id_alumno` ,\n" +
                                "`Telefono` ,\n" +
                                "`Celular` ,\n" +
                                "`Nombre` ,\n" +
                                "`ap_pat` ,\n" +
                                "`ap_mat` ,\n" +
                                "`Calle` ,\n" +
                                "`Municipio` ,\n" +
                                "`NombreTutor` ,\n" +
                                "`Status` ,\n" +
                                "`cursando`\n" +
                                ")\n" +
                                "VALUES (\n" +
                                "NULL ,  '"+datosA[0]+"','"+datosA[1]+"',  '"+datosA[2]+"',  '"+datosA[3]+"',  '"+datosA[4]+"',  '"+datosA[5]+"',  '"+datosA[6]+"',  '"+datosA[7]+"',  '1',  'año 1'\n" +
                                ");");
                 
                int n = pS.executeUpdate();

                if(n>0)
                {
                    mensaje[0] = "1";
                    mensaje[1] = "Datos Dados de alta correctamente";
                    return mensaje;

                }
                else
                {
                   mensaje[0] = "0";
                   mensaje[1] = "Error al registrar al aspirante";
                   return mensaje;              
                }
                        
                 
             }
             else
            {
                mensaje[0] = "0";
                mensaje[1] = "Alumno ya registrado";
                return mensaje;
                
            }
                
             
             
             
         } catch (SQLException ex) {
             Logger.getLogger(VO.class.getName()).log(Level.SEVERE, null, ex);
             System.err.println("MEnsaje:"+ ex.getMessage());
             mensaje[0] = "0";
             mensaje[1] = "Error con el servidor";
             return mensaje;
         }
        
    }
   
   
   public String[] datosAlumno()
    {
        
        
        String[] datos;
        int contador= 0;
        int i;
        

        try {
             
             pS = cn.prepareStatement("SELECT  `Nombre` ,  `ap_pat` ,  `ap_mat` ,  `Telefono` ,  `Celular` ,  `NombreTutor` ,  `Calle` ,  `Municipio` \n" +
                                        "FROM  `alumno_aspirante` \n" +
                                        "WHERE  `Status` =1\n" +
                                        "ORDER BY Nombre ASC ");
             
             ResultSet rs = pS.executeQuery();
             
                         
             while(rs.next())
             {
                 contador += 1;
                 System.out.println("no."+ contador);
             }
             
             rs.first();
             
             datos = new String [contador];
             
            for(i=0;i<contador;i++)
             {
               
                 datos[i] = rs.getString("Nombre").concat("-").concat(rs.getString("ap_pat")).concat("-").concat(rs.getString("ap_mat")).concat("-").concat(rs.getString("Telefono")).concat("-").concat(rs.getString("Celular")).concat("-").concat(rs.getString("NombreTutor")).concat("-").concat(rs.getString("Calle").concat("-").concat(rs.getString("Municipio")));
                 rs.next();
                 System.out.println("datos: "+datos[i]);
             }
             
             return datos;
        
         } catch (SQLException ex) {
             Logger.getLogger(VO.class.getName()).log(Level.SEVERE, null, ex);
             System.err.println("Este es un error: \t"+ex.getMessage());
             return null;
         }
        
        
    }
   
   
   public String[] datosAlumnoPagos()
    {
        
        
        String[] datos;
        int contador= 0;
        int i;
        

        try {
             
             pS = cn.prepareStatement("SELECT  `Id_alumno`,`Nombre` ,  `ap_pat` ,  `ap_mat`, `NombreTutor`\n" +
                                        "FROM  `alumno_aspirante` \n" +
                                        "WHERE  `Status` =1\n" +
                                        "ORDER BY Nombre ASC ");
             
             ResultSet rs = pS.executeQuery();
             
                         
             while(rs.next())
             {
                 contador += 1;
                 System.out.println("no."+ contador);
             }
             
             rs.first();
             
             datos = new String [contador];
             
            for(i=0;i<contador;i++)
             {
               
                 datos[i] = rs.getString("Id_alumno").concat("¬").concat(rs.getString("Nombre")).concat("-").concat(rs.getString("ap_pat")).concat("-").concat(rs.getString("ap_mat")).concat("-").concat(rs.getString("NombreTutor"));
                 rs.next();
                 System.out.println("datos: "+datos[i]);
             }
             
             return datos;
        
         } catch (SQLException ex) {
             Logger.getLogger(VO.class.getName()).log(Level.SEVERE, null, ex);
             System.err.println("Este es un error: \t"+ex.getMessage());
             return null;
         }
        
        
    }
   
   
   public String[] datosAlumnoC()
   {
        
        
        String[] datos;
        int contador= 0;
        int i;
        

        try {
             
             pS = cn.prepareStatement("SELECT  `Nombre` ,  `ap_pat` ,  `ap_mat`" +
                                        "FROM  `alumno_aspirante` \n" +
                                        "WHERE  `Status` =1\n" +
                                        "ORDER BY Nombre ASC ");
             
             ResultSet rs = pS.executeQuery();
             
                         
             while(rs.next())
             {
                 contador += 1;
                 System.out.println("no."+ contador);
             }
             
             rs.first();
             
             datos = new String [contador];
             
            for(i=0;i<contador;i++)
             {
               
                 datos[i] = rs.getString("Nombre").concat("-").concat(rs.getString("ap_pat")).concat("-").concat(rs.getString("ap_mat"));
                 rs.next();
                 System.out.println("datos: "+datos[i]);
             }
             
             return datos;
        
         } catch (SQLException ex) {
             Logger.getLogger(VO.class.getName()).log(Level.SEVERE, null, ex);
             System.err.println("Este es un error: \t"+ex.getMessage());
             return null;
         }
        
        
    }
   
   
   public String EliminarAlumno(String datos[])
    {
        
        try 
        {
            pS = cn.prepareStatement("DELETE FROM alumno_aspirante "
                                        + "WHERE `Nombre` = '"+datos[0]+"' AND `ap_pat` = '"+datos[1]+"' AND `ap_mat` = '"+datos[2]+"'");
         
            int n = pS.executeUpdate();
             
            if(n>0)
            {
                return "1";
            }
            else
                return "Error al dar de baja";

         } catch (SQLException ex) {
             Logger.getLogger(VO.class.getName()).log(Level.SEVERE, null, ex);
             System.err.println("MEnsaje:"+ ex.getMessage());
             return "Error con la base de datos";
         }
        
        
    }
   
   public String modificarAlumno(String datos[])
    {

        
         try {
             pS = cn.prepareStatement("UPDATE  `sear`.`alumno_aspirante` SET \n" +
                                "`Telefono` =  '"+datos[3]+"',\n" +
                                "`Celular` =  '"+datos[4]+"',\n" +
                                "`Nombre` =  '"+datos[0]+"',\n" +
                                "`ap_pat` =  '"+datos[1]+"',\n" +
                                "`ap_mat` =  '"+datos[2]+"',\n" +
                                "`Calle` =  '"+datos[6]+"',\n" +
                                "`Municipio` =  '"+datos[7]+"',\n" +
                                "`NombreTutor` =  '"+datos[5]+"'\n" +
                                "WHERE  `alumno_aspirante`.`Nombre` = '"+datos[8]+"' AND `alumno_aspirante`.`ap_pat` = '"+datos[9]+"' AND  `alumno_aspirante`.`ap_mat` = '"+datos[10]+"'");
             
             
//             System.out.println("UPDATE  `sear`.`alumno_aspirante` SET \n" +
//                                "`Telefono` =  '"+datos[3]+"',\n" +
//                                "`Celular` =  '"+datos[4]+"',\n" +
//                                "`Nombre` =  '"+datos[0]+"',\n" +
//                                "`ap_pat` =  '"+datos[1]+"',\n" +
//                                "`ap_mat` =  '"+datos[2]+"',\n" +
//                                "`Calle` =  '"+datos[6]+"',\n" +
//                                "`Municipio` =  '"+datos[7]+"',\n" +
//                                "`NombreTutor` =  '"+datos[5]+"'\n" +
//                                "WHERE  `alumno_aspirante`.`Nombre` = '"+datos[8]+"' AND `alumno_aspirante`.`ap_pat` = '"+datos[9]+"' AND  `alumno_aspirante`.`ap_mat` = '"+datos[10]+"'");
             int rs = pS.executeUpdate();
             
             if(rs>0)
             {
                 return "Actualización Correctamente";
             }
             else
             {
                 return "Error al registrar intente mas tarde";
             }
             
             
         } catch (SQLException ex) {
             Logger.getLogger(VO.class.getName()).log(Level.SEVERE, null, ex);
             System.err.println("Mensaje: "+ex.getMessage());
             return "Error con el servidor";
         }
        
        
    }
   
   
   // ********************Gestión de los pagos *****************/
   
   
   public String[] datosPagos()
   {
        
        
        String[] datos;
        int contador= 0;
        int i;
        

        try {
             
             pS = cn.prepareStatement("SELECT Id_PagoC, `NombrePAgo` ,  `Cantidad real` \n" +
                                        "FROM  `pagos_colegiaturas` \n" +
                                        "ORDER BY  `NombrePAgo` ASC  ");
             
             ResultSet rs = pS.executeQuery();
             
                         
             while(rs.next())
             {
                 contador += 1;
                 System.out.println("no."+ contador);
             }
             
             rs.first();
             
             datos = new String [contador];
             
            for(i=0;i<contador;i++)
             {
               
                 datos[i] = rs.getString("Id_PagoC").concat("¬").concat(rs.getString("NombrePAgo")).concat("-").concat(rs.getString("Cantidad real"));
                 rs.next();
                 System.out.println("datos: "+datos[i]);
             }
             
             return datos;
        
         } catch (SQLException ex) {
             Logger.getLogger(VO.class.getName()).log(Level.SEVERE, null, ex);
             System.err.println("Este es un error: \t"+ex.getMessage());
             return null;
         }
        
        
    }
   
   
   public String[] datosPagosControl(String dato)
   {
        
        
        String[] datos;
        int contador= 0;
        int i;
        

        try {
             
             pS = cn.prepareStatement("   SELECT `alumno_aspirante`.`Id_alumno`, `Nombre`, `ap_pat`,  `NombrePAgo`, `Cantidad` "
                                     + "FROM `alumno_aspirante` , `pagos_colegiaturas`,  `controlpagosc` "
                                     + "WHERE  `alumno_aspirante`. `Id_alumno` =  `controlpagosc` .`Id_alumno` AND\n" +
                                    "`pagos_colegiaturas`.`Id_PagoC` =  `controlpagosc`.`Id_PagoC` "
                                      + "AND `alumno_aspirante`.`Id_alumno` = '"+dato+"'");
             
             ResultSet rs = pS.executeQuery();
             
                         
             while(rs.next())
             {
                 contador += 1;
                 System.out.println("no."+ contador);
             }
             
             rs.first();
             
             datos = new String [contador];
             
            for(i=0;i<contador;i++)
             {
               
                 datos[i] = rs.getString("Id_alumno").concat("¬").concat(rs.getString("Nombre")).concat("-").concat(rs.getString("ap_pat")).concat("-").concat(rs.getString("NombrePAgo")).concat("-").concat(rs.getString("Cantidad"));
                 rs.next();
                 System.out.println("datos: "+datos[i]);
             }
             
             return datos;
        
         } catch (SQLException ex) {
             Logger.getLogger(VO.class.getName()).log(Level.SEVERE, null, ex);
             System.err.println("Este es un error: \t"+ex.getMessage());
             return null;
         }
        
        
    }
   
   
   
   public String[] regitroPago(String[] datosA)
    {
        String [] mensaje = new String[2];
         try {
             
            PreparedStatement pS2 = cn.prepareStatement("SELECT * \n" +
                                                "FROM  `controlpagosc` \n" +
                                                "WHERE  `Id_alumno` =  '"+datosA[0]+"'\n" +
                                                "AND  `Id_PagoC` =  '"+datosA[1]+"'");
            
            ResultSet rs2 = pS2.executeQuery();
            
            if(!rs2.next())
             {
                 pS = cn.prepareStatement("INSERT INTO  `sear`.`controlpagosc` (\n" +
                                            "`Id_CPC` ,\n" +
                                            "`FechaPago` ,\n" +
                                            "`Cantidad` ,\n" +
                                            "`Id_alumno` ,\n" +
                                            "`Id_PagoC`\n" +
                                            ")\n" +
                                            "VALUES (\n" +
                                            "NULL ,  '"+datosA[3]+"',  '"+datosA[2]+"',  '"+datosA[0]+"',  '"+datosA[1]+"'\n" +
                                            ");");
         
                 System.out.println("INSERT INTO  `sear`.`controlpagosc` (\n" +
                                            "`Id_CPC` ,\n" +
                                            "`FechaPago` ,\n" +
                                            "`Cantidad` ,\n" +
                                            "`Id_alumno` ,\n" +
                                            "`Id_PagoC`\n" +
                                            ")\n" +
                                            "VALUES (\n" +
                                            "NULL ,  '"+datosA[3]+"',  '"+datosA[2]+"',  '"+datosA[0]+"',  '"+datosA[1]+"'\n" +
                                            ");");
                 
                int n = pS.executeUpdate();

                if(n>0)
                {
                    mensaje[0] = "1";
                    mensaje[1] = "Datos Dados de alta correctamente";
                    return mensaje;

                }
                else
                {
                   mensaje[0] = "0";
                   mensaje[1] = "Error al registrar el criterio";
                   return mensaje;              
                }
                        
                 
             }
             else
            {
                mensaje[0] = "0";
                mensaje[1] = "Criterio de evaluación ya registrado";
                return mensaje;
                
            }
                
             
             
             
         } catch (SQLException ex) {
             Logger.getLogger(VO.class.getName()).log(Level.SEVERE, null, ex);
             System.err.println("MEnsaje:"+ ex.getMessage());
             mensaje[0] = "0";
             mensaje[1] = "Error con el servidor";
             return mensaje;
         }
        
    }
   
   
   //******************Grupos**************//
   
   public String[] datosAlumnosCali(String dato)
   {
        
        
        String[] datos;
        int contador= 0;
        int i;
        

        try {
             
             pS = cn.prepareStatement("SELECT DISTINCT `Id_alumno`, `alumno_aspirante`.`ap_pat`,  `alumno_aspirante`.`ap_mat`,  `alumno_aspirante`.`Nombre` "
                                        + "FROM `alumno_aspirante`,   `grupos` ,   `usuarios` "
                                        + "WHERE `alumno_aspirante`.`Id_grupo` =  `grupos`.`Id_grupo`"
                                        + " AND  `usuarios`.`id_usuario`=    `grupos`.`Id_profesor` "
                                        + "AND  `grupos`.`Id_profesor` = '"+dato+"'"
                                        + "ORDER BY `alumno_aspirante`.`ap_pat` ASC");
             
             System.out.println("Datos alumnos Calificación /t"+"SELECT DISTINCT `Id_alumno`,`alumno_aspirante`.`ap_pat`,  `alumno_aspirante`.`ap_mat`,  `alumno_aspirante`.`Nombre` "
                                        + "FROM `alumno_aspirante`,   `grupos` ,   `usuarios` "
                                        + "WHERE `alumno_aspirante`.`Id_grupo` =  `grupos`.`Id_grupo`"
                                        + " AND  `usuarios`.`id_usuario`=    `grupos`.`Id_profesor` "
                                        + "AND  `grupos`.`Id_profesor` = '"+dato+"'"
                                        + "ORDER BY `alumno_aspirante`.`ap_pat` ASC");
             
             ResultSet rs = pS.executeQuery();
             
                         
             while(rs.next())
             {
                 contador += 1;
                 System.out.println("no."+ contador);
             }
             
             rs.first();
             
             datos = new String [contador];
             
            for(i=0;i<contador;i++)
             {
               
                 datos[i] = rs.getString("Id_alumno").concat("¬").concat(rs.getString("ap_pat")).concat("-").concat(rs.getString("ap_mat")).concat("-").concat(rs.getString("Nombre").concat("-").concat("Ej. 9"));
                 rs.next();
                 System.out.println("datos: "+datos[i]);
             }
             
             return datos;
        
         } catch (SQLException ex) {
             Logger.getLogger(VO.class.getName()).log(Level.SEVERE, null, ex);
             System.err.println("Este es un error: \t"+ex.getMessage());
             return null;
         }
        
        
    }
   
   
   //*******************Calificaciones***********////
   
   
   public String[] datosCriterios()
   {
        
        
        String[] datos;
        int contador= 0;
        int i;
        

        try {
             
             pS = cn.prepareStatement("SELECT `Id_Calificacion`, `Nombre` \n" +
                                        "FROM  `calificaciones` ");
             
           
             
             ResultSet rs = pS.executeQuery();
             
                         
             while(rs.next())
             {
                 contador += 1;
                 System.out.println("no."+ contador);
             }
             
             rs.first();
             
             datos = new String [contador];
             
            for(i=0;i<contador;i++)
             {
               
                 datos[i] = rs.getString("Id_Calificacion").concat("-").concat(rs.getString("Nombre"));
                 rs.next();
                 System.out.println("datos: "+datos[i]);
             }
             
             return datos;
        
         } catch (SQLException ex) {
             Logger.getLogger(VO.class.getName()).log(Level.SEVERE, null, ex);
             System.err.println("Este es un error: \t"+ex.getMessage());
             return null;
         }
        
        
    }
   
   public String[] regitroCali(String[] datosA)
    {
        String [] mensaje = new String[2];
        String [] datos;
        
        for(int i= 0; i<datosA.length; i++)
        {
            datos = datosA[i].split("¬");
            if(datos.length==6)
            {
                    try {

                       PreparedStatement pS2 = cn.prepareStatement("SELECT  `Nombre` \n" +
                                            "FROM  `alumno_aspirante` ,  `controlcalificacion` \n" +
                                            "WHERE  `controlcalificacion`.`Id_alumno` =  `alumno_aspirante`.`Id_alumno` \n" +
                                            "AND  `Id_Calificacion` =  '"+datos[3]+"'\n" +
                                            "AND  `controlcalificacion`.`Id_alumno` =  '"+datos[2]+"'");

                       ResultSet rs2 = pS2.executeQuery();

                       if(!rs2.next())
                        {
                            pS = cn.prepareStatement("INSERT INTO  `sear`.`controlcalificacion` (\n" +
                                                        "`Id_CC` ,\n" +
                                                        "`Bimestre` ,\n" +
                                                        "`FechaRegistro` ,\n" +
                                                        "`Id_alumno` ,\n" +
                                                        "`Id_Calificacion` ,\n" +
                                                        "`calificacion` ,\n" +
                                                        "`Id_profesor`"
                                                        + "Status\n" +
                                                        ")\n" +
                                                        "VALUES (\n" +
                                                        "NULL ,  '"+datos[0]+"',  '"+datos[1]+"',  '"+datos[2]+"',  '"+datos[3]+"',  '"+datos[4]+"', 0 , '"+datos[5]+"'\n" +
                                                        ");");

                            System.out.println("INSERT INTO  `sear`.`controlcalificacion` (\n" +
                                                        "`Id_CC` ,\n" +
                                                        "`Bimestre` ,\n" +
                                                        "`FechaRegistro` ,\n" +
                                                        "`Id_alumno` ,\n" +
                                                        "`Id_Calificacion` ,\n" +
                                                        "`calificacion` ,\n" +
                                                        "`Id_profesor`\n" +
                                                        ")\n" +
                                                        "VALUES (\n" +
                                                        "NULL ,  '"+datos[0]+"',  '"+datos[1]+"',  '"+datos[2]+"',  '"+datos[3]+"',  '"+datos[4]+"',  '"+datos[5]+"'\n" +
                                                        ");");

                           int n = pS.executeUpdate();

                           if(n>0)
                           {
                               mensaje[0] = "1";
                               mensaje[1] = "Datos Dados de alta correctamente para el alumno\t"+datos[2]+rs2.getString("Nombre");
                               return mensaje;

                           }
                           else
                           {
                              mensaje[0] = "0";
                              mensaje[1] = "Error al registrar al aspirante \t"+datos[2]+"-"+rs2.getString("Nombre");
                              return mensaje;              
                           }


                        }
                        else
                       {
                           mensaje[0] = "0";
                           mensaje[1] = "Alumno con el ID:\t"+datos[2]+"\t y nombre\t"+rs2.getString("Nombre")+"\t ya fue calificado";
                           return mensaje;

                       }




                    } catch (SQLException ex) {
                        Logger.getLogger(VO.class.getName()).log(Level.SEVERE, null, ex);
                        System.err.println("MEnsaje:"+ ex.getMessage());
                        
                    }
            }
            else
            {
                mensaje[0] = "0";
                mensaje[1] = "Error con el servidor";
                return mensaje;
            }

            
       }
         return null;
        
    }
   
   
   public String[] regitroCE(String datosA)
    {
        String [] mensaje = new String[2];
         try {
             
            PreparedStatement pS2 = cn.prepareStatement("SELECT * \n" +
                                                        "FROM  `calificaciones` \n" +
                                                        "WHERE \n" +
                                                        "`Nombre` =  '"+datosA+"'");
            
            ResultSet rs2 = pS2.executeQuery();
            
            if(!rs2.next())
             {
                 pS = cn.prepareStatement("INSERT INTO  `sear`.`calificaciones` (\n" +
                                            "`Id_Calificacion` ,\n" +
                                            "`Nombre`\n" +
                                            ")\n" +
                                            "VALUES (\n" +
                                            "NULL ,  '"+datosA+"'\n" +
                                            ");");
         
                 System.out.println("INSERT INTO  `sear`.`calificaciones` (\n" +
                                            "`Id_Calificacion` ,\n" +
                                            "`Nombre`\n" +
                                            ")\n" +
                                            "VALUES (\n" +
                                            "NULL ,  '"+datosA+"'\n" +
                                            ");");
                 
                int n = pS.executeUpdate();

                if(n>0)
                {
                    mensaje[0] = "1";
                    mensaje[1] = "Datos Dados de alta correctamente";
                    return mensaje;

                }
                else
                {
                   mensaje[0] = "0";
                   mensaje[1] = "Error al registrar al aspirante";
                   return mensaje;              
                }
                        
                 
             }
             else
            {
                mensaje[0] = "0";
                mensaje[1] = "El pago de este alumno ya registrado";
                return mensaje;
                
            }
                
             
             
             
         } catch (SQLException ex) {
             Logger.getLogger(VO.class.getName()).log(Level.SEVERE, null, ex);
             System.err.println("MEnsaje:"+ ex.getMessage());
             mensaje[0] = "0";
             mensaje[1] = "Error con el servidor";
             return mensaje;
         }
        
    }


   public String modificarCE(String datos[])
    {

        
         try {
             pS = cn.prepareStatement("UPDATE  `sear`.`calificaciones` SET  `Nombre` =  '"+datos[1]+"' "
                     + "WHERE  `calificaciones`.`Id_Calificacion` = '"+datos[0]+ "'");
             
             
           System.out.println(" UPDATE  `sear`.`calificaciones` SET  `Nombre` =  '"+datos[1]+"'"
                   + " WHERE  `calificaciones`.`Id_Calificacion` = '"+datos[0]+ "'");
           
             int rs = pS.executeUpdate();
             
             if(rs>0)
             {
                 return "Actualización Correctamente";
             }
             else
             {
                 return "Error al registrar intente mas tarde";
             }
             
             
         } catch (SQLException ex) {
             Logger.getLogger(VO.class.getName()).log(Level.SEVERE, null, ex);
             System.err.println("Mensaje: "+ex.getMessage());
             return "Error con el servidor";
         }
        
        
    }

   public String EliminarCE(String datos)
    {
        
        try 
        {
            pS = cn.prepareStatement("DELETE FROM `calificaciones` WHERE `Id_Calificacion` = '"+datos+"' ");
         
            System.out.println("DELETE FROM 'calificaciones' WHERE 'calificaciones'.'Id_Calificacion' = '"+datos+"'");
            int n = pS.executeUpdate();
             
            if(n>0)
            {
                return "Dado de baja correctamente";
            }
            else
                return "Error al dar de baja";

         } catch (SQLException ex) {
             Logger.getLogger(VO.class.getName()).log(Level.SEVERE, null, ex);
             System.err.println("MEnsaje:"+ ex.getMessage());
             return "Error con la base de datos";
         }
        
        
    }
   
   
   public String[] datosCaliD(String dato[])
   {
        
        
        String[] datos;
        int contador= 0;
        int i;
        

        try {
             
             pS = cn.prepareStatement("SELECT DISTINCT  `alumno_aspirante`.`Id_alumno` ,  `alumno_aspirante`.`ap_pat` ,  `alumno_aspirante`.`ap_mat` ,  `alumno_aspirante`.`Nombre` ,  `calificacion` \n" +
                            "FROM  `calificaciones` ,  `alumno_aspirante` ,  `grupos` ,  `usuarios` ,  `controlcalificacion` \n" +
                            "WHERE  `alumno_aspirante`.`Id_grupo` =  `grupos`.`Id_grupo` \n" +
                            "AND  `usuarios`.`id_usuario` =  `grupos`.`Id_profesor` \n" +
                            "AND  `grupos`.`Id_profesor` =  '"+dato[0]+"'\n" +
                            "AND  `alumno_aspirante`.`Id_alumno` =  `controlcalificacion`.`Id_alumno` \n" +
                            "AND  `calificaciones`.`Id_Calificacion` =  `controlcalificacion`.`Id_Calificacion` \n" +
                            "AND  `usuarios`.`id_usuario` =  `controlcalificacion`.`Id_profesor` \n" +
                            "AND  `Bimestre` =  '"+dato[1]+"'\n" +
                            "AND  `calificaciones`.`Id_Calificacion` =  '"+dato[2]+"'\n" +
                            "ORDER BY  `alumno_aspirante`.`ap_pat` ASC ");
             
             System.out.println("SELECT DISTINCT  `alumno_aspirante`.`Id_alumno` ,  `alumno_aspirante`.`ap_pat` ,  `alumno_aspirante`.`ap_mat` ,  `alumno_aspirante`.`Nombre` ,  `calificacion` \n" +
                                        "FROM  `calificaciones` ,  `alumno_aspirante` ,  `grupos` ,  `usuarios` ,  `controlcalificacion` \n" +
                                        "WHERE  `alumno_aspirante`.`Id_grupo` =  `grupos`.`Id_grupo` \n" +
                                        "AND  `usuarios`.`id_usuario` =  `grupos`.`Id_profesor` \n" +
                                        "AND  `grupos`.`Id_profesor` =  '"+dato+"'\n" +
                                        "AND  `alumno_aspirante`.`Id_alumno` =  `controlcalificacion`.`Id_alumno` \n" +
                                        "AND  `calificaciones`.`Id_Calificacion` =  `controlcalificacion`.`Id_Calificacion` \n" +
                                        "AND  `usuarios`.`id_usuario` =  `controlcalificacion`.`Id_profesor` \n" +
                                        "ORDER BY  `alumno_aspirante`.`ap_pat` ASC");
             
             ResultSet rs = pS.executeQuery();
             
                         
             while(rs.next())
             {
                 contador += 1;
                 System.out.println("no."+ contador);
             }
             
             rs.first();
             
             datos = new String [contador];
             
            for(i=0;i<contador;i++)
             {
               
                 datos[i] = rs.getString("Id_alumno").concat("¬").concat(rs.getString("ap_pat")).concat("-").concat(rs.getString("ap_mat")).concat("-").concat(rs.getString("Nombre").concat("-").concat(rs.getString("calificacion").toString()));
                 rs.next();
                 System.out.println("datos: "+datos[i]);
             }
             
             return datos;
        
         } catch (SQLException ex) {
             Logger.getLogger(VO.class.getName()).log(Level.SEVERE, null, ex);
             System.err.println("Este es un error: \t"+ex.getMessage());
             return null;
         }
        
        
    }
   
   
   
   //********************Gestion de Grupos********************//
   
   
   
   public String[] datosGruposv()
   {
        
        
        String[] datos;
        int contador= 0;
        int i;
        

        try {
             
             pS = cn.prepareStatement("SELECT `Id_grupo`,`Grado` FROM `grupos`");
             
           
             
             ResultSet rs = pS.executeQuery();
             
                         
             while(rs.next())
             {
                 contador += 1;
                 System.out.println("no."+ contador);
             }
             
             rs.first();
             
             datos = new String [contador];
             
            for(i=0;i<contador;i++)
             {
               
                 datos[i] = rs.getString("Id_grupo").concat("-").concat(rs.getString("Grado"));
                 rs.next();
                 System.out.println("datos: "+datos[i]);
             }
             
             return datos;
        
         } catch (SQLException ex) {
             Logger.getLogger(VO.class.getName()).log(Level.SEVERE, null, ex);
             System.err.println("Este es un error: \t"+ex.getMessage());
             return null;
         }
        
        
    }
   
   
   public String[] datosGruposP()
   {
        
        
        String[] datos;
        int contador= 0;
        int i;
        

        try {
             
             pS = cn.prepareStatement("SELECT  `Id_grupo` ,  `Grado` ,  `Id_profesor` ,  `Nombre` \n" +
                                    "FROM  `grupos` ,  `usuarios` \n" +
                                    "WHERE  `usuarios`.`id_usuario` =  `grupos`.`Id_profesor`");
             
           
             
             ResultSet rs = pS.executeQuery();
             
                         
             while(rs.next())
             {
                 contador += 1;
                 System.out.println("no."+ contador);
             }
             
             rs.first();
             
             datos = new String [contador];
             
            for(i=0;i<contador;i++)
             {
               
                 datos[i] = rs.getString("Id_grupo").concat("-").concat(rs.getString("Grado")).concat(rs.getString("Id_profesor")).concat("¬").concat(rs.getString("Nombre"));
                 rs.next();
                 System.out.println("datos: "+datos[i]);
             }
             
             return datos;
        
         } catch (SQLException ex) {
             Logger.getLogger(VO.class.getName()).log(Level.SEVERE, null, ex);
             System.err.println("Este es un error: \t"+ex.getMessage());
             return null;
         }
        
        
    }
   public String[] regitroG(String datosA[])
    {
        String [] mensaje = new String[2];
         try {
             
            PreparedStatement pS2 = cn.prepareStatement("SELECT * \n" +
                                                    "FROM  `grupos` \n" +
                                                    "WHERE  `Grado` =  '"+datosA[0]+"'");
            
            ResultSet rs2 = pS2.executeQuery();
            
            if(!rs2.next())
             {
                 pS = cn.prepareStatement("INSERT INTO  `sear`.`grupos` (\n" +
                                            "`Id_grupo` ,\n" +
                                            "`Grado` ,\n" +
                                            "`Id_profesor`\n" +
                                            ")\n" +
                                            "VALUES (\n" +
                                            "NULL,  '"+datosA[0]+"',  '"+datosA[1]+"'\n" +
                                            ");");
         
                 System.out.println("INSERT INTO  `sear`.`grupos` (\n" +
                                            "`Id_grupo` ,\n" +
                                            "`Grado` ,\n" +
                                            "`Id_profesor`\n" +
                                            ")\n" +
                                            "VALUES (\n" +
                                            "'NULL',  '"+datosA[0]+"',  '"+datosA[1]+"'\n" +
                                            ");");
                 
                int n = pS.executeUpdate();

                if(n>0)
                {
                    mensaje[0] = "1";
                    mensaje[1] = "Datos Dados de alta correctamente";
                    return mensaje;

                }
                else
                {
                   mensaje[0] = "0";
                   mensaje[1] = "Error al registrar el grupo";
                   return mensaje;              
                }
                        
                 
             }
             else
            {
                mensaje[0] = "0";
                mensaje[1] = "El grupo ya esta registrado";
                return mensaje;
                
            }
                
             
             
             
         } catch (SQLException ex) {
             Logger.getLogger(VO.class.getName()).log(Level.SEVERE, null, ex);
             System.err.println("MEnsaje:"+ ex.getMessage());
             mensaje[0] = "0";
             mensaje[1] = "Error con el servidor";
             return mensaje;
         }
        
    }


   public String modificarG(String datos[])
    {

        
         try {
             pS = cn.prepareStatement("UPDATE  `sear`.`grupos` SET  `Grado` =  '"+datos[1]+"' WHERE  `grupos`.`Id_grupo` =' "+datos[0]+"'");
             
             
           System.out.println(" UPDATE  `sear`.`calificaciones` SET  `Nombre` =  '"+datos[1]+"'"
                   + " WHERE  `calificaciones`.`Id_Calificacion` = '"+datos[0]+ "'");
           
             int rs = pS.executeUpdate();
             
             if(rs>0)
             {
                 return "Actualización Correctamente";
             }
             else
             {
                 return "Error al registrar intente mas tarde";
             }
             
             
         } catch (SQLException ex) {
             Logger.getLogger(VO.class.getName()).log(Level.SEVERE, null, ex);
             System.err.println("Mensaje: "+ex.getMessage());
             return "Error con el servidor";
         }
        
        
    }

   public String EliminarG(String datos)
    {
        
        try 
        {
            pS = cn.prepareStatement("DELETE FROM `grupos` WHERE `Id_grupo` = '"+datos+"' ");
         
            System.out.println("DELETE FROM `grupos` WHERE `Id_grupo` = '"+datos+"' ");
            int n = pS.executeUpdate();
             
            if(n>0)
            {
                return "Dado de baja correctamente";
            }
            else
                return "Error al dar de baja";

         } catch (SQLException ex) {
             Logger.getLogger(VO.class.getName()).log(Level.SEVERE, null, ex);
             System.err.println("MEnsaje:"+ ex.getMessage());
             return "Error con la base de datos";
         }
        
        
    }


}
