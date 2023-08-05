package HomeWork.DZ6;

import java.util.Random;

/*
внутри метода случайным образом генерируется число от 2 до 5, выводится строка:
"Преподаватель ИМЯПРЕПОДАВАТЕЛЯ оценил студента с именем ИМЯСТУДЕНТА
по предмету ИМЯПРЕДМЕТА на оценку ОЦЕНКА."
Все слова, написанные большими буквами, должны быть заменены
соответствующими значениями. ОЦЕНКА должна принимать значения "отлично”,
"хорошо”, "удовлетворительно" или "неудовлетворительно", в зависимости от
значения случайного числа.
 */
public class Teacher {
    private String name;
    private String Subject;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }


    public void evaluate(Student student) {
        Random random = new Random();
        int rate = random.nextInt(4) + 2;

        String evaluation = "";
        switch (rate) {
            case 2:
                evaluation = "Неудовлетворительно";
                break;
            case 3:
                evaluation = "Удовлетворительно";
                break;
            case 4:
                evaluation = "Хорошо";
                break;
            case 5:
                evaluation = "Отлично";
                break;
        }
        System.out.println("Преподаватель " + this.name + " оценил студента с именем " + student.getName() +
                "по предмету " + this.Subject + " на оценку " + evaluation);
    }
}
