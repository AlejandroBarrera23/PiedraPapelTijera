package com.example.piedrapapeltijera

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    // Declaracion de variables para los elementos de la interfaz
    private lateinit var imgPiedra: ImageView
    private lateinit var imgPapel: ImageView
    private lateinit var imgTijera: ImageView
    private lateinit var textoResultado: TextView
    private lateinit var textoSeleccionCompu: TextView
    private lateinit var puntajeJugador: TextView
    private lateinit var puntajeCompu: TextView
    private lateinit var imagenTitulo: ImageView
    private var puntosJugador = 0
    private var puntosCompu = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Inicialización de variables
        imgPiedra = findViewById(R.id.imgPiedra)
        imgPapel = findViewById(R.id.imgPapel)
        imgTijera = findViewById(R.id.imgTijera)
        textoResultado = findViewById(R.id.textoResultado)
        textoSeleccionCompu = findViewById(R.id.textoSeleccionCompu)
        puntajeJugador = findViewById(R.id.puntajeJugador)
        puntajeCompu = findViewById(R.id.puntajeCompu)
        imagenTitulo = findViewById(R.id.imagenTitulo)

        // Selección del logo del juego desde el directorio drawable
        imagenTitulo.setImageResource(R.drawable.titulo_juego)

        // Configuración de listeners
        imgPiedra.setOnClickListener { jugar("Piedra") }
        imgPapel.setOnClickListener { jugar("Papel") }
        imgTijera.setOnClickListener { jugar("Tijera") }
    }

    private fun jugar(eleccionJugador: String) {
        val opciones = listOf("Piedra", "Papel", "Tijera")
        val eleccionCompu = opciones[Random.nextInt(opciones.size)]

        // Actualización del texto para la elección de la PC
        textoSeleccionCompu.text = "Elección del PC: $eleccionCompu"

        // Calcular el resultado
        val resultado = when {
            eleccionJugador == eleccionCompu -> "Empate"
            eleccionJugador == "Piedra" && eleccionCompu == "Tijera" ||
                    eleccionJugador == "Papel" && eleccionCompu == "Piedra" ||
                    eleccionJugador == "Tijera" && eleccionCompu == "Papel" -> {
                puntosJugador++
                "Ganaste"
            }
            else -> {
                puntosCompu++
                "Perdiste"
            }
        }

        // Actualización del texto de las puntuaciones
        textoResultado.text = resultado
        puntajeJugador.text = "Tu puntaje: $puntosJugador"
        puntajeCompu.text = "Puntaje del PC: $puntosCompu"
    }
}


