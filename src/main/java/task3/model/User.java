package task3.model;

public class User {
    private int id;
    private String name;
    private String surname;
    private String email;
    private String birth;

    public void setId(int id) {
        this.id = id;
    }
    public void setId(String id) {
        this.id = Integer.parseInt(id);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public User(String name, String surname, String email, String birth) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.birth = birth;
    }


    public User(int id, String name, String surname, String email, String birth) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.birth = birth;
    }
    public  User() {
        super();
    }


    @Override
    public String toString() {
        return id + " " + name + " " + surname + " " + email + " " + birth;
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
}