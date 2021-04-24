# Primeiros passos

## Configurando o banco de dados

### Com Docker e Docker Compose

Abra o terminal (Canto inferior da IDE ou pelo atalho ALT+F12) e rode o comando abaixo

    docker-compose up -d

### Forma tradicional

Acesse o site do PostgreSQL e baixe a versão mais nova disponivel para o seu sistema operacional.
Depois crie nele o banco de dados conforme os nomes e credenciais que configuramos no application.properties.

## Compilar o projeto

Abra o terminal (Canto inferior da IDE ou pelo atalho ALT+F12)

- Se estiver no linux rode: 

  ./mvnw clean install

- Se estiver no windows rode: 

  ./mvnw.cmd clean install


## Subindo a aplicacao

Ainda no terminal aberto para compilar rode o comando

    java -jar target/cliente-api.jar


Obs.: Garanta que o JDK 11 esteja instalado e configurado corretamente no seu computador.
Obs.: Voce tambem pode utilizar o próprio intellij para compilar e rodar a aplicao através do menu "Maven" do lado direito dele. Igual vimos em aula