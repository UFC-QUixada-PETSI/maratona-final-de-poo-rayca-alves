import java.util.Scanner;
import java.util.ArrayList;

// ==================================================================================
// PASSO 1: CLASSE MÃE (MIDIA)
// ==================================================================================
class Midia {
    // TODO: Atributos privados (titulo, duracao, tocando)
    protected String titulo; // Use protected ou private com getters se preferir
    protected boolean tocando;

    public Midia(String titulo) {
        // TODO: Inicialize titulo e tocando = false
    }

    public String tocar() {
        // TODO: 
        // Se já estiver tocando, retorne "[titulo] ja esta reproduzindo."
        // Se não, mude tocando para true e retorne "Reproduzindo midia: [titulo]"
        return "";
    }
}

// ==================================================================================
// PASSO 2: SUBCLASSES (FILME E MUSICA)
// ==================================================================================

// class Filme extends Midia {
    // Atributo extra: diretor
    // TODO: Construtor (chame super)
    
    // TODO: Sobrescreva o método tocar().
    // Mude tocando = true.
    // Retorne "Exibindo filme: [titulo] do diretor [diretor]"
// }

// class Musica extends Midia {
    // Atributo extra: artista
    // TODO: Construtor (chame super)
    
    // TODO: Sobrescreva o método tocar().
    // Mude tocando = true.
    // Retorne "Tocando musica: [titulo] - [artista]"
// }


// ==================================================================================
// PASSO 3: GERENCIADOR (PLATAFORMA)
// ==================================================================================
class Plataforma {
    private ArrayList<Midia> playlist = new ArrayList<>();

    public void adicionar(Midia m) {
        playlist.add(m);
    }

    public void reproduzirTudo() {
        System.out.println("--- PLAYLIST ---");
        // TODO: Percorra a lista e chame o método tocar() de cada elemento.
        // Imprima o resultado de cada chamada.
    }
}

// ==================================================================================
// MAIN
// ==================================================================================
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Plataforma cineDev = new Plataforma();
        // Para testes unitários manuais do passo 1
        Midia midiaTemp = null; 

        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine().trim();
            if (linha.isEmpty()) continue;
            System.out.println("$" + linha);
            String[] tokens = linha.split(" ");
            String cmd = tokens[0].toLowerCase();

            try {
                switch (cmd) {
                    case "end": scanner.close(); return;
                    case "init": cineDev = new Plataforma(); break;

                    case "midia": // PASSO 1
                        midiaTemp = new Midia(tokens[1]);
                        break;
                    
                    case "tocar_midia": // PASSO 1
                        if (midiaTemp != null) System.out.println(midiaTemp.tocar());
                        break;

                    case "filme": // PASSO 2
                        // Ex: filme Matrix Wachowski
                        // TODO: Descomente
                        // cineDev.adicionar(new Filme(tokens[1], tokens[2]));
                        break;

                    case "musica": // PASSO 2
                        // Ex: musica HeyJude Beatles
                        // TODO: Descomente
                        // cineDev.adicionar(new Musica(tokens[1], tokens[2]));
                        break;

                    case "playlist": // PASSO 3
                        cineDev.reproduzirTudo();
                        break;
                }
            } catch (Exception e) { System.out.println("Erro: " + e.getMessage()); }
        }
    }
}