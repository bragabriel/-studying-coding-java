package lambda.example;

public class LambdaEx {
    public static void main(String[] args) {

        Cat myCat = new Cat();

        Printable lambdaPrintable = () -> System.out.println("Meow");
        printThing(lambdaPrintable);

        PrintableWithEntry lambdaPrintablee = (s) -> System.out.println("Meow");
        printThingg(lambdaPrintablee);
    }
    static void printThing(Printable thing){
        thing.print();
    }

    static void printThingg(PrintableWithEntry thing){
        thing.printWithEntry("@@");
    }
}


