package bai7_Demerging;


import java.util.LinkedList;
import java.util.Random;
import java.util.Stack;

public class Bai7 {
    public static void main(String[] args) {
        LinkedList<Person> person = new LinkedList<>();
        Stack<Person> NU = new Stack<>();
        LinkedList<Person> newSortList = new LinkedList<>();
        for (int i = 1; i < 10; i++) {
            String birthDate = i + "/" + 8 + "/" + "2000";
            boolean sex = new Random().nextBoolean();
            String name;
            if (sex)
                name = "NAM_";
            else
                name = "NU_";
            person.add(new Person( name + i, sex, birthDate));
        }
        for(Person staff : person){
            if (!staff.isSex()){
                NU.add(staff);
            } else {
                newSortList.add(staff);
            }
        }

        while (!NU.isEmpty()){
            newSortList.addFirst(NU.pop());
        }
        for (Person staff: newSortList) {
            System.out.println(staff);
        }
    }
}
