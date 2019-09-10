package my.app1

import io.micronaut.runtime.Micronaut


object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages(Application.javaClass.`package`.name)
                .mainClass(Application.javaClass)
                .start()
    }

}

