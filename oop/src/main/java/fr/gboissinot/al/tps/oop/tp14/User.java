package fr.gboissinot.al.tps.oop.tp14;

import java.util.Objects;

final class User {

    private final String id;
    private final String lastname;
    private final String firstname;

    public User(String id, String lastname, String firstname) {
        this.id = id;
        this.lastname = lastname;
        this.firstname = firstname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(lastname, user.lastname) && Objects.equals(firstname, user.firstname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, lastname, firstname);
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                '}';
    }
}
