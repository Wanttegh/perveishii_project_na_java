import java.util.Scanner;

class human{
    private String name;
    private String surname;
    private String gender;
    private String age;
    private String livingPlace;

    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

    public void setSurname(String n){
        surname = n;
    }

    public String getSurname(){
        return surname;
    }

    public void setGender(String n){
        gender = n;
    }

    public String getGender(){
        return gender;
    }

    public void setAge(String n){
        age = n;
    }

    public String getAge(){
        return age;
    }

    public void setLivingPlace(String n){
        livingPlace = n;
    }

    public String getLivingPlace(){
        return livingPlace;
    }
}

public class program{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        human Human = new human();

        System.out.println("Введите имя человека");
        String name = console.nextLine();

        System.out.println("Введите фамилию человека");
        String surname = console.nextLine();

        System.out.println("Введите пол человека");
        String gender = console.nextLine();

        System.out.println("Введите возраст человека");
        String age = console.nextLine();

        System.out.println("Введите место проживания человека:");
        String livingPlace = console.nextLine();

        Human.setName(name);
        Human.setSurname(surname);
        Human.setGender(gender);
        Human.setAge(age);
        Human.setLivingPlace(livingPlace);

        System.out.println("Вы задали данные следующего человека:");
        System.out.println("Имя и фамилия: " + Human.getName() + " " + Human.getSurname());
        System.out.println("Возраст в годах: " + Human.getAge());
        System.out.println("Пол: " + Human.getGender());
        System.out.print("Место проживания: " + Human.getLivingPlace());
    }
}
