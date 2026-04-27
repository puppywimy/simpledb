package com.back;

public class Sql {
    Sql append(String query) {
        return this;
    }

    Sql append(String query, String value) {
        return this;
    }

    long insert() {
        return 1L;
    }
}
