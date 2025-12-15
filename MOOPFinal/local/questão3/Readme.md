⚔️ Desafio Hardcore: Dark Souls POO

Tempo estimado: 60 min Objetivo: Você recebeu apenas o motor de entrada (Main) de um jogo. Ele define COMO o jogo deve ser jogado, mas não existe NENHUMA lógica implementada. Você deve criar todas as classes, exceções e relacionamentos para que, ao descomentar as linhas da Main, o jogo funcione.
📜 Requisitos (O que você deve criar)

    Tratamento de Erro (Checked Exceptions):

        SemEstaminaException: Quando estamina insuficiente.

        ArmaQuebradaException: Quando durabilidade da arma chega a 0.

    Hierarquia de Armas:

        Arma (Pai): nome, danoBase, durabilidade (0-100).

        Espada (Filha): tem afiacao. Dano = base + afiacao.

        Cajado (Filha): tem poderMagico. Dano = base + (poderMagico/2).

    Hierarquia de Personagens:

        Personagem (Abstrata): nome, vida, estamina (0-100), armaEquipada.

        Cavaleiro (Filho): Gasta 10 estamina. Dano = DanoArma + 5.

        Mago (Filho): Gasta 25 estamina. Dano = DanoArma + 10.

    Regras de Combate (Polimorfismo):

        O método atacar() é abstrato no pai e concreto nos filhos.

        Antes de atacar, verifique: Estamina, Durabilidade da Arma e se a Arma existe (Null).

        Se passar, reduza estamina e durabilidade.
