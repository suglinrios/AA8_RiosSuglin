
import java.util.ArrayList;

public class PrincipalProyecto {

    public static void main(String[] args) {

        System.out.println("Estudiante: Suglin Ríos Aguilar");
        System.out.println("Curso: IC2101 - Programación Orientada a Objetos");
        System.out.println("Actividad: AA8");
        System.out.println("----------------------------------------");

        Persona a, b, e, f, g, h, i, j;
        Proyecto c, d;
        Entregable e1, e2, e3;

        ArrayList<Comparable> personas;
        ArrayList<Comparable> proyectos;

        a = new Persona("123456", "Leopoldo Octavio de Montferrat y Cifuentes");
        b = new Persona("7891011", "Isadora Celeste de Alencourt y Villamediana");
        e = new Persona("35677784", "María Asunción Aramburuzabala Ramírez");
        f = new Persona("689471", "Juan Pablo Larrea Chedraui");
        g = new Persona("2548369", "Ximena del Mar Legorreta Ureña");
        h = new Persona("4789658", "Luis Alberto Requene Coen");
        i = new Persona("5897123", "Carlos Eduardo Pellas Chamorro");
        j = new Persona("5897123", "Ximena Delia Calatrava Mosquera");
        
        c = new Temporal("Implementación ERP", 100, 12, 10.0);
        d = new Permanente("Mantenimiento Infraestructura", 200, 50, 0.10);

        c.asignarEncargado(a);
        d.asignarEncargado(b);

        c.registrarIngreso(3000);
        c.registrarIngreso(600);
        d.registrarIngreso(800);

        e1 = new Entregable("Módulo Financiero", "A TIEMPO");
        e2 = new Entregable("Módulo Recursos Humanos", "RETRASADO");
        e3 = new Entregable("Revisión Servidores", "A TIEMPO");

        c.registrarEntregable(e1);
        c.registrarEntregable(e2);
        d.registrarEntregable(e3);

        System.out.println(c.toString());
        System.out.println(d.toString());

        System.out.println("La siguiente persona: " + a.toString() +
                " es encargado-a de un proyecto cuyo costo actual es: " +
                a.devolverCostoActualPrj());

        System.out.println("La siguiente persona: " + b.toString() +
                " es encargado-a de un proyecto cuyo costo actual es: " +
                b.devolverCostoActualPrj());

        personas = new ArrayList<Comparable>();
        proyectos = new ArrayList<Comparable>();

        personas.add(a);
        personas.add(b);
        personas.add(e);
        personas.add(f);
        personas.add(g);
        personas.add(h);
        personas.add(i);
        personas.add(j);

        proyectos.add(c);
        proyectos.add(d);

        Ordenamiento.ordenar(personas);
        Ordenamiento.ordenar(proyectos);

        System.out.println();

        System.out.println("== Personas (orden alfabético ascendente) ==");

        for (Comparable p : personas) {
            System.out.println(((Persona)p).getNombreCompleto());
        }

        System.out.println();

        System.out.println("== Proyectos (por costo actual ascendente) ==");

        for (Comparable prj : proyectos) {
            System.out.println(((Proyecto)prj).getCodigo() + " | " +
            ((Proyecto)prj).getNombre() + " | " +
            ((Proyecto)prj).calcularCostoActual());
        }

        System.out.println();
    }
}