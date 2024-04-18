/**
 *  Rules SQL 
 *  =========
 * @author: Randolfo A Gonçalves
 * @since:  06/02/24
 * @file:   Category.java 
 *
 * Enumerador para regras sql precarregadas.
*/


enum Sql{
// Category -> (C_)
// ================
    C_INSERT,   
    C_UPDATE,    
    C_DELETE,    
    C_SELECT,

// Type -> (T_)
// ============
    T_INSERT,  
    T_UPDATE,                
    T_DELETE,   
    T_SELECT;

    public static int size=8; //< Número de instruções.
}
