package gradle;

import com.google.gson.Gson;

public class App {
    public static void main(String[] args) {
        Person person = new Person("Eugene", "Petrovytskyi");
        System.out.println(new Gson().toJson(person));
    }
}
