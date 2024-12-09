package com.matury.phonbook.model;

public abstract class Contact {
    private static int idcounter=1;
    private String name;
    private String number;
    private int id;

    private final ContactType type;

    public Contact(String name, String number, ContactType type) {
        this.id=idcounter++;
        this.name = name;
        this.number = number;
        this.type = type;
    }

    private String upFirstLetter(String str){

        if(str !=null && !str.isEmpty()) {
            return Character.toUpperCase(str.charAt(0)) + str.substring(1);
        }
        else return str;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", id=" + id +
                '}';
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = upFirstLetter(name);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
