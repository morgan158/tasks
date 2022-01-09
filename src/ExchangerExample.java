import java.util.List;
import java.util.concurrent.Exchanger;

public class ExchangerExample {
    // Exchanger используется для одновременного обмена данными между потоками

    public static void main(String[] args) {

    }
}

enum Action{
    ROCK, SCISSORS, PAPPERS;
}

class BestFriend extends Thread{
    private String name;
    private List<Action> myActions;
    private Exchanger<Action> exchanger;

    public BestFriend(String name, List<Action> myActions, Exchanger<Action> exchanger) {
        this.name = name;
        this.myActions = myActions;
        this.exchanger = exchanger;
    }

    private void whoWins(Action myAction, Action friendsAction) {
        if(myAction==Action.PAPPERS && friendsAction == Action.ROCK
        || myAction==Action.ROCK && friendsAction == Action.SCISSORS
        || myAction==Action.SCISSORS && friendsAction == Action.PAPPERS) {
            System.out.println("You win");
        }
    }

    public void run(){

    }
}
