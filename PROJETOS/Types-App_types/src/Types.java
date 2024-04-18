/*!**************************************************************
 *  Types
 * =======
 * @author: Randolfo A Gonçalves
 * @since:  03/02/24
 * @file:   Types.java 
 *
 * Classe dedicada para representação de tipos de dados.
****************************************************************/

public class Types extends Category{
   // Fields
   // ======
   private String  name    = "",
                   icon    = "",
                   example = "";
   
   private byte size = 0;
   
   private String max = "0.0";
   private String min = "0.0";

   // Builds 
   // ======
   public Types(){}
   public Types(String name){ this.name=name; }

   // Setting
   // =======
   public void set_size(byte size)         { this.size=size;       }
   public void set_name(String name)       { this.name=name;       }
   public void set_icon(String icon)       { this.icon=icon;       }
   public void set_example(String example) { this.example=example; }
   public void set_min(String min)         { this.min=min;         }
   public void set_max(String max)         { this.max=max;         }
   // Getting
   // =======
   public byte     get_size()    { return size;    }
   public String   get_name()    { return name;    }
   public String   get_icon()    { return icon;    }
   public String   get_example() { return example; }
   public String   get_min()     { return min;     }
   public String   get_max()     { return max;     }
   
}

