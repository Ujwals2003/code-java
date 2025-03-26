public class ShirtRunner{
public static void main(String[] args)
        {
                Shirt shirt1 = new Shirt();
                Shirt shirt2 = new Shirt();
                shirt2.color = "Blue";
                shirt2.size = "L";
                shirt2.fabric = "Cotton";
                shirt2.hasCollar = true;
                System.out.println("Shirt 1 - Base shirt info: Color = " + shirt1.color + ", Size = " + shirt1.size);
                System.out.println("Shirt 2 - Tailored shirt details: " + shirt2.color + " " + shirt2.size + " cotton shirt");
        }
}
