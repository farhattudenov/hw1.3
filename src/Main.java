public class Main {

    public static Parent createObject(String className) {
        switch (className) {
            case "2й":
                Child2 obj2 = new Child2();

                return obj2;
            case "3й":
                Child3 obj3 = new Child3();

                return obj3;
            case "4й":
                Child4 obj4 = new Child4();
               
                return obj4;
            default:
                return null;
        }
    }

    public static void main(String[] args) {

        Parent obj2 = createObject("2й");
        Parent obj3 = createObject("3й");
        Parent obj4 = createObject("4й");


        Parent[] objects = {obj2, obj3, obj4};


        for (Parent obj : objects) {
            if (obj instanceof Printable) {
                ((Printable) obj).print();
            }
        }
    }
}
