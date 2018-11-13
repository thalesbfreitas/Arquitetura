package dataBase;
import java.sql.Connection; 
import java.sql.SQLException; 


public class testeConecxao {
  public static void main(String[] args) throws SQLException {
         Connection connection = conexaoBanco.getConnection();
         System.out.println("Conexão aberta!");
         connection.close();
    }
}
