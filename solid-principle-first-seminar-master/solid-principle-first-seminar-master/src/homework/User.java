package homework;

public class User implements SomeOne{
    private final String name;

    public User(String name){
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setSurname() {

    }

    @Override
    public String getSurname() {
        return null;
    }
}
