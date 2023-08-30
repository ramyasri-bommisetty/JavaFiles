enum Colors{
    white,
    Orange,
    blue,
    black;
}
//Enum is set constants if we declare them in the above we could only use them in the main method

public class EnumSwitchCase {

    public static void main(String[] args) {
    Colors aColor = Colors.blue;

    switch(aColor){
        case white:
            System.out.println("Color is white");
        case blue:
            System.out.println("Color is blue");
        case black:
            System.out.println("Color is black");
        case Orange:
            System.out.println("Color is orange");
    }
    }
}
