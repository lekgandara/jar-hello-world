package foo;

public class Main {

    public static void main(String[] args) {
        System.out.println(args.length + " argumentos:");
        for (int i = 0; i < args.length; i++)
            System.out.println("  " + i + ": '" + args[i] + "'");
    }
}