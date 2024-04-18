/*!********************************************************
 *  Bank 
 * =====
 * @author: Randolfo A Gonçalves
 * @since:  06/02/24
 * @file:   Category.java 
 *
 * Classe dedicada para conexão com banco
***********************************************************/

import java.sql.Statement;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class Bank{
// Fields
// ======
    protected Connection cnt  = null;    
    protected Statement  stt  = null;

// Build
// =====
    Bank(){}
    Bank(String url){ _connect(format(url)); }

// Connection
// ========== 
    protected
    void _connect(String url){
        try{ cnt=DriverManager.getConnection(url);
             stt=cnt.createStatement();
        }catch(SQLException e){ msg(e);  }
    }

    void disconnet(){
        try{ if(cnt != null) cnt.close();       }
        catch(SQLException e){ msg(e); }
    }
    
    
    protected void msg(SQLException e){ System.err.println(e);}
    protected void msg(IOException e){  System.err.println(e);}
    
    protected String format(String url){ return "jdbc:sqlite:"+url; }
}
