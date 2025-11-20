# Gerenciador de Livros

- Atividade 1 — Disciplina de Java
- Curso de Inteligência Artificial — UNIFACISA

Este projeto foi desenvolvido como atividade prática da disciplina de Programação em Java, no curso de Inteligência Artificial da UNIFACISA.

O objetivo é criar um gerenciador simples de livros, permitindo adicionar, pesquisar, listar e excluir registros usando conceitos fundamentais de programação estruturada em Java.

## Funcionalidades

1. Adicionar livros
2. Pesquisar livros
3. Excluir livros
4. Listar livros cadastrados
5. Interagir via menu, escolhendo opções digitando números

## Breve explicação do projeto

Toda a lógica da aplicação está concentrada na classe MetodosGerenciador, responsável por manipular os dados dos livros e autores.

As informações são armazenadas em duas listas paralelas (ArrayList<String>), garantindo uma estrutura simples e eficiente para o nível inicial da disciplina.

Cada método foi desenvolvido para atender a uma operação específica:

adicionar() → coleta dados via terminal e registra nas listas
pesquisar() → percorre a lista de títulos e exibe o correspondente
excluir() → localiza e remove tanto o título quanto o autor
listar() → exibe todos os registros cadastrados

O uso do Scanner permite interação direta com o usuário pelo terminal, reforçando a prática dos fundamentos de entrada de dados e controle de fluxo.

## Estrutura e boas práticas

- O projeto segue princípios básicos da programação estruturada e do início da POO:

- ArrayList para armazenar dados de forma dinâmica;

- Loops for para percorrer e manipular itens;

- Métodos organizados de acordo com cada funcionalidade;

- Condições e validações simples, adequadas ao nível introdutório da disciplina;

- Mensagens claras ao usuário, facilitando a experiência via terminal.