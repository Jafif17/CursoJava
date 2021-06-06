
public class Administrativo extends Personal{

    double sueldoBase;
    double vales;
    double sueldoNeto;

    public Administrativo(int numeroEmpleado,String apPaterno,String apMaterno,String nombre,String fechaNacimiento,String fechaIngreso,double sb,double v){
        super(numeroEmpleado, apPaterno, apMaterno, nombre, fechaNacimiento, fechaIngreso);
        this.sueldoBase = sb;
        this.vales = v;
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
        System.out.println(this.vales);


    }
    public  void calculaImpuestos(){

        this.sueldoNeto = this.sueldoBase  - (0.12 * this.sueldoBase);
        this.sueldoNeto = this.sueldoNeto + this.vales;

    }
    public  void calculaPagoNeto(){
        System.out.println(this.sueldoNeto);

    }

    

    }