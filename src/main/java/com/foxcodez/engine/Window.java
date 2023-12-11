package com.foxcodez.engine;

public class Window {
    private final int width;
    private final int height;
    private final String title;

    private static Window instance = null;

    private Window() {
        this.width = 1920;
        this.height = 1080;
        this.title = "Roguelike";
    }

    public static Window getInstance()
    {
        return (null == Window.instance) ? new Window() : Window.instance;
    }


}
