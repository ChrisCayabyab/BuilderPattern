public class UserApp {
    public static void main(String[] args) {
        User one = new User.UserBuilder()
                .lastName("Cayabyab")
                .firstName("Chris")
                .address("")
                .email("")
                .phone("")
                .age(21)
                .build();

        User two = new User.UserBuilder()
                .lastName("Cayabyab")
                .firstName("")
                .address("Culiat")
                .email("Cayabyab@gmail.com")
                .phone("34535")
                .age(25)
                .build();

        System.out.println(one + "\n");
        System.out.println(two);
    }
}
