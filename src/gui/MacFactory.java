package gui;

public class MacFactory implements GUIFactory{
    // methods of concrete classes and their usage
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
