public class Bevetel {

    public static void main(String[] args) {
        long osszBevetel = 0;
        int egyCsempeAr=Integer.parseInt(args[0]);


        for (int i = 1; i < args.length; i++){
           osszBevetel +=  Integer.parseInt(args[i]);
        }


        System.out.println(osszBevetel * egyCsempeAr);
    }

}

/*
also
public class Bevetel {

    public static void main(String[] args) {
        long osszeg = 0;
        int szorzo = Integer.parseInt(args[0]);
        for (int i = 1; i < args.length; i++) {
            osszeg += Integer.parseInt(args[i]);
        }

        System.out.println(szorzo * osszeg);
    }

}
 */
