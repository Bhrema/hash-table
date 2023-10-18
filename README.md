# PJBL 3

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

As propriedades fundamentais são: 

* Eficiência: Uma boa função de hash e um dimensionamento apropriado da tabela podem levar a operações de busca e inserção de dados extremamente rápidas, com tempo médio de acesso constante.
* Uso de memória: As tabelas hash podem consumir menos memória do que outras estruturas de dados, tornando-as adequadas para armazenar grandes quantidades de dados.
* Manipulação de colisões: Colisões ocorrem quando duas chaves diferentes produzem o mesmo índice de tabela. As tabelas hash devem incluir mecanismos para lidar com colisões, como encadear os valores associados às mesmas chaves ou usar técnicas avançadas de resolução de colisões.
* Funções de hash: A escolha de uma boa função de hash é fundamental para o desempenho de uma tabela hash. A função de hash deve distribuir as chaves de maneira uniforme e minimizar colisões.

## Com colisão
Este repositório contém uma implementação do algoritmo Flood Fill utilizando <br>

### HashSemColisao 
É definida uma classe chamada "HashSemColisao" que implementa uma interface chamada "HashSemColisaoInterface".
<br>

Nesse programa tem: 
- Há uma função chamada "funcaoHash" que calcula o índice na tabela hash com base na matrícula de um aluno. Esta função é usada para determinar onde um aluno será armazenado na tabela.<br>
- O método "insere" é usado para adicionar um aluno na tabela. Antes de fazer isso, ele calcula o índice usando a função de hash e verifica se já existe um aluno com a mesma matrícula na posição da tabela. Se houver uma colisão (ou seja, outro aluno com a mesma matrícula já está lá), uma mensagem de aviso é impressa, caso contrário, o aluno é adicionado à lista encadeada na posição correta.<br>
- O método "busca" deve ser implementado para procurar um aluno na tabela hash, mas no código fornecido, a implementação está vazia.<br>
- O método "deleta" deve ser usado para excluir um aluno da tabela, mas também está vazio no código fornecido.<br>
- O método "printHash" é usado para imprimir o conteúdo da tabela hash na tela.<br>
## Sem colisão
É definida uma classe chamada "HashSemColisao" que implementa uma interface chamada "HashSemColisaoInterface".
<br>

Nesse programa tem: <br>
A classe `HashComColisao` é uma extensão da classe `HashSemColisao` e implementa uma tabela hash que lida com colisões de matrículas de alunos. Ela oferece métodos para buscar, inserir e excluir alunos na tabela hash. Quando ocorrem colisões, a classe gera novas matrículas para resolver conflitos e garantir que não haja duplicações de matrículas na tabela. Em resumo, a classe aprimora a funcionalidade da tabela hash, garantindo que os alunos sejam gerenciados efetivamente, mesmo quando as matrículas são idênticas. <br>
## Main
O programa Java oferece um menu interativo que permite aos usuários alternar entre tabelas hash com ou sem colisões e executar ações relacionadas a alunos, como adicionar, consultar, deletar e visualizar informações. As tabelas hash são usadas para gerenciar dados de alunos. Os usuários podem escolher entre opções de menu para executar essas ações com base em suas preferências. <br>

## Imagem do Funcionamento 
![image](https://github.com/Bhrema/hash-table/assets/91105011/b8394e4c-16c4-4465-abbb-41ef0cb29ed3)
![image](https://github.com/Bhrema/hash-table/assets/91105011/ee616f2d-04cf-4cc9-beda-11285699a121)
![image](https://github.com/Bhrema/hash-table/assets/91105011/55a04e8f-dcde-49e8-8290-ea798b813e89)
![image](https://github.com/Bhrema/hash-table/assets/91105011/e310f715-44a3-455d-af8a-6e4f82c37c2a)





## Uso 
Para utilizar o projeto, siga os passos abaixo:

</div>

1. Clone o repositório para o seu computador:
>```git clone https://github.com/seu-nome-de-usuário/flood-fill.git> ```

2. Compile e execute a classe Main:
>```javac src/Main.java>```

3. Siga as instruções no console para interagir com o algoritmo Flood Fill e ver seus resultados.

