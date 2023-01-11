<h1>COMANDOS GIT UTEIS</h1>


<h2>Iniciando um Repositório</h2>

<li>$git init</li>
$git add README.md
$git commit -m "first commit"
$git branch -M main
$git remote add origin (COLE O SEU REPOSITORIO REMOTO)
$git push -u origin main


<h2>Apagando um repositório</h2>
$ rm -rf .git


<h2>Configurar o repositorio remoto</h2>

$ git config - -global user.name “seu nome”
$ git config  - - global user.email “seu email”

$ git push <repositório-remoto> <nome-da-branch>. (Vincula o repositorio local a um repositorio remoto)
$ git push -u origin <nome-da-branch>



<h2>etar usuário</h2>

git config --global user.name 

<h2>Setar email</h2>
git config --global user.email 

<h2>Setar editor</h2>
git config --global core.editor vim

<h2>Setar ferramenta de merge</h2>
git config --global merge.tool vimdiff

<h2>Setar arquivos a serem ignorados</h2>
git config --global core.excludesfile ~/.gitignore

<h2>Listar configurações</h2>
git config --list


<h2> Vincular repositório local com um repositório remoto </h2>

git remote add origin


<h2>Exibir informações dos repositórios remotos</h2>
git remote show origin


<h2>Renomear um repositório remoto</h2>
git remote rename origin curso-git


<h2>Desvincular um repositório remoto</h2>
git remote rm curso-git



<h2>Listando Arquivos Modificados</h2>
$ git status


<h2> O primeiro push de um repositório deve conter o nome do repositório remoto e o branch.<h2>

git push -u origin master


<h2>Os demais pushes não precisam dessa informação</h2>

git push


<h2>Atualizar repositório local de acordo com o repositório remoto</h2>
git pull -f origin main (branch)

<h2>Sincroniza branch remota</h2>

git fetch




<h2> Listando Branches</h2>
$ git branch
$ git branch -a 


<h2> Seleciona outra branch para trabalhar </h2>
$ git checkout minha-branch

<h2> Cria uma nova branch </h2>
$ git checkout -b minha-nova-branch


<h2> Deleta uma branch </h2>

git branch -d nome-da-branch
git branch -D nome-da-branch

#! A opção -d é mais segura, pois ela só apaga a branch se você já tiver feito merge ou enviado as alterações para seu repositório remoto, evitando perda de código.
A opção -D ignora o estado da sua branch, forçando a sua remoção.
Esse comando apaga apenas a branch local, não removendo branches remotas.


<h2> Renomeando branches</h2> 
<h3>Para renomear a sua atual branch local, execute o comando branch com a opção -m, passando o novo nome.</h3>

git branch -m novo-nome-da-branch


<h3>Se você estiver em uma branch e quiser renomear outra, você deve passar primeiro o nome atual da branch que quer renomear:</h3>

git branch -m nome-atual novo-nome

























