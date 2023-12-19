public class BackgroundTask{
    public void executeTask(Taskcallback callback){

        System.out.println("Tugas dalam latar belakang dimulai...");

        try{
            Thread.slepp(3000); 
        } catch (interruptedException e){
            e.printStackTrace();
        }

        callback.onTaskCompleted("Tugas Selesai");
    }
}