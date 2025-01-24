package com.xperiencelabs.arapp

import android.media.MediaPlayer
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.isGone
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
import com.google.ar.core.Config
import io.github.sceneview.ar.ArSceneView
import io.github.sceneview.ar.node.ArModelNode
import io.github.sceneview.ar.node.PlacementMode
import io.github.sceneview.math.Position
import io.github.sceneview.math.Scale

class MainActivity : AppCompatActivity() {

    private lateinit var sceneView: ArSceneView
    private lateinit var placeButton: ExtendedFloatingActionButton
    private lateinit var infoCard: CardView
    private lateinit var infoTitle: TextView
    private lateinit var infoDescription: TextView
    private lateinit var modelNodes: MutableList<ArModelNode>
    private var mediaPlayer: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.title = "Matematiksel Keşifler AR"
        setContentView(R.layout.activity_main)

        sceneView = findViewById(R.id.sceneView)
        placeButton = findViewById(R.id.place)
        infoCard = findViewById(R.id.infoCard)
        infoTitle = findViewById(R.id.infoTitle)
        infoDescription = findViewById(R.id.infoDescription)
        infoCard.isGone = true

        placeButton.setOnClickListener { placeModels() }
        setupModels()
    }

    private fun setupModels() {
        modelNodes = mutableListOf(
            createModelNode("models/MeryemMirzakhani.glb", R.raw.meryem, Position(0f, 0f, -1.5f), "Meryem Mirzakhani", "Geometride (şekiller ve yüzeyler alanında) çığır açan araştırmalar yapan İranlı bir matematikçiyim. 2014 yılında matematik Fields Madalyası'nı kazanan ilk kadın oldum."),
            createModelNode("models/Archimedes.glb", R.raw.archimedes, Position(1.2f, 0f, -1.5f), "Arşimet", "Bir dairenin alanını, bir kürenin yüzeyinin ve hacminin nasıl hesaplanacağını bulan Antik Yunanlı bir matematikçiyim."),
            createModelNode("models/KatherineJohnson.glb", R.raw.katherine, Position(-1.2f, 0f, -1.5f), "Katherine Johnson", "NASA'nın ilk insanlı uçuşunu planlayan ve Ay'a giden roket rotalarını hesaplayan Amerikalı bir matematikçiyim."),
            createModelNode("models/WilliamPlayfair.glb", R.raw.william, Position(0f, 0f, -2.5f), "William Playfair", "Sütun, çizgi ve daire grafikleri de dahil olmak üzere çeşitli tablo ve grafikler icat eden İskoçyalı bir matematikçi ve ekonomistim."),
            createModelNode("models/Brahmagupta.glb", R.raw.brahmagupta, Position(1.5f, 0f, -2.5f), "Brahmagupta", "Hintli bir matematikçiyim. 1400 yıl önce sıfırı sayı olarak ilk kullanan ve onunla hesap yapan kişiyim. Ona boş anlamına gelen 'Şunya' adını verdim.")
        )
        modelNodes.forEach { sceneView.addChild(it) }
    }

    private fun createModelNode(
        glbFile: String,
        soundResId: Int,
        position: Position,
        name: String,
        description: String
    ): ArModelNode {
        return ArModelNode(sceneView.engine, PlacementMode.INSTANT).apply {
            loadModelGlbAsync(
                glbFileLocation = glbFile,
                scaleToUnits = 0.5f,
                centerOrigin = position
            ) { sceneView.planeRenderer.isVisible = true }

            onHitResult = { _, _ ->
                animateAndShowInfo(this, name, description)
                playSound(soundResId)
            }
        }
    }

    private fun placeModels() {
        modelNodes.forEach { it.anchor() }
        sceneView.planeRenderer.isVisible = false
        placeButton.isGone = true
        infoCard.isGone = true // Bilgi balonlarını gizle
    }

    private fun animateAndShowInfo(node: ArModelNode, name: String, description: String) {
        modelNodes.forEach { it.scale = Scale(0.5f) }
        infoCard.isGone = true
        node.scale = Scale(0.8f)
        infoTitle.text = name
        infoDescription.text = description
        infoCard.isGone = false
    }

    private fun playSound(soundResId: Int) {
        mediaPlayer?.stop()
        mediaPlayer?.release()
        mediaPlayer = MediaPlayer.create(this, soundResId)
        mediaPlayer?.start()
    }

    override fun onPause() {
        super.onPause()
        mediaPlayer?.pause()
    }

    override fun onDestroy() {
        super.onDestroy()
        mediaPlayer?.release()
        mediaPlayer = null
    }
}
