public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.passport = "4444 № 44444444";
        post.patronymic = "Иванович";
        post.phone = "+7 (999)-999-99-99";
        post.surname = "Иванов";
        post.subscription = true;
        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 6;
        post.birthday.year = 1999;

        Post post2 = new Post();
        post2.name = "Василиса";
        post2.passport = "1111 № 44444444";
        post2.patronymic = "Петровна";
        post2.phone = "+7 (999)-000-00-00";
        post2.surname = "Фомина";
        post2.subscription = true;
        post2.birthday = new FormDate();
        post2.birthday.day = 24;
        post2.birthday.month = 5;
        post2.birthday.year = 1982;
        
    }
}
