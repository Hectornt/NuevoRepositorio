public class App {
    public static void main(String[] args) throws Exception {

        int intNumero1 = 1;
        int intNumero2 = 2;
        int intSuma = 0;
        int intCantidadGenerada = 10;
        int i = 0;
        while (i < intCantidadGenerada) {
            intSuma = intNumero1 + intNumero2;
            intNumero1 = intNumero2;
            intNumero2 = intNumero2 + 1;
            i++;
            System.out.println(i + "._" + intSuma);

        }

    }
}
