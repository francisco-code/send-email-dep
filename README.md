# Sobre o projeto

Esta é uma aplicação para disparo de email utilizando a API SendGrid. Antes de utilizar é necessário fazer o cadastro no sendgrid, bem como criar uma chave e depois 
registrar essa chave como uma variável de ambiente (para testar) e depois cadastrar essa chave na config properties quando for subir o BFF para a núvem.
Essa aplicação faz o disparo de até 100 email's grátis por dia. Consulte a página do SendGrid para mais informações de planos para transações acima desse limite.


## Página do SendGrid
https://sendgrid.com/


## Como inserir a variável no application.properties
spring.sendgrid.api-key=${SENDGRID_API_KEY}


## Exite uma chave para trocar entre "test" e "dev"
spring.profiles.active=dev

- Observação: quando essa chave estiver como "spring.profiles.active=test" é feito um retorno 'mockado' para efeito de teste. E quando estiver 
como "spring.profiles.active=dev" é feita a request na API SendGrid e o email será disparado.


## Endpoint desse BFF
/emails


## Body para teste no Postman ou no Insomnia com o verbo POST ou para envio de um frontend que consumirá esse serviço
```json
{
    "fromEmail" : "nome@dominio.com",
    "fromName" : "Nome",
    "replyTo" : "nome@dominio.com",
    "to" : "destinatario@gmail.com",
    "subject" : "Meu assunto",
    "body" : "Meu conteúdo do email com <strong>palavra forte</strong> destacada.",
    "contentType" : "text/html"
}
```


# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- Maven


# Como executar o projeto

## Back end
Pré-requisitos: Java 17 LTS

```bash
# clonar repositório
git clone https://github.com/francisco-code/send-email-dep

# executar o projeto
./mvnw spring-boot:run
```


# Autor
Francisco Correia

