package Builders;


// Following tutorial from https://vyazelenko.com/2012/03/02/recursive-generics-to-the-rescue/
abstract class ConstraintBuilder extends BaseBuilder {

    public ConstraintBuilder equalTo(Number number) {
        return this;
    }

    public ConstraintBuilder greaterThan(Number number) {
        return this;
    }

}
