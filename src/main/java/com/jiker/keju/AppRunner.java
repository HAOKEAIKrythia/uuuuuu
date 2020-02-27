import java.io.IOException;

public class AppRunner {
    private Taxi taxi;
    //private TestData testData;
    private String receipt = "";

    public AppRunner(Taxi taxi) {
        this.taxi = taxi;
    }

    public String execute(String[] arg) throws IOException {
        String commandString = TestData.getTestData(arg[0]);
        String[] array = commandString.split("\\D+");
        for (int i = 1; i <= array.length - 2; i = i + 2) {
            taxi.parameter(Integer.parseInt(array[i]), Integer.parseInt(array[i + 1]));
            receipt += taxi.getPrice();
        }
        return receipt;
    }

    public static void main(String[] args) throws IOException {
        try {
            AppRunner appRunner = new AppRunner(new Taxi());
            String[] arg = {"testData"};
            System.out.println(appRunner.execute(arg));
        }catch (IOException io){
            System.out.println("读入数据有误！");
        }

    }
}
