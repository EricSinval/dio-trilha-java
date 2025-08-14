# ContaTerminal — Projeto de estudos (Java + Git)

Um app de **linha de comando** simples para simular a criação de uma conta bancária: o programa coleta **agência**, **conta**, **nome** e **saldo**, e imprime uma mensagem formatada com os dados.

> Feito para praticar: entrada de dados com `Scanner`, formatação com `printf`, tipos primitivos, organização de um projeto Java e primeiros passos com Git.

---

## Pré-requisitos

- **Java JDK 17+** (ou 11+ se preferir)
- Editor/IDE (VS Code, IntelliJ ou outro)
- **Git** instalado (opcional, para versionar)

---

## Como executar

1. Clone ou baixe o projeto.
2. Compile e rode:

```bash
# dentro da pasta do projeto
javac ContaTerminal.java
java ContaTerminal
```


## Você verá prompts como:

```bash
Por favor, digite o número da Agência:
Por favor, digite o número da Conta:
Por favor, digite o seu nome:
Por favor, digite o seu saldo:
```

## Observação importante sobre o saldo (vírgula vs ponto)

- O Scanner.nextFloat() depende do Locale da JVM:
- Em PT-BR, use vírgula: 237,48
- Para aceitar ponto, force o Locale para US ou leia como String e troque a vírgula por ponto.
  

## Código completo (exemplo)

```bash
import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        int conta = scanner.nextInt();
        scanner.nextLine(); // consumir \n

        System.out.println("Por favor, digite o seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Por favor, digite o seu saldo:");
        float saldo = scanner.nextFloat();

        System.out.printf(
            "Olá %s, obrigado por criar uma conta em nosso banco. " +
            "Sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque.%n",
            nome, agencia, conta, saldo
        );

        scanner.close();
    }
}



```







