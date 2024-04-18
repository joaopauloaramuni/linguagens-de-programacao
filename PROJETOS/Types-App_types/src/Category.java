/*!****************************************************************
 *  Category
 * ==========
 * @author: Randolfo A Gonçalves
 * @since:  03/02/24
 * @file:   Category.java 
 *
 * Classe dedicada para classificação e agrupamento de Types.
******************************************************************/

public class Category {
    // Fields
    // ======
    private String name  = "",
                   color = "",
                   brief = "";
    // Setting
    // =======
    public void set_color(String color)          { this.color=color; }
    public void set_category_name(String name)   { this.name=name;   } 
    public void set_category_brief(String brief) { this.brief=brief; }  
    
    // Getting
    // =======
    public String get_color()          { return color; }
    public String get_category_name()  { return name;  } 
    public String get_category_brief() { return brief; } 

}
