
package array;


public class Array {

   
    public static void main(String[] args) {
       
       String[] nomes = new String[2];
       double[] preco = new double[2];
       int[] quanti = new int[2];

      nomes[0] = "Smartphone";
      preco[0] = 600.99;
      quanti[0] = 2;
      
      
      for(int i=0; i < 2; i++){  
      
      
          
          System.out.println("Produto: " + nomes[i] + "    Preço: " + preco[i] + "     Quantidade: " + quanti[i]);
          System.out.println("=====================================================================");
          System.out.println("Valor Total:  1.200.98  ");
          
          
          
          
      
      }     
        
    }
    
}
