/*
U Fidelitas
Introducción a la Programación 
Pablo Fernández Calderón
12/2
Programa: Aplicación de conocimientos II.
 */
package proyectofinalprogramacion;

import javax.swing.JOptionPane;

public class ProyectoFinalProgramacion 
{
    
    public static void main(String[] args) 
    {
        // Se realiza el menú de opciones
        JOptionPane.showMessageDialog(null,"Hola usuario, elija una de las siguientes opciones");
        JOptionPane.showMessageDialog(null,"1.Ingrese sus datos personales");
        JOptionPane.showMessageDialog(null,"2.Elija que productos desea");
        JOptionPane.showMessageDialog(null,"3.Salir del sistema");
        int opcion=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número de la opción requerida "));
        
        if (opcion==1)
        {
            Datos_Personales();    
        }
        if (opcion==2)
        {
            Productos();
        }
        if (opcion==3)
        {
           Salir(); 
        }


    }
        public static void Datos_Personales()//Esta clase se utiliza para recuadar los datos del estudiante
        {
                JOptionPane.showMessageDialog(null, "Se le solicitarán los datos usuario");

                String cedula= JOptionPane.showInputDialog("Escriba la cédula");
                String nombre=JOptionPane.showInputDialog("Escriba el nombre");
                String apellidos = JOptionPane.showInputDialog("Escriba los apellidos");

                 JOptionPane.showMessageDialog(null, "Usuario "+nombre+" "+apellidos+" , cedula "+cedula);

        }
        
        public static void Productos()//Se utiliza una clase externa para realizar este apartado
        {
            Productos FIDE1=new Productos();
          
        }
        
        public static void Salir()
            {
               JOptionPane.showMessageDialog(null,"Usted ha salido del sistema"); 
            }
}
