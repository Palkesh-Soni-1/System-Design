public class App {
    public static void main(String[] args) {
        User user= new User.UserBuilder()
                .setName("Satyam")
                .setAccountNo("2211201110")
                .setPhoneNumber("9999999999")
                .setAddress("Lucknow")
                .setParentName("Ganesh")
                .setuName("Supercluster")
                .setAge(21)
                .build();
        System.out.println(user);
    }
}
