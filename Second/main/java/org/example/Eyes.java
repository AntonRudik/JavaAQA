package org.example;

public class Eyes {
    private String color;
    private int radious;
    private boolean visible;
    private int count;

    public Eyes(String color, Integer radious, boolean visible, int count) {
        this.color = color;
        this.radious = radious;
        if (count == 0) {
            this.visible = false;
            this.count = 0;
        }
        if ((count < 3) && (count > 0)) {
            this.visible = visible;
            this.count = count;
        } else {
            this.visible = visible;
            this.count = 2;
        }
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }
}
