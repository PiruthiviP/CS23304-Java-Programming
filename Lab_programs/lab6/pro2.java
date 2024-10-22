// 2. Suppose that you have written a time server, which periodically notifies its clients 
// of the current date and time. Write an interface that the server could use to enforce 
// a particular protocol on its clients.

import java.util.Date;

interface TimeClient {
    void notifyTime(Date date);
}

class MyClient implements TimeClient {
    public void notifyTime(Date date) {
        System.out.println("Current time: " + date);
    }
}

public class pro2{
    public static void main(String[] args) {
        TimeClient client = new MyClient();
        client.notifyTime(new Date());
    }
}
