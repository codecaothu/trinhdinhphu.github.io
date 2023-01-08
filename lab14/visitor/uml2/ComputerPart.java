package lab14.visitor.uml2;

public interface ComputerPart {
    void accept(ComputerPartVisitor v);
}
