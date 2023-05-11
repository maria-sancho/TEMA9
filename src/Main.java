import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Futbolista f1 = new Futbolista("11111111A", "Lionel Messi", 34, 672);
        Futbolista f2 = new Futbolista("22222222B", "Cristiano Ronaldo", 36, 675);
        Futbolista f3 = new Futbolista("33333333C", "Neymar Jr", 29, 181);
        Futbolista f4 = new Futbolista("44444444D", "Kylian Mbappé", 25, 200);

        Comparator<Futbolista> comparadorEdadNombre = new Comparator<Futbolista>() {
            public int compare(Futbolista f1, Futbolista f2) {
                int resultado = Integer.compare(f1.getEdad(), f2.getEdad());
                if (resultado == 0) {
                    resultado = f1.getNombre().compareTo(f2.getNombre());
                }
                return resultado;
            }
        };

    }}