public class Main
{
    public static void main(String[] args)
    {
        Person p1 = new Person("Jan", "Kowalski");
        System.out.println(p1);
        p1.introduce();

        Person p2 = new Person(null, "Nowak");
        System.out.println(p2);
        System.out.println(p2.surname());

        Point point1 = new Point(3, 4);
        System.out.println(point1);
    }
}