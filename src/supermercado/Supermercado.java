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

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Supermercado {

    
    public static void main(String[] args) {
        
        //Definimos variables locales para uso en la clase principal
         double salario=0, ventas=0;
         int p, horas=0;
         String otra="", nombre, cedula,ciudad, puesto = null;
         boolean control= false;
         
         DecimalFormat df = new DecimalFormat("0.00"); 
 
         
         do{
                //Pedimos los datos al usuario
                nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado.");
                cedula = JOptionPane.showInputDialog("Ingrese la cédula del empleado.");
                ciudad = JOptionPane.showInputDialog("Ingrese la ciudad del empleado.");
                p = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el puesto del empleado:"
                        + "\n 1.Cajero"
                        + "\n 2.Limpieza"
                        + "\n 3.Mostrador"));

                //Evaluamos el tipo de puesto del empleado
                switch (p){
                    case 1:  // Se seleccionó cajero
//                        puesto = "Cajero";
                        horas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas trabajadas del empleado."));
                        Cajero objCajero = new Cajero(nombre, cedula,ciudad, horas);
                        ciudad = objCajero.ciudad();
                        puesto = objCajero.puesto();
                        salario = objCajero.salarioDiario();
                        control = true;
                        
                        break;
                                                
                    case 2:  // Se seleccionó limpieza
//                        puesto = "Limpieza";
                        Limpieza objLimpieza = new Limpieza(nombre, cedula,ciudad);
                        ciudad = objLimpieza.ciudad();
                        puesto = objLimpieza.puesto();
                        salario = objLimpieza.salarioDiario();
                        control = true;
                        break;
                    
                    case 3:  // Se seleccionó mostrador
//                        puesto = "Mostrador";
                        ventas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las ventas diarias del empleado."));
                        Mostrador objMostrador = new Mostrador(nombre, cedula,ciudad, ventas);
                        ciudad = objMostrador.ciudad();
                        puesto = objMostrador.puesto();
                        salario = objMostrador.salarioDiario();
                        control = true;
                        break;
                    
                    default:
                           JOptionPane.showMessageDialog(null, "Ha seleccionado un cargo incorrecta");
                        control = false;

                }
                
                if (control){
                    JOptionPane.showMessageDialog(null, "Los datos del empleado son:"
                            + "\n NOMBRE: " + nombre
                            + "\n CÉDULA: "  + cedula
                            + "\n CIUDAD: " + ciudad
                            + "\n PUESTO: " + puesto
                            + "\n SALARIO DIARIO: " + salario
                            + "\n SALARIO MES: "+ salario*30
                            + "\n SALUD Y PENSION: "+ (salario*30)*0.08
                            + "\n TOTAL A PAGAR: "+ (salario*30 - ((salario*30)*0.08)));
                }

                //Le pregunto al usuario si desea ingresar otro empleado
                otra =JOptionPane.showInputDialog("¿Desea ingresar otro empleado (S/N)?");
                
         }while (otra.equalsIgnoreCase("s"));
         
         
         
        
        
    }
}
