public class KlasesPvz {



    public static void  main(String[]args){ /*metodas, kuris pradeda programos darba*/

        SecondClassExample secondClassExample=new SecondClassExample(67); /*objekto kurimas. skliaustuose irasem skaiciu 67, kuri priskiria prie kint id ir naudoja antra konstruktoriu*/

        secondClassExample.testMethod(); /*metodo, parasyto apacioje, iskvietimas*/
    }

}




class  SecondClassExample{ //*kai yra dvi klases salia viena kitos, tik viena is ju gali buti public./

    private  int id; //kintamieji rasomi klases virsuje. sis prieinamos tik sioje klaseje

    //default konstruktorius (be nurodyto kintamojo?)

    public SecondClassExample() { //kuriame pirma konstruktoriu (jis kvieciamas, kai turim objekta)
        id=10;
    }

    public SecondClassExample(int id) { //antras konstruktorius
     //id=ids siuo atveju nereikalingas, nes skiriasi kintamuju vardai//
        this.id=id;   //this nurodo sios klases kintamaji id, kuris uzrasomas is naujo


    }

    public void testMethod(){
        System.out.println("this is my method :)"+id);
    }
}