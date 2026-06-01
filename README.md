# Bebidas Acoplado - Manual de Uso

## 📋 Descrição do Projeto

O projeto **Bebidas Acoplado** é uma aplicação Java que simula o processo de preparação de diferentes tipos de bebidas. O sistema permite adicionar ingredientes customizados para cada bebida e simula etapas realísticas de preparação como ferventação, dissolução, coação e infusão.

Este projeto é um exemplo educacional que demonstra conceitos de programação orientada a objetos, como classes, enumerações e estruturas de dados em Java.

## 🍵 Bebidas Suportadas

O projeto suporta a preparação de 4 tipos de bebidas:

1. **Café** - Com etapas de ferventação, coação e serviço
2. **Chá** - Com etapas de ferventação, infusão do sachê e serviço
3. **Chocolate Quente** - Com etapas de ferventação do leite, dissolução do chocolate e serviço
4. **Suco** - Com adição de ingredientes e serviço

## 🔧 Pré-requisitos

- **Java 17** ou superior
- **Maven 3.6** ou superior
- Um terminal/prompt de comando

## 📦 Instalação

### 1. Clonar o repositório

```bash
git clone https://github.com/CristiankAmorim/bebidas-acoplado.git
cd bebidas-acoplado
```

### 2. Compilar o projeto

```bash
mvn clean compile
```

### 3. Executar o projeto

```bash
mvn exec:java -Dexec.mainClass="org.example.main.Main"
```

## 🚀 Como Usar

### Executar o Programa Principal

O programa principal (`Main.java`) já contém exemplos de uso. Você pode executá-lo para ver a simulação de preparação de diferentes bebidas.

### Criar suas próprias Bebidas

Para criar uma bebida personalizada, siga os passos:

#### 1. Importar as Classes Necessárias

```java
import org.example.main.bebidas.Cafe;
import org.example.main.bebidas.Cha;
import org.example.main.bebidas.ChocolateQuente;
import org.example.main.bebidas.Suco;
import org.example.main.bebidas.enums.Ingrediente;
```

#### 2. Instanciar uma Bebida

```java
// Exemplo: Criar um café
Cafe cafe = new Cafe();
```

#### 3. Adicionar Ingredientes

```java
// Adicionar ingredientes desejados
cafe.adicionarIngrediente(Ingrediente.PO_DE_CAFE);
cafe.adicionarIngrediente(Ingrediente.ACUCAR);
cafe.adicionarIngrediente(Ingrediente.LEITE);
```

#### 4. Preparar a Bebida

```java
// Iniciar o processo de preparação
cafe.preparar();
```

### Exemplos de Uso Completo

#### Exemplo 1: Preparar um Café com Açúcar e Leite

```java
Cafe cafe = new Cafe();
cafe.adicionarIngrediente(Ingrediente.PO_DE_CAFE);
cafe.adicionarIngrediente(Ingrediente.ACUCAR);
cafe.adicionarIngrediente(Ingrediente.LEITE);
cafe.preparar();
```

**Saída esperada:**
```
Preparando café
Fervendo a água...
Água fervida
Coando o café...
Café coado
Adicionando ingredientes: 
Ingrediente: Pó de café adicionado
Ingrediente: Açucar adicionado
Ingrediente: Leite adicionado
Servindo a bebida na xícara 
Bebida pronta para consumo
```

#### Exemplo 2: Preparar um Chá com Canela

```java
Cha cha = new Cha();
cha.adicionarIngrediente(Ingrediente.AGUA);
cha.adicionarIngrediente(Ingrediente.SACHE);
cha.adicionarIngrediente(Ingrediente.ACUCAR);
cha.adicionarIngrediente(Ingrediente.CANELA);
cha.preparar();
```

#### Exemplo 3: Preparar Chocolate Quente com Canela

```java
ChocolateQuente chocolate = new ChocolateQuente();
chocolate.adicionarIngrediente(Ingrediente.CHOCOLATE_EM_PO);
chocolate.adicionarIngrediente(Ingrediente.LEITE);
chocolate.adicionarIngrediente(Ingrediente.ACUCAR);
chocolate.adicionarIngrediente(Ingrediente.CANELA);
chocolate.preparar();
```

#### Exemplo 4: Preparar um Suco Natural

```java
Suco suco = new Suco();
suco.adicionarIngrediente(Ingrediente.AGUA);
suco.adicionarIngrediente(Ingrediente.LARANJA);
suco.adicionarIngrediente(Ingrediente.ACUCAR);
suco.preparar();
```

