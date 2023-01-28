public class Tarea4 {

    public static void main(String[] args){


        Cliente c1 = new Cliente();

        c1.setCredito(1000);
        c1.setEdad(30);
        c1.setNombre("Pedro");
        c1.setTelefono("324893489");

        System.out.println(c1.getCredito());
        System.out.println(c1.getEdad());
        System.out.println(c1.getNombre());
        System.out.println(c1.getTelefono());

        Trabajador t1 = new Trabajador();

        t1.setEdad(20);
        t1.setNombre("Andres");
        t1.setTelefono("34823478");
        t1.setSalario(3000);

        System.out.println(t1.getSalario());
        System.out.println(t1.getEdad());
        System.out.println(t1.getNombre());
        System.out.println(t1.getTelefono());

    }

}
