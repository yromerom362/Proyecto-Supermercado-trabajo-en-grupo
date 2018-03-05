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


public class Limpieza extends Empleado{


    public Limpieza(String n, String cc, String c){  
        super(n,cc,c,"Limpieza"); 
    }


    @Override
    public double salarioDiario( ){  
          return 26041.4; 
    } 
} 
