@file:JvmName("Lwjgl3Launcher")

package org.snowjak.polymorph.lwjgl3

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration
import org.snowjak.polymorph.PolymorphApplication

/** Launches the desktop (LWJGL3) application. */
fun main() {
    Lwjgl3Application(PolymorphApplication(), Lwjgl3ApplicationConfiguration().apply {
        setTitle("Polymorph")
        setWindowedMode(640, 480)
        setWindowIcon(*(arrayOf(128, 64, 32, 16).map { "libgdx$it.png" }.toTypedArray()))
    })
}
