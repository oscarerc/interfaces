public class Main {
    static CocheCRUD cocheCRUD= new CocheCRUDImpl();
    public static void main(String[] args) {

        Coche aveo = new Coche(2,"rojo","aveo",22);


        cocheCRUD.save(aveo);
        cocheCRUD.findAll();


    }
}