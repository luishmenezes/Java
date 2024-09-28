
# Lista de Exercícios
<img src="assets/images/Unicap_Icam_Tech-01.png" alt="drawing" width="200"/>

## Identificação
**Professor**: Iago Rodrigues

**Disciplina**: Programação Orientada a Objetos

**Atividade**: Lista de Exercícios 02

**Estudante**: LUIS HENRIQUE PORTO MENEZES

## Instruções 
> 1. Sua implementação deve estar dentro da pasta src/**main**/java/br/unicap/poo/atividade 
> 2. A submissão **não deve ser feita após o prazo**
> 3. Para cada exercício, criar um pacote dentro da pasta "atividade", que deve conter a classe base e a classe Main

## Exercícios

> Lembrando: Para cada questão a seguir, se faz necessário a criação da classe base e também da classe Main, a qual irá criar objetos a partir da classe base.
> 
> Todos os exercícios devem utilizar **múltiplos construtores**, de acordo com a necessidade de cada cenário.
> 
> **Encapsule os atributos** das classes, criando os respectivos **getters** e **setters**.
>
> Utilize **ArrayList** explicitamente onde necessário.

### Questão 01

Crie uma classe `Livro` com os atributos `titulo` e `autor`. Em seguida, crie uma classe `Biblioteca` que tenha o método `adicionarLivro(Livro livro)` que recebe um objeto do tipo `Livro` e imprime uma mensagem no console dizendo que o livro foi adicionado à biblioteca.

**Instruções para Main**:

-   Na classe `Main`, crie uma instância de `Biblioteca` e duas instâncias de `Livro`.
-   Use o método `adicionarLivro` para adicionar os livros à biblioteca e exibir as mensagens no console.

### Questão 02

Implemente uma classe `Cliente` com o atributo `nome`, e uma classe `Pedido` com o atributo `valorTotal`. Crie um método em `Pedido` chamado `adicionarCliente(Cliente cliente)`, que exibe no console o nome do cliente e o valor do pedido.

**Instruções para Main**:

-   Na classe `Main`, crie uma instância de `Cliente` e uma de `Pedido`.
-   Chame o método `adicionarCliente` e exiba as informações no console.

### Questão 03


Implemente as classes `Aluno` e `Curso`. Um curso pode ter vários alunos, mas os alunos podem existir independentemente do curso. Na classe `Curso`, mantenha um **ArrayList de Aluno** e implemente o método `adicionarAluno(Aluno aluno)` para adicionar um aluno à lista de alunos. Crie também o método `listarAlunos()` que imprime o nome de todos os alunos cadastrados.

**Atributos da Classe Aluno**:

-   `nome` (String)
-   `idade` (int)
-   `matricula` (String)
-   `email` (String)
-   `mediaFinal` (double)

**Atributos da Classe Curso**:

-   `nome` (String)
-   `codigo` (String)
-   `duracao` (int) // em semestres
-   `descricao` (String)
-   `cargaHoraria` (int) // em horas
-   `alunos` (ArrayList< Aluno>)

**Relação**: `Curso` contém vários `Aluno`, mas `Aluno` existe independentemente de `Curso`. A relação é representada por um `ArrayList<Aluno>`.

**Instruções para Main**:

-   Crie um curso e três alunos.
-   Adicione os alunos ao curso usando o método `adicionarAluno` e, em seguida, chame o método `listarAlunos` para listar todos os alunos.

### Questão 04

Implemente uma classe `Jogador` e uma classe `Time`. Um time pode ter vários jogadores, mas os jogadores podem existir independentemente do time. Na classe `Time`, mantenha um **ArrayList de Jogador** e implemente o método `adicionarJogador(Jogador jogador)` e o método `listarJogadores()`.

**Atributos da Classe Jogador**:

-   `nome` (String)
-   `posicao` (String)
-   `numeroCamisa` (int)
-   `golsMarcados` (int)
-   `altura` (double)

**Atributos da Classe Time**:

-   `nome` (String)
-   `cidade` (String)
-   `fundacao` (int) // ano de fundação
-   `estadio` (String)
-   `numeroTitulos` (int)
-   `jogadores` (ArrayList< Jogador>)

**Relação**: `Time` contém vários `Jogador`, mas `Jogador` existe independentemente de `Time`. A relação é representada por um `ArrayList<Jogador>`.

**Instruções para Main**:

-   Crie uma instância de `Time` e três instâncias de `Jogador`.
-   Adicione os jogadores ao time e chame o método `listarJogadores`.

### Questão 05

Implemente uma classe `Departamento` e uma classe `Empresa`. Uma empresa pode ter vários departamentos, mas os departamentos podem existir independentemente da empresa. Na classe `Empresa`, mantenha um **ArrayList de Departamento** e implemente o método `adicionarDepartamento(Departamento departamento)` e o método `listarDepartamentos()`.

**Atributos da Classe Departamento**:

-   `nome` (String)
-   `codigo` (String)
-   `numeroFuncionarios` (int)
-   `orcamentoAnual` (double)
-   `gerenteResponsavel` (String)

**Atributos da Classe Empresa**:

-   `nome` (String)
-   `cnpj` (String)
-   `numeroFuncionarios` (int)
-   `cidadeSede` (String)
-   `faturamentoAnual` (double)
-   `departamentos` (ArrayList< Departamento>)

**Relação**: `Empresa` contém vários `Departamento`, mas `Departamento` existe independentemente de `Empresa`. A relação é representada por um `ArrayList<Departamento>`.

**Instruções para Main**:

-   Crie uma instância de `Empresa` e três instâncias de `Departamento`.
-   Adicione os departamentos à empresa e chame o método `listarDepartamentos`.

### Questão 06

