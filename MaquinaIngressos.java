/**
 * MaquinaIngressos modela uma máquina de ingressos ingênua que
 * emite ingressos de preço fixo.
 * O preço de um ingresso é definido através do construtor.
 * É uma máquina ingênua porque ela confia que os clientes
 * colocarão a quantidade de dinheiro suficiente antes de tentar
 * emitir um ingresso.
 * Ela também assume que os clientes colocarão quantidades
 * razoáveis.
 * 
 * Traduzido por Julio César Alves - 2023-08-31
 *
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class MaquinaIngressos
{
    // O preço de um ingresso desta máquina
    private int preco;
    // A quantidade de dinheiro que o usuário colocou até o momento.
    private int saldo;
    // A quantidade total de dinheiro coletada pela máquina.
    private int total;

    /**
     * Cria uma máquina que emite ingressos de um dado preço.
     * Note que o preço deve ser maior que zero, e não tem
     * nenhuma verificação para garantir isso.
     */
    public MaquinaIngressos(int custoIngresso)
    {
        preco = custoIngresso;
        saldo = 0;
        total = 0;
    }

    /**
     * Retorna o preço do ingresso.
     */
    public int obterPreco()
    {
        return preco;
    }

    /**
     * Retorna a quantidade de dinheiro já inserida para o
     * próximo ingresso.
     */
    public int obterSaldo()
    {
        return saldo;
    }

    /**
     * Recebe uma quantidade de dinheiro de um cliente.
     */
    public void inserirDinheiro(int quantidade)
    {
        saldo = saldo + quantidade;
    }

    /**
     * Imprime um ingresso.
     * Atualiza o total coletado e reduz o saldo para zero.
     */
    public void imprimirIngresso()
    {
        // Simula a impressão de um ingresso
        System.out.println("##################");
        System.out.println("# Ingressos & Cia ");
        System.out.println("# Ingresso");
        System.out.println("# " + preco + " centavos.");
        System.out.println("##################");
        System.out.println();

        // Atualiza o total coletado com o saldo
        total = total + saldo;
        // Zera o saldo
        saldo = 0;
    }
}
