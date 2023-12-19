public class Main {
    public static void main(String[] args){
        BackgroundTask backgroundTask = new BackgroundTask();

        Taskcallback callback = new Taskcallback(){
            @Override
            public void onTaskCompleted(String result){
                System.out.println("Notifikasi: " + result);
            }
        };

        backgroundTask.executeTask(callback);
    }
}