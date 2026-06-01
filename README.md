# Manual de Uso - Bebidas Acoplado

## Visão Geral

**Bebidas Acoplado** é um projeto Java educacional que demonstra o uso de padrões de design, especificamente o **Template Method Pattern**. O projeto simula um sistema de preparação de bebidas, onde cada tipo de bebida segue um processo de preparo estruturado e personalizado.

O aplicativo permite preparar diferentes tipos de bebidas (Café, Chá, Chocolate Quente e Suco) com seus ingredientes específicos, executando um processo de preparo padronizado com customizações particulares para cada tipo de bebida.

## Estrutura do Projeto

```
bebidas-acoplado/
├── src/
│   └── main/
│       └── java/
│           └── org/example/main/
│               ├── Main.java                          # Classe principal da aplicação
│               └── bebidas/
│                   ├── Bebida.java                    # Classe abstrata base
│                   ├── Cafe.java                      # Implementação específica: Café
│                   ├── Cha.java                       # Implementação específica: Chá
│                   ├── ChocolateQuente.java           # Implementação específica: Chocolate Quente
│                   ├── Suco.java                      # Implementação específica: Suco
│                   └── enums/
│                       └── Ingrediente.java           # Enum com todos os ingredientes disponíveis
├── pom.xml                                            # Configuração Maven
└── README.md                                          # Este arquivo
```

## Pré-requisitos

Para executar este projeto, você precisa ter instalado:

- **Java Development Kit (JDK)** versão 17 ou superior
- **Apache Maven** versão 3.6 ou superior

### Verificando a Instalação

Para verificar se o Java está instalado corretamente:
```bash
java -version
```

Para verificar se o Maven está instalado corretamente:
```bash
mvn -version
```

## Como Compilar

Para compilar o projeto, navegue até o diretório raiz do projeto e execute:

```bash
cd bebidas-acoplado
mvn clean compile
```

Comando detalhado:
- `mvn clean` - Remove arquivos de compilação anterior
- `mvn compile` - Compila o código fonte

## Como Executar

Para executar a aplicação compilada, use:

```bash
mvn clean compile exec:java -Dexec.mainClass="org.example.main.Main"
```

Alternativamente, você pode empacotar o projeto como um JAR e executá-lo:

```bash
mvn clean package
java -cp target/bebidasAcoplado-1.0-SNAPSHOT.jar org.example.main.Main
```

## Tipos de Bebidas Disponíveis

### 1. **Café**
Uma bebida quente clássica à base de água.

**Ingredientes utilizados:**
- Água
- Pó de Café
- Açúcar

**Processo de preparo:**
1. Ferve água
2. Escolhe ingredientes
3. Adiciona açúcar
4. Adiciona pó de café
5. Mexe
6. Coa o café
7. Serve

### 2. **Chá**
Uma bebida quente reconfortante à base de água e sachê.

**Ingredientes utilizados:**
- Água
- Sachê
- Açúcar
- Canela

**Processo de preparo:**
1. Ferve água
2. Escolhe ingredientes
3. Coloca o sachê na água quente
4. Aguarda infusão
5. Serve

### 3. **Chocolate Quente**
Uma bebida quente e deliciosa à base de leite.

**Ingredientes utilizados:**
- Leite
- Açúcar
- Chocolate em Pó

**Processo de preparo:**
1. Aquece o leite (sem fervura obrigatória)
2. Escolhe ingredientes
3. Adiciona açúcar
4. Mistura chocolate em pó
5. Mexe
6. Serve

### 4. **Suco**
Uma bebida fresca à base de água e frutas.

**Ingredientes utilizados:**
- Água
- Laranja (ou outras frutas)
- Açúcar

**Processo de preparo:**
1. Ferve água
2. Escolhe ingredientes
3. Esfria a água
4. Adiciona frutas
5. Adoça conforme desejo
6. Serve

## Ingredientes Disponíveis

O sistema possui os seguintes ingredientes cadastrados no enum `Ingrediente`:

| Ingrediente | Descrição |
|------------|-----------|
| AGUA | Água |
| PO_DE_CAFE | Pó de café |
| CHOCOLATE_EM_PO | Chocolate em pó |
| LEITE | Leite |
| ACUCAR | Açúcar |
| ABACAXI | Abacaxi |
| LARANJA | Laranja |
| MORANGO | Morango |
| LIMAO | Limão |
| UVA | Uva |
| CANELA | Canela |
| SACHE | Sachê |

