import java.util.Scanner;
public class Perimetro {

    protected void perimetroRetangulo(Scanner scanner) {
        System.out.println("Digite aresta um");
        Double arestaUm = scanner.nextDouble();
        System.out.println("Digite aresta dois");
        Double arestaDois = scanner.nextDouble();
        Double perimetroRetangulo = (arestaUm * 2) + (arestaDois * 2);
        System.out.println("O perímetro do retâgulo é: " + perimetroRetangulo);
    }

    protected void perimetroCiculo(Scanner scanner) {
        System.out.println("Digite o valor do raio");
        Double raio = scanner.nextDouble();
        Double perimetroCirculo = (raio * 3.14) * 2;
        System.out.println("O perímetro do retângulo é: " + perimetroCirculo);
    }

    protected void perimetroTriangulo(Scanner scanner) {
        System.out.println("Digite o valor da aresta um");
        Double arestaUm = scanner.nextDouble();
        System.out.println("Digite o valor da aresta dois");
        Double arestaDois = scanner.nextDouble();
        System.out.println("Digite o valor da aresta tres");
        Double arestaTres = scanner.nextDouble();
        Double perimetroTriangulo = arestaUm + arestaDois + arestaTres;
        System.out.println("O perímetro do triângulo é: " + perimetroTriangulo);
    }
}
