public class Lote{
    private String ID;
    private Produto produto;
    private int quantidade;

    public Lote(String id, Produto produto, int quant){
        this.ID = id;
        this.produto = produto;
        this.quantidade = quant;
    }
    public void getLote(){
        System.out.println(this.quantidade);
    }
    public String toString(){
        String retorno = "O ID é " + this.ID +" "+"o produto é "+ this.produto.getNome() + " e a quantidade é "+ this.quantidade;
        System.out.println(retorno);
        return retorno; 
    }

}