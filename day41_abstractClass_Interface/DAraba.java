package day41_abstractClass_Interface;

public abstract class DAraba {
    public static void main(String[] args) {

    }
    //abstract class da main method opsiyoneldir
    //Eger abstract class sadece child classlarin tasimak zorunda oldugu classlari
    //belirlemek icin olusturulduysa main methoda ihtiyac olmaz sadece abstract method olur
    //Ama bir abstract methodta standart belirlemek disinda methodtalarda calisabilir
    //bu durumda ihtiyac olursa main method olusturulabilir.
    //sadece child classlarin mecburi tasiyacaklari ozellikleri belirleyen methodtlarin abstractlarin method badisi olmaz
     protected  abstract void yakit();
     protected  abstract void kaporta();
     protected abstract void motor();

public  void klima(){
    System.out.println("bazi arabalarda klima olabilir");
    /*
    abstract olmayan methodlara concrete method denir
    abstract bir methodu abstract keyword ile belirtmek zorunludur.
    concrete methodlara bunun declare edilmesine gerek yoktur
    biz sadece abstraction ile ilgili konustugumuzda abstract olmayan methodlardan bahsetmek icin conrete
    tabirini kullaniriz
     */


}


}
