# Piedra, Papel o Tijera

Una aplicación móvil para Android desarrollada en Android Studio que permite a los usuarios jugar el clásico juego de Piedra, Papel o Tijera contra la computadora. ¡Pon a prueba tu suerte y estratégia!

## Características principales
- Interfaz sencilla y fácil de usar.
- Elección aleatoria de la computadora para competir contra el jugador.
- Indicación clara del resultado de cada partida: “Ganaste”, “Perdiste” o “Empate”.
- Contadores de puntuación para el jugador y la computadora.
- Diseñado para dispositivos Android.

## Capturas de pantalla
<img src="./assets/cap1.jpeg" alt="Pantalla principal" width="200" />
<img src="./assets/cap1.jpeg" alt="Resultado del juego" width="200" />


## Capturas de pantalla
![Pantalla principal](./assets/cap1.jpeg)
![Resultado del juego](./assets/cap2.jpeg)

## Tecnologías utilizadas
- **Lenguaje**: Java
- **Entorno de desarrollo**: Android Studio

## Instalación y ejecución

Puedes descargar el archivo APK desde el siguiente enlace:
[Descargar APK](https://ejemplo.com/piedra-papel-tijera.apk)

1. **Clonar el repositorio:**
   ```bash
   git clone https://github.com/tuusuario/piedra-papel-tijera.git
   ```
2. **Abrir en Android Studio:**
   - Abre Android Studio.
   - Selecciona `Open an Existing Project` y navega hasta la carpeta del proyecto clonado.

3. **Ejecutar la aplicación:**
   - Conecta un dispositivo Android o configura un emulador.
   - Haz clic en el botón `Run` (▶) en Android Studio para compilar y ejecutar la aplicación.

## Uso
1. Elige entre las opciones disponibles: Piedra, Papel o Tijera.
2. La computadora hará su selección de forma aleatoria.
3. Observa el resultado del juego en la pantalla y ve cómo se actualizan las puntuaciones.
4. ¡Juega tantas veces como quieras y supera a la computadora!

## Diseño de la aplicación
### Pantalla principal:
- **Opciones del jugador:** Tres botones (“Piedra”, “Papel” y “Tijera”).
- **Selección de la computadora:** Un TextView o ImageView que muestra la elección de la computadora.
- **Resultado del juego:** Un TextView que indica si el jugador ganó, perdió o hubo empate.
- **Contadores de puntuación:** TextViews para la puntuación del jugador y de la computadora.

### Lógica del juego:
- Las reglas clásicas:
  - Piedra gana a Tijera.
  - Tijera gana a Papel.
  - Papel gana a Piedra.
  - Si ambas selecciones son iguales, es un empate.

## Contribuciones
Las contribuciones son bienvenidas. Si deseas mejorar esta aplicación o agregar nuevas funcionalidades, sigue estos pasos:

1. Haz un fork del repositorio.
2. Crea una rama para tus cambios:
   ```bash
   git checkout -b nueva-funcionalidad
   ```
3. Realiza tus cambios y haz commit:
   ```bash
   git commit -m "Agregada nueva funcionalidad"
   ```
4. Sube los cambios a tu repositorio:
   ```bash
   git push origin nueva-funcionalidad
   ```
5. Abre un Pull Request en este repositorio.

## Licencia
Este proyecto está licenciado bajo la [MIT License](LICENSE).

## Contacto
Si tienes dudas o sugerencias, no dudes en contactarme en [tu-email@ejemplo.com](mailto:tu-email@ejemplo.com) o abrir un issue en este repositorio.

