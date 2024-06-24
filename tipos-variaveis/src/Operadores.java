public class Operadores{
    public static void main(String[]args){

        int numero = 5;
        boolean variavel =  false;
        variavel = ! variavel;
        int a,b;
        a =  5;
        b =  6;
        int resultado =  a == b ? 100 : 99;// estrutura boleena usando INTERAVÉL 
        // Lembrando: numa operação ternária a primeira expressão SEMPRE 
        // tem que ser uma EXPRESSÃO BOLEANA 
        System.out.println(resultado);
        //numero = - numero; // para o numero para o negativo
        //numero = numero * - 1; // voltando o número ara o valor positivo
        //System.out.println(- numero);
        //numero = numero +1; equivale a: número ++
        System.out.println(-- numero);
        System.out.println(! variavel);

        int numero_1 = 1;
        int numero_2 = 2;
        
        boolean simNao = numero_1 == numero_2;
        System.out.println("Númeroum é igual a númeroDois?\n" + simNao);
        
        simNao = numero_1 != numero_2;
        System.out.println("Númeroum é igual a númeroDois?\n" + simNao);
        
        simNao = numero_1 > numero_2;
        System.out.println("Númeroum é igual a númeroDois?\n" + simNao);
        
         
        if (numero_1 < numero_2) {
            System.out.println("A nossa condição é verdadeira ");
            
        }
        System.out.println("Númeroum é igual a númeroDois?\n" + simNao);
        
        String nomeUm = "VALDEIR";  
        String nomeDois = new String("VALDEIR");
        System.out.println(nomeUm.equals(nomeDois));
        // Exceção à regra, para Strings e/ou objetos usamos a funão(equals) 
        // que compara conteúdo. 

        
        boolean condicao1 = true;
        boolean condicao2 = true;
        
        if (condicao1 && 7 > 4 )// Define se as duas condiçoes são verdadeiras V e V
        {
            System.out.println("As duas condiçoes são vedadeiras ");
        }

        System.out.println("Fim");

        if (condicao1  || condicao2 )// Define se Pelo menos uma das condições é verdadeira V ou V
        {
            System.out.println("Pelo menos uma das condições é verdadeira  ");
        }


        
        
        
            
        }
    }
 
