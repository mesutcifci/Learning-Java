
public class Main {
    public static void main(String[] args) {
        
        String message = "The weather is very nice today.";
        System.out.println(message);
        
        System.out.println("Number of characters = " + message.length());
        
        System.out.println("third character = " + message.charAt(2));
        
        System.out.println(message.concat(" Hooray"));
        
        System.out.println(message.startsWith("T"));
        System.out.println(message.endsWith("2"));
        
        char[] characters = new char[21];
        message.getChars(0, 21, characters,0);
        System.out.println(characters);
        
        System.out.println(message.indexOf("e"));
        System.out.println(message.lastIndexOf("e"));
        
        String newMessage = message.replace("a", "4");
        System.out.println(newMessage);
        
        System.out.println(message.substring(2));
        System.out.println(message.substring(1,5));
        
        for(String word: message.split(" ")) {
            System.out.println(word);
        }
        
        System.out.println(message.toUpperCase());
        System.out.println(message.toLowerCase());
        
        //System.out.println(mesaj.trim());
        String text = "1234";
        int number = Integer.parseInt(text);
        System.out.println(number + number);
        
        int date = 1995;
        String word = String.valueOf(date);
        System.out.println(word);
            
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
