package lab12.abstractfactory.pseudocode;

public class WinButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created WinButton.");
    }
}
