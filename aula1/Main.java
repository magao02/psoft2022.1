public class Main{
    public static void main(String[] args){
        Produto p = new Produto("asq123", "Leite", "Itambé");
        Lote l1 = new Lote("asanoq123", p, 1100);
        l1.toString();
        p.toString();
       
    }
}