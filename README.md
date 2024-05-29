# Conversor de Moedas

> ## Desafio Alura Challenges Oracle-ONE BR - Back End - Turma 6 - 2024

&nbsp;
<p align="center">
   <img src="https://img.shields.io/badge/ STATUS-LANÇADO (desenvolvido)-brightgreen"/>
</p>
<p align="center">
   <img src="https://img.shields.io/badge/ STATUS-VERSÃO 1.0-brightgreen"/>
</p>

#### Escrito em `JAVA`.

&nbsp;
> ## Descrição do Desafio
&nbsp;
O objetivo deste desafio é criar um programa em Java que permita a conversão de valores entre diferentes moedas utilizando uma API de taxa de câmbio. O programa deve solicitar ao usuário a moeda de origem, a moeda de destino e o valor a ser convertido, e então exibir o resultado da conversão.

&nbsp;
> ### Requisitos

1. **Entrada do Usuário**:
    - Moeda de origem (ex: BRL para Real Brasileiro).
    - Moeda de destino (ex: USD para Dólar Americano).
    - Valor a ser convertido.

2. **Processamento**:
    - Utilizar uma API para obter a taxa de conversão entre as duas moedas.
    - Calcular o valor convertido com base na taxa de conversão obtida.

3. **Saída**:
    - Exibir o valor convertido, a moeda de origem, a moeda de destino e a taxa de conversão utilizada.

### API Utilizada
&nbsp;
Para realizar as conversões de moeda, foi utilizada a API da ExchangeRate-API (https://www.exchangerate-api.com/), que fornece taxas de câmbio atualizadas.

&nbsp;
> ## Solução
&nbsp;
A solução foi implementada em Java e consiste em quatro classes principais: `Main`, `MenuPrincipal`, `ConsultaConversao`e `Conversao`.

### Classe `Main`
&nbsp;
Esta classe é a principal, a que dá início em toda a aplicação chamando a classe `MenuPrincipal`.

### Classe `MenuPrincipal`
&nbsp;
Esta classe é responsável pela interação com o usuário, imprimindo o conteúdo da classe `Menu` e direcionar para as opções de escolha que redirecionam para as classes de `SubMenu`, classes essas responsáveis por enviar as informações para a consulta na API e impressão do resultado.

### Classe `ConsultaConversao`
&nbsp;
Esta classe é responsável por interagir com a API de conversão de moeda. Ela pega as informações passada pelas classes `SubMenu` e monta a URL da API, envia a requisição e processa a resposta para obter a taxa de conversão, o resultado da conversão e é responsável na construção da primeira parte da impressão do resultado informando o valor a ser convertido.

### Classe `Conversao`
&nbsp;
Esta classe armazena as informações obtidas e convertidas da API pela classe `ConsultaConversao` como a data e hora da consulta, a moeda de origem, a moeda de destino, a taxa de conversão, o resultado da conversão e monta a segunda parte da impressão do resultado.

&nbsp;
> ## Introdução
&nbsp;
Bem-vindo à documentação da aplicação `Conversor de Moedas`.

&nbsp;
Uma ferramenta simples para conversão de valores em `Real, Dollar, Euro e Peso Argentino` utilizando taxas de câmbio reais e atualizadas, desenvolvida por [Rodrigo Leone](https://github.com/Rodrigo-Leone).

&nbsp;
Esta aplicação foi criada no contexto da bolsa do curso da [Oracle](https://www.oracle.com/br/), [Alura](https://www.alura.com.br/) e [Ifood](https://www.ifood.com.br/), com foco em `BackEnders iniciantes`.

&nbsp;
A aplicação é escrita `exclusivamente` em [JAVA](https://docs.oracle.com/en/java/javase/21/docs/api/), sem o uso de `Framework's`.

&nbsp;
A aplicação deve ser exclusivamente interagida via `terminal`.


> ### Versão Atual: 1.0
&nbsp;
Na versão 1.0, a aplicacação foi `finalizada` e `entregue`.


> ### Pré-requisitos

* Acesso a `WEB`.
* `Java` instalado.
* `Intellij IDEA` instalado.
* `Gson` baixado e configurado ao projeto

> ### Funcionalidades

1. A aplicação conta com um `menu` inicial com `seis opções` de `conversão` e `uma` opção para `encerrar` a própria aplicação.

2. Cada `SubMenu` solicitará um valor para `conversão` e imprimirá o resultado, além de oferecer duas `opções` de escolha, `voltar` e `Sair`.

![img01.jpg](img%2Fimg01.jpg)![img02.jpg](img%2Fimg02.jpg)

&nbsp;
> ### Créditos
Baseado em orientação da [Alura](https://www.alura.com.br/) e seus `professores`, com `live` única de lançamento do desafio.

Documentação e melhorias por [Rodrigo Leone](https://github.com/Rodrigo-Leone).

LinkedIn em [Rodrigo Leone](https://www.linkedin.com/in/rodrigo-leone/)

---


Espero que esta documentação ajude você a compreender a aplicação.

Fique à vontade para contribuir e adicionar melhorias ao código.

Primeiro commit na data de 27/05/2024.

Ultimo commit na data de 29/05/2024.