import java.util.Dictionary;
import java.util.Scanner;

public class main {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        /*System.out.println(doBinaryToDecimal("00101010"));
        System.out.print(doDecimalToBinary(255));*/

        doGreetMenu();

    }

    private  static void doGreetMenu(){
        System.out.println("Enter 0 to convert Binary to Decimal,\n1 To Convert Decimal to Binary,\n2 To Convert Decimal to Hex\n3 to Convert Hex to Decimal.");
        switch (scanner.nextLine()){
            case "0":
                System.out.println(doBinaryToDecimal("101001"));
                break;
            case "1":
                System.out.println(doDecimalToBinary(15));
                break;
            case "3":
                doHexToBin("34FA");
        }
    }

    public static int doBinaryToDecimal(String input){
        int runningTotal=0; //!Todo make better bc this is slow
        for (int i = 0; i< input.length();i++){
            runningTotal += ((input.charAt(i))==("0").toCharArray()[0] ? 0 : (Math.pow(2,i-1)));
        }

        return (runningTotal);};

    public static String doDecimalToBinary(int input){
        input = input +1;
        int runningTotal = input;
        String runningString = ("");
        int currentWeight;
        for(int i = 0; i < 8 ;i++){
            currentWeight = (int) Math.pow(2,(7-i));
            if(runningTotal-currentWeight>0){
                runningTotal -= currentWeight;
                runningString+=("1");
            }else{runningString+=("0");}
        }

        return  Integer.toString(Integer.parseInt(runningString)); //Removes leading zeros
    }

    public static int doHexToBin(String input){
        input = input.toUpperCase();
        String newInput = "";
        for(int i = 0; i<input.length();i++){
            newInput += input.charAt(input.length()-(i+1));
        }
        int runningTotal = 0;
        String runningString = "";
        for(int i = 0;i<newInput.length();i++){
            try{
                runningTotal += (Character.getNumericValue(newInput.charAt(i))*(Math.pow(16,i)));
            }catch (Exception e){
                return -1;
            }//!TODO ASCII VAL to number
        }
        return runningTotal;
    }

}
