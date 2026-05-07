public class Forense
{
    protected String nombre;
    protected int edad;
    protected String experiencia;
    protected String especialidad;
    protected String genero;
    protected String nombreCadaver;
    protected String horaAutopsia;
    protected String estadoCuerpo;
    protected String equipoProteccion;

    public Forense(String nombre, int edad, String experiencia, String especialidad, String genero, String nombreCadaver, String horaAutopsia, String estadoCuerpo, String equipoProteccion)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.experiencia = experiencia;
        this.especialidad = especialidad;
        this.genero = genero;
        this.nombreCadaver = nombreCadaver;
        this.horaAutopsia = horaAutopsia;
        this.estadoCuerpo = estadoCuerpo;
        this.equipoProteccion = equipoProteccion;
    }

    public void analizarCuerpo()
    {
        System.out.println(nombre + " analiza el cuerpo de: " + nombreCadaver);
        System.out.println("Estado del cuerpo: " + estadoCuerpo);
    }

    public void deducirCausa()
    {
        System.out.println(nombre + " deduce la causa de muerte.");
    }

    public void tomarFotos()
    {
        System.out.println(nombre + " toma fotos del cadáver y la escena.");
    }

    public void generarInforme()
    {
        System.out.println("INFORME FORENSE");
        System.out.println("Forense: " + nombre);
        System.out.println("Cadáver: " + nombreCadaver);
        System.out.println("Hora de autopsia: " + horaAutopsia);
        System.out.println("Estado: " + estadoCuerpo);
    }

    public String obtenerInfo()
    {
        return nombre + " [Forense] - Especialidad: " + especialidad;
    }
}