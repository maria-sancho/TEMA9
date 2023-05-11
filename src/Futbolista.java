import java.util.Comparator;

public class Futbolista implements Comparable<Futbolista> {
    private String dni;
    private String nombre;
    private int edad;
    private int numGoles;
    public Futbolista(String dni, String nombre, int edad, int numGoles) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.numGoles = numGoles;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumGoles() {
        return numGoles;
    }

    public void setNumGoles(int numGoles) {
        this.numGoles = numGoles;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Futbolista futbolista = (Futbolista) o;
        return dni.equals(futbolista.dni);
    }

    public String toString() {
        return "Futbolista{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", numGoles=" + numGoles +
                '}';
    }

    public int compareTo(Futbolista o) {
        return this.dni.compareTo(o.getDni());
    }

    public static Comparator<Futbolista> nombreComparator = new Comparator<Futbolista>() {
        public int compare(Futbolista f1, Futbolista f2) {
            return f1.getNombre().compareTo(f2.getNombre());
        }
    };

    public static Comparator<Futbolista> edadComparator = new Comparator<Futbolista>() {
        public int compare(Futbolista f1, Futbolista f2) {
            return Integer.compare(f1.getEdad(), f2.getEdad());
        }
    };

    public static Comparator<Futbolista> comparadorEdadNombre = new Comparator<Futbolista>() {
        public int compare(Futbolista f1, Futbolista f2) {
            int resultado = Integer.compare(f1.edad, f2.edad);
            if (resultado == 0) {
                resultado = f1.nombre.compareTo(f2.nombre);
            }
            return resultado;
        }
    };

}
