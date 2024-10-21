package myblackjack;

/**
 *
 * @author alvar
 */
public class Person {
    private String username;
    private Hand hand;

    public Person() {
        this.username = "jugador";
        this.hand = new Hand();
    }

    public Person(String username) {
        this.username = username;
        this.hand = new Hand();
    }

    public Person(Person other) {
        this.username = other.username;
        this.hand = other.hand;
    }

    public String getUsername() {
        return username;
    }

    public Hand getHand() {
        return hand;
    }
}
