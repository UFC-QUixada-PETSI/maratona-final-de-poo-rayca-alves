import java.util.ArrayList;
import java.util.Scanner;

// ==================================================================================
// PASSO 2: EXCEÇÃO PERSONALIZADA
// ==================================================================================
class InstrumentoDesafinadoException extends Exception {
    public InstrumentoDesafinadoException(String nome) {
        
    }
}

// ==================================================================================
// PASSO 1: CLASSE PAI (INSTRUMENTO)
// ==================================================================================
class Instrumento {
    protected String nome;
    protected boolean afinado;

    public Instrumento(String nome) {
       
    }

    public String getNome() {
        return this.nome;
    }

    public String afinar() {
       
        return "";
    }

    // PASSO 2: 
    public String tocar() throws InstrumentoDesafinadoException {
    
        return "Tocando instrumento generico.";
    }
}

// ==================================================================================
// PASSO 3: CLASSES FILHAS
// ==================================================================================

// class Violao extends Instrumento {
  
// }

// class Piano extends Instrumento {
   
// }


// ==================================================================================
// PASSO 4: O PALCO (GERENCIADOR)
// ==================================================================================
class Palco {
    private ArrayList<Instrumento> instrumentos = new ArrayList<>();

    public void adicionar(Instrumento i) {
        
    }

    public Instrumento buscar(String nome) {
        
        return null;
    }

    public void showAoVivo() {
        System.out.println("--- INICIANDO O SHOW ---");
       
        
        System.out.println("--- FIM DO SHOW ---");
    }
}

// ==================================================================================
// MAIN
// ==================================================================================
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Palco palco = new Palco();

        while (true) {
            if (!scanner.hasNextLine()) break;
            String linha = scanner.nextLine().trim();
            if (linha.isEmpty()) continue;
            
            System.out.println("$" + linha);
            String[] tokens = linha.split(" ");
            String cmd = tokens[0].toLowerCase();

            try {
                if (cmd.equals("end")) {
                    break;
                } else if (cmd.equals("init")) {
                    palco = new Palco();
                    
                } else if (cmd.equals("add")) { // PASSO 1 e 4
                    palco.adicionar(new Instrumento(tokens[1]));
                    
                } else if (cmd.equals("violao")) { // PASSO 3
                    // TODO: Descomente
                    // palco.adicionar(new Violao(tokens[1]));
                    
                } else if (cmd.equals("piano")) { // PASSO 3
                    // TODO: Descomente
                    // palco.adicionar(new Piano(tokens[1]));
                    
                } else if (cmd.equals("afinar")) { // PASSO 1
                    Instrumento i = palco.buscar(tokens[1]);
                    if (i != null) System.out.println(i.afinar());
                    
                } else if (cmd.equals("tocar")) { // PASSO 2
                    Instrumento i = palco.buscar(tokens[1]);
                    if (i != null) System.out.println(i.tocar());
                    
                } else if (cmd.equals("show")) { // PASSO 4
                    palco.showAoVivo();
                }
                
            } catch (InstrumentoDesafinadoException e) {
                System.out.println("ERRO: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        scanner.close();
    }
}