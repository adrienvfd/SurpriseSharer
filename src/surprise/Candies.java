package surprise;


public class Candies implements ISurprise{

    private static final String[] TYPE_LIST = {"chocolate", "jelly", "fruits", "vanilla"};
    private static final int MAX_NUMBER_OF_CANDIES = 100;
    private int number;
    private String type;

    Candies(int number, String type){
        this.number = number;
        this.type = type;

    }

    public static Candies generate(){
        int randomNum = ISurprise.randomElement.nextInt(MAX_NUMBER_OF_CANDIES);
        int randomType = ISurprise.randomElement.nextInt(TYPE_LIST.length);

        return new Candies(randomNum, TYPE_LIST[randomType]);
    }

    @Override
    public void enjoy() {
        System.out.println("Yum yum, here are " + number + " " + type);
    }
}

/*
Surpriza contine un numar aleator de bomboane, de un anumit tip.
Operare:	Constructorul clasei va primi numarul de bomboane si tipul acestora.
La executia surprizei se va afisa un mesaj relevant, in functie de starea interna a obiectului-surpriza.
 */

/*
Generate() :
FortuneCookie	Clasa va contine un vector de minim 20 de zicale (+ autorul acestora) la alegere. Poti lua colectia de zicale de pe un site de specialitate.
La apelul metodei generate(), metoda va genera un numar aleator si va alege elementul din array in consecinta. Ulterior, va crea o (noua) surpriza corespunzator.

 */