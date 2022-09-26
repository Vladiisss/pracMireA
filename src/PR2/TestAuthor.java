package PR2;

public class TestAuthor {

    public static void main(String[] args) {

        Author obj = new Author("Alex", "alex96@gmail.com", 'M');
        System.out.println(obj.getName());
        System.out.println(obj.getEmail());
        obj.setEmail("Alexandr2000@gmail.com");
        System.out.println(obj.getEmail());
        System.out.println(obj.getGender());
        System.out.println(obj.toString());

    }
}
