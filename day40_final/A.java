package day40_final;

 public class A {

  protected   String isim="cuneyt";
  final  static   String OKUL="Yildiz Koleji";

  /*bir variable final olarak tanimlayndiysa baska classdan yada icinde oldugumuz classlardan baska
  deger atanmasi mumkun degildir.
  mademki degeri degistirilmiyor genelede static de yaparak bu varibaleye erisim kolaylastirilabilir
  VE GENELDE static final olarak belirlenen variableler buyuk harfle yazilir
   */
  final void finalMethod() {
    System.out.println("final methodlar ovverride edilemez");

    // bir method final yapilirsa degistirilemez


  }


}
