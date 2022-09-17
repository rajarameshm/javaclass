package com.org;

public class CharacterTest {

    public static void main(String[] args) {
        Character characterA = new Character('A');
        System.out.println(characterA);

        System.out.println(Character.toLowerCase(characterA));
        System.out.println(Character.toUpperCase('b'));
        System.out.println(Character.isDigit('C'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isWhitespace(' '));
    }
}