Implemente uma classe `Professor` e uma classe `Disciplina`. Uma disciplina pode ter vários professores, mas os professores podem existir independentemente da disciplina. Na classe `Disciplina`, além de manter um **ArrayList de Professor**, crie o método `adicionarProfessor(Professor professor)` e um método `obterProfessorComMaiorSalario()` que retorna o professor com o maior salário. Também implemente o método `listarProfessores()`.

**Atributos da Classe Professor**:

-   `nome` (String)
-   `especialidade` (String)
-   `titulação` (String)
-   `idade` (int)
-   `salario` (double)

**Atributos da Classe Disciplina**:

-   `nome` (String)
-   `codigo` (String)
-   `cargaHoraria` (int)
-   `nivel` (String) // Ex: Graduação, Pós-graduação
-   `descricao` (String)
-   `professores` (ArrayList<Professor>)

**Relação**: `Disciplina` contém vários `Professor`, mas `Professor` existe independentemente de `Disciplina`.

**Instruções para Main**:

-   Crie uma instância de `Disciplina` e três instâncias de `Professor`.
-   Adicione os professores à disciplina.
-   Liste os professores e também exiba o professor com o maior salário.

### Questão 07

Crie uma classe `Usuário` e uma classe `Biblioteca`. Uma biblioteca pode ter vários usuários, mas os usuários podem existir independentemente da biblioteca. Na classe `Biblioteca`, além de manter um **ArrayList de Usuário**, crie métodos para `adicionarUsuario(Usuario usuario)` e `removerUsuario(String matricula)` que remove um usuário com base em sua matrícula. Também implemente o método `listarUsuarios()`.

**Atributos da Classe Usuário**:

-   `nome` (String)
-   `matricula` (String)
-   `telefone` (String)
-   `email` (String)
-   `dataNascimento` (String)

**Atributos da Classe Biblioteca**:

-   `nome` (String)
-   `endereco` (String)
-   `numeroLivros` (int)
-   `horarioFuncionamento` (String)
-   `capacidadeUsuarios` (int)
-   `usuarios` (ArrayList<Usuario>)

**Relação**: `Biblioteca` contém vários `Usuário`, mas `Usuário` existe independentemente de `Biblioteca`.

**Instruções para Main**:

-   Crie três instâncias de `Usuario` e adicione-as à `Biblioteca`.
-   Remova um usuário pela matrícula e liste os usuários restantes.

### Questão 08

Crie uma classe `Motor` com o atributo `tipo` e uma classe `Carro` que tem um `Motor`. O motor deve ser criado quando o carro for instanciado. O `Carro` deve ter métodos como `mostrarDetalhes()` e `verificarVelocidadeMaxima()`, onde a velocidade máxima varia de acordo com o tipo do motor.

**Atributos da Classe Motor**:

-   `tipo` (String)
-   `cilindrada` (double)
-   `potencia` (int)
-   `fabricante` (String)
-   `consumo` (double) // consumo por litro

**Atributos da Classe Carro**:

-   `modelo` (String)
-   `ano` (int)
-   `cor` (String)
-   `motor` (Motor) // Composição
-   `velocidadeAtual` (double)

**Relação**: `Carro` contém um `Motor`, e o `Motor` depende do ciclo de vida do `Carro` (composição).

**Instruções para Main**:

-   Crie dois carros, cada um com um tipo de motor diferente.
-   Chame os métodos `mostrarDetalhes` e `verificarVelocidadeMaxima()` para verificar a velocidade máxima permitida de acordo com o motor.


### Questão 09

Implemente uma classe `Comodo` e uma classe `Casa`. Uma casa contém vários cômodos, e os cômodos **não podem existir fora da casa** (composição). Adicione métodos como `adicionarComodo(Comodo comodo)`, `removerComodo(String nomeComodo)` e `calcularAreaTotal()` para calcular a área total da casa com base nos cômodos.

**Atributos da Classe Comodo**:

-   `nome` (String)
-   `largura` (double)
-   `comprimento` (double)
-   `tipo` (String) // Ex: Sala, Cozinha, Quarto
-   `janelas` (int)

**Atributos da Classe Casa**:

-   `endereco` (String)
-   `numeroComodos` (int)
-   `tamanhoTerreno` (double) // área total do terreno
-   `comodos` (ArrayList<Comodo>) // Composição
-   `proprietario` (String)

**Relação**: A `Casa` contém vários `Comodo`, e os `Comodo` dependem totalmente da `Casa` (composição).

**Instruções para Main**:

-   Crie uma instância de `Casa` e três instâncias de `Comodo`.
-   Adicione os cômodos à casa e remova um cômodo.
-   Calcule a área total da casa com base nos cômodos e exiba.

### Questão 10

Implemente uma classe `Processador` e uma classe `Computador`. Um computador possui um processador, e o processador não pode existir fora do computador (composição). O computador deve permitir a troca de processador (`trocarProcessador(Processador processador)`), e implementar métodos como `verificarDesempenho()` que calcula o desempenho com base nas especificações do processador.

**Atributos da Classe Processador**:

-   `modelo` (String)
-   `frequencia` (double) // em GHz
-   `numeroNucleos` (int)
-   `cache` (double) // em MB
-   `fabricante` (String)

**Atributos da Classe Computador**:

-   `marca` (String)
-   `memoriaRAM` (int) // em GB
-   `armazenamento` (int) // em GB
-   `processador` (Processador) // Composição
-   `placaDeVideo` (String)

**Relação**: O `Computador` contém um `Processador`, e o `Processador` depende do ciclo de vida do `Computador` (composição).

**Instruções para Main**:

-   Crie uma instância de `Computador` com um `Processador`.
-   Chame o método `verificarDesempenho` e simule a troca de processador.
-   Após trocar o processador, verifique o desempenho novamente.
