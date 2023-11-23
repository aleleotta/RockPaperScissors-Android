package com.example.rockpaperscissorsandroid;

public class clsPerson {
    private int id = 0;
    private String name = "undefined";
    private enum Elements {
        UNDEFINED,
        ROCK,
        PAPER,
        SCISSORS
    }

    private Elements element = Elements.UNDEFINED;

    public clsPerson(){}

    public clsPerson(String name){
        if(!name.equals("")) {
            this.name = name;
        }
    }

    public clsPerson(String name, int element){
        if(!name.equals("") && name != null) {
            this.name = name;
        }
        if(element == 1) {
            this.element = Elements.ROCK;
        } else if(element == 2) {
            this.element = Elements.PAPER;
        } else if(element == 3) {
            this.element = Elements.SCISSORS;
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(!name.equals("") && name != null) {
            this.name = name;
        }
    }

    public String getElement() {
        String strElement = this.element.name();
        return strElement;
    }

    public void setElement(int element) {
        if(element == 1) {
            this.element = Elements.ROCK;
        } else if(element == 2) {
            this.element = Elements.PAPER;
        } else if(element == 3) {
            this.element = Elements.SCISSORS;
        }
    }

}