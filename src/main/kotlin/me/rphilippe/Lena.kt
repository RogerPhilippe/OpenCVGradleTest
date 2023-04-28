package me.rphilippe

import org.opencv.core.Core
import org.opencv.core.Mat
import org.opencv.core.CvType
import org.opencv.imgcodecs.Imgcodecs
import org.opencv.highgui.HighGui
import java.io.File

object Lena {

    fun whoiam() {
        System.loadLibrary("opencv_java454d")
        println("I'm Lena.")
        try {
            val img = Imgcodecs.imread("./src/main/resources/imgs/Lena.png")
            HighGui.imshow("Bela Lena", img)
            HighGui.waitKey()
        } catch (ex: Exception) {
            ex.printStackTrace()
        }
        System.exit(0)
    }

}