## Entendendo o Código

### Classe Abstrata Bebida

A classe `Bebida` define o fluxo geral de preparo de qualquer bebida usando o padrão **Template Method**:

```java
public abstract class Bebida {
    
    public final void preparar() {
        System.out.println("========== PREPARANDO " + getNome().toUpperCase() + " ==========");
        
        escolherIngredientes();
        if(precisaFerver()) {
            ferver();
        }
        
        prepararEspecifico();
        servir();
        
        System.out.println("=".repeat(getNome().length() + 21) + "\n");
    }
    
    // Métodos abstratos que as subclasses devem implementar
    protected abstract void prepararEspecifico();
    protected abstract String getNome();
    
    // Método que pode ser sobrescrito (Template Method variation)
    protected boolean precisaFerver() {
        return true;
    }
}
```

### Classe Concreta: Café

```java
public class Cafe extends Bebida {
    
    @Override
    protected void prepararEspecifico() {
        System.out.println("Adicionando o açucar");
        System.out.println("Adicionando o pó de café");
        System.out.println("Mexendo...");
        System.out.println(getNome() + " coado");
    }
    
    @Override
    protected String getNome() {
        return "Café";
    }
}
```

### Clase Main: Exemplo de Uso

```java
public class Main {
    public static void main(String[] args) {
        
        // Cria lista de bebidas
        List<Bebida> bebidas = new ArrayList<>();
        
        // Cria e configura Café
        Cafe cafe = new Cafe();
        cafe.adicionarIngredientesAoEstoque(Ingrediente.AGUA);
        cafe.adicionarIngredientesAoEstoque(Ingrediente.PO_DE_CAFE);
        cafe.adicionarIngredientesAoEstoque(Ingrediente.ACUCAR);
        bebidas.add(cafe);
        
        // Cria e configura Chá
        Cha cha = new Cha();
        cha.adicionarIngredientesAoEstoque(Ingrediente.AGUA);
        cha.adicionarIngredientesAoEstoque(Ingrediente.SACHE);
        cha.adicionarIngredientesAoEstoque(Ingrediente.ACUCAR);
        cha.adicionarIngredientesAoEstoque(Ingrediente.CANELA);
        bebidas.add(cha);
        
        // Prepara todas as bebidas
        for(Bebida bebida : bebidas) {
            try {
                bebida.preparar();
            } catch (RuntimeException e) {
                System.out.println(e.getMessage() + "\n");
            }
        }
    }
}
```

## Fluxo de Execução

O fluxo de preparo de qualquer bebida segue a seguinte sequência:

1. **Preparando [Nome da Bebida]** - Exibe o início da preparação
2. **Escolher Ingredientes** - Valida e lista todos os ingredientes
3. **Ferver** (se aplicável) - Aquece o ingrediente base
4. **Preparar Específico** - Executa passos únicos de cada bebida
5. **Servir** - Finaliza e prepara para consumo
6. **Pronto** - Exibe mensagem de conclusão

## Tratamento de Erros

O sistema valida a disponibilidade de ingredientes antes de preparar qualquer bebida:

```java
private void escolherIngredientes() {
    if(this.ingredientes.isEmpty()) {
        throw new RuntimeException("Estoque de ingredientes vazio");
    }
    
    System.out.println("Escolhendo ingredientes: ");
    for(Ingrediente i : ingredientes) {
        System.out.println("Ingrediente: " + i.getDescricao() + " escolhido");
    }
}
```

**Exceção:**
- `Estoque de ingredientes vazio` - Lançada quando tenta-se preparar uma bebida sem adicionar ingredientes.

## Exemplo de Saída

Quando o programa é executado, você verá uma saída similar a:

```
========== PREPARANDO CAFÉ ==========
Escolhendo ingredientes: 
Ingrediente: Água escolhido
Ingrediente: Pó de café escolhido
Ingrediente: Açucar escolhido
Fervendo a/o Água
Água fervido(a)
Adicionando o açucar
Adicionando o pó de café
Mexendo...
Café coado
Servindo a bebida...
Bebida pronta para consumo
==========================================

========== PREPARANDO CHÁ ==========
Escolhendo ingredientes: 
Ingrediente: Água escolhido
Ingrediente: Sachê escolhido
Ingrediente: Açucar escolhido
Ingrediente: Canela escolhido
Fervendo a/o Água
Água fervido(a)
...
```

