package edu.fra.uas.demo.controller;

public class Fach {
    
    int note;

    public Fach(int note) {
        this.note = note;
    }


    public void printnote() {
        System.out.println(note);
    }


    public int getnote() {
        return note;
    }

    public void setnote(int note) {
        this.note = note;
    }






}
