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

![Mockup1](https://cdn.discordapp.com/attachments/1025044659275321430/1029740236265230386/Registro.PNG)

### *H2-Inicio sesión*
“**Como** jugador, **quiero** poder acceder al sistema iniciando sesión **para** para jugar una partida.”

**Escenarios positivos:**

<u>H2 + E1 - Deja iniciar sesión.</u>

Dado el formulario de inicio de sesión, el sistema reconoce los datos en la base de datos, y deja acceder al usuario.

**Escenarios negativos:**

<u>H1 - E1 - No deja iniciar sesión.</u>

Dado el formulario de inicio de sesión, el sistema no reconoce los datos en la base de datos, y no le permite la entrada en el sistema al jugador.

![Mockup2](https://cdn.discordapp.com/attachments/1025044659275321430/1029740233660571769/InicioSesion.PNG)

### *H3-Iniciar una partida*
“**Como** jugador, **quiero** que el sistema ofrezca un botón **para** poder iniciar una nueva partida.”

**Escenarios positivos:**

<u>H3 + E1 - Deja iniciar la partida con éxito.</u>

Dado un jugador en el menú del juego, le aparecerán varios botones, si quiere iniciar una partida, el jugador pulsará el botón de “Iniciar partida” y seleccionará la dificultad (la dificultad determinará la cantidad de cartas que salen del mazo al pedirle carta a éste). Se le formará de manera exitosa una partida con el mazo con cartas aleatorias, la zona de juego con cartas aleatorias, y la zona donde se pondrá el montón de cartas del mismo palo.

**Escenarios negativos:**

<u>H3 - E1 - No deja iniciar la partida.</u>

Dado un jugador no logueado en el sistema que quiera iniciar una partida, no podrá iniciar la partida por lo que tampoco le aparecerá la vista del tablero, y le aparecerá un mensaje de error “Debes iniciar sesión para poder jugar”.

![Mockup3](https://cdn.discordapp.com/attachments/1025044659275321430/1029740234914668575/InicioPartida.PNG)

### *H9-Editar perfil de usuario*
“**Como** jugador, **quiero** poder acceder a mi perfil **para** poder editar los datos de mi perfil.”

**Escenarios positivos:**

<u>H9 + E1 - Ver mi perfil.</u>

Dado un jugador logueado en el menú de inicio, al hacer click en su nombre le aparecerá una pestaña en la que pondrá “Modificar datos personales”, al hacer click se accederá a una vista con los datos personales para poder cambiarlos y seleccionar que se actualicen.

### *H10-Actividades sobre el perfil de los jugadores como administrador*
“**Como** administrador, **quiero** poder crear, leer, actualizar y eliminar los perfiles de los usuarios, **para** poder corregir posibles errores, ver los datos de dicho jugador, etc.”

**Escenarios positivos:**

<u>H10 + E1 - Ver la lista.</u>

Dado un administrador, si éste desea acceder al apartado de “Herramientas de administrador”, accede a una vista donde podrá realizar las actividades dichas anteriormente.

**Escenarios negativos:**

<u>H10 - E1 - Intentar acceder a dichas actividades siendo usuario.</u>

Dado un jugador logueado, si éste intenta acceder al apartado de “Herramientas de administrador”, salta un error de autenticación, ya que no tiene permisos para acceder a dicho apartado.


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
* Couto , André Alves
* Lorenzo Casas, Ángel
* Navarro Sicre, Manuel
* Ortiz Blanco, Manuel
* Praça, Daniela Fonseca
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
