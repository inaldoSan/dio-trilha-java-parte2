public class Main {
    public static void main(String[] args) {
        Fila<String> minhaFila = new Fila<>();
        minhaFila.enqueueo("primeiro");
        minhaFila.enqueueo("segundo");
        minhaFila.enqueueo("terceiro");
        minhaFila.enqueueo("quarto");
        System.out.println(minhaFila);
        System.out.println(minhaFila.dequeue());
        System.out.println(minhaFila);
    }
}
