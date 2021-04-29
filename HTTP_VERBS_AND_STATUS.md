# Recursos HTTP

/C:/Arquivos de Programs/Minha Pasta/Batata.md
/C:/Arquivos de Programs/Minha Pasta/BatataFrita.md
/C:/Arquivos de Programs/Minha Pasta 2/BatataFrita.md

- Host
http://api.meuservice.com.br/

- Host + Recurso
http://api.meuservice.com.br/api/minha-pasta

# Verbos HTTP
- GET (Recuperar recursos (se existirem))
    - http://api.meuservice.com.br/minha-pasta/ (Listar todos os recursos existentes)
    - http://api.meuservice.com.br/minha-pasta/Batata.md (Obter um recurso especifico se existir)

- POST (Criar um novo recurso)
    - http://api.meuservice.com.br/minha-pasta/
         - Corpo da Requisição (Body)
    
- PUT (Atualizar completamente um recurso)
    - http://api.meuservice.com.br/minha-pasta/Batata.md
        - Corpo da Requisição com todo os novos dados (Body)
    
- PATCH (Atualizções parciais de recurso)
    - http://api.meuservice.com.br/minha-pasta/Batata.md
        - Corpo da Requisição apenas com os novos dados especificos (Body)
    
- DELETE (Para remover recursos)
    - http://api.meuservice.com.br/minha-pasta/Batata.md
    
# Status HTTP

Grupos de status

- Status 200 (Categoria de códigos de sucesso)
- Status 300 (Categoria de redirecionamento)
- Status 400 (Erros do lado do Client que está consumindo a nossa API Rest)
- Status 500 (Erros do lado do servidor / do lado da nossa aplicação)
- https://developer.mozilla.org/pt-BR/docs/Web/HTTP/Status