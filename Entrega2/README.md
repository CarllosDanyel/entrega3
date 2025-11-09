# Projeto Java - Build Automation

## Requisitos Implementados

### ✅ 1. Geração de Script de Construção
- **Maven** configurado com `pom.xml` completo
- **Script batch** `build.bat` para automação total
- Comandos: `mvn clean compile package`

### ✅ 2. Integração com SCV (Sistema de Controle de Versão)
- **Git** configurado com `.gitignore` abrangente
- Ignora arquivos de build, IDEs e temporários

### ✅ 3. Re-compilação Mínima
- **Maven Compiler Plugin** com `useIncrementalCompilation=true`
- Compila apenas arquivos modificados

### ✅ 4. Criação do Sistema Executável
- **Maven Shade Plugin** gera JAR executável
- Arquivo: `target/meu-projeto-executavel.jar`
- Execução: `java -jar target/meu-projeto-executavel.jar`

### ✅ 5. Automação de Testes
- **JUnit 5** configurado
- **Maven Surefire Plugin** para execução automática
- Testes em: `src/test/java/`

### ✅ 6. Relatórios
- **JaCoCo** para cobertura de código
- **Maven Site Plugin** para relatórios HTML
- **Surefire Report** para resultados de testes

### ✅ 7. Geração de Documentação
- **JavaDoc** configurado
- Documentação automática das classes
- Saída: `target/site/apidocs/`

## Como Usar

### Build Completo
```bash
# Windows
build.bat

# Linux/Mac
mvn clean compile test package site javadoc:javadoc
```

### Comandos Individuais
```bash
mvn clean          # Limpar
mvn compile        # Compilar
mvn test           # Executar testes
mvn package        # Criar executável
mvn site           # Gerar relatórios
mvn javadoc:javadoc # Gerar documentação
```

### Executar Aplicação
```bash
java -jar target/meu-projeto-executavel.jar
```

## Estrutura do Projeto
```
├── src/
│   ├── main/java/com/meuprojeto/
│   │   ├── App.java      # Classe principal
│   │   └── Utils.java    # Utilitários
│   └── test/java/com/meuprojeto/
│       └── UtilsTest.java # Testes
├── target/               # Arquivos gerados
├── pom.xml              # Configuração Maven
├── build.bat            # Script de build
└── README.md            # Documentação
```