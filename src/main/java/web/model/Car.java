package web.model;

public class Car {
    private String colour;
    private String mark;
    private Integer serialNumber;
    private String comment;

    public Car() {
    }
    public Car(String colour, String mark, Integer serialNumber, String comment) {
        this.colour = colour;
        this.mark = mark;
        this.serialNumber = serialNumber;
        this.comment = comment;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    // а нужны ли здесь сеттеры или для приличия пусть будут?
}
