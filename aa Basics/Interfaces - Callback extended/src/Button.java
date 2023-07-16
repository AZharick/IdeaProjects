public class Button {
    EventHandler handler;

    Button (EventHandler action){     //в К-ре принимается О-т И-са
        this.handler = action;
    }

    public void click() {            //в М-де вызывается М-д О-та И-са
        handler.execute();
    }
}
