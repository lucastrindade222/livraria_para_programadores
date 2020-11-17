# Livraria para programadores
-------------------------------------------------
**Projeto acadêmico de uma aplicação em java para gerencia uma livraria**

 
**SQL**: sql para a criação do banco de dados da aplicação: 
```
create database livraria;

use livraria;

create table livro(
   id int primary key unique,
   escritor int,
   nome_do_livro char(30),
   publicacao date,
   Quantidade_em_estoque int
   
   
   
);

create table escritor(

id  int primary key unique,
nome char(30),
data_de_nacimento date,
sobre_o_altor char(30)
)




```
