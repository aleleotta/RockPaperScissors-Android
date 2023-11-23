package com.example.rockpaperscissorsandroid

class clsPerson {
    val id = 0
    private var name = "undefined"

    private enum class Elements {
        UNDEFINED,
        ROCK,
        PAPER,
        SCISSORS
    }

    private var element = Elements.UNDEFINED

    constructor()
    constructor(name: String) {
        if (name != "") {
            this.name = name
        }
    }

    constructor(name: String?, element: Int) {
        if (name != "" && name != null) {
            this.name = name
        }
        if (element == 1) {
            this.element = Elements.ROCK
        } else if (element == 2) {
            this.element = Elements.PAPER
        } else if (element == 3) {
            this.element = Elements.SCISSORS
        }
    }

    fun getName(): String {
        return name
    }

    fun setName(name: String?) {
        if (name != "" && name != null) {
            this.name = name
        }
    }

    fun getElement(): String {
        return element.name
    }

    fun setElement(element: Int) {
        if (element == 1) {
            this.element = Elements.ROCK
        } else if (element == 2) {
            this.element = Elements.PAPER
        } else if (element == 3) {
            this.element = Elements.SCISSORS
        }
    }
}