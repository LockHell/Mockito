package ru.netology.domain;

public class PosterManager {

    private Poster[] films = new Poster[0];
    private int limit;

    public PosterManager() {
        limit = 10;
    }

    public PosterManager(int limit) {
        this.limit = limit;
    }


    public void add(Poster film) {

        Poster[] tmp = new Poster[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public Poster[] findAll() {

        return films;
    }

    public Poster[] findLast() {
        Poster[] ans;
        if (limit < films.length) {
            ans = new Poster[limit];
        } else {
            ans = new Poster[films.length];
        }
        for (int i = 0; i < ans.length; i++) {
            ans[i] = films[films.length - i - 1];
        }
        return ans;

    }

}