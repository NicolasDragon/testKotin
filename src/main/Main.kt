package main

import family.Daugther
import family.Parent


class Main {
    fun test(a: String): String {
        return "ee" + a;
    }

    fun compute(i: Int, i1: Int): Int? {
        return i*i1;
    }

    fun concatenate(s: String, s1: String): String {
        return s+s1;
    }

    fun getSon(): Parent {

        return Daugther();
    }
}

