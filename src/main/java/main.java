
public class main {

    public static void main(String[] args) {
        System.out.println(doBinaryToDecimal("00101010"));
        System.out.print(doDecimalToBinary(255));

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

        return  runningString;
    }
}
