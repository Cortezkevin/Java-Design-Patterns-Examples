package Mediator.example_1;

import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements Mediator {
    List<Colleague> colleagues = new ArrayList<>();

    public void add(Colleague colleague){
        colleagues.add(colleague);
    }

    @Override
    public void sendMessage(String message, Colleague colleague) {
        for (Colleague c: colleagues){
            if(c != colleague){
                c.receive(message);
            }
        }
    }
}
