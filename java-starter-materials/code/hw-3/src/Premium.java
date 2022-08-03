public class Premium {
    public static void main(String[] args) {
        int salory = 10000;
        byte lengthOfService = 44;
        double prize = 0;

        if (lengthOfService < 5){
            prize = salory * 0.1;
        }else if(lengthOfService >= 5 && lengthOfService < 10){
            prize = salory * 0.15;
        }else if(lengthOfService >= 10 && lengthOfService < 15){
            prize = salory * 0.25;
        }else if(lengthOfService >= 15 && lengthOfService < 20){
            prize = salory * 0.35;
        }else if(lengthOfService >= 20 && lengthOfService < 25){
            prize = salory * 0.45;
        }else{
            prize = salory * 0.5;
        }

        System.out.println(prize);
    }
}
