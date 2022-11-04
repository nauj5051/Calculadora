import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        char confirmação = 'S';
        while(confirmação == 'S'){
        System.out.println("BEM VINDO A SUA CALCULADORA, PRIMEIRO, DIGITE DOIS NÚMEROS QUE DESJA FAZER SUA OPERAÇÃO");
        Scanner digite = new Scanner(System.in);
        double numero1 = digite.nextDouble();
        double numero2 = digite.nextDouble();
        System.out.println("AGORA DIGITE QUAL OPERAÇÃO VOCÊ QUER FAZER, PARA SOMA DIGITE '+', PARA SUBTRAÇÃO DIGITE '-', PARA MULTIPLICAÇÃO DIGITE 'x' E PARA DIVISÃO DIGITE '/'. ");
        char operação = digite.next().charAt(0);
        if(operação == '+'){
            double resultado = numero1 + numero2;
            System.out.println("O RESULTADO DA SUA OPERAÇÃO É: " + resultado);
        }
        else if(operação == '-'){
            double resultado = numero1 - numero2;
            System.out.println("O RESULTADO DA SUA OPERAÇÃO É: " + resultado);
        }
        else if(operação == '/'){
            double resultado = numero1/numero2;
            System.out.println("O RESULTADO DA SUA OPERAÇÃO É: " + resultado);
        }
        else if(operação == 'x'){
            double resultado = numero1 * numero2;
            System.out.println("O RESULTADO DA SUA OPERAÇÃO É: " + resultado);
        }
        System.out.println("DESEJA CONTINUAR USANDO A CALCULADORA?");
         confirmação = digite.next().charAt(0);
        if(confirmação =='S'){
            continue;
        }
        else{
            break;
        }
    }
    }
}
