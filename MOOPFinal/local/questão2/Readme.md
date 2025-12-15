Exercício: O Sistema de Shows
Contexto: Você foi contratado para finalizar o backend de um sistema de gerenciamento de instrumentos musicais. O arquiteto de software já escreveu a classe Main (que processa os comandos de entrada) e definiu a estrutura das classes, mas toda a lógica interna está vazia.

Sua Missão: Complete o código implementando a lógica das classes InstrumentoDesafinadoException, Instrumento, Violao, Piano e Palco. Siga rigorosamente os requisitos abaixo para que o código funcione com a Main.

1. Classe InstrumentoDesafinadoException
   Esta é uma exceção personalizada.

Construtor: Deve receber o nome do instrumento e passar para o construtor da superclasse (super) a seguinte mensagem exata: "O instrumento [nome] esta desafinado! Nao pode tocar."

2. Classe Instrumento (Classe Pai)
   Esta classe representa um instrumento genérico.

Atributos: Deve ter um atributo para o nome (String) e um estado para saber se está afinado (boolean). Dica: Use protected para facilitar o acesso nas classes filhas.

Construtor: Recebe o nome e inicializa o instrumento como desafinado (false) por padrão.

Método afinar(): Muda o estado para afinado e retorna a mensagem: "O instrumento [nome] foi afinado com sucesso!".

Método tocar():

Verifica se está afinado.

Se NÃO estiver: Lança a InstrumentoDesafinadoException.

Se estiver: Retorna "Tocando instrumento generico.".

3. Classes Violao e Piano (Classes Filhas)
   Ambas devem herdar de Instrumento.

Construtor: Deve receber o nome e repassar para o construtor da classe pai.

Método tocar() (Sobrescrita):

Deve verificar se está afinado (igual ao pai). Se não, lança a exceção.

Se estiver afinado, retorna a mensagem específica:

Violão: "Violao [nome] tocou: STRUMMM!"

Piano: "Piano [nome] tocou: PLIN PLIN PLIN!"

4. Classe Palco (Gerenciador)
   Esta classe gerencia a banda.

Atributos: Deve possuir uma lista (ArrayList) para armazenar os instrumentos.

Método adicionar(Instrumento i): Adiciona o instrumento na lista e imprime: "[nome] adicionado ao palco.".

Método buscar(String nome): Procura um instrumento na lista pelo nome. Retorna o objeto se achar, ou null se não achar.

Método showAoVivo():

Imprime: "--- INICIANDO O SHOW ---".

Percorre a lista de instrumentos e chama o método tocar() para cada um.

Tratamento de Erro: O showAoVivo não pode travar se um instrumento falhar. Você deve usar try-catch dentro do loop. Se um instrumento estiver desafinado, capture a exceção e imprima: "FALHA NO SHOW: [mensagem da exceção]".

Ao final do loop, imprime: "--- FIM DO SHOW ---".

Dicas para o Aluno:
Analise a classe Main para entender como os métodos são chamados.

Lembre-se de importar java.util.ArrayList.

Cuidado com a lógica do showAoVivo: se o try-catch estiver fora do loop, o show acaba no primeiro erro. Se estiver dentro, o show continua com os próximos instrumentos.
