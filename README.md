# Olivia Challenge

Criei esse projeto para recolher as apostas com relação ao nascimento da Olivia, minha filha.
É um projeto utilizando a seguinte stack:

* Java
* jOOQ
* Serverless
* PostgreSQL 10
* IBM Cloud Functions

O objetivo é apenas exercitar a utlização de função como uma API para um frontend leve.

## Setup

Para compilar e subir a função em sua cloud basta executar os seguintes passos:

1. Criar um banco de dados

```sql
 create table bet (id serial primary key, name varchar not null, email varchar not null, height numeric not null, weight numeric not null, born timestamp not null, hairy boolean not null);
```

2. Alterar as configurações de acesso na class `ConnectionUtil`

3. Executar os comandos abaixo

```bash
$ npm install
$ mvn clean package
$ sls deploy
```

Obs.: Estou considerando que já possua instalado e configurado o ambiente Serverless e IBM Cloud.

Caso ainda não tenha configurado siga as instruções conforme endereços abaixo:

https://serverless.com/framework/docs/providers/openwhisk/guide/quick-start/

https://console.bluemix.net/docs/openwhisk/bluemix_cli.html#cloudfunctions_cli