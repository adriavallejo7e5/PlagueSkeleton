# Pràctica UF4. POO Plague Game

- Aquesta pràctica es realitza en parelles o de forma individual
- Creeu un projecte nou per fer aquesta pràctica
- Per entregar la pràctica afegeix el tag "practicaUF4" a la versió.
- Cloneu el projecte del git:git@git



La pràctica consisteix en desenvolupar un joc anomenat Plague. En el codi hi trobaràs implementada la UI, per tal de que compili se't proporcionen les interfícies que hauràs d'implementar, i les classes necessàries.

## PlagueGame
Un científic especialitzat en contenció de plagues ha de controlar l'expansió d'unes plagues mortals que estan arrasant el món. Hauràs de viatjar pels diferents territoris, buscant recursos i erradicant les plagues sense sortir-ne il·lès.

## UML
<div class="mxgraph" style="max-width:100%;border:1px solid transparent;" data-mxgraph="{&quot;highlight&quot;:&quot;#0000ff&quot;,&quot;nav&quot;:true,&quot;resize&quot;:true,&quot;toolbar&quot;:&quot;zoom layers tags lightbox&quot;,&quot;edit&quot;:&quot;_blank&quot;,&quot;xml&quot;:&quot;&lt;mxfile host=\&quot;app.diagrams.net\&quot; modified=\&quot;2022-04-05T14:44:52.887Z\&quot; agent=\&quot;5.0 (X11)\&quot; etag=\&quot;JcERwmmVe8sg1R6xjYfV\&quot; version=\&quot;17.2.4\&quot; type=\&quot;google\&quot;&gt;&lt;diagram id=\&quot;C5RBs43oDa-KdzZeNtuy\&quot; name=\&quot;Page-1\&quot;&gt;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&lt;/diagram&gt;&lt;/mxfile&gt;&quot;}"></div>
<script type="text/javascript" src="https://viewer.diagrams.net/js/viewer-static.min.js"></script>

-Les classes amb la capçalera gris ja estan implementades

