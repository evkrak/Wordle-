public class testingStrings {
    public static void main(String[] args) {
        String name = "HelloWorld";
        System.out.println(name.charAt(1));
        System.out.println(name.concat(" This Is great"));
        System.out.println(name.endsWith("rld"));
        System.out.println(name.endsWith("123"));
        System.out.println(name.equals("HelloWorld"));
        System.out.println(name.equals("helloworld"));
        System.out.println(name.equalsIgnoreCase("helloworld"));
        System.out.println(name.equalsIgnoreCase("hi world"));
        System.out.println(name.indexOf("H"));
        System.out.println(name.indexOf("o"));
        System.out.println(name.indexOf("z"));
        System.out.println(name.indexOf("o", 5));
        System.out.println(name.replace("o","!"));
        System.out.println(name.substring(4,8));
        System.out.println(name.toLowerCase());
    }
}

