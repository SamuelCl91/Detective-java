import java.util.Scanner;

public class Espia
{
    protected String nombreClave;
    protected int reportesEnviados;
    protected String destinoActual;

    public Espia(String nombreClave, int reportesEnviados, String destinoActual)
    {
        this.nombreClave = nombreClave;
        this.reportesEnviados = reportesEnviados;
        this.destinoActual = destinoActual;
    }

    public void enviarReporte()
    {
        reportesEnviados++;
        System.out.println("El agente envía el reporte número " + reportesEnviados + " hacia " + destinoActual + ".");
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Espia agente = new Espia("Tinta Invisible", 0, "Estación Central");
        agente.enviarReporte();

        System.out.println("\nExpediente nuevo:");
        System.out.print("Nombre en clave: ");
        String nombreClave = sc.nextLine();

        System.out.print("Destino actual: ");
        String destinoActual = sc.nextLine();

        System.out.print("Reportes enviados iniciales: ");
        int reportesEnviados = sc.nextInt();
        sc.nextLine();

        Espia nuevoAgente = new Espia(nombreClave, reportesEnviados, destinoActual);
        System.out.println("\nInformación registrada:");
        nuevoAgente.enviarReporte();

        sc.close();
    }
}
