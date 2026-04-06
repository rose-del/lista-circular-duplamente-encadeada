public class ListaCircularDuplamenteEncadeada {
    Nodo primeiro;
    int tamanho;

    public ListaCircularDuplamenteEncadeada() {
        primeiro = null;
        tamanho = 0;
    }

    public int size() {
        return tamanho;
    }

    public void addElemento(int elemento) {
        Nodo novo = new Nodo(elemento);

        if (primeiro == null) {
            primeiro = novo;
            novo.proximo = primeiro;
            novo.anterior = primeiro;
        } else {
            Nodo ultimo = primeiro.anterior;

            // Encaixar o novo nó entre o último e o primeiro
            ultimo.proximo = novo;
            novo.anterior = ultimo;
            novo.proximo = primeiro;
            primeiro.anterior = novo;
        }
        tamanho++;
    }

    public Nodo get(int index) {
        if (index < 0 || index >= tamanho) {
            return null;
        }
        Nodo atual = primeiro;
        for (int i = 0; i < index; i++) {
            atual = atual.proximo;
        }
        return atual;
    }

    public void add(int index, int elemento) {
        if (index < 0 || index > tamanho) {
            return;
        }

        Nodo novo = new Nodo(elemento);

        if (index == 0) {
            if (primeiro == null) {
                primeiro = novo;
                novo.proximo = primeiro;
                novo.anterior = primeiro;
            } else {
                Nodo ultimo = primeiro.anterior;

                novo.proximo = primeiro;
                novo.anterior = ultimo;
                primeiro.anterior = novo;
                ultimo.proximo = novo;
                primeiro = novo;
            }
        } else {
            Nodo anteriorNodo = get(index - 1);
            Nodo proximoNodo  = anteriorNodo.proximo;

            anteriorNodo.proximo = novo;
            novo.anterior = anteriorNodo;
            novo.proximo = proximoNodo;
            proximoNodo.anterior = novo;
        }
        tamanho++;
    }

    public void remove(int index) {
        if (index < 0 || index >= tamanho) {
            return;
        }

        if (tamanho == 1) {
            primeiro = null;
            tamanho--;
            return;
        }

        if (index == 0) {
            Nodo ultimo = primeiro.anterior;

            primeiro = primeiro.proximo;
            primeiro.anterior = ultimo;
            ultimo.proximo = primeiro;
        } else {
            Nodo alvo     = get(index);
            Nodo anterior = alvo.anterior;
            Nodo proximo  = alvo.proximo;

            anterior.proximo = proximo;
            proximo.anterior = anterior;
        }
        tamanho--;
    }

    public void exibir() {
        if (primeiro == null) {
            System.out.println("Lista vazia");
            return;
        }

        // Sentido horário (proximo)
        Nodo atual = primeiro;
        System.out.print("Horário  : ");
        do {
            System.out.print(atual.valor);
            if (atual.proximo != primeiro) System.out.print(" <-> ");
            atual = atual.proximo;
        } while (atual != primeiro);
        System.out.println(" <-> (volta para " + primeiro.valor + ")");

        // Sentido anti-horário (anterior), começando pelo último
        atual = primeiro.anterior;
        System.out.print("Contrário: ");
        Nodo inicio = primeiro.anterior;
        do {
            System.out.print(atual.valor);
            if (atual.anterior != inicio) System.out.print(" <-> ");
            atual = atual.anterior;
        } while (atual != inicio);
        System.out.println(" <-> (volta para " + inicio.valor + ")");
    }

}
