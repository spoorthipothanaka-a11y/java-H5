class box{
      double length,width,height;
      box(){
length=width=height=-1;
}
      box(double d){
length=width=height=d;
}
      box(double len,double wid,double ht){
length=len;
width=wid;
height=ht;
}
void volume(){
System.out.println(length*width*height);
}
}
class ConcOverLoad {
    public static void main(String args[]) {
        box obj1 = new box();
        System.out.print("Volume of obj1: ");
        obj1.volume();
        box obj2 = new box(5);
        System.out.print("Volume of obj2: ");
        obj2.volume();
        box obj3 = new box(2, 3, 4);
        System.out.print("Volume of obj3: ");
        obj3.volume();
    }
}