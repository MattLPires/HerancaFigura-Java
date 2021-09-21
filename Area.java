import java.util.Scanner;

public class Area {

    protected void areaRetangulo(Scanner scanner) {
        System.out.println("Digite aresta um");
        Double arestaUm = scanner.nextDouble();
        System.out.println("Digite aresta dois");
        Double arestaDois = scanner.nextDouble();
        Double areaRetangulo = arestaUm * arestaDois;
        System.out.println("A área do retâgulo é: " + areaRetangulo);
    }

    protected void areaCirculo(Scanner scanner) {
        System.out.println("Digite o valor do raio");
        Double raio = scanner.nextDouble();
        Double areaCirculo = (raio * raio) * 3.14;
        System.out.println("A área do retângulo é: " + areaCirculo);
    }

    protected void areaTriangulo(Scanner scanner) {
        System.out.println("Digite o valor da base");
        Double base = scanner.nextDouble();
        System.out.println("Digite o valor da altura");
        Double altura = scanner.nextDouble();
        Double areaTriangulo = (base * altura) / 2;
        System.out.println("A área do triângulo é: " + areaTriangulo);

    }
}
