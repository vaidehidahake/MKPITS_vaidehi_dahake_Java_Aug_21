//program without main() method.
class Mac
{
  static
  {
     System.out.println("static block is invoked");//error main method not found in Mac class.
     System.exit(0);
  }

}