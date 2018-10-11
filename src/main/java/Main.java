public class Main {
    public static void main(String[] args) {

        int Rezultat;
        double Rezultat2;
        Basic Obiect = new Basic();
        Expert Obiect2 = new Expert();

        Rezultat = Obiect.add(2, 3);
        Rezultat2 = Obiect.add(2.3, 3.5);

        int Rezultat3 = Obiect2.pow(3, 4);
        double Rezultat4 = Obiect2.pow(3.5, 4);

        int Rezultat5 = Obiect2.factorial(4);
        double Rezultat6 = Obiect.substract(7.6, 3.2);
        int Rezultat7 = Obiect.substract(152, 136);

        System.out.println(Rezultat);
        System.out.println(Rezultat2);
        System.out.println(Rezultat3);
        System.out.println(Rezultat4);
        System.out.println(Rezultat5);
        System.out.println(Rezultat6);
        System.out.println(Rezultat7);

    }
}
