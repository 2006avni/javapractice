class Restaurant {

    boolean foodReady = false;

    synchronized void prepareFood() throws Exception {
        System.out.println("Chef prepared food");
        foodReady = true;
        notify();
    }

    synchronized void serveFood() throws Exception {
        while (!foodReady) {
            wait();
        }
        System.out.println("Waiter served food");
    }

    public static void main(String[] args) {
        Restaurant r = new Restaurant();

        Thread chef = new Thread(() -> {
            try {
                r.prepareFood();
            } catch (Exception e) {
            }
        });

        Thread waiter = new Thread(() -> {
            try {
                r.serveFood();
            } catch (Exception e) {
            }
        });

        waiter.start();
        chef.start();
    }
}