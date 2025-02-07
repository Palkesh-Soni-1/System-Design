import LogProcessor.LogProcessor;
import LogProcessor.InfoLogProcessor;
import LogProcessor.DebugLogProcessor;
import LogProcessor.ErrorLogProcessor;

public class App {
    public static void main(String[] args) throws Exception {
        LogProcessor logProcessor=new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        logProcessor.log(LogProcessor.INFO,"Just a Info message");
        logProcessor.log(LogProcessor.DEBUG,"This Needs to Debug");
        logProcessor.log(LogProcessor.ERROR,"There is an Error");
    }
}
