D.O.M

Document Object Model

é um padrão de como acessar e modificar os elementos html de uma pagina.
Nós que representam cada elemento do html de uma pagina.

--------------------------------------------------

##Dom vs Bom

B.O.M

Browser object model

Tudo que esta dentro do objeto window (D.O.M esta dentro do B.O.M)

B.O.M
Document, History, Location, screen, navigator

----------------------------------------------------

## MÉTODOS DE MANIPULAÇÃO DO D.O.M

document.getElementById('id');

document.getElementsByTagName('tag'); (retorna array)

document.getElementsByClassName('classe'); (retorna array)

document.querySelectorAll ('.busca mais de uma classe ou combinando uma tag com classe); (retorna array)

-----------------------------------------------------

Classes

classList.add - adiciona classe
classList.remove - remove a classe
classList.toggle - (altera estado)

Acessando diretamento o CSS de um elemento

-----------------------------------------------------

Eventos - ações feitas em uma pagina web (interações)

Eventos de mouse > mouseover, mouseout
Eventos de click > click, dbclick (clicks duplos)
Eventos de atualização > Change, load


Acionando eventos (evento sera acionado quando o usuario executar uma ação)

addEventListener

também é possivel colocar o acionador dentro do html ex:

<h1 onclik="mudaTexto(this)">Clique aqui</h1>
(quando é usado no html se coloca o prefixo 'on')
