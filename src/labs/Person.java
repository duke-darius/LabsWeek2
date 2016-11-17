/*
Java Lab sheet three. Examples for nested classes and enum with Person class
 */

package labs;

/**
 *
 * @author ajb
 */
public class Person implements Comparable<Person>{
    private String name;
    private int age;    //In years
    private double height;  // in cm
    private int shoeSize;
    private char sex;   //m=male, f=female
    int nationality;    //0=British, 1=French, 2=German, 3 =Chinese, 4=American, 5= Any other.

    public Person(String s, int a, double h, int shoe,int n,char m){
        name=s;
        age=a;
        height=h;
        shoeSize=shoe;
        nationality=n;
        sex=m;

    }

    public static void sortPersonArray(Person[] peeps){
        System.out.println(" UNSORTED");
        for(Person p:peeps)
            System.out.println(p);
//OTHER SORTING HERE


    }
    public static void main(String[] args){
        Person[] people=new Person[5];
        people[0]=new Person("Bob",21,12,190,0,'m');
        people[1]=new Person("Alice",19,3,160,1,'f');
        people[2]=new Person("Jim",23,8,175,0,'m');
        people[3]=new Person("Simone",18,165,6,2,'f');
        people[4]=new Person("Zhang Wei",24,7,170,3,'m');
        sortPersonArray(people);
    }

    @Override
    public int compareTo(Person o){
        return Integer.compare(o.age, this.age);
    }
}
