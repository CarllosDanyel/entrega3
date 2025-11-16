---
name: Configurar regra de cobertura mínima do Jacoco
about: Describe this issue template's purpose here.
title: ''
labels: ''
assignees: ''

---

🎯 Qual é o objetivo desta feature?
O pom.xml inclui o Jacoco, mas ele apenas gera o relatório. Queremos garantir a qualidade, fazendo o build falhar se a cobertura de testes for muito baixa.

📝 Descrição da Solução
Modificar a configuração do jacoco-maven-plugin no pom.xml. Adicionar um <execution> com o goal de check. Configurar regras (ex: BUNDLE, LINE) para exigir uma cobertura mínima (ex: 80%).

📋 Critérios de Aceite
[ ] O pom.xml é atualizado com o goal check do Jacoco.

[ ] O build (mvn verify) falha se a cobertura de linhas for inferior a 80%.
