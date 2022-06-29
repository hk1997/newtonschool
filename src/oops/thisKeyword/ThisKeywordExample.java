package oops.thisKeyword;

public class ThisKeywordExample {
   private String name;
   private int age;

    public ThisKeywordExample(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public ThisKeywordExample setName(String name){
        this.name = name;
        return this;
    }

    public ThisKeywordExample setAge(int age){
        this.age =age;
        return this;
    }


    public static void main(String[] args) {
        ThisKeywordExample ob = new ThisKeywordExample("Hardik", 24);

        ob.setName("Kartik").setAge(27);
    }


}
