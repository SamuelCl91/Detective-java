public class Policia
{
    protected int id;
    protected String nombre;
    protected int edad;
    protected String genero;
    protected String especialidad;
    protected String direccion;
    protected int numero;
    protected String rango;
    protected String experiencia;
    protected String equipamiento;

    public Policia(int id, String nombre, int edad, String genero, String especialidad, String direccion, int numero, String rango, String experiencia, String equipamiento)
    {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.especialidad = especialidad;
        this.direccion = direccion;
        this.numero = numero;
        this.rango = rango;
        this.experiencia  = experiencia;
        this.equipamiento = equipamiento;
    }

    public void interrogar(String sospechoso)
    {
        System.out.println(nombre + " interroga a " + sospechoso);
    }

    public void investigar()
    {
        System.out.println(nombre + " investiga el lugar de los hechos.");
    }

    public void analizar()
    {
        System.out.println(nombre + " analiza las evidencias encontradas.");
    }

    public void deducir()
    {
        System.out.println(nombre + " deduce posibles hipótesis del caso.");
    }

    public void buscar()
    {
        System.out.println(nombre + " busca más pistas en el área.");
    }

    public void registrar()
    {
        System.out.println(nombre + " registra el lugar.");
    }

    public void tomarNotas()
    {
        System.out.println(nombre + " toma notas del caso.");
    }

    public void hacerInforme()
    {
        System.out.println(nombre + " redacta un informe policial.");
    }

    public void subirDatos()
    {
        System.out.println(nombre + " sube los datos al sistema.");
    }

    public void auditar()
    {
        System.out.println(nombre + " audita el expediente.");
    }

    public String obtenerInfo()
    {
        return nombre + " [" + rango + "] - Especialidad: " + especialidad;
    }
}
