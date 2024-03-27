package Doc;
/*
* @author Rikckmy Giliade
* */
public class Doc2 {
    public static void main(String[] args) {
        // comentário de uma única linha
        /*
        * múltiplas linhas
        * */


    }
    /**
     * método de documentação
     * */
   public int soma (int x, String m, int n){
       int r = 0;
       if (m == "M"){
           r = n * x;
       } else {
         r = n + x;
       }
   return r;
   }
}
