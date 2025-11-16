---
name: Criar testes unitários para Calculadora
about: Describe this issue template's purpose here.
title: ''
labels: ''
assignees: ''

---

🎯 Qual é o objetivo desta feature?
Garantir que a nova classe Calculadora funcione como esperado e que nosso relatório de cobertura (Jacoco) seja útil. O AppTest.java atual é muito simples.

📝 Descrição da Solução
Criar um novo arquivo src/test/java/com/meuprojeto/CalculadoraTest.java. Usar as anotações @Test do JUnit para testar cada método (somar, subtrair, dividir, etc.).

📋 Critérios de Aceite
[ ] CalculadoraTest.java criado.

[ ] Testes implementados para somar() (casos positivos e negativos).

[ ] Testes implementados para subtrair().

[ ] Teste específico para a divisão por zero (deve lançar uma exceção).
