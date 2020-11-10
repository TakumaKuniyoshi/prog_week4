public class Main {
    public static void main(String[] args){
        System.out.println("null");
        Chatbot bot1 = new Chatbot();
        Chatbot bot2 = new Chatbot("nulltoma");
        bot1.greeting();
        bot2.greeting();
        bot2.setChatbot("null");
        bot2.greeting();
    }
    
}