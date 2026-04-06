# Lista Circular Duplamente Encadeada

Este repositório contém uma implementação de uma **Lista Circular Duplamente Encadeada** em Java, uma estrutura de dados dinâmica que permite navegação em ambos os sentidos (para frente e para trás), com a característica especial de que o último elemento aponta para o primeiro e o primeiro elemento aponta para o último, formando um ciclo.

## Estrutura

### Classe `Nodo`

Representa um elemento da lista.

### Classe `ListaCircularDuplamenteEncadeada`

Implementa a lógica da lista.

### Atributos

* `primeiro`: referência para o primeiro nó
* `tamanho`: quantidade de elementos

#### 1. Métodos principais

##### - `addElemento(int elemento)`: Adiciona um elemento ao final da lista.

##### - `add(int index, int elemento)`: Insere um elemento em uma posição específica.

##### - `get(int index)`: Retorna o nó em um índice específico.

##### - `remove(int index)`: Remove um elemento com base no índice.

##### - `size()`: Retorna o tamanho da lista.

##### - `exibir()`:

Mostra a lista:

* Sentido horário (→)
* Sentido anti-horário (←)

## Saída Esperada (Exemplo)

```
Horário  : 10 <-> 20 <-> 30 <-> (volta para 10)
Contrário: 30 <-> 20 <-> 10 <-> (volta para 30)
```

## Como Executar o Projeto

### 1. Clone o repositório

```bash
git clone https://github.com/rose-del/lista-circular-duplamente-encadeada.git
```

### 2. Compile os arquivos

```bash
javac Main.java
```

### 3. Execute o programa

```bash
java Main
```
