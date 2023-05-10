import java.util.Scanner;

public class consumoCombustivel {
    public static void main(String[] args) {

 // VARIÁVEIS 

        String placaVeiculo = "";
        double valorCombustivel, consumoA60, consumoA80, consumoA100, consumoA120, consumoA140, custoViagem, consumoTotal, mediaPonderada;
        int quilometrosA60, quilometrosA80, quilometrosA100, quilometrosA120, quilometrosA140;

        Scanner scanner = new Scanner(System.in);

// ENTRADA DE DADOS

        System.out.println("Informe os dados a seguir.");

        System.out.println("Placa do veículo:");
        placaVeiculo = scanner.nextLine();

        System.out.println("Valor do litro do combustível:");
        valorCombustivel = scanner.nextDouble();
        
        System.out.println("Quilômetros rodados a 60 KM/H:");
        quilometrosA60 = scanner.nextInt();

        System.out.println("Quilômetros rodados a 80 KM/H:");
        quilometrosA80 = scanner.nextInt();

        System.out.println("Quilômetros rodados a 100 KM/H:");
        quilometrosA100 = scanner.nextInt();

        System.out.println("Quilômetros rodados a 120 KM/H:");
        quilometrosA120 = scanner.nextInt();

        System.out.println("Quilômetros rodados a 140 KM/H:");
        quilometrosA140 = scanner.nextInt();

// CÁLCULOS

consumoA60 = (quilometrosA60 / 30.7);
consumoA80 = (quilometrosA80 / 26.8);
consumoA100 = (quilometrosA100 / 22.4);
consumoA120 = (quilometrosA120 / 18.1);
consumoA140 = (quilometrosA140 / 14.5);

consumoTotal = (consumoA60 + consumoA80 + consumoA100 + consumoA120 + consumoA140);

mediaPonderada = (((quilometrosA60) * 60 + (quilometrosA80) * 80 + (quilometrosA100) * 100 + (quilometrosA120) * 120 + (quilometrosA140) * 140) / 100);

custoViagem = (consumoTotal * valorCombustivel);

// SAÍDA


System.out.println("\nRELATÓRIO");

System.out.println("\nPlaca do veículo: " + placaVeiculo);
System.out.printf("Custo total da viagem: R$ %.2f", custoViagem );
System.out.println("\nVelocidade média da viagem: " + mediaPonderada + "KM/H");
System.out.printf("Quantidade total de combustível: %.2f", consumoTotal);
System.out.println("L");


scanner.close();
    }
}

//  Paulo Vítor Amorim de Oliveira RA: 323114192