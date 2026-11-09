# ☕ N2 - Exercício Prático (Ponto Extra) | Java e Programação Orientada a Objetos

Projeto desenvolvido em **Java** como atividade prática de **Programação Orientada a Objetos (POO)**. O repositório reúne três exercícios que aplicam, na prática, os pilares da orientação a objetos: **encapsulamento**, **estruturas de controle** (laços e menus) e **herança com sobrescrita de métodos**.

---

## 📚 Exercícios

### 1️⃣ Validação e Encapsulamento de Dados Acadêmicos
Classes: `AlunoBCC` e `TestaAluno` (pacote `unidade5.laboratorio`)

Modela um aluno com RA, nome e duas notas. Os atributos são privados e as notas só são aceitas pelo *setter* se estiverem entre **0,0 e 10,0**.

- Média semestral ponderada: **N1 (40%) + N2 (60%)**
- Situação: **Aprovado** (média ≥ 6,0) ou **Exame / Reprovado**
- `TestaAluno` lê os dados pelo teclado e imprime o boletim final

### 2️⃣ Sistema de Controle de Estoque com Laço e Menu
Classes: `ItemEstoque` e `TestaEstoque`

Controla o estoque de um item por meio de um menu interativo (`do-while` + `switch-case`):

| Opção | Ação |
|:---:|---|
| 1 | Consultar estoque e valor total |
| 2 | Dar baixa em itens (com validação de estoque suficiente) |
| 3 | Reabastecer estoque |
| 0 | Sair |

### 3️⃣ Hierarquia de Veículos da Frota (Herança e Sobrescrita)
Classes: `Veiculo`, `CarroPasseio`, `ViaturaUtilitaria` e `TestaFrota`

Superclasse `Veiculo` com o cálculo padrão de aluguel (dias × diária). As subclasses sobrescrevem `calcularAluguel`:

- **`CarroPasseio`**: soma uma taxa fixa de higienização de **R$ 50,00**
- **`ViaturaUtilitaria`**: acrescenta **10%** quando a capacidade de carga é superior a **1000 kg**

**Exemplo de resultado (5 dias):**

| Veículo | Cálculo | Total |
|---|---|---|
| Carro de passeio (diária R$ 100) | 5 × 100 + 50 | **R$ 550,00** |
| Viatura utilitária (diária R$ 200, 1500 kg) | 5 × 200 + 10% | **R$ 1.100,00** |

---

## 🧠 Conceitos aplicados

- Classes, objetos e construtores
- Encapsulamento (`private`, *getters* e *setters*) e validação de dados
- Estruturas de decisão e repetição (`if/else`, `switch`, `do-while`)
- Leitura de dados com `Scanner`
- Herança (`extends`, `super`, `protected`)
- Sobrescrita de métodos (`@Override`) e polimorfismo
- Organização em pacotes (`package`)

---

## 📁 Estrutura do projeto

```
N2-PontoExtra/
└── src/
    ├── unidade5/
    │   └── laboratorio/
    │       ├── AlunoBCC.java
    │       └── TestaAluno.java
    ├── ItemEstoque.java
    ├── TestaEstoque.java
    ├── Veiculo.java
    ├── CarroPasseio.java
    ├── ViaturaUtilitaria.java
    └── TestaFrota.java
```

---

## ▶️ Como executar

**Pré-requisito:** JDK 17 ou superior (`java -version` para conferir).

Clone o repositório e entre na pasta `src`:

```bash
git clone https://github.com/SEU-USUARIO/NOME-DO-REPOSITORIO.git
cd NOME-DO-REPOSITORIO/src
```

**Exercício 1** (usa pacote, por isso é executado pelo nome completo):

```bash
javac unidade5/laboratorio/*.java
java unidade5.laboratorio.TestaAluno
```

**Exercício 2:**

```bash
javac ItemEstoque.java TestaEstoque.java
java TestaEstoque
```

**Exercício 3:**

```bash
javac Veiculo.java CarroPasseio.java ViaturaUtilitaria.java TestaFrota.java
java TestaFrota
```

> 💡 Ao digitar números decimais no Exercício 1, use **vírgula** (ex.: `7,5`) em sistemas configurados em português do Brasil.

---

## 🛠️ Tecnologias

- Java (JDK 17+)
- Visual Studio Code

---

## 👩‍💻 Autora

**Carla**
[GitHub](https://github.com/SEU-USUARIO) · [LinkedIn](https://www.linkedin.com/in/SEU-PERFIL)

---

📌 *Projeto com fins educacionais.*
