# Livraria para programadores
-------------------------------------------------

 
### Sobre o projeto

Esta aplicação tem como finalidade cadastrar livros de uma livraria que tem como seu publico alvo programadores. Esta aplicação tem uma tela inicial onde o usuário pode ver todos os livros da livraria cadastrados na biblioteca. Se o usuário tiver acesso ele poderá fazer login na loja e cadastrar os livros e seus autores, editar e excluir.  

 
 
 
**SQL**: sql para a criação do banco de dados da aplicação: 


```
 create database livraria
default char set utf8
default collate utf8_general_ci;

use livraria;

create table livros(
        ID integer primary key auto_increment,
	    nome varchar(40),
	    autor varchar(40),
	    descricao text,
        Valor varchar(40)

);
create table autor(
ID integer primary key auto_increment,
nome varchar(40),
nacimento varchar(40),
    descricao text

);

 select * from autor;



```
**Senha para acesar**: nome = DEV senha = 12345 

