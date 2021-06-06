public class Docente extends Personal {

    double sueldoBase;
    double montoBeca;
    double sueldoNeto;

    public Docente(int numeroEmpleado,String apPaterno,String apMaterno,String nombre,String fechaNacimiento,String fechaIngreso,double sb,double mb){
        super(numeroEmpleado, apPaterno, apMaterno, nombre, fechaNacimiento, fechaIngreso);
        this.sueldoBase = sb;
        this.montoBeca = mb;
        this.sueldoNeto = 0;

    }

    public  void muestraDatos(){

        System.out.println(this.numeroEmpleado);
        System.out.println(this.apPaterno);
        System.out.println(this.apMaterno);
        System.out.println(this.nombre);
        System.out.println(this.fechaNacimiento);
        System.out.println(this.fechaIngreso);
        System.out.println(this.sueldoBase);
        System.out.println(this.montoBeca);


    }
    public  void calculaImpuestos(){

        this.sueldoNeto = this.sueldoBase  - (0.15 * this.sueldoBase);
        this.sueldoNeto = this.sueldoNeto + this.montoBeca;

    }
    public  void calculaPagoNeto(){
        System.out.println(this.sueldoNeto);

    }






    
}
