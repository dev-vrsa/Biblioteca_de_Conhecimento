<h1>COMANDOS GIT UTEIS</h1>


<h2>Iniciando um Repositório</h2>

<li>$git init</li>
<li>$git add README.md</li>
<li>$git commit -m "first commit"</li>
<li>$git branch -M main</li>
<li>$git remote add origin (LINK DO REPOSITORIO)</li>
<li>$git push -u origin main</li>


<h2>Apagando um repositório</h2>
<li>$ rm -rf .git</li>


<h2>Configurar o repositorio remoto</h2>

<li>$ git config - -global user.name “seu nome”
<li>$ git config  - - global user.email “seu email”

<li>$ git push (repositório-remoto) (nome-da-branch)
<li>$ git push -u origin (nome-da-branch)



<h2>Setar usuário</h2>

<li>$git config --global user.name 

<h2>Setar email</h2>
<li>$git config --global user.email 

<h2>Setar editor</h2>
<li>$git config --global core.editor vim

<h2>Setar ferramenta de merge</h2>
<li>$git config --global merge.tool vimdiff

<h2>Setar arquivos a serem ignorados</h2>
<li>$git config --global core.excludesfile ~/.gitignore

<h2>Listar configurações</h2>
<li>$git config --list


<h2> Vincular repositório local com um repositório remoto </h2>

<li>$git remote add origin (link do repositorio remoto)


<h2>Exibir informações dos repositórios remotos</h2>
<li>$git remote show origin


<h2>Renomear um repositório remoto</h2>
<li>$git remote rename origin example-nome


<h2>Desvincular um repositório remoto</h2>
<li>$git remote rm curso-git



<h2>Listando Arquivos Modificados</h2>
 <li>$git status


<h2> O primeiro push de um repositório deve conter o nome do repositório remoto e o branch.</h2>

<li>$git push -u origin master


<h2>Os demais pushes não precisam dessa informação</h2>

<li>$git push


<h2>Atualizar repositório local de acordo com o repositório remoto</h2>
<li>$git pull -f origin main (branch)

<h2>Sincroniza branch remota</h2>

<li>$git fetch




<h2> Listando Branches</h2>
<li>$git branch
<li>$git branch -a 


<h2> Seleciona outra branch para trabalhar </h2>
<li>$git checkout minha-branch

<h2> Cria uma nova branch </h2>
<li>$git checkout -b minha-nova-branch


<h2> Deleta uma branch </h2>

<li>$git branch -d nome-da-branch
<li>$git branch -D nome-da-branch

<lu>A opção -d é mais segura, pois ela só apaga a branch se você já tiver feito merge ou enviado as alterações para seu repositório remoto, evitando perda de código.
A opção -D ignora o estado da sua branch, forçando a sua remoção.
  Esse comando apaga apenas a branch local, não removendo branches remotas.</lu> 


<h2> Renomeando branches</h2> 
<h3>Para renomear a sua atual branch local, execute o comando branch com a opção -m, passando o novo nome.</h3>

<li>$git branch -m novo-nome-da-branch</li>

<li>excluir um branch no local:  $git branch -d nomeDoBranchLocal</li>


<li>git push origin --delete nomeDoBranchRemoto</li>


<h3>Se você estiver em uma branch e quiser renomear outra, você deve passar primeiro o nome atual da branch que quer renomear:</h3>

<li>$git branch -m nome-atual novo-nome

 
 <h3>Como Renomear um Branch Remoto do Git?</h3>
 
<li>$git push origin --delete nome-antigo</li>
<li>$git push origin :old-name novo-nome</li>
 
 
























