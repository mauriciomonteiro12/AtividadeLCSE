package ListaCircularSimplesmenteEncadeada;

public class Main {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();

        // Adicionando elementos à lista
        System.out.println("Adicionando elementos à lista:");
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("Lista: " + list.display());

        // Removendo um elemento
        System.out.println("Removendo 20 da lista:");
        list.remove(20);
        System.out.println("Lista após remoção: " + list.display());

        // Removendo o cabeçalho
        System.out.println("Removendo 10 da lista:");
        list.remove(10);
        System.out.println("Lista após remoção: " + list.display());
    }
}