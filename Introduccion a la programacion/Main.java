public class Main{
    public static void main(String args[]){
        Persona persona = new Persona();
        persona.setEdad(15);
        persona.setTelefono(1154326543);
        persona.setNombre("xd");
        System.out.println(persona.getEdad()) ;
        System.out.println(persona.getNombre());
        System.out.println(persona.getTelefono());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }
}
