# Tabela Hash 

<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0">

<div align="center">

 <br>
     Este é o terceiro projeto da matéria Resolução de Problemas Estruturados em Computação, realizado pela equipe 9, compostos por: <br><br>
     Bruno Crema 👨🏼‍💻 <br>
     João Elias Fadel 👨🏻‍💻 <br>
     João Victor Ferreira 👨🏽‍💻 <br>
     Lohine Mussi 👩🏻‍💻 
     
## Tabela Hash 
<br> 

![image](https://github.com/Bhrema/hash-table/assets/91105011/652bd000-7487-4253-a5af-ddd1e0feccb9)


Uma tabela hash, ou tabela de dispersão, é uma estrutura de dados que usa uma função de hash para mapear chaves a valores, permitindo a recuperação eficiente de valores com base nas chaves. Ela é eficiente, consome menos memória, lida com colisões e é amplamente usada em programação para armazenar e acessar dados rapidamente.

A propriedade fundamental é a seguinte:

* Eficiência: Uma boa função de hash e um dimensionamento apropriado da tabela podem levar a operações de busca e inserção de dados extremamente rápidas, com tempo médio de acesso constante.
* Uso de memória: As tabelas hash podem consumir menos memória do que outras estruturas de dados, tornando-as adequadas para armazenar grandes quantidades de dados.
* Manipulação de colisões: Colisões ocorrem quando duas chaves diferentes produzem o mesmo índice de tabela. As tabelas hash devem incluir mecanismos para lidar com colisões, como encadear os valores associados às mesmas chaves ou usar técnicas avançadas de resolução de colisões.
* Funções de hash: A escolha de uma boa função de hash é fundamental para o desempenho de uma tabela hash. A função de hash deve distribuir as chaves de maneira uniforme e minimizar colisões.

## Algoritmo Árvore Binária
Este repositório contém uma implementação do algoritmo Flood Fill utilizando 3 classes: <br>

### ArvoreBinariaBusca 
Esta classe Java, chamada `ArvoreBinariaBusca`, implementa uma árvore binária de busca. Ela permite inserir, buscar e remover valores na árvore. Também oferece a capacidade de imprimir a árvore em formato de árvore binária.
<br>

Para usar esta árvore:<br>
- Crie uma instância da classe `ArvoreBinariaBusca`.<br>
- Use o método `inserir` para adicionar valores à árvore.<br>
- Use o método `buscar` para verificar se um valor existe na árvore.<br>
- Use o método `remover` para remover um valor da árvore.<br>
- Use o método `imprimirArvore` para visualizar a árvore em formato de árvore binária.<br>
### Main
Este é um programa Java que interage com uma árvore binária de busca. Os principais recursos são: <br>

- **Inserções:** O usuário pode inserir números na árvore, com exibição da árvore após cada inserção.<br>
- **Buscas:** Permite ao usuário buscar números na árvore e informa se o número foi encontrado.<br>
- **Remoções:** Possibilita a remoção de números da árvore, com exibição da árvore após cada remoção.  <br>
 ### Node
A classe `Node`, que representa os nós da árvore, deve ser definida externamente com pelo menos três atributos: `dado` (valor do nó), `esquerda` (referência para o filho esquerdo) e `direita` (referência para o filho direito). Essa classe é essencial para a estrutura da árvore.
<br>

## Funcionamento do projeto 
### Inserções: <br>
-O programa permite a inserção de números em uma árvore binária de busca.<br>
-O usuário é solicitado a digitar um número para inserção.<br>
-Após cada inserção, a árvore é exibida em formato de árvore binária para visualização.<br>
-Para encerrar a inserção, o usuário digita 'q'.<br>
### Buscas: <br>
-Após a fase de inserção, o programa entra na fase de busca.<br>
-O usuário pode digitar um número para verificar se ele está presente na árvore.<br>
-O programa informa se o número foi encontrado na árvore.<br>
### Remoções:<br>
-O programa permite a remoção de números da árvore.<br>
-O usuário é solicitado a digitar um número a ser removido.<br>
-Após cada remoção, a árvore é exibida em formato de árvore binária para visualização.<br>
-O programa informa se o número foi removido com sucesso.<br>
-Para encerrar a remoção, o usuário digita 'q'.<br>
### Encerramento do Programa:<br>
-O usuário pode repetir os passos de inserção, busca e remoção conforme necessário.<br>
-Para encerrar o programa completamente, o usuário pode digitar 'q' em qualquer ponto do processo.<br>
![image](https://github.com/BES-Noite/PJBL2-ArvoreBinariaDeBusca/assets/91105011/db43740b-4107-4b35-9668-44b082f3a36a)
![image](https://github.com/BES-Noite/PJBL2-ArvoreBinariaDeBusca/assets/91105011/071bbe23-f509-4a60-8e58-70c761f25c7b)
![image](https://github.com/BES-Noite/PJBL2-ArvoreBinariaDeBusca/assets/91105011/cc22b934-403b-4af0-89d7-62dba6c04ea7) <br>

## Uso 
Para utilizar o projeto, siga os passos abaixo:

</div>

1. Clone o repositório para o seu computador:
>```git clone https://github.com/seu-nome-de-usuário/flood-fill.git> ```

2. Compile e execute a classe Main:
>```javac src/Main.java>```

3. Siga as instruções no console para interagir com o algoritmo Flood Fill e ver seus resultados.

