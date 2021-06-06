public abstract class Personal {

    int numeroEmpleado;
    String apPaterno;
    String apMaterno;
    String nombre;
    String fechaNacimiento;
    String fechaIngreso;

    public Personal(int numeroEmpleado,String apPaterno,String apMaterno,String nombre,String fechaNacimiento,String fechaIngreso){

        this.numeroEmpleado = numeroEmpleado;
        this.apPaterno = apMaterno;
        this.apMaterno = apMaterno;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaIngreso = fechaIngreso;        

    }

    public abstract void muestraDatos();
    public abstract void calculaImpuestos();
    public abstract void calculaPagoNeto();


    
}
