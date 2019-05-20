# Criando um jar no estilo HelloWorld


Vá até sua pasta de projetos

    cd path/to/projects/

Clone este repositório

    git clone https://github.com/flaviomicheletti/jar-hello-world

Entra na pasta clonada.

    cd jar-hello-world/

Crie e acesse a pasta `foo`.

    mkdir foo
    cd foo/

Dentro da pasta crie o arquivo `Main.java` e ensira o seguinte conteúdo:

```java
package foo;

public class Main {

    public static void main(String[] args) {
        System.out.println(args.length + " argumentos:");
        for (int i = 0; i < args.length; i++)
            System.out.println("  " + i + ": '" + args[i] + "'");
    }
}
```

Estamos com a seguinte estrutura:

    jar-hello-world/
        foo/
            Main.java

Compile.

    javac Main.java

Teste. (necessário voltar um diretório)

cd ..

    java foo.Main a b c


### Criar o JAR file

    cd ../

    pwd
    path/to/projects/jar-hello-world

    # criando
    jar -cvfm lish.jar .\foo\manifest.txt .\foo\Main.class

    # testando
    java -jar .\lish.jar a b c


