public record Point(int x, int y)
{
    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    public Point()
    {
        this(0, 0);
    }
}
