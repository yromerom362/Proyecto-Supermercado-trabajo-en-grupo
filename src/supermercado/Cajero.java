
/*Trabajo en Grupo Guia 2
//Proyecto desarrollado con lenguaje de programación Java "Supermercado" 
//*Autores
//HARBEY JAIR GUERRERO BULLA
//CAMILO ANDRES SERRANO QUINTERO 
//YEISSON ROMERO MANCIPE 
//Universidad EAN
//Construccion de Software
*/
package supermercado;


public class Cajero extends Empleado{ 
   
    protected int  horasTrabajadas;
   
    public Cajero(String n, String cc, String c, int hT){  
            super(n,cc,c,"Cajero"); 
             horasTrabajadas = hT; 
    }


   public double salarioDiario( ){  
            return (3256.18 * horasTrabajadas); 
    } 
}

