package org.example;

public class Player {
    private int Id;in
    private String Name;
    private int CurrentPosition;
    public int getId()
    {
        return this.Id;
    }
    public void setId(int id)
    {
        this.Id = id;
    }
    public int getCurrentPosition()
    {
        return this.CurrentPosition;
    }
    public void setCurrentPosition(int currentPosition)
    {
        this.CurrentPosition = currentPosition;
    }
    public String getName()
    {
        return this.Name;
    }
    public void setName(String name)
    {
        this.Name = name;
    }
}
