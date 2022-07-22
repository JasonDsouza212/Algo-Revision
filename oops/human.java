package oops;

public class human {
   private human() {
        System.out.println("Im in bitch");
    }
    static private human h;
    static human create(){
       if(h==null){
           h=new human();
       }
       return h;

   }
}
