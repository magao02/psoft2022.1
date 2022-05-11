public class App {
    public static void main(String[] args) throws Exception {
        Produto produto1 = new Produto("Leite", "Itambé");
		Lote lote1 = new Lote(produto1, 200);
		System.out.println(produto1);
		System.out.println(lote1);
    }
}
