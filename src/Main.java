public class Main {
    public static void main(String[] args) {
        Profile Users = new Profile();
        Users.firstName = "Kevin";
        Users.lastName = "Miles";
        Users.age = 54;
        User firstUser = new User();
        firstUser.login = "Mile";
        firstUser.password = "*****";
        firstUser.role = "Unknown";

        System.out.println(Users.firstName +" "+ Users.lastName + ", age="+ Users.age);
        System.out.println("login:"+firstUser.login);
        System.out.println("password:"+firstUser.password);
        System.out.println("role:"+firstUser.role);


    }


}
