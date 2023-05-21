1er Parcial.
Ide a utilizar: Android Studio
Lenguaje: Kotlin

Deben desarrollar una app. La misma debe de permitir el ingreso del nombre de un alumno en su primer
pantalla, navegar persistiendo este dato a otra pantalla donde se listará un LISTADO (MutableList)
de alumnos. Luego se podrá seleccionar un alumno de esa lista, y enviar esos datos a otra
actividad (DETALLE)donde se mostrarán el nombre del alumno.

1- Se debe utilizar activities para la navegacion.
2- Enviar los datos por bundle durante la navegacion
3- Mostrar los datos mediante un LISTVIEW

Extra points:
Para sacar un 10 (DIEZ) se deberán agregar los siguentes puntos al challenges
1- El nombre del alumno se debera guardar en las SharedPreferences y levantarlo en la segunda
actividad leyendo las SharedPreferences
2- El listado ya no será un mutable list de strings, si no un mutableList de alumnos, cuya DataClass
tendra el nombre del alumno, la edad y una foto (10 registros minimo). Tomar en cuenta que al nombre
ingresado en la primer pantalla se deberan agregar el resto de los datos.
3- Se deberá usar GLIDE para cargar las fotos en el recycler view
4- En la pantalla del DETALLE mostrar los datos del alumno.

Para aprobar la app debe funcionar. Se debe de adjuntar un video mostrando el correcto
funcionamiento de la app de principio a fin (con un solo caso esta bien)
Se deberá subir el codigo a un repositorio GIT (enviar link) o el codigo de la app en un archivo
zip.

Suerte con el examen!

Juan Pablo Rodrigues da Cruz
juan.pablo.dacruz@istea.com.ar