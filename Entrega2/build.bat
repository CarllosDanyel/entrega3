@echo off
echo ========================================
echo    Script de Build Automatizado
echo ========================================

echo [1/6] Limpando projeto...
call mvn clean

echo [2/6] Compilando codigo...
call mvn compile

echo [3/6] Executando testes...
call mvn test

echo [4/6] Gerando relatorios...
call mvn site

echo [5/6] Criando executavel...
call mvn package

echo [6/6] Gerando documentacao...
call mvn javadoc:javadoc

echo ========================================
echo    Build concluido com sucesso!
echo    Executavel: target\meu-projeto-executavel.jar
echo    Relatorios: target\site\index.html
echo    Documentacao: target\site\apidocs\index.html
echo ========================================
pause