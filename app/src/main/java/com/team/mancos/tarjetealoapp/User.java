package com.team.mancos.tarjetealoapp;


import java.util.ArrayList;


public class User {
    String id;
    String name;
    String lastName;
    String nick;
    String pwd;
    ArrayList<ListCard> listCards;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public ArrayList<ListCard> getListCards() {
        return listCards;
    }

    public void setListCards(ArrayList<ListCard> listCards) {
        this.listCards = listCards;
    }

}
