class Students extends Thread {
    private String name;
    Students(String name) {
        this.name = name;
    }
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(name + " writing page " + i);
        }
        System.out.println(name + " completed writing");
    }
}
class ThrdEx5{
    public static void main(String args[]) {
        Students t1 = new Students("Student 1");
        Students t2 = new Students("Student 2");
        Students t3 = new Students("Student 3");
        t1.start();
        t2.start();
        t3.start();
    }
}