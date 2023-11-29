import java.util.*;
public class dowhile4 {
    public static void main(String[] args) {
        try{}
        Scanner scnProduto = new Scanner(System.in);
        Scanner scnQtd = new Scanner(System.in);
        Scanner scnContinuar = new Scanner(System.in);
        boolean continuar = true;

        String[] nomeProdutos = {"Maça (kg)","Pão (Un)","Sabão (Un)","Coca-Cola (2L)","Chocolate (barra)"};
        double[] precosProdutos = {7.59,0.51,27.86,8.99,3.89};

        short codProduto;
        List<Short> codigosProdutosCarrinho = new ArrayList<>();
        List<String> nomesProdutosCarrinho = new ArrayList<>();
        List<Double> precosProdutosCarrinho = new ArrayList<>();

        double  qtdProduto;
        List<Double> qtdsProdutosCarrinho = new ArrayList<>();
        List<Double> subtotalProdutosCarrinho = new ArrayList<>();

        short qtdProdutosCarrinho = 0;
       
        boolean carrinhoCheio = false;
        
        short idProdTemp;
        while (carrinhoCheio == false) {
            idProdTemp = 0;
            while (idProdTemp < nomeProdutos.length){
                System.out.println("cód [" + idProdTemp + " ] - produto: " + nomeProdutos[idProdTemp]);
                idProdTemp++;
            }
            System.out.println("Digite o código do produto que deseja adicionar ao carrinho");
            codProduto = scnProduto.nextShort();

            codigosProdutosCarrinho.add(codProduto);
            nomesProdutosCarrinho.add(nomeProdutos[codProduto]);
            precosProdutosCarrinho.add(precosProdutos[codProduto]);

            System.out.println("Digite o código do produto que deseja adicionar ao carrinho");
            qtdProduto = scnQtd.nextDouble();

            qtdsProdutosCarrinho.add(qtdProduto);
            subtotalProdutosCarrinho.add(precosProdutos[codProduto] * qtdProduto);

            qtdProdutosCarrinho++;
            if (qtdProdutosCarrinho == nomeProdutos.length){
                carrinhoCheio = true;
            }
             System.out.println("Deseja adicionar mais algum produto no carrinho?");
             if (scnContinuar.nextLine().toUpperCase().equals("NAO")) {
                break;
             }
        }
        scnProduto.close();
        scnQtd.close();
        scnContinuar.close();

        Short idprodCarrinhoTmp = 0;
        Double precoTotal = 0.0;
        System.out.println("Os produtos do carrinho são: ");

        while (idprodCarrinhoTmp < nomesProdutosCarrinho.size()) {
            System.out.println(
                " Código " + 
                codigosProdutosCarrinho.get(idprodCarrinhoTmp) +
                "] | Produto: " + 
                nomesProdutosCarrinho.get(idprodCarrinhoTmp) + 
                " | Preço unitário: " + 
                precosProdutosCarrinho.get(idprodCarrinhoTmp) + 
                " | Quantidade: " + 
                qtdsProdutosCarrinho.get(idprodCarrinhoTmp) + 
                " | subtotal: R$ " + 
                subtotalProdutosCarrinho.get(idprodCarrinhoTmp)
                );
                precoTotal += subtotalProdutosCarrinho.get(idprodCarrinhoTmp);
                idprodCarrinhoTmp++;
        }
        System.out.println("Total da compra: R$ " + precoTotal);

    }
}