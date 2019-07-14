package Builders;


// Following tutorial from https://vyazelenko.com/2012/03/02/recursive-generics-to-the-rescue/
abstract class BaseBuilder {
    private void addField(Class<?> cls, String name) {

    }

    public BaseBuilder addIntField(String name) {
        addField(int.class, name);
        return this;
    }

    abstract Object build();

}
