public class OperadoresRelacionais {
        public static void main(String[] args) {
                String nomeUm = "Karol";
                String nomeDois = new String ("Karol");

                System.out.println(nomeUm.equals(nomeDois)); //equals compara entre dois conteudos, objetos
                // Para numero Operadores Relacionais

                int numero1 = 1;
                int numero2 = 2;

                boolean simNao = numero1 == numero2;

                if (numero1 == numero2){ //true
                        System.out.println("a nossa condição é verdadeira");
                }

                System.out.println("numeroUm é igual a numeroDois? " + simNao);
        
                simNao = numero1 != numero2;

                System.out.println("numero é igual a numeroDois? " + simNao);

                simNao = numero1 != numero2;

                System.out.println("numero é igual a numeroDois? " + simNao);

                simNao = numero1 > numero2;

                System.out.println("numero é igual a numeroDois? " + simNao);
        }
}
