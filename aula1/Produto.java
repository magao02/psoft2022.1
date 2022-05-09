public class Produto{
    private String ID;
    private String nome;
    private String fabricante;

    public Produto(String id, String nome, String fabricante ){
        this.ID = id;
        this.nome = nome;
        this.fabricante = fabricante;
    }
    public String getNome(){
        return this.nome;
    }
    public String toString(){
        String retorno = "O ID é " + this.ID +" "+"o produto é "+ this.nome + " e o fabricante é "+ this.fabricante;
        System.out.println(retorno);
        return retorno ;
    }
}