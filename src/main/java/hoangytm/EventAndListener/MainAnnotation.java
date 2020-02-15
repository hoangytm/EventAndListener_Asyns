package hoangytm.EventAndListener;



public class MainAnnotation {

    public static void main(String[] args) throws IllegalAccessException {
        Number number = new Number("hello"); // Tao doi tuong super man
        number.getIntNumber();


        String json = JsonNameProcessor.toJson(number);
        System.out.println(json);
    }
}


