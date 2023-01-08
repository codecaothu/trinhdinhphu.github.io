package lab14.visitor.uml1;

import lab14.visitor.uml2.*;

public class VisitorPatternDemo {
    public static void main(String[] args) {
        ComputerPart[] computerParts = new ComputerPart[]{new Monitor(), new Monitor(), new Mouse(), new Keyboard()};
        ComputerPart computer = new Computer(computerParts);
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
