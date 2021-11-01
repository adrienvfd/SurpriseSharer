package surpriseSharer.surprise;
import surpriseSharer.helpers.RandomHelper;
public class FortuneCookie implements ISurprise{

    private String message;
    private String author;
    private static final String[][] QUOTES = {
            {"Take out the fortune before you eat the cookie.", "Dave Barry"},
            {"The final act of business judgment is intuitive.", "Alfred P. Sloan"},
            {"Everybody, even those that don't like Chinese food, knew that you had to eat the cookie for the fortune to come true. And so he did.", "Justin Swapp"},
            {"Love of action is not industry.", "Seneca The Younger"},
            {"He digs out a fortune cookie fortune from his mouth, as if his mouth has a pocket. It says THE SIMPLEST ANSWER IS TO ACT. He hands it to me. I nod and put the fortune in my own mouth pocket.", "A.S. King"},
            {"Thought for the day: Twitter ... 140 character limit ... must be a great tool for fortune cookie writers ...", "E.A. Bucchianeri"},
            {"The more this guy talked, the more he sounded like a fortune cookie.", "Kelly Creagh"},
            {"A journey of 1000 miles begins with one step.", "Laozi"},
            {"Could this guy sound a little less like a fortune cookie on acid?", "Huntley Fitzpatrick"},
            {"To me there's no real difference between a fortune teller or a fortune cookie and any of the organized religions. They're all equally valid or invalid, really. And equally helpful.", "Woody Allen"},
            {"Always tell the truth - it's the easiest thing to remember.", "David Mamet"},
            {"Your successes and happiness are forgiven you only if you generously consent to share them.", "Albert Camus"},
            {"To love and be loved is to feel the sun from both sides.", "David Viscott"},
            {"When you look into an abyss, the abyss also looks into you.", "Friedrich Nietzsche"},
            {"Life is what happens when you’re busy making other plans.", "John Lennon"},
            {"Get busy living or get busy dying", "Stephen King"},
            {"You only live once, but if you do it right, once is enough", "Mae West"},
            {"Many of life’s failures are people who did not realize how close they were to success when they gave up.", "Thomas A. Edison"},
            {"If you want to live a happy life, tie it to a goal, not to people or things", "Albert Einstein"},
            {"Your time is limited, so don’t waste it living someone else’s life. Don’t be trapped by dogma – which is living with the results of other people’s thinking.", "Steve Jobs"},
            {"Money and success don’t change people; they merely amplify what is already there.", "Will Smith"}
    };

    private FortuneCookie(String message, String author){
        this.message = message;
        this.author = author;
    }

    public static FortuneCookie generate(){
        int random = RandomHelper.getNewRandomInt(QUOTES.length);
        return new FortuneCookie(QUOTES[random][0], QUOTES[random][1]);
    }

    @Override
    public void enjoy() {
        System.out.println(message + " - " + author);
    }

    @Override
    public String toString(){
        return "ITEM: Fortune Cookie || MESSAGE: " + message + " || AUTHOR: " + author;
    }
}

/*
FortuneCookie	Reprezinta o surpriza de tipul Fortune Cookie in care persoana va primi un mesaj simbolic, care sa o calauzeasca in viitor.
Operare:	Clasa primeste mesajul (i.e. String) la constructia obiectului. Acesta va fi afisat la output in momentul „deschiderii surprizei“.
 */
