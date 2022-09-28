public class Main {
    public static void main(String[] args) {
        //Strings
        String name= "Sarfraz";
        System.out.println(name.length()); //To find the length
        //Concatenation
        String name1= "asif";
        String name2= "raza";
        String name3= name1 + " and " + name2;
        System.out.println(name3);
        //charAt
        System.out.println(name.charAt(0));
        //replace
        String name4= name.replace('S', 'A');
        //Substring
        String friends= "Asif and raza";
        System.out.println(friends.substring(0, 4));

    }
}