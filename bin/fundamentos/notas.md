# eclipse
- seleciona outro projeto: file - switch workspace - other
- perspectivas: window - perspective (basta selecionar a perspectiva, no caso Java) - create a java project e seguir passos (informar nome do projeto) - finish - não criar modulo por enquanto.
- criar programa em java: botão direito do mouse sobre a pasta src - new - class - dar nome ao package (pasta) - dar nome ao arquivo (Name) - finish
- começando: main (ctrl+espaço) - seleciona primeira opção(public static void main(String[] args)) / syst (ctrl+espaço) - seleciona primeira opção(System.out.println("Hello, world!!!")) imprima uma linha na saida do sistema;
- oculta barra dos package: ctrl + m 
- mostra um console com os resultados dentro do eclipse: window - show view - console
- rodar código: run - run
- alterar fonte: window - preferences - digitar font - colors and font (aqui consigo configurar tamanho de fonte, cor);
- renomeiar pcotes: refactor - rename

# java
- Organizado em sentenças de código, onde é finalizado com ; (l22, 23, 24 são sentenças de código, mesmo não tendo nada escrito)
- {} significa um bloco de código
- código aula https://github.com/cod3rcursos/curso-java

<!-- package fundamentos;

public class PrimeiroPrograma {
	
	public static void main(String[] args) {
		System.out.println("Hello, world!");
		System.out.println("Hello, world Parte 2!");
    ;
    ;
    ;
	}
} -->

- organização no eclipse, fez alusão a um livro. Oragnizou em pacotes e dentro deles classes. EX. clinica médica;

- fechar projeto: clicar com botão doreito sobre ele e selecionar 'close project'
- abrir projeto: clicar com botão doreito sobre ele e selecionar 'open project'

- documentação: https://docs.oracle.com/en/java/javase/16/docs/api/index.html

- javaDoc: '/** + enter' no inicio do documento leva a um comentário que vc pode fazer sobre determinada classe;

- definição váriável: tipo, nome e valor ex. int raio = 3;

# tipos variáveis
- double ex. 3.56 (pode variar)
- int ex. 3
- final doble ex. 3.6 (mas não pode variar)
- 

# inferência de tipos
A partir do java 10, quando instanciamos uma variável, o java vai inferir qual o tipo, a partir do conteúdo que escrevermos nela.
Então, nao posso iniciá-la como number e na linha seguinte instanciá-la novamente, mas como string. Isso dá erro, ela terá que ser number até o fim.
Não é possível tb, inicializar a variável em uma linha e instanciá-la na outra. var.

		<!-- var e;
		e = 123.45;  -->

Java é uma linguagem em que os tipos da variável são fortes, portanto, temos de sempre declarar antes.

# tipos primitivos
Temos 8 tipos:

- 6 tipos valores numéricos:
- - 4 representam inteiros: byte(1), short(2), int(4), long(8) -> diferença é a capacidade de armazenamento, bytes (1 byte = 8 bites);
- - 2 representam pontos flutuantes: float(4), double(8)

- outros 2 tipos:
- - char(caracter delimitado entre '') e boolean(true, false);


# notação ponto
- String não é um tipo primitivo da linguagem java, por isso escrevemos com a primeira letra maiúscula;
- tipos que não são primitvos temos a disposição o recurso .
- tipos primitivos NÃO tem o operador '.'

# Import
nem tudo está disponívela  todo tempo e as vezes precisa importar para usar.
ex. Date, JButton;

# tipo string
- o valor original da string não conseguimos modificar (objeto imutável)
- conseguimos apenas mofificar 

# console
formas de impressão no console;
 System.out -> saída
 System.in -> entrada


# Wrappers
versões ori
https://github.com/cod3rcursos/fundamentos-programacao-java/tree/master/CursoJava/src/fundamentos

https://github.com/cod3rcursos/curso-java/blob/master/exercicios/src/fundamentos/Wrappers.java


# Conversão de objeto
- Converter um byte para long não tem problema, a informação não se perde, estamos indo do menor para o maior e podemos fazer a conversão de forma implicita. Agora o contrário só pode ser feito de forma explicita, pois há risco de perda de informação.
- float -> inteiro mesmo sendo do mesmo tamanho, são tipos diferentes e ao passar de float para int temos que ser explicitos! pois haverá perda das casas decimais.
- regras: tamanho, tipo;
- https://github.com/cod3rcursos/curso-java/tree/master/exercicios/src/fundamentos
- atenção passagem de string para número;
- BigDecimal -> usado para dinheriro, pois dá mais precisão.

# Operadores
Essa classificação tem haver com número de operandos em cima de um determinado operador:
- Unários: i++
- Binários: 3 + 2
- Ternários: x ? true : false
- Aritméticos:
- Relacionais:
- Lógicos:
- Atribuição:


# Operadores Lógicos
- ver tabela verdade;

# JRE X JDK
- JRE Java Runtime Env.
- JDK Java Dev. Kit
- conceito de máquina virtual