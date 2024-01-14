
//запуск программы
public class ExecutionStarter {

    public static void main(String[] args) {
        Hello task1 = new Hello();
        HelloSlava task2 = new HelloSlava();
        EveryThirdElement task3 = new EveryThirdElement();
        task1.outputHello();
        task2.nameVerification();
        task3.outputEveryThirdElement();
    }
}
