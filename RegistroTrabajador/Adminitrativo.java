import java.util.Scanner;

import javax.print.Doc;

import java.util.ArrayList;
public class Main{
    public static void main(String [] args){
        
        ArrayList<Personal> listado = new ArrayList<Personal>();
        Scanner entrada = new Scanner(System.in);
        Scanner ent2 = new Scanner(System.in);
        
        int opcion;
        //datos auxiliares necesarios
        String nom = "";
        int numeroEmpleado;
        String apPaterno;
        String apMaterno;
        String nombre;
        String fechaNacimiento;
        String fechaIngreso;
        double sueldoBase;
        double montoBeca;
        double vales;
        boolean bandera = true;

        // este while es para ciclar el menú 

        while(bandera){

        System.out.println("Bievenido");
        System.out.println("Selecciona la opcion deseada");
        System.out.println("1.Docente");
        System.out.println("2.Administrativo");
        System.out.println("3.salir");
        opcion = entrada.nextInt();


        
        if(opcion == 1){

            int subop = 0;

            System.out.println("1.Registrar");
            System.out.println("2.Ver listado");
            System.out.println("3.Buscar Docente");

            subop = entrada.nextInt();

            

            switch(subop){

                case 1:
                System.out.println("Numero de empleado:");
                numeroEmpleado = entrada.nextInt();
                System.out.println("Apellido Paterno");
                apPaterno = ent2.nextLine();
                System.out.println("Apellido Materno");
                apMaterno = ent2.nextLine();
                System.out.println("Nombre");
                nombre = ent2.nextLine();
                System.out.println("Fecha de Nacimiento");
                fechaNacimiento = ent2.nextLine();
                System.out.println("Fecha Ingreso");
                fechaIngreso = ent2.nextLine();
                System.out.println("Sueldo Base");
                sueldoBase = ent2.nextDouble();
                System.out.println("Monto de Beca");
                montoBeca = ent2.nextDouble();
       
                Personal nuevo = new Docente(numeroEmpleado, apPaterno, apMaterno, nombre, fechaNacimiento, fechaIngreso, sueldoBase,montoBeca);
                listado.add(nuevo);

                
                break;
                case 2: 

                if(listado.size()  <= 0){
                    System.out.println("Aun no hay registros");
                }

                else{

                System.out.println("El listado es:");

                

            
                for(Personal i: listado){
                    if(i instanceof Docente){

                        i.calculaImpuestos();

                    }
                    
                }

                for(Personal j: listado){

                    if(j instanceof Docente){
                    j.muestraDatos();
                    j.calculaPagoNeto();

                    }
                }

                }

                
                
                break;
                case 3: 



                System.out.println("Ingresa el nombre a buscar :");
                nom = entrada.nextLine();


                for(Personal i: listado){

    
                    if(i.nombre == nom){
                        i.calculaImpuestos();
                        i.muestraDatos();
                        i.calculaPagoNeto();
                    }

                    
                }
                
                break;
                default:System.out.println("Opcion no valida"); break;

            }

        }
        else if(opcion == 2){

            int op2 = 0;

            System.out.println("1.Registrar");
            System.out.println("2.Ver listado");
            System.out.println("3.Buscar Docente");

            op2 = entrada.nextInt();

            switch(op2){

                case 1:

                Scanner ent3 = new Scanner(System.in);
                
                System.out.println("Numero de empleado:");
                numeroEmpleado = ent3.nextInt();

                System.out.println("Sueldo Base");
                sueldoBase = ent3.nextDouble();
                System.out.println("Monto de vales");
                vales = ent3.nextDouble();

                ent3.skip("\n");
                System.out.println("Apellido Paterno ");
 
                apPaterno = ent3.nextLine();

                System.out.println("Apellido Materno ");

                apMaterno = ent3.nextLine();
                System.out.println("Nombre");

                nombre = ent3.nextLine();
                System.out.println("Fecha de Nacimiento");
                fechaNacimiento = ent3.nextLine();
                System.out.println("Fecha Ingreso");
                fechaIngreso = ent3.nextLine();
              

                Personal nuev = new Adminitrativo(numeroEmpleado, apPaterno, apMaterno, nombre, fechaNacimiento, fechaIngreso, sueldoBase, vales);
                listado.add(nuev);

                break;
                case 2:

                if(listado.size() <= 0){

                    System.out.println("Aun no hay registros");

                }

                else{

                



                for(Personal i: listado){

                    if(i instanceof Adminitrativo){

                    if(i.nombre == nom){
                        i.calculaImpuestos();
                        i.muestraDatos();
                        i.calculaPagoNeto();
                    }

                    }

                  
                }

                }
                
                
                break;
                case 3:
      

                for(Personal i: listado){

    
                    if(i.nombre == nom){
                        i.calculaImpuestos();
                        i.muestraDatos();
                        i.calculaPagoNeto();
                    }

                    
                }
            
                
                break;
                default:System.out.println("Opcion no valida"); break;


            }
            
        }

        else if(opcion == 3){

            System.out.println("Hasta luego :)"); bandera = false;

        }


        else{

            System.out.println("Elige una opcion valida");


        }


        

        

    }

    }
}