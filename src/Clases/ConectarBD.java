/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Jesús Quezada
 */
public class ConectarBD {
   Connection conectar = null;
   
   public Connection conectar(){
       try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/usuarios","root","toor");
           JOptionPane.showMessageDialog(null,"La conexión ha sido establecida correctamente","Estado de la conexión",JOptionPane.INFORMATION_MESSAGE);
       } catch (ClassNotFoundException | SQLException e) {
         
           JOptionPane.showMessageDialog(null,"No se ha podido establecer la conexión "+e,"Estado de la conexión",JOptionPane.ERROR_MESSAGE); 
       }
       return conectar;
   }
    
}
