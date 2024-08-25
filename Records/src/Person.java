public record Person(String name, String surname)
{
    public Person
    {
        if(name == null)
        {
            name = "";
        }
    }
    public void introduce()
    {
        System.out.println("My name is " + name + " " + surname);
    }

}
