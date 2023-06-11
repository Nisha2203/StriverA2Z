import java.util.Scanner;

public class Datatypes2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the type ");
        String type = in.next();
        int value=0;
        if (type.equalsIgnoreCase("Character") )
        {
            value =1 ;
        }
        else if(type.equalsIgnoreCase("Integer"))
        {
            value = 4;
        }
        else if(type.equalsIgnoreCase("Long"))
        {
            value = 8;
        }
        else if(type.equalsIgnoreCase("Float"))
        {
            value = 4;
        }
        else if(type.equalsIgnoreCase("Double"))
        {
            value = 8;
        }
        System.out.println(value);
    }
}
//switch(str)
//   {
//       case "Character":
//           a= Character.SIZE/8;
//           break;

//             case "Integer":
//           a= Integer.SIZE/8;
//           break;
//             case "Long":
//           a= Long.SIZE/8;
//           break;
//             case "Float":
//           a= Float.SIZE/8;
//           break;
//             case "Double":
//           a= Double.SIZE/8;
//           break;
//           default :
//           a=0;
//   }
//     return a;

