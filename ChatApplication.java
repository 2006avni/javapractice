class ChatApplication {

    static class Sender extends Thread {
        public void run() {
            System.out.println("Sending message...");
        }
    }

    static class Receiver extends Thread {
        public void run() {
            System.out.println("Receiving message...");
        }
    }

    public static void main(String[] args) {

        Sender s = new Sender();
        Receiver r = new Receiver();

        s.start();
        r.start();
    }
}