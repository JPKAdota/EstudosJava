package Lista;

public class ExemploOrdenacaoList {
    public static void main(String[] args) {
        System.out.println();
    }
}


class Gato{
    private String nome;
    private Integer idade;
    private  String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }


}