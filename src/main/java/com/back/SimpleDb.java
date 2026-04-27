package com.back;

public class SimpleDb {
    String host;
    String userName;
    String password;
    String dbName;

    SimpleDb(String host, String userName, String password, String dbName) {
        this.host = host;
        this.userName = userName;
        this.password = password;
        this.dbName = dbName;
    }

    void setDevMode(boolean devMode) {
    }

    void run(String query, Object... values) {
    }

    Sql genSql() {
        return new Sql();
    }
}