[Consulteu l'UML a draw.io](https://drive.google.com/file/d/1eJuiDG1jbcq7xVSJ1kbYKV9VDccIMcTF/view?usp=sharing)

** Aquest uml és un disseny previ, per tant no s'han especificat tots els mètodes o atributs

## PlagueGame & WorldUI
__Aquestes classes ja estan implementades i no s'han de tocar!__

__PlagueGame__: És la classe que gestiona la inicialització del joc.

__WorldUI__: És la classe que dirigeix la dinàmica del joc, que consisteix en gestionar les diferents rondes, mostrar el taulell, organitzar les accions del jugador, fer créixer les colònies.

A cada ronda o torn el jugador pot realitzar les accions següents:
- Moure el personatge.
- Agafar recursos per desinfectar les plagues més eficaçment o bé agafar un vehicle per moure's més ràpidament.
- Exterminar les plagues del territori on es troba, segons els recursos de què disposa. Vegeu l'apartat [Exterminar plagues](#exterminar-plagues)

Al final de cada ronda:
- Es poden generar noves colònies.
- Les colònies es reprodueixen i s'expandeixen quan són grans (+3 icones)
- Apareixen nous recursos.
  Vegeu l'apartat [next turn](#final-de-ronda---next-turn)


## World & Territory
__Wordl__: El món està representat per un taulell en forma de matriu on cada una de les caselles és un territory.
Implementa una interfície IWorld, on hi trobareu els mètodes que cal que implementeu i la seva documentació.

__Territory__ :
Un territory té un contador(plagueSize) que indica la grandària de la colònia (Aquest valor es consulta l'atribut size de la classe Colony).
plagueSize també ens indica el número d'icones de colònia que mostrarem: el valor màxim serà 3
Té 1 personatge o bé un recurs (ítem).
Vegeu el [disseny UML](#uml).
Cada territori només té un tipus de plaga, ja que una plaga invasora pot acabar amb una plaga existent, o bé una plaga existent pot evitar que arribi una plaga nova. Vegeu l'apartat [expansió](#expansió)

Aquesta classe implementa una interfície ITerritory, en la que s'especifiquen els mètodes que cal que implementeu i la seva documentació.



#### Output World(5,3)
```
-------------------------
|    |    |    |    |    |
|    |    |    |    |    |
-------------------------
|    |    |    |    |    |
|    |    |    |    |    |
-------------------------
|    |    |    |    |    |
|    |    |    |    |    |
-------------------------

```
Tingues en compte que els mètodes de la User interface que mostren les dades són al projecte adjunt, per exemple WorldUI.draw() pinta el taulell.

## Player
En el taulell hi col·locarem el jugador o personatge de l'usuari, la seva posició inicial serà al centre del taulell.
El jugador podrà tenir 1 arma de desinfecció i 1 vehicle Vegeu el [disseny UML](#uml).
Per defecte el jugador elimina les plagues amb la mà i es trasllada a peu.


## Exterminar plagues - estris de desinfecció (weapon)
Quan un personatge arriba a un territori intentarà exterminar la plaga amb un recurs de desinfecció (o arma).

El territori decrementarà la seva població atacada.

Exterminar Plagues d'un territori:
- Dracs:
    - Escombra: no elimina cap colònia
    - Espasa: elimina una colònia
    - Mà (sense armes): no elimina cap colònia <!-- el drac mata l'home, fi de la partida ? -->
- Formigues
    - Escombra: elimina totes les colònies
    - Espasa: elimina una colònia
    - Mà (sense armes): elimina dues colònies

## Moure el personatge - vehicles
A l'inici de cada torn el personatge pot moure's, per defecte el personatge es desplaça a peu, això vol dir que, a cada moviment el personatge només és pot desplaçar als territoris contigus.
A la fase de generar nous ítems (next turn) poden apareixer vehicles al taulell, que el personatge podrà agafar, si es sitúa en el territori on s'ha generat, podrà escollir agafar-lo o no.

Aquest ítem apareix en un territori de manera aleatòria, i si ja hi havia un ítem desapareix i és reemplaçat pel nou ítem

Relació de moviments per vehicle
|  Vehicle         | Desplaçament |
| :--:             | :--:         |
| A peu       	   | A les caselles contigües         |
| Bicicleta 	   | A una distància de 4 caselles    |
| Helicopter 	   | A qualsevol lloc                 |



## Final de ronda - next turn
Al final de cada ronda:

### Generar noves colònies:
__Assegura't de que et funciona tot abans d'implementar cada una de les fases de poblar__

Es genera 1 plaga en una casella aleatòria. La plaga serà d'un tipus o d'un altre escollit a l'atzar segons les probabilitats següents:

| Tipus de plaga | Probabilitat |
| :--:           | :--:       |
| Formiga        | 92%  |
| Drac           | 8%  |

Només es crea generació espontània en un territori sense colonitzar


### Generar nous ítems:
Pot aparèixer 1 nou recurs al taulell, escollit a l'atzar segons les probabilitats següents:

| Recurs o vehicle | Probabilitat |
| :--:             | :--:         |
| Bicicleta 	   | 20%          |
| Helicopter 	   | 10%          |
| Escombra  	   | 20%          |
| Espasa    	   | 10%          |
| Res       	   | 40%          |

### Reproducció:
Les colònies existents a cada territori es reprodueixen, és a dir incrementen.
Si hi havia 2 icones de formigues -> Passen a ser 3 icones de formigues

| Plaga    | Factor de reproducció  |
| :--:     | :--:          		    |
| Drac 	   | 30 torns               |
| Formiga  | 90% possibilitats/ torn|

### Expansió:
Quan un territori arriba a la seva capacitat màxima de colònies (3), aquestes s'expandeixen. Per exemple, un territori amb 3 dracs que s'ha reproduït, aquest quart drac s'expandeix a un nou territori.
El nou territori és colonitzat si està buit, o bé si la plaga es considera més forta, si no s'extingeix.
Funció d'expansió i ordre de les colònies segons fortaleza

| Plaga  |  S'expandeix a          | Colonització |
| :--:   | :--: 		           | :--: 		  |
| Drac 	 | Qualsevol casella       | Sempre       |
| Formiga| A les caselles contigües (Torre)| Només en territoris buits o de formigues |



## Icones
- personatge: 🚶
- colònia de formigues: 🐜
- plaga de dracs: 🐉
- vehicles o formes de viatjar: a peu:🚶, bicicleta: 🚲, helicopter: 🚁
- estris de desinfecció: mà: 👆, espasa:🗡, escombra: 🧹

## Metodologia d'entrega
- Cal que el projecte contingui un markdown on indiqueu:
    - El nom i cognom dels autors
    - Els aspectes que funcionen
    - Els aspectes que cal millorar
    - Els punts no desenvolupats