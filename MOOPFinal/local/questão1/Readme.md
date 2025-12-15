🎬 Desafio POO: CineDev Streaming

Objetivo: Construir o backend de uma plataforma que suporta diferentes tipos de mídia.

Conceitos:

    A classe Midia (pai) define o comportamento genérico.

    As classes Filme e Musica (filhas) personalizam como o conteúdo é exibido.

    A classe Plataforma gerencia uma lista genérica.

📜 Roteiro de Desenvolvimento
🟢 Passo 1: A Mídia Genérica (Teste 01)

Foco: Encapsulamento e Estado.

    Crie a classe Midia.

    Atributos privados: titulo (String), duracao (int - em minutos), tocando (boolean).

    Construtor: Recebe título e duração. Inicializa tocando = false.

    Método tocar():

        Se tocando for true, retorne: "[titulo] ja esta reproduzindo."

        Se tocando for false, mude para true e retorne: "Reproduzindo midia: [titulo]"

🟡 Passo 2: Especializações (Teste 02)

Foco: Herança e Sobrescrita.

    Crie a classe Filme que estende Midia.

        Novo atributo: diretor (String).

        Sobrescreva tocar(): "Exibindo filme: [titulo] do diretor [diretor]" (Lembre de mudar o estado tocando para true, talvez usando super ou métodos protegidos, ou apenas simulando a string).

    Crie a classe Musica que estende Midia.

        Novo atributo: artista (String).

        Sobrescreva tocar(): "Tocando musica: [titulo] - [artista]"

🔵 Passo 3: A Playlist Polimórfica (Teste 03)

Foco: Polimorfismo.

    Na classe Plataforma, crie uma ArrayList<Midia>.

    Método adicionar(Midia m).

    Método reproduzirTudo(): Percorre a lista e chama o método tocar() de cada item.

        Aqui você verá o polimorfismo: o código é o mesmo, mas a saída muda dependendo se é filme ou música.
