import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //vartotojo irasytos info nuskaitymas
        ScannerExample scannerExample=new ScannerExample();
        String name="";
        do {

            System.out.println("Iveskite savo varda");
            name = sc.nextLine(); // nuskaito visa eilute
            System.out.println("Jusu vardas yra " + name);


            String a = "Petras";
            String b = "Petras";

            if (a.equals(b)) { //stringus galima patikrinti ar jie lygus tik su equal
                System.out.println("LYGUS " + a);
            } else {
                System.out.println("NE");
            }  // ScannerExample sca
            int length = name.length(); //kodo sutrumpinimas, daznai kartojasi name.lenght, todel susikuriam kintamaji
            if (length % 2 == 0) {
                System.out.println("Ivestas zodis " + name + " yra lyginis, ilgis " + length);
            } else {
                System.out.println("Ivestas zodis yra " + name + " yra nelyginis, ilgis " + length + ", rasta raidziu" );
            }


        } while (!name.equals("pabaiga"));


        //string name=sc.next();// nuskaito teksta iki tarpo

    }

    private int countChars(String name) {
        int numb = 0;
        for (int i = 0; i < name.length(); i++) {
            char letter = name.charAt(i);
            if (letter == 'a' || letter == 'A') {
                numb++;
            }

        }
        return numb;
    }
}