## 🧪 Ingredientes Disponíveis

A aplicação oferece os seguintes ingredientes que podem ser adicionados às bebidas:

| Enum | Descrição |
|------|-----------|
| `AGUA` | Água |
| `PO_DE_CAFE` | Pó de café |
| `CHOCOLATE_EM_PO` | Chocolate em pó |
| `LEITE` | Leite |
| `ACUCAR` | Açúcar |
| `ABACAXI` | Abacaxi |
| `LARANJA` | Laranja |
| `MORANGO` | Morango |
| `LIMAO` | Limão |
| `UVA` | Uva |
| `CANELA` | Canela |
| `SACHE` | Sachê |

## 📂 Estrutura do Projeto

```
bebidas-acoplado/
├── src/
│   └── main/
│       └── java/
│           └── org/example/main/
│               ├── Main.java                           # Classe principal com exemplos
│               └── bebidas/
│                   ├── Cafe.java                       # Classe para preparar café
│                   ├── Cha.java                        # Classe para preparar chá
│                   ├── ChocolateQuente.java            # Classe para preparar chocolate quente
│                   ├── Suco.java                       # Classe para preparar suco
│                   └── enums/
│                       └── Ingrediente.java            # Enumeração dos ingredientes
├── pom.xml                                             # Configuração do Maven
└── README.md                                           # Este arquivo
```

## 🔨 Métodos Principais

### Classe Cafe, Cha, ChocolateQuente e Suco

#### `void adicionarIngrediente(Ingrediente ingrediente)`
Adiciona um ingrediente à lista de ingredientes da bebida.

**Parâmetros:**
- `ingrediente` - Um valor do enum `Ingrediente`

**Exemplo:**
```java
cafe.adicionarIngrediente(Ingrediente.LEITE);
```

#### `void preparar()`
Inicia o processo de preparação da bebida, exibindo as etapas no console.

**Exemplo:**
```java
cafe.preparar();
```

#### `List<Ingrediente> getIngredientes()`
Retorna a lista de ingredientes adicionados.

**Exemplo:**
```java
List<Ingrediente> ingredientes = cafe.getIngredientes();
```

#### `void setIngredientes(List<Ingrediente> ingredientes)`
Define uma nova lista de ingredientes.

**Exemplo:**
```java
List<Ingrediente> novaLista = new ArrayList<>();
novaLista.add(Ingrediente.LEITE);
cafe.setIngredientes(novaLista);
```

## ⚠️ Observações Importantes

1. **Adicionar Ingredientes:** Certifique-se de adicionar pelo menos um ingrediente antes de chamar `preparar()`. Caso contrário, uma exceção será lançada.

2. **Ordem de Etapas:** Cada bebida tem uma sequência específica de preparação:
   - **Café:** Fervir → Coar → Adicionar Ingredientes → Servir
   - **Chá:** Fervir → Infusionar → Adicionar Ingredientes → Servir
   - **Chocolate Quente:** Fervir Leite → Dissolver Chocolate → Adicionar Ingredientes → Servir
   - **Suco:** Adicionar Ingredientes → Servir

3. **Saída Console:** Toda a simulação é exibida no console padrão.

## 📝 Exemplo Completo em um Arquivo Java

```java
import org.example.main.bebidas.Cafe;
import org.example.main.bebidas.enums.Ingrediente;

public class MeuPrograma {
    public static void main(String[] args) {
        // Criar um café
        Cafe cafe = new Cafe();
        
        // Adicionar ingredientes
        cafe.adicionarIngrediente(Ingrediente.PO_DE_CAFE);
        cafe.adicionarIngrediente(Ingrediente.LEITE);
        cafe.adicionarIngrediente(Ingrediente.ACUCAR);
        
        // Preparar a bebida
        cafe.preparar();
    }
}
```

## 🛠️ Troubleshooting

### Erro: "Lista de ingredientres vazia"
**Solução:** Adicione pelo menos um ingrediente antes de chamar `preparar()`.

### Erro de Compilação
**Solução:** Verifique se você tem Java 17 ou superior instalado:
```bash
java -version
```

### Maven não encontrado
**Solução:** Instale o Maven seguindo as instruções em https://maven.apache.org/install.html

## 📄 Licença

Este projeto é fornecido como um exemplo educacional.

## 👤 Autor

-Cristian K Amorim
-Isaac Nascimento
-Pedro H Oliveira Souza

## 🤝 Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir uma issue ou enviar um pull request. 




