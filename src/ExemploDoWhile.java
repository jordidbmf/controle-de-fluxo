import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {
        System.out.println(("Discando..."));

        do{
            //executando repetidas vezes até alguém atender
            System.out.println("Telefone tocando");

        }while(tocando());
            System.out.println("Alô!!!");
        
    }

    private static boolean tocando(){
            //valor aleatório entre 1 e 3, se for 1 é verdadeiro
            boolean atendeu = new Random().nextInt(3) == 1;
            System.out.println("Atendeu? " + atendeu);
            //negando o ato de continuar rocando. Se o atendeu for true acaba o tocando()
            return !atendeu;
        }
}
