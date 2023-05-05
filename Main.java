public class Main {
    private int numero;
    private int temporario;
    private String divisores;


    public boolean numeroPerfeito(int numero) {
        this.numero = numero;
        boolean resposta = false;
        if (this.numero == 1) {
            resposta = false;
        } else if (this.numero > 2) {
            temporario = 0;
            divisores = ""; // seqüência de divisores
            for (int i = 1; i <= (this.numero / 2); i++) {
                if ((this.numero % i) == 0) {
                    temporario += i;
                    if (divisores.length() > 0) {
                        divisores += (" + " + i);    // concatena os divisores
                    } else {
                        divisores = ("= " + i);   // na variável string "divisores"
                    }
                }
                else {
                    resposta = false;
                }
                if (this.numero == temporario){
                    resposta = true;
                }
            }
        }
        return resposta;
    }
}