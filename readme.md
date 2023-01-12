#Solitaires

![Solitaire](https://github.com/gii-is-DP1/dp1--2022-2023-l6-1/blob/master/src/main/resources/static/resources/images/ases_inicio.png)

Nuestro proyecto para la asignatura es el juego del Solitario que nació como entretenimiento personal por su simpleza y bajo coste,
ya que solo se necesita una baraja de 52 cartas. Es un juego de cartas individual, por ello recibe dicho nombre. El objetivo del juego 
es conseguir ordenar las cuatro pilas de cartas diferenciadas por su “palo” y de forma ascendente,
comenzando por los ases(“unos” en la baraja española) hasta la K(“rey” en la baraja española). El Solitario es un juego apto para todo
tipo de público.
El desarrollo del juego consiste en tomar decisiones según qué cartas tengas disponibles.La duración del juego es indeterminada:
Terminará cuando, o bien hayamos conseguido ordenar las cuatro pilas de cartas de distintos palos, es decir, ganemos, o nos quedemos sin posibles 
movimientos para poder avanzar en la partida, perdamos. De forma orientativa, suele rondar los 10 minutos.
	
<a href = "https://www.youtube.com/watch?v=5G-xi5QkCmo&ab_channel=JulenRedondo"> Para mayor aclaración de cómo se desarrollaría el juego, haga clic aquí </a>


## Glosario

 * **Baraja**: Conjunto de cartas con las que se desarrollará el juego, contiene 52 cartas.
 * **Carta**: Tarjeta que tiene una cara frontal con números y dibujos que permiten identificar y diferenciarlas de otras cartas. Y al dorso un dibujo uniforme que no permite identificarla y diferenciarla de otras.
 * **Palo**: Cada una de las diferentes categorías en las que se dividen las cartas de una baraja y se representan con un símbolo. Cada baraja contiene 4 palos.
 * **Tablero**: Lugar donde se desarrolla el juego.
 * **Montón**: Conjunto de cartas ordenadas ascendentemente, comenzando por el as y acabando por la K, y del mismo palo.

## Tipos de Usuario / Roles 

**Jugador**: Persona que realiza los movimientos, para intentar ganar su partida.

**Administrador**: Gerente del software que se encarga de gestionar la información.

## <u>Historias de Usuario</u>
### *H1-Registro*
“**Como** jugador, **quiero** que el sistema me ofrezca un botón **para** poder realizar el registro.”

**Escenarios positivos:**

<u>H1 + E1 - Deja realizar el registro.</u>

Dado el formulario de registro, el sistema acepta la solicitud de registro.

**Escenarios negativos:**

<u>H1 - E1 - Registro erróneo.</u>

Dado el formulario de registro, el sistema no acepta la solicitud de registro debido a que existen campos del formulario que no son correctos.

![Mockup1](https://cdn.discordapp.com/attachments/1025044659275321430/1050388471421878302/mockup_register.png)

### *H2-Inicio sesión*
“**Como** jugador, **quiero** poder acceder al sistema iniciando sesión **para** para jugar una partida.”

**Escenarios positivos:**

<u>H2 + E1 - Deja iniciar sesión.</u>

Dado el formulario de inicio de sesión, el sistema reconoce los datos en la base de datos, y deja acceder al usuario.

**Escenarios negativos:**

<u>H1 - E1 - No deja iniciar sesión.</u>

Dado el formulario de inicio de sesión, el sistema no reconoce los datos en la base de datos, y no le permite la entrada en el sistema al jugador.

![Mockup2](https://cdn.discordapp.com/attachments/1025044659275321430/1050388472151683102/mockup_signin.png)

### *H3-Iniciar una partida*
“**Como** jugador, **quiero** que el sistema ofrezca un botón **para** poder iniciar una nueva partida.”

**Escenarios positivos:**

<u>H3 + E1 - Deja iniciar la partida con éxito.</u>

Dado un jugador en el menú del juego, le aparecerán varios botones, si quiere iniciar una partida, el jugador pulsará el botón de “StartGame”. Se le formará de manera exitosa una partida con el mazo con cartas aleatorias, la zona de juego con cartas aleatorias, y la zona donde se pondrá el montón de cartas del mismo palo.

![Mockup3](https://cdn.discordapp.com/attachments/1025044659275321430/1063102632522154054/image.png)
![Mockup3](https://cdn.discordapp.com/attachments/1025044659275321430/1057585538170892298/image.png)

**Escenarios negativos:**

<u>H3 - E1 - No deja iniciar la partida.</u>

Dado un jugador no logueado en el sistema que quiera iniciar una partida, no podrá iniciar la partida por lo que tampoco le aparecerá la vista del tablero, y le aparecerá un mensaje de error “Debes iniciar sesión para poder jugar”.


### *H4-Añadir carta al montón de su palo*
“**Como** jugador, **quiero** que haya un espacio dedicado a poner las cartas que pudiera añadir a los montones del mismo palo, **para** poder así avanzar en la partida.”

**Escenarios positivos:**

<u>H4 + E1 - Conseguir As de un palo.</u>

Dado un jugador en partida, tras tener un As al descubierto, el juego debe dejar añadir ésta carta al montón que el jugador escoja.

![Mockup3](https://cdn.discordapp.com/attachments/1025044659275321430/1057585859374874624/image.png)

<u>H4 + E2 - Conseguir carta mayor para un montón.</u>

Dado un jugador en partida, cuando éste tiene cartas posicionadas en un montón en orden ascendente, comenzando por el As, debe poder poner la siguiente carta inmediatamente superior, siempre que ésta esté disponible y sea del mismo palo, en dicho montón.

**Escenarios negativos:**

<u>H4 - E1 - Carta bloqueada por otras.</u>

Dado un jugador en partida, si éste intenta mover una carta que no está descubierta no podrá.

<u>H4 - E2 - Mover carta de otro palo.</u>

Dado un jugador en partida, éste intenta colocar sobre un montón una carta de diferente palo al que corresponde dicho montón, la carta deberá volver a su posición anterior ya que este movimiento no cumple las reglas.

<u>H4 - E3 - Mover una carta que no va en orden.</u>

Dado un jugador en partida, éste intenta poner sobre un montón una carta que no es la que va justo después formando la escalera ascendente que debería formarse en dicho montón, la carta deberá volver a su posición anterior ya que este movimiento no cumple las reglas.

### *H5-Mover cartas en la zona de juego*
“**Como** jugador, **quiero** poder realizar los movimientos que crea pertinentes en la zona de juego, siempre respetando las reglas del mismo, **para** poder así avanzar en la partida.”

**Escenarios positivos:**

<u>H5 + E1 - Mover cartas que van en orden y son de distinto color.</u>

Dado un jugador en partida, si éste quiere realizar un movimiento de carta en la zona de juego, que cumple que va en orden descendente con la otra carta sobre la que la queremos poner y es de otro color, tendrá la posibilidad de hacer dicho cambio ya que cumple las reglas.

<u>H5 + E2 - Mover una escalera de cartas de una columna a otra para hacer una cadena mayor y liberar la siguiente carta.</u>

Dado un jugador en partida, si éste quiere realizar un movimiento de una escalera de cartas en la zona de juego, que cumple que va en orden descendente con la otra carta o la otra escalera de cartas sobre la que la desea colocar, y cumple que las cartas de “unión” son de otro color, tendrá la posibilidad de hacer dicho cambio ya que cumple las reglas.

<u>H5 + E3 - Mover la K cuando hay una columna libre en la zona de juego.</u>

Dado un jugador en partida, si éste libera una columna de cartas, que por lo tanto quedará vacía y desea colocar una K en dicha posición o una escalera descendente que empieza por la K, tendrá la posibilidad de hacer dicho cambio ya que cumple las reglas.

**Escenarios negativos:**

<u>H5 - E1 - Mover cartas del mismo color.</u>

Dado un jugador en partida, si éste quiere realizar un movimiento de carta en la zona de juego, que es del mismo color que la otra carta sobre la que la desea poner, no tendrá la posibilidad de hacer dicho cambio ya que no cumple las reglas y dicha carta deberá volver a su posición anterior.

<u>H5 - E2 - Mover cartas que no van en orden.</u>

Dado un jugador en partida, si éste quiere realizar un movimiento de cartas en la zona de juego, que no va en orden descendente con la otra carta sobre la que la desea poner, no tendrá la posibilidad de hacer dicho cambio ya que no cumple las reglas y dicha carta deberá volver a su posición anterior.

<u>H5 - E3 - Mover una carta a una columna vacía que no sea la K.</u>

Dado un jugador en partida, si éste libera una columna de cartas, que por lo tanto quedará vacía y desea poner una carta que no sea la K en dicha posición o una escalera descendente que no empieza por la K, no tendrá la posibilidad de hacer dicho cambio ya que no cumple las reglas y dicha carta o dicha escalera deberá volver a su posición anterior.

### *H6-Pedir cartas a la baraja*
“**Como** jugador, **quiero**  acceder al mazo de cartas cuando me quedo sin movimientos en la zona de juego, **para** seguir avanzando en la partida.”

**Escenarios positivos:**

<u>H6 + E1 - El mazo me ofrece las cartas solicitadas.</u>

Dado un jugador en partida, si éste cree que no tiene más movimientos disponibles, y cree oportuno solicitar cartas al mazo de cartas, dependiendo el número de cartas del modo de juego elegido al comenzar la partida, éste nos ofrece el número de cartas pertinentes, siempre en el mismo orden.

**Escenarios negativos:**

<u>H6 - E1 - El mazo se queda sin cartas.</u>

Dado un jugador en partida, si éste cree que no tiene más movimientos disponibles, y cree oportuno solicitar cartas al mazo de cartas, pero éste está vacío, se deberán coger todas las cartas que están de frente pero que pertenecen al mazo y colocarlas en el mismo orden anterior, siendo visible de nuevo el dorso de las cartas.

![Mockup6](https://cdn.discordapp.com/attachments/1025044659275321430/1057587017686454312/image.png)

### *H7-Ver estadísticas*
“**Como** jugador, **quiero** que el sistema almacene el historial de partidas que he jugado, cuanntas he ganado y cuantas he perdido **para** poder verlos.”

**Escenarios positivos:**

<u>H7 + E1 - Ver mis estadísticas.</u>

Dado un jugador en el menú del juego, si quiere ver sus estadísticas jugando al Solitario, deberá pulsar el botón "Get my Stats" en el menú, se le llevará a una vista en la que habrá un registro de todas las partidas disputadas por dicho jugador y podrá ver las que ha ganado y las que ha perdido, además, encontrará un botón "See my Achievements" en el podrá comprobar que logros ha conseguido el jugador.


![Mockup7](https://cdn.discordapp.com/attachments/1025044659275321430/1050388472491425872/mockup_stats.png)
![Mockup7](https://cdn.discordapp.com/attachments/1025044659275321430/1050388472860516362/mockup_stats2.png)

### *H8-Terminar partida*
“**Como** jugador, **quiero** que el juego nos informe de cuando una partida está finalizada ya sea con victoria o derrota, **para** terminar la partida.”

**Escenarios positivos:**

<u>H8 + E1 - Victoria.</u>

Dado un jugador en partida, si éste consigue colocar todas las cartas en los montones del palo, ordenados ascendentemente, y completados con sus respectivas 13 cartas por palo, el juego deberá mostrar por pantalla que el juego ha finalizado, y que el jugador ha ganado.

![Mockup8](https://cdn.discordapp.com/attachments/1025044659275321430/1062471734361600112/unnamed.png)

<u>H8 - E2 - Derrota.</u>

Dado un jugador en partida y dada una disposición de cartas en el tablero, tal que el jugador no pueda avanzar en la partida, el jugador deberá pulsar el botón “Rendirse”, para que finalice dicha partida.

![Mockup8](https://cdn.discordapp.com/attachments/1025044659275321430/1062471973583720478/unnamed_1.png)

### *H9-Editar perfil de usuario*
“**Como** jugador, **quiero** poder acceder a mi perfil **para** poder editar los datos de mi perfil.”

**Escenarios positivos:**

<u>H9 + E1 - Ver mi perfil.</u>

Dado un jugador logueado en el menú de inicio, al hacer click en su nombre le aparecerá una pestaña en la que pondrá “Modificar datos personales”, al hacer click se accederá a una vista con los datos personales para poder cambiarlos y seleccionar que se actualicen.

![Mockup9](https://cdn.discordapp.com/attachments/1025044659275321430/1050388472491425872/mockup_stats.png)
![Mockup9](https://cdn.discordapp.com/attachments/1025044659275321430/1050433634567454822/image.png)
![Mockup9](https://cdn.discordapp.com/attachments/1025044659275321430/1057587980971282502/image.png)

### *H10-Actividades sobre el perfil de los jugadores como administrador*
“**Como** administrador, **quiero** poder crear, leer, actualizar y eliminar los perfiles de los usuarios, **para** poder corregir posibles errores, ver los datos de dicho jugador, etc.”

**Escenarios positivos:**

<u>H10 + E1 - Ver la lista.</u>

Dado un administrador, si éste desea acceder al apartado de “Herramientas de administrador”, accede a una vista donde podrá realizar las actividades dichas anteriormente.

**Escenarios negativos:**

<u>H10 - E1 - Intentar acceder a dichas actividades siendo usuario.</u>

Dado un jugador logueado, si éste intenta acceder al apartado de “Herramientas de administrador”, salta un error de autenticación, ya que no tiene permisos para acceder a dicho apartado.

### *H11-Ver amigos*
“**Como** jugador, **quiero** que el sistema me proporcione una lista de amigos **para** poder ver los nombres de mis amigos y sus puntuaciones.”

**Escenarios positivos:**

<u>H11 + E1 - Ver mis amigos.</u>

Dado un jugador en el menú del juego, si quiere ver sus amigos, deberá pulsar el menú desplegable y después“My Profile” en el menú, y se le llevará a otra vista en la que habrá un botón “Friends” dedicado a enviarle a otra vista en la que habrá una tabla con los datos más significativos de sus amigos registro de todos los amigos de dicho jugador.

![Mockup11](https://cdn.discordapp.com/attachments/1025044659275321430/1050388471065358367/mockup_friends.png)

### *H12-Mandar solucitud de amistad*
“**Como** jugador, **quiero** que el sistema me proporcione un menú en el que pueda añadir amigos **para** añadirlo a mi lista de amigos.”

**Escenarios positivos:**

<u>H12 + E1 - Mandar solicitud de amistad.</u>

Dado un jugador en el menú del juego, si quiere añadir un amigo, deberá pulsar el botón “Find Players” en el menú, se le llevará a otra vista, 
donde deberá buscar el apellido del jugador al que se la quiere enviar, y al acceder en el perfil de dicho jugador aparecerá un botón “Send Friend Request” que
permite mandar la solicitud de amistad al otro jugador.

![Mockup12](https://cdn.discordapp.com/attachments/1025044659275321430/1050388473191870515/mockup_details.png)

### *H13-Ver solucitud de amistad*
“**Como** jugador, **quiero** que el sistema me proporcione un menú en el que pueda ver las solicitudes de amistad que recibí **para** poder aceptarlas o rechazarlas.”

**Escenarios positivos:**

<u>H14 + E1 - Ver mis solicitudes de amistad.</u>

Dado un jugador en el menú del juego, si quiere ver sus solicitudes de amistad , deberá pulsar el botón “My Profile” en el menú desplegable, se le llevará a otra vista en
la que habrá un botón “Friend Requests” que le llevará a otra vista con una lista de todas los solicitudes y quién la mandó y en dicha lista le aparecerán dos botones
uno es “Accept” que al accionarlo desaparecerá la solicitud y se agregará dicho jugador a su lista de amigos.

![Mockup7](https://cdn.discordapp.com/attachments/1025044659275321430/1050388472491425872/mockup_stats.png)
![Mockup13A](https://cdn.discordapp.com/attachments/1025044659275321430/1050433634567454822/image.png)
![Mockup13](https://cdn.discordapp.com/attachments/1025044659275321430/1050388471765803048/mockup_request.png)

### *H14-Aceptar solucitud de amistad*
“**Como** jugador, **quiero** que el sistema me proporcione un menú en el que pueda ver las solicitudes de amistad que recibí **para** poder aceptarlas.”

**Escenarios positivos:**

<u>H14 + E1 - Aceptar mis solicitudes de amistad.</u>

Dado un jugador en el menú del juego, si quiere ver sus solicitudes de amistad , deberá pulsar el botón “My Profile” en el menú desplegable, se le llevará a otra vista en la que habrá un botón “Friend Requests” que le llevará a otra vista con una lista de todas los solicitudes y quién la mandó.

![Mockup13](https://cdn.discordapp.com/attachments/1025044659275321430/1050388471765803048/mockup_request.png)

### *H15-Rechazar solucitud de amistad*
“**Como** jugador, **quiero** que el sistema me proporcione un menú en el que pueda ver las solicitudes de amistad que recibí **para** poder rechazarlas.”

**Escenarios positivos:**

<u>H15 + E1 - Rechazar mis solicitudes de amistad.</u>

Dado un jugador en el menú del juego, si quiere ver sus solicitudes de amistad , deberá pulsar el botón “My Profile” en el menú desplegable, 
se le llevará a otra vista en la que habrá un botón “Friend Requests” que le llevará a otra vista con una lista de todas los solicitudes y quién 
la mandó y en dicha lista le aparecerán dos botones uno es “Reject” que al accionarlo desaparecerá la solicitud y se agregará dicho jugador a su lista de amigos.

![Mockup13](https://cdn.discordapp.com/attachments/1025044659275321430/1050388471765803048/mockup_request.png)

### *H16-Eliminar amigos*
“**Como** jugador, **quiero** que el sistema me proporcione una lista de mis amigos **para** poder eliminarlos.”

**Escenarios positivos:**

<u>H16 + E1 - Eliminar amigo.</u>

Dado un jugador en el menú del juego, si quiere ver sus amigos, deberá pulsar el menú desplegable y después“My Profile” en el menú, y se le llevará a otra vista en la que habrá un botón “Friends” dedicado a enviarle a otra vista en la que habrá una tabla con los datos más significativos de sus amigos registro de todos los amigos de dicho jugador y además un botón a su lado “Remove” que al accionarlo se eliminará la relación de amistad entre ambos jugadores.

![Mockup13](https://cdn.discordapp.com/attachments/1025044659275321430/1050388471065358367/mockup_friends.png)

## Database configuration

In its default configuration, Petclinic uses an in-memory database (H2) which
gets populated at startup with data. 

## Working with Petclinic in your IDE

### Prerequisites
The following items should be installed in your system:
* Java 8 or newer.
* git command line tool (https://help.github.com/articles/set-up-git)
* Your preferred IDE 
  * Eclipse with the m2e plugin. Note: when m2e is available, there is an m2 icon in `Help -> About` dialog. If m2e is
  not there, just follow the install process here: https://www.eclipse.org/m2e/
  * [Spring Tools Suite](https://spring.io/tools) (STS)
  * IntelliJ IDEA
  * [VS Code](https://code.visualstudio.com)

### Steps:

1) On the command line
```
git clone https://github.com/gii-is-DP1/dp1--2022-2023-l6-1
```
2) Inside Eclipse or STS
```
File -> Import -> Maven -> Existing Maven project
```

Then either build on the command line `./mvnw generate-resources` or using the Eclipse launcher (right click on project and `Run As -> Maven install`) to generate the css. Run the application main method by right clicking on it and choosing `Run As -> Java Application`.

3) Inside IntelliJ IDEA

In the main menu, choose `File -> Open` and select the Petclinic [pom.xml](pom.xml). Click on the `Open` button.

CSS files are generated from the Maven build. You can either build them on the command line `./mvnw generate-resources`
or right click on the `spring-petclinic` project then `Maven -> Generates sources and Update Folders`.

A run configuration named `PetClinicApplication` should have been created for you if you're using a recent Ultimate
version. Otherwise, run the application by right clicking on the `PetClinicApplication` main class and choosing
`Run 'PetClinicApplication'`.

4) Navigate to Petclinic

Visit [http://localhost:8080](http://localhost:8080) in your browser.


## Looking for something in particular?

|Spring Boot Configuration | Class or Java property files  |
|--------------------------|---|
|The Main Class | [PetClinicApplication](https://github.com/gii-is-DP1/spring-petclinic/blob/master/src/main/java/org/springframework/samples/petclinic/PetClinicApplication.java) |
|Properties Files | [application.properties](https://github.com/gii-is-DP1/spring-petclinic/blob/master/src/main/resources) |
|Caching | [CacheConfiguration](https://github.com/gii-is-DP1/spring-petclinic/blob/master/src/main/java/org/springframework/samples/petclinic/system/CacheConfiguration.java) |

## Interesting Spring Petclinic branches and forks

The Spring Petclinic master branch in the main [spring-projects](https://github.com/spring-projects/spring-petclinic)
GitHub org is the "canonical" implementation, currently based on Spring Boot and Thymeleaf. There are
[quite a few forks](https://spring-petclinic.github.io/docs/forks.html) in a special GitHub org
[spring-petclinic](https://github.com/spring-petclinic). If you have a special interest in a different technology stack
that could be used to implement the Pet Clinic then please join the community there.

# Contributing

The [issue tracker](https://github.com/gii-is-DP1/spring-petclinic/issues) is the preferred channel for bug reports, features requests and submitting pull requests.

For pull requests, editor preferences are available in the [editor config](.editorconfig) for easy use in common text editors. Read more and download plugins at <https://editorconfig.org>. If you have not previously done so, please fill out and submit the [Contributor License Agreement](https://cla.pivotal.io/sign/spring).

# Members
* Cordero Diaz, Jesus Javier 
* Lorenzo Casas, Ángel
* Navarro Sicre, Manuel
* Ortiz Blanco, Manuel
* Redondo Pacheco, Julen



# License

The Spring PetClinic sample application is released under version 2.0 of the [Apache License](https://www.apache.org/licenses/LICENSE-2.0).

[spring-petclinic]: https://github.com/spring-projects/spring-petclinic
[spring-framework-petclinic]: https://github.com/spring-petclinic/spring-framework-petclinic
[spring-petclinic-angularjs]: https://github.com/spring-petclinic/spring-petclinic-angularjs 
[javaconfig branch]: https://github.com/spring-petclinic/spring-framework-petclinic/tree/javaconfig
[spring-petclinic-angular]: https://github.com/spring-petclinic/spring-petclinic-angular
[spring-petclinic-microservices]: https://github.com/spring-petclinic/spring-petclinic-microservices
[spring-petclinic-reactjs]: https://github.com/spring-petclinic/spring-petclinic-reactjs
[spring-petclinic-graphql]: https://github.com/spring-petclinic/spring-petclinic-graphql
[spring-petclinic-kotlin]: https://github.com/spring-petclinic/spring-petclinic-kotlin
[spring-petclinic-rest]: https://github.com/spring-petclinic/spring-petclinic-rest
