package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {

    Poster first = new Poster("Bladshot", "Action movie");
    Poster second = new Poster("Forward", "Cartoon");
    Poster third = new Poster("Hotel Belgrade", "Comedy");
    Poster fourth = new Poster("Gentlemen", "Action movie");
    Poster fifth = new Poster("Invisible Man", "Horror");
    Poster sixth = new Poster("Trolls. World tour", "Cartoon");
    Poster seventh = new Poster("Number one", "Comedy");
    Poster eighth = new Poster("Death on the Nile", "Crime");
    Poster ninth = new Poster("Spiderhead", "Fiction");
    Poster tenth = new Poster("Red notice", "Crime");
    Poster eleventh = new Poster("Time", "Thriller");


    @Test
    public void addTest() {
        PosterManager manager = new PosterManager();

        manager.add(first);
        manager.add(second);


        Poster[] actual = manager.findAll();
        Poster[] expected = {first, second};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void TestFindLast11() {
        PosterManager manager = new PosterManager();

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);


        Poster[] actual = manager.findLast();
        Poster[] expected = {eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void TestFindLast9() {
        PosterManager manager = new PosterManager();

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);


        Poster[] actual = manager.findLast();
        Poster[] expected = {ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void TestFindLast10() {
        PosterManager manager = new PosterManager();

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);


        Poster[] actual = manager.findLast();
        Poster[] expected = {tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        Assertions.assertArrayEquals(expected, actual);
    }

}