## Padrão de Design: Template Method

Este projeto implementa o padrão **Template Method Pattern**, um padrão comportamental que:

- Define a estrutura geral de um algoritmo em uma classe base (Bebida)
- Deixa os detalhes específicos para serem implementados pelas subclasses (Cafe, Cha, etc.)
- Garante que a ordem dos passos seja mantida consistente
- Permite que subclasses customizem certos passos sem alterar a estrutura geral

**Benefícios:**
- ✅ Reutilização de código
- ✅ Consistência entre implementações
- ✅ Facilidade de manutenção e extensão
- ✅ Inversão de controle controlada

## Como Estender o Projeto

### Adicionar uma Nova Bebida

Para adicionar uma nova bebida (por exemplo, Café com Leite), siga estes passos:

1. **Crie uma nova classe** que estenda `Bebida`:

```java
package org.example.main.bebidas;

public class CafeComLeite extends Bebida {
    
    @Override
    protected void prepararEspecifico() {
        System.out.println("Adicionando leite quentinho");
        System.out.println("Misturando com o café");
        System.out.println(getNome() + " pronto");
    }
    
    @Override
    protected String getNome() {
        return "Café com Leite";
    }
}
```

2. **Atualize a classe Main** para usar a nova bebida:

```java
CafeComLeite cafeLeite = new CafeComLeite();
cafeLeite.adicionarIngredientesAoEstoque(Ingrediente.AGUA);
cafeLeite.adicionarIngredientesAoEstoque(Ingrediente.PO_DE_CAFE);
cafeLeite.adicionarIngredientesAoEstoque(Ingrediente.LEITE);
cafeLeite.adicionarIngredientesAoEstoque(Ingrediente.ACUCAR);
bebidas.add(cafeLeite);
```

### Adicionar um Novo Ingrediente

Para adicionar um novo ingrediente ao enum:

```java
public enum Ingrediente {
    AGUA("Água"),
    // ... ingredientes existentes ...
    MEL("Mel"),  // Novo ingrediente
    
    private final String descricao;
    // ... resto do código ...
}
```

### Customizar o Comportamento de Fervura

Se uma bebida não precisa ferver, sobrescreva o método `precisaFerver()`:

```java
public class Suco extends Bebida {
    
    @Override
    protected boolean precisaFerver() {
        return false;  // Suco não precisa ferver
    }
    
    @Override
    protected void prepararEspecifico() {
        // Implementação específica
    }
    
    @Override
    protected String getNome() {
        return "Suco";
    }
}
```

## Versão da Aplicação

- **Versão:** 1.0-SNAPSHOT
- **Grupo:** org.example
- **Artefato:** bebidasAcoplado
- **Java:** 17+
- **Encoding:** UTF-8

## Tecnologias Utilizadas

- **Linguagem:** Java 17
- **Build Tool:** Apache Maven 3.6+
- **Padrões:** Template Method Pattern
- **Estrutura de Dados:** ArrayList

## Conselhos de Desenvolvimento

1. **Estude o Template Method Pattern** - Este projeto é um excelente exemplo educacional
2. **Experimente adicionar novas bebidas** - Entenda como o padrão funciona na prática
3. **Teste sem ingredientes** - Veja como o tratamento de exceções funciona
4. **Modifique os passos** - Customize o processo de preparo

## Resolução de Problemas

### "Estoque de ingredientes vazio"
**Problema:** A bebida foi criada mas nenhum ingrediente foi adicionado antes de chamar `preparar()`.

**Solução:** Adicione ingredientes antes de preparar:
```java
Cafe cafe = new Cafe();
cafe.adicionarIngredientesAoEstoque(Ingrediente.AGUA);  // Adicione isto!
cafe.preparar();
```

### Erro ao compilar: "Java versão incompatível"
**Problema:** Sua versão do Java é inferior à 17.

**Solução:** Instale Java 17 ou superior.

### "mvn: comando não encontrado"
**Problema:** Maven não está instalado ou não está no PATH.

**Solução:** Instale Maven e adicione-o ao PATH do sistema.

## Licença

Este é um projeto educacional. Sinta-se livre para usar, modificar e distribuir conforme necessário para fins de aprendizado.

## Autor

Cristian K Amorim
Isaac Nascimento
Pedro H Oliveira Souza

---

**Última Atualização:** 2026

**Dúvidas ou Sugestões?** Sinta-se livre para explorar o código e experimentar com diferentes implementações!
