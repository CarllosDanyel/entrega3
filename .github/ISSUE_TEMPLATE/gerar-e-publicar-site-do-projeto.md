---
name: Gerar e publicar site do projeto
about: Describe this issue template's purpose here.
title: ''
labels: ''
assignees: ''

---

🎯 Qual é o objetivo desta feature?
O pom.xml está configurado com maven-site-plugin, maven-javadoc-plugin e relatórios do Surefire/Jacoco. Precisamos de um local para ver esses relatórios gerados.

📝 Descrição da Solução
Rodar mvn site localmente para gerar a documentação no diretório target/site.

(Avançado) Criar um GitHub Action para rodar mvn site e publicar o conteúdo de target/site no GitHub Pages.

📋 Critérios de Aceite
[ ] O comando mvn site gera o index.html com links para Javadoc, Surefire e Jacoco.

[ ] (Opcional) O site está acessível publicamente via GitHub Pages.
