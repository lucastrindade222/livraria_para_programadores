# Livraria para programadores
-------------------------------------------------

 
### Sobre o projeto

Esta aplicação tem como finalidade cadastrar livros de uma livraria que tem como seu publico alvo programadores. Esta aplicação tem uma tela inicial onde o usuário pode ver todos os livros da livraria cadastrados na biblioteca. Se o usuário tiver acesso ele poderá fazer login na loja e cadastrar os livros e seus autores, editar e excluir.  

 
 
 
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
