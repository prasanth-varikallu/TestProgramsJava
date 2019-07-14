package Builders;

abstract class BaseBuilder {
    private void addField(Class<?> cls, String name) {

    }

    public BaseBuilder addIntField(String name) {
        addField(int.class, name);
        return this;
    }

    abstract Object build();

}
