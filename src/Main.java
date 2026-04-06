public class Main {
    public static void main(String[] args) {
        ListaCircularDuplamenteEncadeada lista = new ListaCircularDuplamenteEncadeada();

        System.out.println("=== Inserindo no final ===");
        lista.addElemento(10);
        lista.addElemento(20);
        lista.addElemento(30);
        lista.exibir();
        System.out.println("Tamanho: " + lista.size());

        System.out.println("\n=== Inserindo 5 no início (índice 0) ===");
        lista.add(0, 5);
        lista.exibir();
        System.out.println("Tamanho após add: " + lista.size());

        System.out.println("\n=== Inserindo 15 no índice 2 ===");
        lista.add(2, 15);
        lista.exibir();
        System.out.println("Tamanho após add: " + lista.size());

        System.out.println("\n=== Removendo índice 0 ===");
        lista.remove(0);
        lista.exibir();
        System.out.println("Tamanho após remove: " + lista.size());
    }
}