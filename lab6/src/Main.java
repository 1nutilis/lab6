public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance("log.txt");
        logger.setLogLevel(LogLevel.WARNING);


        Thread thread1 = new Thread(() -> logger.log("Информационное сообщение", LogLevel.INFO));
        Thread thread2 = new Thread(() -> logger.log("Предупреждение", LogLevel.WARNING));
        Thread thread3 = new Thread(() -> logger.log("Ошибка", LogLevel.ERROR));

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
