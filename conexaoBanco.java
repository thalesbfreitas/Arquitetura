package dataBase;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 /**
 * @author Thales Freitas
 * @version 1.0 
 * Sistema Hoetalria - Aquitetura de Software
 **/
public class conexaoBanco {
    private static final String URL = "jdbc:mysql://localhost:3306/hotelaria";
    private static final String USUARIO = "root";
    private static final String SENHA = "123456";
    
    public static Connection getConnection()throws SQLException  {
	try {
            return DriverManager.getConnection(URL, USUARIO, SENHA);
	}         
	catch(SQLException excecao) {
            throw new RuntimeException(excecao);
	}
    }
}
