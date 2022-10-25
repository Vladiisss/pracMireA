package PR7.y1;


import java.util.Scanner;
import java.util.Stack;


public class Game {

    public static void main(String[] args) {

        int xod = 1;
        int card1, card2;
        String winner = "DRAW";

        Deck dk1 = new Deck();
        Deck dk2 = new Deck();


        while (true) {

            card1 = dk1.getTop();
            card2 = dk2.getTop();

            if (card1 < card2) {
                dk2.insertDown(card2, card1);
                if (dk1.isEmpty()) {
                    winner = "Second";
                    break;
                }
            } else {
                dk1.insertDown(card1, card2);
                if (dk2.isEmpty()) {
                    winner = "First";
                    break;
                }
            }
            xod++;
            if (xod > 106) {
                break;
            }
        }

        if (xod > 106) {
            System.out.println("botva");
        } else {
            System.out.println(winner + " " + xod);
        }
    }


}


class Deck {

    private Stack<Integer> dk = new Stack<Integer>();


    public Deck() {
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            dk.push(in.nextInt());
        }
        reverseStack();
    }

    private void reverseStack() {
        Stack<Integer> tmp = new Stack<Integer>();

        while (!dk.empty()) {
            tmp.push(dk.pop());
        }
        dk = tmp;
    }

    public int getTop() {

        if (dk.empty()) {
            return -1;
        }
        return dk.pop();
    }

    // a - своя карта, b - карта соперника
    public void insertDown(int a, int b) {

        reverseStack();
        dk.push(a);
        dk.push(b);
        reverseStack();
    }

    public boolean isEmpty() {
        return dk.empty();
    }


    public void get() {

        while (!dk.empty()) {
            System.out.println(dk.pop());
        }
    }

    @Override
    public String toString() {

        return "Deck{" +
                "dk=" + dk +
                '}';
    }
}

