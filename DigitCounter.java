public class DigitCounter {

  public static String getNextNumber(String input, int nTimesToCall)
  {
    // Check the depth parameter:
    if(nTimesToCall <=0) ...

    // Create the new string, based on the `input`
    String output = ....


    // Print out the conversion:
    System.out.printf("\nnTimesToCall: %3d - %s -> %s",nTimesToCall, input, output);


    // Recursively call this function, using the new number we calculated (`output`)
    // as the input to the next call. Decrement the depth, so show how many times this
    return getNextNumber(output, nTimesToCall-1);

  }


  public static void main(String[] args)
  {
    String startingnumber = "3944305";
    getNextNumber(startingnumber, 100);
  }

}