package com.org.immutable;

class Name implements Cloneable {

    private String firstName;
    private String lastName;
    private String middleName;

    public Name(String firstName, String lastName, String middleName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    @Override
    public String toString() {
        return "Name[firstName="+firstName+", lastName="+lastName+", middleName="+middleName+"]";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
