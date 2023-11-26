#  🥼 **Orglife - 2TDSR**

## 💻 Descrição do Projeto
Projeto feito para a Global Solution, com a proposta de criar o app da nossa clínica de órgãos. Utilizamos o framework Spring e utilizando a plataforma Azure para o Deploy da aplicação e para a utilização do banco de dados Azure SQL Database.

## 📷 Prints
Os prints se encontram dentro da pasta prints-tela-azure dentro dos repositórios acima

## ⚙️ Endpoints:
* Link da aplicação para teste dos endpoints: https://global-orglife-springboot.azurewebsites.net
### Login:
* `POST`  /login - Efetuar login
### Médicos:
* `POST`  /medicos - Cadastrar médico
* `GET` ou `DELETE` /medicos/{id}- Detalhar e/ou Excluir médico
* `GET` /medicos - Listagem de médicos
* `PUT` /medicos - Atualização de informações do médico selecionado 
### Pacientes:
* `POST` /pacientes - Cadastrar paciente
* `GET` ou `DELETE` /pacientes/{id} - Detalhar e/ou Excluir paciente
* `GET` /pacientes - Listagem de pacientes
* `PUT` /pacientes - Atualização de informações do paciente selecionado
### Consultas:
* `POST` /consultas - Agendar uma Consulta

## 📝 Instruções para as Requisições
A seguir teremos os JSONs para disparar cada requisição:
### Login:
```js
{
  "login": "rodrigo.petroni@org.life",
  "senha": "123456"
}
```
### Cadastro de Médicos:
```js
{
"crm": "890765",
"email": "artur.alves@org.life",
"nome": "Artur Alves",
"orgao": "PULMÃO",
"telefone": "1145236666",
"endereco": {
    "bairro": "bairro",
    "cep": "12345555",
    "cidade": "Santa Catarina",
	  "complemento": "complemento",
	  "logradouro": "rua 2",
		"numero": "135",
    "uf": "SC"
    }
}
```
### Atualização de Médicos:
```js
{
"id": 1,
"telefone": "2111112222"
}
```

### Cadastro de Pacientes: 
```js
{
"cpf": "122.233.344-45",
"email": "marcos.cardoso@gmail.com",
"nome": "Marcos Cardoso",
"orgao": "FIGADO",
"doador": "SIM",
"telefone": "1122221111",
"endereco": {
    "bairro": "bairro",
    "cep": "12345555",
    "cidade": "Santa Catarina",
	  "complemento": "complemento",
	  "logradouro": "rua 2",
		"numero": "135",
    "uf": "SC"
    }
}
```

### Atualização de Pacientes:
```js
{
"id": 1,
"telefone": "2300023235"
}
```
### Agendamento de Consultas
```js
{
    "idPaciente": 3,
    "idMedico": 3,
    "data": "2023-12-12T10:00"
}
```

## 🛠 Tecnologias:
Utilizamos para realizar o projeto as tecnologias:
* Java 17
* Spring Boot 3
* Maven
* Microsoft Azure (Azure SQL Database, Centro de implantação)
* Hibernate
* Spring Data JPA
* Lombok
* Bean Validation
* Spring Security

## 🦺 Colaboradores
Segue abaixo nome dos integrantes que auxiliaram na realização do projeto:
* Rodrigo Costa Petroni / RM: 93872
* Gustavo Ribeiro Maio / RM: 93211
* Lucas Antunes dos Reis Silva / RM: 95781
* Nickolas Kenji Takeda Maldonado / RM: 95281
* Kauan Altino Gianesini Grilo / RM: 94700

## 🎬 Vídeos
Links para os vídeos referente ao funcionamento do projeto e referente ao pitch do projeto:

### Vídeo Pitch
* https://youtu.be/arG7gNc4fGY

### Vídeo do funcionamento do projeto (Aplicação e Teste de Persistência no Banco com os referentes CRUDs)
* https://youtu.be/SA-jO6vpyCM
