package gui;

public class WinFactory implements GUIFactory{
    // methods of concrete classes and their usage
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WinCheckbox();
    }
}
