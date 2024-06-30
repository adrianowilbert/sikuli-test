# MySikuliExample

Projeto MAVEN de estudos destinado a utilização do [Sikuli](http://sikulix.com/) para testes que envolvam aplicações que 
não se tem acesso ao código fonte, tais como aplicatovos desktop. Os testes deste projeto foram realizados com a 
calculadora do Windows.

- Índice
- Instalação
- Configuração
- Uso
- Contribuição
- Licença

## Instalação
Não é necessário realizar nenhuma instalação adicional ao projeto. A dependência necessária já se encontra no POM.

## Frameworks e ferramentas
* Junit 4
* Maven
* Hamcresh
* JDK 14

## Principais Classes e Métodos

### Screen
Representa a tela do computador onde as ações serão realizadas.

```java
Screen screen = new Screen();
```
## Localização e Região:

### Region
Representa uma região na tela onde as operações serão realizadas.

```java
Region region = new Region(x, y, largura, altura);
```

### find()
Encontra uma imagem ou padrão na tela dentro de uma região específica.

```java
Match match = screen.find("imagem.png");
```

## Interagindo com Elementos na Tela:

### click()
Clica em uma posição específica ou em um elemento encontrado.

```java
screen.click("imagem.png");
```

### doubleClick()
Clica duas vezes em uma posição específica ou em um elemento encontrado.

```java
screen.doubleClick("imagem.png");
```

### rightClick()
Clica com o botão direito do mouse em uma posição específica ou em um elemento encontrado.

```java
screen.rightClick("imagem.png");
```

### type()
Digita texto em um campo de entrada.

```java
screen.type("campo.png", "Texto a ser digitado");
```

### dragDrop()
Arrasta e solta um elemento de origem para um destino na tela.

```java
screen.dragDrop("origem.png", "destino.png");
```

## Esperando por Elementos:

### wait()
Espera até que uma imagem ou padrão apareça na tela.

```java
screen.wait("imagem.png");
```

### exists()
Verifica se uma imagem ou padrão está presente na tela.

```java
if (screen.exists("imagem.png") != null) {
System.out.println("Imagem encontrada!");
}
```

## Outros Comandos Úteis:

### hover()
Move o mouse para uma posição específica ou para um elemento encontrado.

```java
screen.hover("imagem.png");
```

### keyDown() e keyUp() 
Pressiona e solta uma tecla do teclado.

```java
screen.type("a", KeyModifier.CTRL);
```


## Executando Testes

maven
`mvn clean verify`

## Contato
Para dúvidas ou feedback, entre em contato com Adriano Wilbert pelo e-mail: [adrianowilbert@gmail.com](mailto:adrianowilbert@gmail.com) 