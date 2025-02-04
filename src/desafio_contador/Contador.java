package desafio_contador;

import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner contador = new Scanner(System.in);
        try {
            System.out.println("Digite o primeiro número: ");
            int numero1 = contador.nextInt();
            System.out.println("Digite o segundo número: ");
            int numero2 = contador.nextInt();

            //contador

            contadorNumeros(numero1,numero2);


        }catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        } finally {
            contador.close();
        }

    }

    public static void contadorNumeros (int a , int b) throws ParametrosInvalidosException {
        if(a > b) {
            throw  new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        for (int i = a ; i <= b ; i++) {
            System.out.println("Contagem: ");
            System.out.println(i);
        }
    }

}
