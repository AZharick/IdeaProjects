public class Button {
    ButtonHandler handler;

    Button (ButtonHandler action) {
        this.handler = action;
    }

    public void click() {
        handler.execute();
    }

}
