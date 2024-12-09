package com.matury.phonbook.model;

public class BusinessCounter extends Contact{

    private String fax;

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public BusinessCounter(String name, String number) {
        super(name, number, ContactType.BUSINES);

    }

    @Override
    public String toString() {
        return super.toString() +
                "fax='" + fax + '\'' +
                '}';
    }
}
