/*!*****************************************************************
 *  Bank_Types 
 *  ==========
 * @author: Randolfo A Gonçalves
 * @since:  06/02/24
 * @file:   Category.java 
 *
 * Classe dedicada para operações CRUD no banco de dados:
*******************************************************************/
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Query extends Bank{
    //! Conteiner de regras sql:
    private 
    Map<Sql,String> query = new HashMap<Sql,String>();
    
    //! Inicializa o conteiner lendo o file querys.sqlite
    private
    void init(List<String> line,int i){ while(++i<Sql.size)query.put(Sql.values()[i],line.get(i));} 
    
    //! Build Class Bank_Types:
    Query(){}
    Query(String path){ 
        super(path+"data.db"); 
        try{init(Files.readAllLines(Paths.get(path+"querys.sql")),-1);} 
        catch(IOException e){msg(e);}
    } 

    //  Category 
    // ==========
    
    void delete_ctg(String name){ 
        try{ PreparedStatement pstt=cnt.prepareStatement(query.get(Sql.C_DELETE));
             pstt.setString(1,name);        
             pstt.executeUpdate();
        
        }catch(SQLException e){msg(e);}  
    }
    
    void insert(Category ctg){ 
        try{ PreparedStatement pstt=cnt.prepareStatement(query.get(Sql.C_INSERT));
             pstt.setString(1,ctg.get_category_name());                
             pstt.setString(2,ctg.get_category_brief());
             pstt.setString(3,ctg.get_color());           
             pstt.executeUpdate();
        
        }catch(SQLException e){msg(e);}
    }

    void update(Category ctg){ 
        try{ PreparedStatement pstt=cnt.prepareStatement(query.get(Sql.C_UPDATE));
             pstt.setString(1,ctg.get_category_name());                
             pstt.setString(2,ctg.get_category_brief());
             pstt.setString(3,ctg.get_color());           
             pstt.setString(4,ctg.get_category_name());    
             pstt.executeUpdate();
        
        }catch(SQLException e){msg(e);}
    }

    Category select_ctg(String name){ 
        Category ctg=new Category();
        try{ 
             PreparedStatement pstt = cnt.prepareStatement(query.get(Sql.C_SELECT));
             pstt.setString(1,name);
             ResultSet rset=pstt.executeQuery();
             ctg.set_color(rset.getString("_color"));
             ctg.set_category_name(rset.getString("_name"));    
             ctg.set_category_brief(rset.getString("_brief"));

        }catch(SQLException sql){msg(sql);}
        return ctg;
    }

    ArrayList<Category> select_ALL(){
        ArrayList<Category> list = new ArrayList<Category>();
        try{
            ResultSet rset=stt.executeQuery("SELECT * FROM Categories");
            Category ctg = new Category();
            while(rset.next()){
                    ctg.set_color(rset.getString("_color"));
                    ctg.set_category_name(rset.getString("_name"));    
                    ctg.set_category_brief(rset.getString("_brief"));               
                list.add(ctg);
            } 
            return list;
        }catch(SQLException e){
            msg(e); 
            return null;
        }
    }

    //  Types 
    // =======
    
    void delete(String name){ 
        System.out.println(name);
        try{ PreparedStatement pstt=cnt.prepareStatement(query.get(Sql.T_DELETE));
             pstt.setString(1,name);        
             pstt.executeUpdate();
        }catch(SQLException e){msg(e);}  
    }
    
    void insert(Types type){ 
        try{ PreparedStatement pstt=cnt.prepareStatement(query.get(Sql.T_INSERT));
             pstt.setString(1,type.get_name());
             pstt.setString(2,type.get_category_name());
             pstt.setString(3,type.get_icon());
             pstt.setString(4,type.get_example());
             pstt.setByte(5,type.get_size());
             pstt.setString(6,type.get_min());
             pstt.setString(7,type.get_max());
             pstt.executeUpdate();
        
        }catch(SQLException e){msg(e);}
    }

    void update(Types type){ 
        try{ PreparedStatement pstt=cnt.prepareStatement(query.get(Sql.T_UPDATE));
             pstt.setString(1,type.get_name());
             pstt.setString(2,type.get_category_name());
             pstt.setString(3,type.get_icon());
             pstt.setString(4,type.get_example());
             pstt.setByte(5,type.get_size());
             pstt.setString(6,type.get_min());
             pstt.setString(7,type.get_max());
             pstt.setString(8,type.get_name()); 
             pstt.executeUpdate();
        
        }catch(SQLException e){msg(e);}
    }

    Types select(String name){ 
        Types type =new Types();
        
        try{ 
            
             PreparedStatement pstt=cnt.prepareStatement(query.get(Sql.T_SELECT));
             pstt.setString(1,name); 
             ResultSet rset=pstt.executeQuery();
             type.set_name(rset.getString("_name"));
             type.set_category_name(rset.getString("_name_ctg"));
             type.set_icon(rset.getString("_icon"));
             type.set_example(rset.getString("_exemple"));
             type.set_size(rset.getByte("_size"));
             type.set_min(rset.getString("_min"));
             type.set_max(rset.getString("_max"));
            
        }catch(SQLException sql){msg(sql);}
        
        return type;
    }



    ArrayList<Types> select_all(){
        ArrayList<Types> list = new ArrayList<Types>();
        try{
            ResultSet rset=stt.executeQuery("SELECT * FROM Kinds");
            while(rset.next()){
                Types type = new Types();
                type.set_name(rset.getString("_name"));
                type.set_category_name(rset.getString("_name_ctg"));
                type.set_icon(rset.getString("_icon"));
                type.set_example(rset.getString("_exemple"));
                type.set_size(rset.getByte("_size"));
                type.set_min(rset.getString("_min"));
                type.set_max(rset.getString("_max"));
                
                list.add(type);
            } 
            return list;
        }catch(SQLException e){
            msg(e);
            return null;
        }
    }

    Query connect(String url){ 
        try{ init(Files.readAllLines(Paths.get(url+"/sql/querys.sql")),-1);
             _connect(format(url));
        
        }catch(IOException e){msg(e);}
        return this; 
    } 
    
} 
