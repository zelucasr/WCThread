Projeto de Programação concorrente

UFRN 2016.2
____________________________________

Integrantes:

Francisco Laércio de Morais

José Lucas Santos Ribeiro
____________________________________

O objetivo deste trabalho é colocar em prática os mecanismos de sincronização de processos/threads concorrentes por meio da implementação de uma solução para o Problema do Banheiro Unissex nas linguagens de programação C++ ou Java.
____________________________________

O PROBLEMA

Um escritório contém um banheiro que pode ser utilizado tanto por homens quanto por mulheres, mas não por ambos ao mesmo tempo. 
Se um homem estiver no banheiro, outros homens podem entrar, porém eventuais mulheres que desejem utilizar o banheiro devem esperar ele ficar vazio. 
Se uma mulher estiver no banheiro, outras mulheres podem entrar, porém eventuais homens que desejem utilizar o banheiro devem esperar ele ficar vazio. 
Cada pessoa (homem ou mulher) pode passar um tempo utilizando o banheiro.

____________________________________

TAREFAS

– O programa deve exibir a entrada e saída de uma pessoa (homem ou mulher) do banheiro
– O programa deve exibir quantas pessoas (homens ou mulheres) estão no banheiro no momento
– O banheiro pode ter uma capacidade limite de pessoas utilizando ao mesmo tempo
– O tempo que cada pessoa passa no banheiro pode ser aleatório