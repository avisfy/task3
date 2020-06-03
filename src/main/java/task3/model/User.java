package task3.model;

public class User {
    private int id;
    private String name;
    private String surname;
    private String email;
    private String birth;

    public User(String name, String surname, String email, String birth) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.birth = birth;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getBirth() {
        return birth;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + email + " " + birth;
    }
}