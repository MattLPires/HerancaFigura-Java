
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int tipoConta;
        int formaGeometrica;
        main.mensagemUm();
        tipoConta = scanner.nextInt();
        main.menssagemDois();
        formaGeometrica = scanner.nextInt();
        main.verificaQualFuncaoChamar(tipoConta, formaGeometrica, scanner);
    }

    public void mensagemUm() {
        System.out.println("Calculador de Figuras geompetricas");
        System.out.println("Escolha a conta:");
        System.out.println("1 - Area");
        System.out.println("2 - Perímetro");
    }

    public void menssagemDois() {
        System.out.println("Escolha a forma geometrica");
        System.out.println("1 - retangulo");
        System.out.println("2 - circulo");
        System.out.println("3 - triangulo");
    }

    public void verificaQualFuncaoChamar(int tipoConta, int formaGeometrica, Scanner scanner) {
        if (tipoConta == 1) {
            Area area = new Area();
            if (formaGeometrica == 1) {
                area.areaRetangulo(scanner);
            } else if (formaGeometrica == 2) {
                area.areaCirculo(scanner);
            } else {
                area.areaTriangulo(scanner);
            }
        } else {
            Perimetro perimetro = new Perimetro();
            if (formaGeometrica == 1) {
                perimetro.perimetroRetangulo(scanner);

            } else if (formaGeometrica == 2) {
                perimetro.perimetroCiculo(scanner);

            } else {

            }
        }

    }


    public class Area {

        private void areaRetangulo(Scanner scanner) {
            System.out.println("Digite aresta um");
            Double arestaUm = scanner.nextDouble();
            System.out.println("Digite aresta dois");
            Double arestaDois = scanner.nextDouble();
            Double areaRetangulo = arestaUm * arestaDois;
            System.out.println("A área do retâgulo é: " + areaRetangulo);
        }

        private void areaCirculo(Scanner scanner) {
            System.out.println("Digite o valor do raio");
            Double raio = scanner.nextDouble();
            Double areaCirculo = (raio * raio) * 3.14;
            System.out.println("A área do retângulo é: " + areaCirculo);
        }

        private void areaTriangulo(Scanner scanner) {
            System.out.println("Digite o valor da base");
            Double base = scanner.nextDouble();
            System.out.println("Digite o valor da altura");
            Double altura = scanner.nextDouble();
            Double areaTriangulo = (base * altura) / 2;
            System.out.println("A área do triângulo é: " + areaTriangulo);

        }

    }

    public class Perimetro {
        private void perimetroRetangulo(Scanner scanner) {
            System.out.println("Digite aresta um");
            Double arestaUm = scanner.nextDouble();
            System.out.println("Digite aresta dois");
            Double arestaDois = scanner.nextDouble();
            Double perimetroRetangulo = (arestaUm * 2) + (arestaDois * 2);
            System.out.println("O perímetro do retâgulo é: " + perimetroRetangulo);
        }

        private void perimetroCiculo(Scanner scanner) {
            System.out.println("Digite o valor do raio");
            Double raio = scanner.nextDouble();
            Double perimetroCirculo = (raio * 3.14) * 2;
            System.out.println("O perímetro do retângulo é: " + perimetroCirculo);
        }

        private void perimetroTriangulo(Scanner scanner){
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
}
