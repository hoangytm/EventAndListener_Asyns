package hoangytm.EventAndListener;
@JsonName("hello_JsonName")
public class Number {

    String number;
    int intNumber;
    public Number(String number){
        this.number=number;
    }
    public String getNumber(){
        return number;
    }
    public int getIntNumber(){
        return intNumber;
    }

}
